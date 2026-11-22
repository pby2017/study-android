# SWE-Perf card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- Latest paper v2 (revised 2026-07-01; arXiv lists acceptance at ICML 2026): https://arxiv.org/abs/2507.12415
  - Dataset: 140 instances from nine popular GitHub Python repositories, filtered from 102,241 PRs.
  - The task includes the repository code, target functions, performance tests, an expert patch, and an executable environment. It is not an unconstrained blind task: oracle (file-level context) and realistic (repository-level agent) settings are distinct.
  - Data construction checked correctness by requiring relevant tests to pass on both original and modified versions; performance was measured with repeated runs and statistical filtering.
  - The evaluation separates correctness and performance analysis. A faster patch alone is not sufficient evidence of a useful optimization.
  - The authors report a remaining OpenHands-to-expert gap of 8.59% in their evaluated setup. Omitted from the card because it is model/setup-specific and would age quickly.
- Project overview: https://swe-perf.github.io/
  - Confirms benchmark scope and 140 tasks; repeats the 102,241-PR, nine-repository construction.
- Public repository API: https://api.github.com/repos/SWE-Perf/SWE-Perf
  - Snapshot checked 2026-11-22: 55 stars, 10 forks; last push 2025-10-28. Small attention signal only; no star count included in the card.
- Public repository: https://github.com/SWE-Perf/SWE-Perf

## Changes and rationale

- Removed “first repository-level benchmark” because it was overbroad and not needed to explain the educational point.
- Reframed the card around the difference between correctness and performance evaluation.
- Added the sample and language boundary, target-function hint, and oracle vs realistic setup distinction to prevent overstating generality.
- Removed the 8.59-point headline because it depends on a particular evaluated setup and is less durable than the benchmark lesson.
- Added an advanced label and an interview question/answer about correctness, benchmark validity, and reproducible measurements.

Confidence: high for the paper's dataset, task formulation, and evaluation setup; medium for generalizing results beyond the benchmark's Python repositories and provided target functions.

## Sources

- https://arxiv.org/abs/2507.12415
- https://arxiv.org/html/2507.12415v2
- https://swe-perf.github.io/
- https://github.com/SWE-Perf/SWE-Perf
- https://api.github.com/repos/SWE-Perf/SWE-Perf
