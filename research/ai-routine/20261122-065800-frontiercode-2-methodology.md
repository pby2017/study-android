# FrontierCode 2.0 card refinement

## Decision

Refined the existing AI developer-evaluation card. Its original text described the June 8 FrontierCode 1.0 launch, nested Extended/Main/Diamond sets, model scores, and an 81%-lower-false-positive claim. The current leaderboard is on FrontierCode 2.0 and notes that 1.1 deprecated Diamond, so the previous details were stale and would misrepresent the current benchmark.

## Primary sources checked

- https://cognition.com/blog/frontier-code-2.0
  - Published 2026-10-27. Describes broader repositories/categories (including security and performance), higher mergeability standards, larger task scope, and thoroughness criteria for conditions inferable from code and user intent.
  - Reports reference changes average 67% more files and 89% more lines than 1.1, in codebases 25% larger. Omitted these volatile/comparative figures from the short card.
  - Score is weighted rubric aggregate; solutions failing blockers score zero. The post discusses avoiding regressions, effective tests, scope, compatibility, thoroughness, and more.
- https://cognition.com/frontiercode
  - Current leaderboard identifies FrontierCode 2.0 as a 132-task suite and lists methodology revisions. It states FrontierCode 1.1 deprecated the Diamond subset and the current 2.0 leaderboard launch date is 2026-10-27.
  - Model and score table changes frequently; no live model ranking/score was included in the card.

## Card changes

- Replaced stale 1.0/1.1 title, task-set counts, model scores, and false-positive comparison with current 2.0 framing.
- Added advanced level, compact key points, and an interview question/answer.
- Emphasized evaluator design lessons: functional correctness alone misses inferred requirements, thoroughness, compatibility, and regressions; understand blocker criteria and benchmark version before comparing scores.

## Confidence

High for the current suite version, 132-task count, methodology, and blocker score behavior based on the benchmark publisher's current pages. Model rankings are dynamic and intentionally excluded.
