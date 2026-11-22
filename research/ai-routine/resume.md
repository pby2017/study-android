# Local AI routine checkpoint — 2026-11-23

## Current phase
- Synced `master` before edits; it was already up to date.
- Refined `mini-SWE-agent` using the current v2 README, official SWE-bench leaderboard, and GitHub API snapshot. Removed the 74% headline, clarified benchmark subset/configuration boundaries and that `subprocess.run` does not itself provide sandbox isolation, and added intermediate retrieval Q&A.
- Research audit: `research/ai-routine/20261123-005600-mini-swe-agent-benchmark-boundaries.md`.
- YAML parsing/card fields, Ruby syntax, routine tests (3/14), navigation tests (6/6), and `git diff --check` passed. `bundle check` cannot satisfy Gemfile dependencies, so Jekyll build is unverified; no gems were installed.
- Published as `fe011e6` (`Make coding-agent benchmark claims comparable`); `origin/master` matched after push and the worktree is clean.
- The overall study-android card objective remains active.

## Next actions
1. Before the next edit, run `git pull --ff-only origin master`.
2. Continue oldest-first from the next eligible queued AI or AI+Android card; skip entries with newer refinement records.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
