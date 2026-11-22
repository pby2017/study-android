# Claude Managed Agents Dreams card refinement — 2026-11-22

## Decision
Replace the shorthand feature comparison and oversized Harvey headline with a compact API mental model: Dreams performs asynchronous curation over an existing memory store plus transcripts, returns a separate candidate store, and leaves adoption/review to the developer. Explain when memory helps and note preview, billing, and data-retention constraints.

## Sources checked
- https://platform.claude.com/docs/en/managed-agents/dreams — current API behavior: research preview; one existing memory store plus 1–100 sessions; asynchronous output store; input immutability; review/attach/discard; standard token billing; output `usage`; ZDR and HIPAA eligibility.
- https://www.anthropic.com/research/components-of-agent-memory — Anthropic's Nov 6, 2026 explanation of memory vs model-weight learning and task-dependent evaluations. The wiki helped multi-document merger questions (87% vs 73% search-only) but had no clear gain on a legal task whose criteria were largely retrievable from a single document. It warns that injected/overgrown memory can consume tokens and propagate wrong notes.
- https://claude.com/blog/new-in-claude-managed-agents — May 19 product announcement: Dreams is a research preview; Harvey uses it for long-form legal drafting/document creation and reports ~6× completion rates in its tests.

## Fact checks and corrections
- Dream input consists of an existing memory store and 1–100 prior session transcripts; the API asynchronously creates a separate output store. The input is not modified. The developer may review and attach, archive, or delete the output.
- Dreams curates external memory; it does not train/change model weights. Anthropic's research explicitly distinguishes agent memory from weight changes and in-context learning.
- The ~6× figure is Harvey's result “in their tests,” reported by Anthropic. The announcement does not publish the task definition, baseline, or measurement methodology; card labels it as customer-specific, not an expected lift.
- Anthropic's Nov 6 experiments show task dependence: memory/wiki helped a cross-document merger task, but did not clearly improve a task where direct search found answers in one source. Memory is not automatically useful for every workload.
- The official docs still mark Dreams research preview, bill it at the selected model's token rates, and identify Managed Agents sessions as not ZDR-eligible. Avoid sensitive transcript processing without checking policy and access requirements.

## Card updates
- Added intermediate level, concise API/data flow, task-dependent use case, caveats about the customer metric, three official sources, and interview retrieval Q/A.
- Removed shorthand comparison to Outcomes/Multiagent orchestration because it did not teach the memory-correction mechanism.

Confidence: high for the API and Anthropic's published research/announcement; limited for Harvey's metric because its evaluation methodology is not public in the cited announcement.
