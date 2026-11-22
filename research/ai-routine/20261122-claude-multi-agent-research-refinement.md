# Multi-agent research pattern card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked Anthropic's primary engineering/research article: https://www.anthropic.com/research/multi-agent-research-system
- Kept the 90.2% result but explicitly scoped it to Anthropic's internal evaluation (Opus 4 lead + Sonnet 4 subagents vs. single Opus 4), not a general guarantee.
- Corrected token-cost framing: the article reports multi-agent systems use about 15x the tokens of chat interactions; it separately says agents typically use about 4x.
- Preserved the use-case boundary: breadth-first, independent parallel research and information exceeding one context; many dependent coding tasks may not benefit.
- Replaced detailed implementation-specific agent names and rigid agent-count rules with reusable design principles: task boundaries, goals, tools, and output formats.
- Added intermediate difficulty and an interview retrieval question.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
