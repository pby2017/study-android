# Local AI routine checkpoint — 2026-11-23

## Current phase
- Synced `master` before edits; it was already up to date.
- Refined `Qwen3-Coder-Next` using its current Hugging Face model card and Qwen repository README. Corrected active-parameter memory implications and clarified native/extended context and tool-parser compatibility.
- Research audit: `research/ai-routine/20261123-010300-qwen3-coder-next-serving-boundaries.md`.
- YAML/schema validation, Ruby syntax, routine tests (3 tests/14 assertions), navigation tests (6/6), and `git diff --check` passed. Jekyll build remains unverified because bundled gems are missing; none were installed.
- Published as `6a6263a` (`Clarify Qwen coder active-weight serving costs`); `origin/master` matched after push and the worktree was clean.
- The overall study-android card objective remains active.

## Next actions
1. Before the next edit, run `git pull --ff-only origin master`.
2. Before editing again, run `git pull --ff-only origin master`.
3. Continue oldest-first with `DSPy`; add the missing level and interview retrieval while checking its current core design.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
