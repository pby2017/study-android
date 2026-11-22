# SWE-bench Multimodal card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Verify task-count discrepancies and refresh the card using the current official benchmark release.

## Decision

Retain the topic and make its transferable lesson relevant to Android UI debugging: visual evidence helps diagnose user-facing bugs, but expected behavior, reproduction steps, rendered-output inspection, and functional regression tests are separate evidence. Explicitly state that SWE-bench M itself is a JavaScript benchmark, not an Android evaluation.

## Evidence and count reconciliation

- Current official benchmark page: <https://www.swebench.com/multimodal>
  - Says the original release augmented the benchmark with 517 issues containing visual elements.
  - Announces Multimodal v2 on 2026-09-01 with 480 tasks retained for reproducible evaluation after removing known flaky or ungradeable tests; Docker environments were rebuilt and JavaScript grading/visual test assets improved.
- ICLR 2025 paper: <https://proceedings.iclr.cc/paper_files/paper/2025/file/07d6332ae36730707fddddba736d7b6c-Paper-Conference.pdf>
  - Abstract reports 617 task instances; the paper's introduction and conclusion say 619, while its appendix table describes 517 test-split instances.
  - A subset of 69 benchmark instances uses pixel-level visual testing; visual inputs are not equivalent to visual-output validation on every task.
  - The authors report human annotators judged associated images necessary on 83.5% of the 557 instances with images (paper's task/image scope), not all tasks indiscriminately.
- Hugging Face dataset card: <https://huggingface.co/datasets/SWE-bench/SWE-bench_Multimodal>
  - Describes 612 issue–PR pairs: dev 102 and test 510 across disjoint repositories.
- These figures refer to different artifacts/units/releases and are not fully reconciled by the public pages: paper total (617/619), initial visual-issue count (517), issue–PR pair count (612), and current v2 reproducible tasks (480). The card therefore uses only the current v2 figure and avoids treating the counts as interchangeable.

## Card changes

- Removed the old single-count claim and historical SWE-agent 12% vs. 6% performance comparison.
- Used the current v2 reproducible-task count, with its release qualification.
- Distinguished visual issue interpretation from output validation; noted the original paper used pixel-level visual tests only on a subset.
- Added Android transfer guidance while explicitly limiting the benchmark's scope to user-facing JavaScript software.
- Added level and interview retrieval question.

## Validation

Run Ruby syntax, both YAML loads, targeted card assertions, routine tests, and `git diff --check` before commit.

Confidence: high on current v2 description and documented scope; medium on cross-source numerical reconciliation because the paper and dataset pages report different totals and units without a complete mapping. The card intentionally avoids those ambiguous original-release totals.
