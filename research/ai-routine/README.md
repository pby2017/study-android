# AI routine research notes

Local 4-hour routine writes one note per run here.

Each note should record:
- candidates considered
- source URLs checked
- popularity / star / adoption signals
- fact-check signals
- selection or rejection reason
- confidence

Rule: weak evidence means no card. The routine should not fill quota by force.

## Scope

This directory documents the `study-android` AI and AI+Android knowledge-card routine. The routine discovers, explores, researches, verifies, summarizes, and publishes public-facing Korean cards to the study-android repository. It is not an app-factory-android product automation loop.

Non-goals:
- Do not create or update app-factory-android GitHub issues.
- Do not create app-factory-android feature branches or pull requests.
- Do not comment on, close, triage, or otherwise mutate app-factory-android issue/PR state.
- Do not publish pure Android topics. Do not treat AI+Android topic research as an app implementation request.


## Topic eligibility

Only two topic classes qualify:

1. **AI topics** — Claude CLI, Codex, LLMs, agents, MCP, AI coding tools, model releases, benchmarks, AI infra, prompt/context engineering, AI security, and similar AI-native developer subjects.
2. **AI+Android topics** — Android development where AI is the central angle, such as on-device LLMs, AI-assisted Android testing, mobile AI inference, Android agent workflows, AI UX for mobile, or AI tooling that materially changes Android development.

Pure Android topics are out of scope. If a candidate has no meaningful AI angle, reject it as below the routine threshold even if it is useful Android content.

## Evidence gate

A card may be published only when all are true:

1. Practical developer value is clear.
2. Topic is current, recently active, or newly relevant.
3. At least one popularity, adoption, benchmark, official, or reputable-coverage signal exists.
4. At least one primary or highly reputable source supports the central claim.
5. Exact metrics such as star counts are verified during the same run if included.
6. Existing cards were checked for duplicate titles or duplicate angles.
7. The final card is safe for public GitHub Pages visibility.

Weak evidence means no card. A no-card run is valid when the research note explains what was checked and why candidates were rejected.

## Research note fields

Each completed run note should include:
- run timestamp
- selected candidates
- rejected or deferred candidates that received meaningful review
- source URLs checked
- popularity/star/adoption signals
- exact metrics verified during the run, if used
- fact-check signals
- selected/rejected reason
- confidence
- published card title and source, when applicable

## Resume checkpoint fields

`research/ai-routine/resume.md` should include:
- paused timestamp
- blocking reason
- current phase
- candidates already checked
- source URLs already opened
- selected candidates not yet written as cards
- rejected candidates and reasons
- exact next actions
- whether `.local-ai-research.disabled` was created

## App-factory non-mutation check

Manual observation commands, when needed:

```bash
gh issue list -R pby2017/app-factory-android --state all --limit 5
gh pr list -R pby2017/app-factory-android --state all --limit 5
```

These commands are read-only checks. The study-android routine must not mutate app-factory-android issue or PR state.

## Local headless routine setup record

### Goal

Run the AI-card publishing pipeline from this Mac, not GitHub Actions. The job should:

1. sync with `origin/master` before edits,
2. research current AI/developer-tooling topics with web search,
3. accept only topics with practical value, recency, popularity/adoption signals, and fact-checkable sources,
4. update card data in the repo,
5. verify YAML/script health,
6. commit and push the batch,
7. repeat every 4 hours.

### Scheduler

- Scheduler: macOS `launchd`
- Label: `com.pby2017.study-android.ai-research`
- Plist: `~/Library/LaunchAgents/com.pby2017.study-android.ai-research.plist`
- Installer: `scripts/install_local_ai_cron.sh`
- Cadence: `StartInterval = 14400` seconds (4 hours)
- Immediate run: installer uses `RunAtLoad` and `launchctl kickstart`
- Failure guard: `.local-ai-research.disabled` stops future scheduled runs after a Codex failure until removed manually.
- Logs:
  - `logs/launchd.out.log`
  - `logs/launchd.err.log`
  - `logs/local-ai-research-YYYYMMDD-HHMMSS.log`

Useful status commands:

```bash
launchctl print gui/$(id -u)/com.pby2017.study-android.ai-research | grep -E 'state =|pid =|last exit|runs ='
ls -t logs/local-ai-research-*.log | head -1 | xargs tail -n 120
```

Manual immediate run:

```bash
launchctl kickstart -k gui/$(id -u)/com.pby2017.study-android.ai-research
```

### Headless provider decision

Primary provider is Codex headless:

```bash
codex --search exec -C "$ROOT" --dangerously-bypass-approvals-and-sandbox "$PROMPT"
```

Reasoning:
- `codex exec` is the non-interactive/headless Codex surface.
- Top-level `--search` enables live web search for the research-heavy routine.
- `-C "$ROOT"` fixes the working root.
- `--dangerously-bypass-approvals-and-sandbox` is used because launchd has no human approval loop; this job is local-only and repo-scoped by prompt/script guardrails.

No fallback providers are configured. The routine is Codex-only by owner request: if Codex fails, the job writes `research/ai-routine/resume.md`, creates `.local-ai-research.disabled`, exits non-zero, and future scheduled runs do nothing until the marker is removed after Codex is fixed.

The wrapper owns final verification, commit, and push. Headless Codex is instructed not to commit/push directly.

### Issues found and fixes applied

1. **Wrong Codex headless syntax**
   - Symptom: `codex -p` treated `-p` as profile, not prompt.
   - Cause: current Codex CLI uses `codex exec` for non-interactive execution.
   - Fix: changed routine to `codex exec ... "$PROMPT"`.

2. **Wrong placement for `--search`**
   - Symptom: `codex exec --search` rejected the flag.
   - Cause: `--search` is a top-level Codex option.
   - Fix: changed command to `codex --search exec ...`.

3. **Unsupported approval flag variant**
   - Symptom: `--ask-for-approval never` was rejected in the automation path used at the time.
   - Fix: changed launchd/headless command to `--dangerously-bypass-approvals-and-sandbox`.

4. **launchd could not execute Homebrew symlink reliably**
   - Symptom: launchd failed to run `/opt/homebrew/bin/codex` in one run.
   - Cause: launchd environment/path/symlink resolution can differ from an interactive shell.
   - Fix: resolve the actual Codex binary with `realpath "$(command -v codex)"` before running.

5. **Codex backend returned transient 404**
   - Symptom: log showed `wss://chatgpt.com/backend-api/codex/responses` and HTTPS fallback returning `404 Not Found`.
   - Diagnosis: local install/auth were healthy; later `codex doctor` reported websocket `HTTP 101 Switching Protocols`, and smoke tests with `codex exec` and `codex --search exec` succeeded.
   - Conclusion: likely temporary ChatGPT Codex backend/edge routing issue, not repo/script syntax.
   - Mitigation: keep the routine Codex-only, write a resume checkpoint on failure, disable future scheduled runs, fix Codex, remove `.local-ai-research.disabled`, then manual kickstart.

6. **Fallback providers removed**
   - Symptom: Gemini fallback could spend time retrying `429 RESOURCE_EXHAUSTED / MODEL_CAPACITY_EXHAUSTED` instead of forcing Codex issues to be fixed.
   - Owner decision: use Codex only.
   - Fix: remove Gemini/Claude/OMX fallback from `scripts/local_ai_research_pipeline.sh`.

7. **Stale resume checkpoint after provider failure**
   - Symptom: `research/ai-routine/resume.md` could remain after a failed provider cycle.
   - Fix approach: remove stale checkpoint once provider health is confirmed, then restart launchd so a clean Codex-first run begins.

### Verification snapshots

Commands used during setup/debug:

```bash
codex --version
codex doctor
codex exec -C /Users/byungyongpark/Desktop/study-android --dangerously-bypass-approvals-and-sandbox 'Say OK only.'
codex --search exec -C /Users/byungyongpark/Desktop/study-android --dangerously-bypass-approvals-and-sandbox 'Say OK only.'
launchctl print gui/$(id -u)/com.pby2017.study-android.ai-research | grep -E 'state =|pid =|last exit|runs ='
```

Observed good state after debugging:
- Codex CLI: `0.140.0`
- Auth: ChatGPT token configured
- Websocket: connected (`HTTP 101 Switching Protocols`)
- Smoke test: `codex exec` returned `OK`
- Search smoke test: `codex --search exec` returned `OK`

### Operational rules

- Before local edits, sync with `git pull --ff-only origin master` when clean because other sessions may push to the same repo.
- Do not add GitHub Actions for this pipeline unless explicitly requested; the owner wants local scheduling to avoid paid workflow use.
- Do not force low-quality cards to fill a quota. Weak evidence means no card.
- If Codex/quota/tooling fails mid-run, write `research/ai-routine/resume.md` with exact next actions and source URLs gathered so far, then create `.local-ai-research.disabled` so the 4-hour loop does not waste resources.
- Known-broken Codex or environment failures must pause repeated unattended runs until recovery is confirmed by a smoke test.
- If `resume.md` is stale and Codex health is confirmed, remove it and `.local-ai-research.disabled` before restarting the routine.

## Current owner decision: success gate before schedule

The routine must not keep retrying a known-broken Codex setup every 4 hours. The required sequence is:

1. Run a Codex smoke test successfully.
2. Remove `.local-ai-research.disabled` if it exists.
3. Kickstart launchd once.
4. Only then leave the 4-hour cadence enabled.

Smoke test:

```bash
codex --search exec -C /Users/byungyongpark/Desktop/study-android --dangerously-bypass-approvals-and-sandbox "Say OK only."
```
