# Frequent Intentional Compaction card review

## Decision

Keep this AI engineering workflow card. Reframe the 40–60% context figure as a context-dependent heuristic from one team's experience, not a general optimum. Tighten the actionable steps and frame the BAML figures as a self-reported example rather than a benchmark or expected productivity gain.

## Sources checked (2026-11-23 KST)

- Humanlayer's article: https://github.com/humanlayer/advanced-context-engineering-for-coding-agents/blob/main/ace-fca.md
  - Defines the approach as structuring the full workflow around context management, with a 40–60% context-utilization range that varies with task complexity.
  - Splits work into research, plan, and implement; the article says phases may repeat or be skipped, and that verified implementation progress is compacted into the plan.
  - Describes a 300k-LOC BAML project and paired 7-hour work session for cancellation and WASM support; the author says one PR was approved and the other was still open at that point. It is an anecdotal report, not a controlled productivity study.
  - Explicitly describes failed efforts and the need for focused human engagement and codebase expertise.
- BAML merged PR: https://github.com/BoundaryML/baml/pull/2357
  - Confirms a concrete merged cancellation implementation and its testing details; does not independently validate the article's total LOC/time estimate.

## Card changes

- Added advanced level, interview question, and concise answer.
- Removed the implication that 40–60% is a universal target.
- Kept the author-reported BAML scale/time only with clear caveats and excluded it as an adoption or performance signal.
- Made the useful transfer lesson explicit: inspect research assumptions and the plan before code, then carry validated state rather than raw logs into a fresh context.

## Confidence

High for what the author recommends and what the linked PR merged; medium for general usefulness because the workflow is a practitioner account, not a controlled comparison. No universal productivity claim is made.
