# AGENTS.md context-file card refinement — 2026-11-22

## Decision
Correct the headline from “automatically generated files reduce success” to the paper's statistical result: context files did not significantly change task success in the studied settings, while adding inference cost. Explain the boundary and preserve a measured-use recommendation instead of telling all projects to remove AGENTS.md.

## Sources checked
- https://arxiv.org/abs/2602.11988 — current arXiv v3 (revised 2026-09-29) abstract, authors, submission history, and summary: no general task-success improvement; over 20% average inference cost increase; context files can still encode non-standard practices.
- https://arxiv.org/html/2602.11988 — full paper, including main outcome tables, significance tests, experimental setup, and limitations.

## Fact checks and corrections
- Scope: SWE-bench Lite (300 issues from 11 popular Python repositories) and CTXbench (138 Python tasks from 12 repositories). This is issue-resolution performance, not Android/Kotlin development or every use of agent context.
- Generated context: success changes were not statistically significant (none-vs-LLM p=0.87 on SWE-bench and p=0.37 on CTXbench); measured costs increased 20% and 23% on average, respectively.
- Developer-provided context: 2.4% average performance increase over no context was not statistically significant (p=0.21); it significantly outperformed LLM-generated context by 7% (p=0.038). Its use also increased average steps and cost, up to 19%.
- The previous wording that auto-generated context “lowers success” confused numerical direction with statistical evidence. Replaced it with the measured, non-significant result.
- The paper's v3 explicitly lists Python as a limitation and says results may differ for less represented languages/toolchains. Card now warns against direct Android/Kotlin extrapolation.
- Recommendation is phrased as a practical interpretation: keep repository-specific, non-obvious guidance and evaluate on representative local tasks. It is not presented as a measured Android finding.

## Card updates
- Added intermediate level, short summary, three quantitative points, source links to the abstract and paper, and an interview Q/A about external validity.
- Removed the unsupported blanket “delete AI-generated context / automatic docs are poison” framing.

Confidence: high; figures and p-values are checked against the current v3 paper text/tables.
