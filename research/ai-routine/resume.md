# Local AI routine checkpoint — 2026-11-23

## Current phase
- Synced `master` with `git pull --ff-only origin master` before edits; it was already current.
- Refined Dify as an AI+Android backend-security card: Dify's app API key stays on the server; its `user` field scopes data but does not authenticate. Added retrieval validation, license caveat, difficulty, sources, and interview recall.
- Research audit: `research/ai-routine/20261123-012000-dify-android-api-key-boundary.md`.
- YAML/schema validation, Ruby syntax, routine tests (3 tests/14 assertions), navigation tests (6/6), and `git diff --check` passed. `bundle check` reports missing Gemfile dependencies; Jekyll build remains unverified and no gems were installed.
- Published as `062f458` (`Teach Dify API key safety for Android clients`); `origin/master` matched after push and the worktree was clean.
- Previous verified publication: E2B `a094be9` (`Clarify E2B sandbox trust boundaries`) and checkpoint `790292f`.
- Previous verified publication: LiteLLM `7b47fba` with checkpoint `1cf4f3c`.
- The study-android knowledge-card objective remains active.

## Next actions
1. Before the next edit, run `git pull --ff-only origin master`; continue with the next eligible oldest-first card after checking its prior refinement history.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
