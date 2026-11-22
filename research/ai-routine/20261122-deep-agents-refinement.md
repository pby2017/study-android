# Deep Agents card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Re-check the benchmark and harness-engineering claims in the Deep Agents card.

## Decision

Keep the card, but make the transferable lesson the controlled improvement loop: hold the model fixed, inspect traces for recurring failures, change a limited part of the harness, rerun the same evaluation, then check for regressions elsewhere.

## Evidence

- LangChain's experiment report: <https://www.langchain.com/blog/improving-deep-agents-with-harness-engineering>
  - Reports `gpt-5.2-codex` fixed while system prompt, tools, and middleware were iteratively adjusted.
  - Reports Terminal-Bench 2.0 score moving from 52.8% to 66.5%; this is the authors' result for that setup and publication-time ranking, not a current leaderboard guarantee or generalization claim.
  - Describes trace retrieval, parallel error analysis, synthesis, and targeted changes; warns that task overfitting can cause regressions.
- Current package and repository state (2026-11-22): <https://github.com/langchain-ai/deepagents>
  - GitHub API snapshot: 31,514 stars, 4,460 forks, MIT, not archived, last pushed 2026-11-22.
  - Latest release: `deepagents==0.7.41`, published 2026-11-20: <https://github.com/langchain-ai/deepagents/releases/tag/deepagents%3D%3D0.7.41>
- The current release demonstrates active maintenance; the historical experiment's numeric result remains useful only when clearly attributed and bounded.

## Card changes

- Removed the stale package release `0.6.12` and old static star count.
- Preserved the core experiment but identified the score as LangChain-reported and setup-specific, not current rank or universal lift.
- Removed implementation details (named middleware) that were not essential to the learning objective.
- Added a concise retrieval question about isolating model vs. harness effects and testing generalization.
- Added difficulty `고급`.

## Validation

Run Ruby syntax, both YAML loads, targeted card-field assertions, routine tests, and `git diff --check` before commit.

Confidence: high for the published experiment setup and current repository/release snapshot; medium-high for transferability, which must be validated on each agent/task distribution.
