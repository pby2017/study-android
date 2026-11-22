# Local AI routine checkpoint — 2026-11-23

## Current phase
- Synced `master` with `git pull --ff-only origin master` before edits; it was already current.
- Refined LiteLLM using current official Python SDK, AI Gateway, and virtual-key docs. Replaced the stale feature list with the SDK-vs-control-plane decision and clarified Gateway operations and fallback risks.
- Research audit: `research/ai-routine/20261123-010900-litellm-sdk-gateway-boundary.md`.
- YAML/schema validation, Ruby syntax, routine tests (3 tests/14 assertions), navigation tests (6/6), and `git diff --check` passed. `bundle check` cannot satisfy Gemfile dependencies; Jekyll build remains unverified, and no gems were installed.
- Published as `7b47fba` (`Clarify the LiteLLM SDK and gateway boundary`); `origin/master` matched after push and the worktree was clean.
- The study-android knowledge-card objective remains active.

## Next actions
1. Run the YAML/schema, Ruby, routine, navigation, and diff checks; update the audit.
2. Before the next edit, run `git pull --ff-only origin master`; continue with `E2B` and verify sandbox/security boundaries from current primary sources.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
