# Local AI routine checkpoint — 2026-11-23

## Current phase
- Synced `master` before edits; it was already up to date.
- Refined `mini-SWE-agent` using the current v2 README, official SWE-bench leaderboard, and GitHub API snapshot. Removed the 74% headline, clarified benchmark subset/configuration boundaries and that `subprocess.run` does not itself provide sandbox isolation, and added intermediate retrieval Q&A.
- Research audit: `research/ai-routine/20261123-005600-mini-swe-agent-benchmark-boundaries.md`.
- YAML parsing/card fields, Ruby syntax, routine tests (3/14), navigation tests (6/6), and `git diff --check` passed. `bundle check` cannot satisfy Gemfile dependencies, so Jekyll build is unverified; no gems were installed.
- Commit/push are pending for this checkpoint.
- The overall study-android card objective remains active.

## Next actions
1. Commit and push this verified card refinement.
2. Continue oldest-first from the next eligible queued AI or AI+Android card; skip Kiro and cc-sdd because they already have newer refinement records.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
