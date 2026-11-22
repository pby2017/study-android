# Local AI routine checkpoint — 2026-11-23

## Current phase
- Corrected the local pipeline invocation to use supported `codex exec`; headless smoke test returned `CODEX_EXEC_OK`.
- Reloaded the 4-hour LaunchAgent with direct script execution (no login zsh). The real routine ran through Codex and generated one new ML Kit Agent API card plus a Karpathy-guidelines refinement.
- Wrapper verification exposed Ruby's US-ASCII default under launchd; fixed the UTF-8 log test and set UTF-8 locale in the LaunchAgent.
- The current routine output remains uncommitted and is preserved in the worktree. Re-run all validations, commit and push the card batch plus deterministic test fix, then reload/kickstart the LaunchAgent and verify a successful wrapper exit.
- Audit: `research/ai-routine/20261123-013535-karpathy-guidelines-and-topic-screen.md`.

## Latest validation
- `ruby -c scripts/auto_post.rb`: pass.
- `ruby scripts/auto_post_test.rb` with `LANG`, `LC_ALL`, and `LC_CTYPE` unset: 3 tests, 14 assertions, 0 failures/errors.
- YAML card/queue loading and selected-card field assertions: pass (983 cards).
- `node --test scripts/card-navigation.test.js`: 6/6 pass.
- `git diff --check`: pass.
- Full Jekyll build remains unverified because bundle dependencies are missing.

## Next actions
1. Finish verification, commit and push preserved card/refinement/audit output and the UTF-8 regression-test fix.
2. Run the 4-hour LaunchAgent again from the clean, synced worktree; verify it can pass its wrapper tests and finish commit/push without creating a disabled marker.
3. Continue oldest-first card review from the refinement cursor after the routine run is safely published.

No GitHub Actions or app-factory-android operations were performed.
