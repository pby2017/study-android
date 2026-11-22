# SWE-EVO card refinement

Date: 2026-11-22 (Asia/Seoul)

## Scope and decision

Refined the existing AI benchmark card. Kept SWE-EVO's core lesson—single-issue coding-agent benchmarks do not establish release-scale maintenance ability—and tightened the benchmark interpretation. This is an existing-card refinement, not a claim that SWE-EVO is a broadly adopted or high-star project.

## Evidence checked

- Latest paper version: https://arxiv.org/abs/2512.18470 (v6, revised 2026-05-22).
  - Dataset: 48 release-sized tasks across 7 mature Python repositories.
  - Mean edited files: 20.9; mean total tests: 874.
  - Best reported SWE-EVO result: GPT-5.4 with OpenHands, 25% Resolved Rate.
  - GPT-5.2: 18.75% with OpenHands and 22.92% with SWE-agent. SWE-bench Verified reports 72.80% for GPT-5.2 under the paper's bash-only comparison column.
  - One resolved task changes the aggregate score by 2.08 percentage points. Authors caution against over-interpreting small gaps.
  - Resolved Rate requires all FAIL_TO_PASS and PASS_TO_PASS tests to pass. Fix Rate captures partial FAIL_TO_PASS progress only when regression tests pass; it is not a full code-quality metric.
- Author repository: https://github.com/SWE-EVO/SWE-EVO
  - Public dataset and evaluation code; MIT license; 63 stars and 17 forks observed on 2026-11-22. This is a modest signal, not evidence of mass adoption.

## Changes and rationale

- Removed the old “SWE-bench Verified is saturated at Opus 4.8 88%” claim; the cited paper does not support that statement, and it distracts from SWE-EVO's actual contribution.
- Corrected the comparison: 22.92% is GPT-5.2 with SWE-agent, while the 72.80% Verified result is reported in a bash-only comparison column. These are not a controlled head-to-head; card language now labels the setup difference.
- Added sample-size caution (48 tasks; 2.08 percentage points per solved task) and distinguished hard Resolved Rate from partial Fix Rate.
- Added an advanced label and interview question/answer to reinforce benchmark-selection judgment.

Confidence: high for the reported paper results and dataset; medium for practical generalization beyond the seven Python projects and tested scaffolds.

## URLs opened

- https://arxiv.org/abs/2512.18470
- https://arxiv.org/html/2512.18470v6
- https://github.com/SWE-EVO/SWE-EVO
