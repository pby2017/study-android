# 2026-11-23 00:56 KST — mini-SWE-agent refinement

## Scope and sync

- Synced `master` with `git pull --ff-only origin master` before edits; no incoming changes.
- Refined one existing AI card. No new topic, GitHub Actions, or app-factory work.

## Sources checked

- https://github.com/SWE-agent/mini-swe-agent
- https://api.github.com/repos/SWE-agent/mini-swe-agent
- https://www.swebench.com/

## Evidence

- The current v2 README describes an approximately 100-line agent class, bash as its only tool, linear conversation history, and independent `subprocess.run` actions. It frames the design as useful for baseline systems, fine-tuning, and benchmark evaluation.
- The README advertises SWE-bench Verified performance above 74%. This is a project README claim, not a date-/model-/harness-pinned universal comparison. The current official leaderboard distinguishes Verified (500 human-filtered tasks) from its Bash Only view (500 tasks with the mini-SWE-agent environment common to models). Preserve the claim only as an attribution in research, not as a title or current headline score.
- Security nuance: an independent subprocess per action can simplify environment replacement, but does not itself isolate commands. Actual filesystem/network/privilege limits must come from the execution environment; this is an engineering inference from the documented execution model.
- Live GitHub API attention/activity snapshot: 9,958 stars, 1,364 forks, MIT license, not archived, last pushed 2026-11-16. Stars are an attention signal, not evidence of adoption or benchmark validity.

## Card changes

- Removed the stale-looking `74%` headline and distinguished the README's claim from current leaderboard comparisons.
- Reframed the lesson around a small, inspectable agent scaffold; clarified trajectory observability and the boundary between process execution and sandboxing.
- Added `중급`, two primary source links, and an interview question/answer focused on architecture and benchmark comparability.

## Confidence

- High for the design and benchmark-scope statements; medium for current attention/activity, which is a point-in-time GitHub snapshot.

## Verification

- `ruby -c scripts/auto_post.rb` — passed.
- Both card and queue YAML parsed; the card has the required level, two sources, three points, interview, and answer.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed, including single-card random display, ordered navigation, category filter, and deep-link restoration.
- `git diff --check` — passed after removing an extra trailing blank line in the log.
- `bundle check` — unable to satisfy the Gemfile because required gems are not installed; no dependency installation was attempted. Therefore a Jekyll build remains unverified.
