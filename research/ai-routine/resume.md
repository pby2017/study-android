# Local AI routine checkpoint — 2026-11-23

## Current phase
- Synced `master` with `origin/master` before edits; it was already up to date.
- Refined the existing Claude Code code-review card. The updated lesson distinguishes the bundled `/code-review` command from the official plugin and says to verify actual agent execution and diff coverage rather than infer completion from a clean exit or “no issues” output.
- Research audit: `research/ai-routine/20261123-004800-code-review-execution-evidence.md`.
- Validation passed: card YAML/schema lookup, `ruby -c scripts/auto_post.rb`, `ruby scripts/auto_post_test.rb` (3 runs, 14 assertions), `node --test scripts/card-navigation.test.js` (6 tests), and `git diff --check`.
- This is one incremental refinement; the overall study-android card objective remains active.

## Next actions
1. Review the older Spotify Honk card against current first-party Spotify and Anthropic sources; update only if its factual detail or learning value has drifted.
2. Sync with `git pull --ff-only origin master` before the next edit.
3. Continue oldest-first card review and keep every published topic within AI or AI+Android scope.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
