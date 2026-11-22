# Card refinement audit — Context Rot

Reviewed: 2026-11-22 23:57 KST

## Sources checked

- Chroma technical report (July 2025): <https://www.trychroma.com/research/context-rot>
- Reproduction toolkit and repository metadata: <https://github.com/chroma-core/context-rot>

## Evidence and review

- The report evaluates 18 LLMs across controlled NIAH variants, LongMemEval, and repeated-word tasks. Its central claim is non-uniform performance as input grows, not that every model fails identically in every long-context task.
- For LongMemEval, the report filters to 306 questions. Full prompts average about 113k tokens; focused prompts average about 300 tokens. It reports significantly higher focused-prompt performance across all tested models. The full prompt requires retrieval and reasoning, while the focused condition supplies only relevant material; therefore this comparison does not isolate context length alone or prove that 300 tokens is universally optimal.
- The report is a Chroma-authored technical report, not an independent or peer-reviewed guarantee. It does provide a public toolkit to reproduce experiments. The public repository showed 323 stars and 35 forks during this review; this is a modest signal for the toolkit, not a measure of model adoption.
- Duplicate scan: the deck has related context engineering, compaction, and agent-memory cards, but no other card explaining this specific controlled LongMemEval comparison. Keep the topic as complementary rather than imply that all long-context use is harmful.

## Change decision

Retain and rewrite the legacy card. Replaced the clickbait claim that all 18 models' accuracy “collapses” with a bounded conclusion; added intermediate level and interview retrieval. Center practical advice on retrieving/summarizing relevant evidence and evaluating real workloads. Explicitly label the 300-token prompt as a study average, not a universal budget.

Confidence: high for the report's stated setup and results; medium for applying those results to production agents because the report is a vendor-authored technical report and benchmarks do not establish every workload.
