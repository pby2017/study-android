# MCP Tool Search: lazy loading, fallback, and context trade-offs

## Sources checked
- https://code.claude.com/docs/en/mcp — current Claude Code MCP reference, especially “Scale with MCP tool search”, environment controls, model/provider exceptions, gateway behavior, and `alwaysLoad`.
- https://www.anthropic.com/research/advanced-tool-use — Anthropic's Tool Search design, examples, internal evaluation results, and selection trade-offs.

## Verified facts
- Current Claude Code documentation says tool search is enabled by default for supported model/runtime combinations; MCP tools are deferred and discovered on demand.
- Support is model- and provider-dependent. The docs list Claude Opus 4, Sonnet 4, Haiku 4.5 and later on the Anthropic path; earlier models can load all tools upfront. Vertex AI, Microsoft Foundry, HIPAA configuration and disabling experimental betas have separate behavior.
- `ENABLE_TOOL_SEARCH` unset/`true` uses deferred loading with documented fallbacks. `auto` preloads definitions while their total is below 10% of context; `auto:N` changes the threshold; `false` preloads all tools. `alwaysLoad: true` exempts a server.
- An `ANTHROPIC_BASE_URL` gateway needs to forward `defer_loading`, `tool_reference`, and the beta header. Current docs describe automatic retry without tool search after 400/422 on Claude Code v2.1.305+; earlier versions differ.
- Anthropic's stated token/context and accuracy results are internal evaluations under specific setups, not universal savings guarantees. The card therefore omits numeric benchmark claims.

## Corrections and rationale
- Removed the unsupported anecdotal 66k-token startup loss, inaccurate 2026-01-14 launch date, “almost no context impact” phrasing, incorrect Haiku-unavailable claim, and outdated gateway default claim.
- Reframed as lazy schema loading: initial context can shrink, but the search step costs latency and loaded schemas still consume context.
- Added intermediate difficulty and a retrieval answer on when to keep a small set of high-use tools always loaded.

## Popularity / relevance
This is an official Claude Code runtime behavior rather than a third-party project; no GitHub star claim is relevant. The primary source is maintained current product documentation and the feature remains part of the current MCP configuration surface.

## Confidence
High for the current commands, thresholds, and compatibility exceptions because they are documented in the first-party manual. Internal evaluation numbers are deliberately not generalized into the card.
