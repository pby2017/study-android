# MCP agent testing card merge and mcp-eval review

## Decision

Merged the adjacent standalone `mcp-eval` product card into the `mcptest`-derived MCP testing-strategy card. The two cards covered complementary layers of one short learning unit: deterministic mocked tool-call regressions and end-to-end evaluation against real MCP servers. Keeping both as standalone cards repeated MCP test setup and assertions, so a single two-layer card better teaches when to use each.

## Sources checked

- https://github.com/lastmile-ai/mcp-eval
  - README describes real agent-to-server tests without mocks, traces over OpenTelemetry, assertions on tool use/content/path/performance, and pytest/dataset/decorator styles.
  - Its quick example invokes an agent and checks tool calls, content, and response time; metrics include latency, token usage, and cost. Live tests can therefore incur provider costs and external variability.
  - GitHub snapshot: 41 stars, 10 forks. This is limited attention; the card makes no claim that the tool is hot or widely adopted.
- https://pypi.org/project/mcpevals/
  - Package `mcpevals`; latest listed version 0.1.10, published 2025-09-04; one maintainer. The PyPI release date is old relative to the current review date, while GitHub README is the source for current project feature text. Removed any production-readiness implication.
- https://github.com/josephgec/mcptest
  - YAML mock fixtures, tool responses/errors, and trajectory assertions. Its test runner executes an agent command, so mocking the MCP server alone does not imply no LLM API call or zero model cost.

## Resulting card content

- Mock layer: fast, repeatable checks for tool choice, arguments, order, and error paths; external server behavior is controlled.
- Live layer: actual agent↔MCP-server integration and OTEL trace assertions for tool path, output, latency, and cost.
- Explicit cost/coverage boundary: mock server does not necessarily mock the LLM; live testing verifies integration paths mocks cannot prove.
- Removed product inventory and duplicated standalone mcp-eval summary. mcp-eval is cited as one implementation example, not a recommendation.

## Confidence

High for the documented features and distinction. Popularity remains modest and PyPI release recency does not establish active package publishing; card is methodology-first rather than trend- or adoption-based.
