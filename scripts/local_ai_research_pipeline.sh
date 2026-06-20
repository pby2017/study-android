#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
LOG_DIR="$ROOT/logs"
LOCK_DIR="$ROOT/.local-ai-research.lock"
DISABLED_FILE="$ROOT/.local-ai-research.disabled"
mkdir -p "$LOG_DIR"

STAMP="$(date '+%Y%m%d-%H%M%S')"
RUN_LOG="$LOG_DIR/local-ai-research-$STAMP.log"

exec > >(tee -a "$RUN_LOG") 2>&1

cd "$ROOT"

if [[ -f "$DISABLED_FILE" ]]; then
  echo "Local AI research pipeline is disabled because the previous Codex run failed: $DISABLED_FILE"
  echo "Fix Codex, remove the disabled marker, then kickstart launchd manually."
  exit 0
fi

echo "[$(date '+%Y-%m-%d %H:%M:%S %Z')] local AI research pipeline start"

if ! mkdir "$LOCK_DIR" 2>/dev/null; then
  echo "Another local AI research pipeline is already running: $LOCK_DIR"
  exit 0
fi
trap 'rm -rf "$LOCK_DIR"' EXIT

if ! git diff --quiet || ! git diff --cached --quiet; then
  mkdir -p research/ai-routine
  cat > research/ai-routine/resume.md <<RESUME_EOF
# Local AI routine paused before sync

Paused at: $(date '+%Y-%m-%d %H:%M:%S %Z')

Reason: working tree already had local changes before the routine could run \`git pull --ff-only\`.

Next actions:
1. Inspect \`git status --short\`.
2. Commit/stash/resolve local changes.
3. Run \`git pull --ff-only origin $(git branch --show-current)\`.
4. Re-run \`./scripts/local_ai_research_pipeline.sh\`.
RESUME_EOF
  echo "Working tree has local changes before sync. Wrote resume checkpoint and stopped."
  exit 1
elif git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
  git fetch origin
  git pull --ff-only origin "$(git branch --show-current)"
fi

PROMPT=$(cat <<'PROMPT_EOF'
Use repo skill `.codex/skills/local-ai-card-routine/SKILL.md`.
Run the study-android AI/Android developer-topic card routine now.
Important: edit this repository only; do not add GitHub Actions; do not commit or push.
Pure Android topics are out of scope. Android topics qualify only when the core angle is AI+Android, and they are educational card content, not app feature requests. If a candidate has no AI angle, reject it as below threshold.
Do not create, update, close, comment on, or triage app-factory-android issues, branches, or pull requests.
Wrapper script owns final verification, commit, and push.
If usage/quota is near exhaustion or tool access degrades, write a resume checkpoint to `research/ai-routine/resume.md` with next actions, then stop cleanly.
PROMPT_EOF
)

run_codex() {
  command -v codex >/dev/null 2>&1 || return 127
  local codex_bin
  codex_bin="$(realpath "$(command -v codex)")"
  echo "Trying headless provider: codex"
  timeout "${PIPELINE_TIMEOUT:-10200}" "$codex_bin" --search exec -C "$ROOT" --dangerously-bypass-approvals-and-sandbox "$PROMPT"
}

AGENT_OK=0
if run_codex; then
  AGENT_OK=1
else
  echo "Codex headless provider failed or unavailable."
fi

if [[ "$AGENT_OK" != "1" ]]; then
  mkdir -p research/ai-routine
  cat > research/ai-routine/resume.md <<RESUME_EOF
# Local AI routine disabled after Codex failure

Paused at: $(date '+%Y-%m-%d %H:%M:%S %Z')

Reason: Codex headless provider failed or was unavailable. The 3-hour routine is disabled to avoid wasting local/API resources on repeated failures.

Next actions:
1. Check latest log: $RUN_LOG
2. Confirm Codex works headless: \`codex --search exec -C "$PWD" --dangerously-bypass-approvals-and-sandbox "Say OK only."\`.
3. Remove disabled marker: \`rm -f .local-ai-research.disabled\`.
4. Re-run \`./scripts/local_ai_research_pipeline.sh\` or \`launchctl kickstart -k gui/$(id -u)/com.pby2017.study-android.ai-research\`.
RESUME_EOF
  touch "$DISABLED_FILE"
  echo "Codex headless failed. Wrote resume checkpoint, disabled future scheduled runs, and stopped cleanly."
  exit 1
fi

rm -f "$DISABLED_FILE"

echo "Running wrapper verification"
ruby -c scripts/auto_post.rb
ruby -e 'require "yaml"; YAML.load_file("_data/cards.yml"); YAML.load_file("_data/ai_queue.yml"); puts "yaml_ok"'
git diff --check

if git diff --quiet && git diff --cached --quiet; then
  echo "No changes generated."
  exit 0
fi

git add README.md _data/cards.yml _data/ai_queue.yml auto-post-log.md scripts/ logs/.gitkeep .gitignore .codex/skills/local-ai-card-routine/SKILL.md 2>/dev/null || true
git add research/ai-routine 2>/dev/null || true

git commit -m "$(cat <<'MSG'
Publish researched AI cards from local routine

The local launchd routine researches current AI developer tooling,
updates GitHub Pages card data, verifies YAML/script health, then pushes
the generated batch from the developer machine instead of paid Actions.

Constraint: GitHub Actions intentionally disabled to avoid paid workflow use
Constraint: Local run should fit a 3-hour cadence with research-heavy execution
Confidence: medium
Scope-risk: moderate
Directive: Keep scheduling local-only unless the owner explicitly asks for GitHub Actions again
Tested: ruby -c scripts/auto_post.rb; YAML load for card data; git diff --check
Not-tested: Full long-running headless research cycle in this commit
MSG
)"
git push origin "$(git branch --show-current)"

echo "[$(date '+%Y-%m-%d %H:%M:%S %Z')] local AI research pipeline complete"
