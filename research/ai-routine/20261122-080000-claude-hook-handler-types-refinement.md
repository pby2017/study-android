# Claude Code hook handler types refinement

- Reviewed: 2026-11-22 08:00 KST
- Candidate: existing `훅 핸들러 5종 — 셸·HTTP·MCP 도구·프롬프트·에이전트로 받기` card.
- Decision: retain and correct. These handler choices give developers different tradeoffs for local automation, remote validation, existing MCP tools, and model-assisted evaluation.
- Primary source checked: https://code.claude.com/docs/en/hooks

## Verified claims

- Settings-based hooks support five handler types: `command`, `http`, `mcp_tool`, `prompt`, and `agent`. The reference separately describes JavaScript function hooks for plugin mods; the five types are not every possible plugin hook implementation.
- Event support varies. `PreCompact` supports command/http/mcp_tool, not prompt/agent. `Setup` supports command only. `SessionStart` supports command and mcp_tool.
- `mcp_tool` calls a named tool on a configured MCP server. It does not spawn a shell command; result parsing/error handling differs from ordinary command hooks.
- `prompt` sends event input and prompt to one LLM evaluation. `agent` starts a subagent with tool access for multi-turn inspection; agent hooks are experimental and the docs recommend command hooks for production workflows.
- `/hooks` is a read-only browser of configured hooks, their source, and their contents. Edit settings files to add or change hooks.

## Card changes

- Scoped "five types" to settings-based hook handlers.
- Removed the stale statement that `/hooks` edits only command/MCP hooks; it is now read-only.
- Added event-specific availability examples and the experimental status of agent hooks.
- Clarified prompt vs agent execution shape.
- Added an interview question on unsupported event/type combinations and the read-only browser.

## Validation

- Checked the current official hooks reference: handler `type` field, event/type support matrix, MCP tool behavior, prompt/agent descriptions, and `/hooks` menu section.
- No popularity metric applies; these are built-in configuration mechanisms.
- Confidence: high.
