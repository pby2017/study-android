#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
LOG_DIR="$ROOT/logs"
LOCK_DIR="$ROOT/.local-ai-research.lock"
mkdir -p "$LOG_DIR"

STAMP="$(date '+%Y%m%d-%H%M%S')"
RUN_LOG="$LOG_DIR/local-ai-research-$STAMP.log"

exec > >(tee -a "$RUN_LOG") 2>&1

cd "$ROOT"

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

AGENT_CMD=()
if [[ -n "${LOCAL_AI_AGENT_BIN:-}" ]]; then
  # shellcheck disable=SC2206
  AGENT_CMD=($LOCAL_AI_AGENT_BIN)
elif command -v codex >/dev/null 2>&1; then
  AGENT_CMD=(codex --search exec -C "$ROOT" -s danger-full-access --ask-for-approval never)
elif command -v omx >/dev/null 2>&1; then
  AGENT_CMD=(omx exec --search --madmax -C "$ROOT")
else
  echo "No headless agent found: need omx or codex in PATH"
  exit 127
fi

PROMPT=$(cat <<'PROMPT_EOF'
Use repo skill `.codex/skills/local-ai-card-routine/SKILL.md`.
Run local AI card routine now.
Important: edit this repository only; do not add GitHub Actions; do not commit or push.
Wrapper script owns final verification, commit, and push.
If usage/quota is near exhaustion or tool access degrades, write a resume checkpoint to `research/ai-routine/resume.md` with next actions, then stop cleanly.
PROMPT_EOF
)

echo "Running headless agent: ${AGENT_CMD[*]}"
timeout "${PIPELINE_TIMEOUT:-13800}" "${AGENT_CMD[@]}" "$PROMPT"

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
Constraint: Local run should fit a 4-hour cadence with research-heavy execution
Confidence: medium
Scope-risk: moderate
Directive: Keep scheduling local-only unless the owner explicitly asks for GitHub Actions again
Tested: ruby -c scripts/auto_post.rb; YAML load for card data; git diff --check
Not-tested: Full long-running headless research cycle in this commit
MSG
)"
git push origin "$(git branch --show-current)"

echo "[$(date '+%Y-%m-%d %H:%M:%S %Z')] local AI research pipeline complete"
