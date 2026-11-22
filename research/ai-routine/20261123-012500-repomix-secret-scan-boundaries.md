# 2026-11-23 01:25 KST — Repomix output, secret scan, and MCP filesystem boundaries

## Sync and eligibility

- Ran `git pull --ff-only origin master` before edits; `master` was current and worktree was clean.
- Cursor named Amp as next, but the Amp card already has an audit from `20261123-001855-amp-agent-workflows-refinement.md` and contains current sources/learning fields. Skip the duplicate review and proceed to the next older card, Repomix.
- Repomix was a broad, legacy feature list with a stale star count and no learning level, current source links, or retrieval question. It fits the AI developer-tool scope.

## Sources checked

- https://github.com/yamadashy/repomix
- https://github.com/yamadashy/repomix/releases/tag/v1.18.0
- https://github.com/yamadashy/repomix/releases/tag/v1.19.0
- https://repomix.com/guide/security
- https://repomix.com/guide/mcp-server

## Evidence and selection

- GitHub snapshot showed approximately 29.4k stars, 1.7k forks, and MIT license. GitHub releases showed current v1.19.0 (released Nov 8, 2026), providing a second freshness signal. These are attention and maintenance signals, not proof of quality or deployment adoption.
- Repomix packs repository content into AI-friendly outputs and provides file selection, ignore rules, token counts, and optional compression. A generated pack is still a copy of repository data; sending it to an external model or MCP client is a separate disclosure decision.
- Repomix's release notes explicitly define Secretlint as a best-effort heuristic for known credential formats, not an access boundary. A clean scan therefore cannot prove the output contains no secrets or sensitive data.
- The official MCP guide says MCP without `--sandbox` can read paths available to the host user. `--sandbox` confines paths to a workspace and disables target config loading, but is application-level confinement, not an OS sandbox; untrusted hosted clients still require platform isolation.
- Remote repository configs are not loaded by default. Explicit `--remote-trust-config` can authorize configs where JS/TS may execute and processors can run external commands or paths can read outside the clone; review before trusting.
- This card has practical value for developer context export and MCP setups. No pure Android claims were added.

## Card changes

- Replaced stale packaging/marketing inventory with data disclosure and filesystem trust-boundary guidance.
- Removed old fixed star count; recorded a live rounded GitHub signal in this audit only.
- Added intermediate level, current official sources, and interview retrieval.

## Verification

- `_data/cards.yml` and `_data/ai_queue.yml` parse; the Repomix card has an allowed level, four sources, interview, and answer.
- `ruby -c scripts/auto_post.rb` — passed.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed.
- `bundle check` — Gemfile dependencies are unavailable; no dependencies were installed and the Jekyll build remains unverified.

## Confidence

- High for current CLI/MCP behaviors and Secretlint limits because current official documentation/release notes state them directly; medium for the time-sensitive star snapshot.
