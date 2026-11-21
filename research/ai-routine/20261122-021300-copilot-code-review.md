# Card refinement: GitHub Copilot Code Review

- Reviewed: 2026-11-22 02:13 KST
- Card: `GitHub Copilot Code Review — 저장소 규칙·도구를 PR 리뷰에 연결하기`
- Decision: Refined; preserve as an AI-assisted review workflow topic.

## Sources checked

- [GitHub Changelog: AGENTS.md support](https://github.blog/changelog/2026-06-18-copilot-code-review-agents-md-support-and-ui-improvements/) — confirms root AGENTS.md review context and the June 18, 2026 GA announcement.
- [GitHub Docs: Copilot code review](https://docs.github.com/en/copilot/concepts/agents/code-review) — current supported interfaces, conditional Skills/MCP usage, review effort levels, AI-credit billing, Actions runner usage for agentic capabilities, and review limitations.

## Corrections and rationale

- Removed the implication that AGENTS.md, MCP, and Skills all work as one always-on review configuration. Root AGENTS.md is read automatically; Skills and MCP add context when relevant/configured.
- Replaced the stale Low/Medium terminology with current Lite/Balanced/Max effort-level language.
- Added the important cost split: review model interactions use AI credits; agentic context gathering/suggestion handoff can use GitHub Actions runners. The baseline review can remain with limited agentic capabilities if Actions runners are unavailable.
- Added a human validation boundary; a review result is not a substitute for tests or reviewer judgment.
- The exact estimated dollar ranges were omitted because they can change and add limited durable learning value.

## Validation

- Current official product documentation supports the card's operational claims.
- YAML parse, repository tests, and diff checks are recorded in the run result.
