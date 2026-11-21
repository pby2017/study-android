# MCP mock testing vs live integration card refinement

## Decision

Reframed the product-heavy `mcptest` feature list as a general developer lesson: mocked MCP interaction tests are a fast regression layer, not a substitute for live integration tests. This preserves the useful distinction from the adjacent `mcp-eval` card, which focuses on real agent↔server evaluation.

## Sources checked

- https://github.com/josephgec/mcptest
  - README describes a vendor-neutral MCP agent test framework using YAML fixtures, mocked tool responses and error scenarios, trajectory assertions, baseline drift, and `capture` from a live server.
  - Current README install snippet: `pip install mcp-agent-test`; package command is `mcptest`.
  - GitHub page showed 0 stars at review time; no adoption/popularity claim is made in the card.
- https://pypi.org/project/mcp-agent-test/
  - Distribution `mcp-agent-test`, version 0.1.0, status Alpha, release date 2026-04-16, one maintainer. PyPI project description contains an inconsistent `pip install mcptest` snippet, while its release files and GitHub README identify the distribution as `mcp-agent-test`. Card uses the GitHub README's package name and avoids prescribing installation.
- https://github.com/lastmile-ai/mcp-eval
  - Adjacent card describes live server integration testing; used only to validate that the mock-vs-live distinction is a complementary testing layer rather than duplicate product feature coverage.

## Corrections

- Removed the old product-card metric/feature list (17 assertions, 7 metrics, 6 packs, 19 conformance checks) to reduce product feature churn and keep the card instructional.
- Removed the inaccurate implication that mock MCP fixtures mean no LLM API/token cost. The test runner launches an agent command; if that command calls a hosted model, model spend and nondeterminism may remain. This is a workflow-level inference from the documented agent command interface, not an unconditional property claim.
- Added the limitation that mocks do not test real server authentication, network, or implementation compatibility.

## Confidence

High for repository features and PyPI package status. The project is an early-stage, low-attention tool; its documentation is inconsistent about the install distribution name, so the card does not position it as a recommended production dependency.
