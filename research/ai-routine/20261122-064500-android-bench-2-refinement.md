# Android Bench 2.0 card refinement — 2026-11-22

## Decision

Refined the existing Android Bench card rather than adding another benchmark card. The old title and summary described Android Bench 1.0's localized PR tasks and volatile model leaderboard scores. Those claims no longer represented the official Android Bench 2.0 page.

## Facts checked against primary sources

- Official leaderboard: https://developer.android.com/bench
  - Current page labels the benchmark Android Bench 2.0 and reports 30 long-horizon tasks.
  - It exposes pass rate, confidence interval, completion rate, average latency, and average cost; ranking values are live and therefore omitted from the durable card.
- Official methodology: https://developer.android.com/bench/methodology/2
  - The 30 tasks cover app creation, migrations, new features, and cross-platform app conversion.
  - Each task has five independent runs to account for nondeterministic agent behavior.
  - Evaluation uses isolated Docker containers and hardware-accelerated Android virtual devices.
  - Checks include instrumentation assertions, database state, intents/network/events, regression suites, UI walkthroughs, visual judgment, and accessibility-tree inspection.
  - Pass rate measures perfect task success; completion rate provides partial-progress signal when a run does not pass.

## Card changes

- Added intermediate level and an interview question/answer.
- Replaced stale 1.0 title, task counts, and model scores with the 2.0 long-horizon evaluation design.
- Explained the distinction between full pass and partial completion; cautioned against reading leaderboard rank without run/task context.
- Kept a single authoritative official source URL in the card; this note records the methodology URL used for verification.

Confidence: high. No popularity claim is used; this is a first-party Android engineering evaluation relevant to AI coding-agent use.
