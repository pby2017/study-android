# Claude Code IDE MCP card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked the current official VS Code integration guide: https://code.claude.com/docs/en/ide-integrations
- Kept the card centered on the built-in `ide` MCP server and CLI/VS Code context sharing.
- Removed the stale claim that Jupyter execution is “always confirmed” without distinguishing the gate: `mcp__ide__executeCode` requires VS Code Quick Pick confirmation, separately from MCP PreToolUse allowlists.
- Added the current privacy boundary: a matching `Read` deny rule excludes both selected text and the active-file notice for a sensitive file.
- Added intermediate difficulty and an interview question that tests the difference between tool allowlisting and IDE-side execution confirmation.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
