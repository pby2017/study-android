# DX AI-code throughput card refinement — 2026-11-22

## Decision
Keep the underlying developer lesson but replace the stale Q1 AI-tool vendor ranking with the more current Q3 2026 cohort observation: AI-code volume and reviewer wait time should be tracked together. Do not present the cohort comparison as proof that AI caused review delays.

## Sources checked
- https://getdx.com/report/state-of-ai-impact-in-engineering-q3-report/ — DX's Q3 2026 report covers 500+ R&D organizations. It reports median time-to-first-review of 40 minutes for the 20–40% AI-code cohort and 82 minutes for the 80%+ cohort, based on July–September 2026. The report also reports median weekly complexity-weighted TrueThroughput rising 19% from Q2 to Q3 2026; that metric was not needed in the concise card.
- https://docs.getdx.com/reports/pr-throughput/ — DX defines PR throughput as merged pull requests per contributing engineer and describes TrueThroughput as an AI-adjusted complexity-weighted metric. This clarifies what the benchmark measures; it is not an independent validation of DX's dataset.
- https://getdx.com/news/new-dx-data-finds-94-of-ai-token-usage-is-re-reading-existing-context/ — DX's October 14, 2026 announcement repeats the Q3 results and adds context on PR size and token usage. It is another company-published summary, not an independent study.

## Fact-check and limits
- The primary report's chart labels are 20–40%, 40–60%, 60–80%, and 80+%; the corresponding displayed medians are 40, 56, 71, and 82 minutes. “105% longer” is the rounded comparison between 82 and 40 minutes.
- Report sample: 500+ companies overall; review-wait cohort period: July–September 2026. The larger throughput series spans October 2025–September 2026 and is a different time window.
- These are aggregate cohort associations. The public page does not establish random assignment, control for team differences, or demonstrate that AI-code share caused longer waits. The card says so explicitly.
- Rejected carrying forward the old product-level Cursor/Claude/Copilot figures: they described a Q1 comparison and are no longer the freshest useful lesson. Also omitted the 19% TrueThroughput increase because the card is clearer when centered on review queues rather than mixing separate metrics and windows.
- Attention/usefulness signal: the Q3 report analyzes 500+ R&D organizations and has a current 2026 data window. This indicates broad benchmark coverage, not proof that any particular AI tool is widely adopted.

## Card changes
- Added intermediate level and interview retrieval Q&A.
- Reframed title and summary around review capacity, preserved the critical causal caveat, and linked the report plus metric definition.

Confidence: high for the reported values and their stated sample window; medium for generalizing the cohort pattern beyond DX's dataset.
