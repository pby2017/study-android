# Terminal-Bench card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Replace an obsolete June 2026 Terminal-Bench 2.1 leaderboard snapshot with durable comparison guidance from the current official benchmark.

## Decision

Retain the benchmark topic, but focus on fair interpretation: the measured result belongs to a model + agent/harness + execution configuration, and results must be compared within the same benchmark version and conditions.

## Evidence

- Official Terminal-Bench site: <https://www.tbench.ai/>
  - Current page identifies Terminal-Bench 4.1.
  - Leaderboard rows contain model, agent, resolution rate, and 95% confidence intervals; table also exposes tokens and costs.
  - The official page identifies Stanford, Harbor, and Laude Institute as hosts.
- Official run guide: <https://www.tbench.ai/run>
  - Runs are executed through Harbor; example pins `terminal-bench/terminal-bench@4.1.0`, environment, agent, model, and `-k 5`.
  - Tasks can require GPUs, so sandbox/environment choice matters.
- Current leaderboard examples on retrieval date show a mixture of models and agents, confirming that the table is not a model-only ranking.

## Card changes

- Removed June 2026 Terminal-Bench 2.1 model ranking, model-version names, and the stale claim that the historical value represented current performance.
- Added current 4.1 evidence dimensions: model-agent pairing, 95% confidence interval, token/cost, version-pinned run conditions.
- Added retrieval Q&A about controlled comparisons.
- Added difficulty `고급`.

## Validation

Run Ruby syntax, both YAML loads, targeted card assertions, routine tests, and `git diff --check` before commit.

Confidence: high on current official leaderboard/run-guide fields; benchmark results still require per-run interpretation and should not be generalized beyond the task distribution.
