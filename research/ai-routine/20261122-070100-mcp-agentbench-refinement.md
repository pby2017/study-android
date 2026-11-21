# MCP-AgentBench card refinement

## Decision

Refined an existing AI developer-evaluation card. The prior card's benchmark construction claims were broadly supported, but its model leaderboard comparisons were historical and encouraged reading an old fixed experiment as current model capability. The updated card focuses on the durable evaluation design and qualifies the judge agreement figure by its actual sample.

## Primary sources checked

- AAAI 2026 publication, DOI: https://doi.org/10.1609/aaai.v40i37.40347
- Full paper HTML: https://arxiv.org/html/2509.09734

Verified in the paper:

- Testbed: 33 MCP servers, 188 tools; selected for executability/stability, stateless behavior, and text-based interaction. This is a curated paper testbed, not a current inventory of all MCP servers.
- Benchmark: 600 queries, six categories formed from single/multiple server scope and single/parallel/sequential call dependency; 100 queries per category.
- MCP-Eval evaluates final task success against query/reference material, rather than requiring one fixed trajectory, because multiple tool-use paths and self-correction can be valid.
- Judge-human comparison: three experts rated 60 items (10 per category, Claude 3.7 Sonnet outputs). MCP-Eval agreement with human majority was 91.67%; Cohen's kappa was 0.734. These are sample-specific agreement figures, not a guarantee of general judge correctness.
- The paper's model results cover a historical model set and implementation setup. Removed Qwen/Kimi/GPT-4o ranking claims from the card.

## Card changes

- Added advanced level and an interview recall question/answer.
- Reframed the takeaway around path-agnostic outcome evaluation, complexity categories, evidence of tool use, and judge validation limits.
- Kept exact counts only where directly supported by the paper.

## Confidence

High for paper-reported benchmark construction and sample-level evaluation results. The testbed and model experiments are a research snapshot and should not be presented as current ecosystem coverage or model rankings.
