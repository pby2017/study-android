# Claude Code bare mode and usage breakdown refinement

Updated: 2026-11-22 08:55 KST

## Cards refined

### `claude -p --bare`
- Rechecked current headless documentation: bare skips discovery of hooks, skills, commands, subagents, plugins, MCP servers, auto memory, and CLAUDE.md. Settings and permission rules still load; hooks do not run even when passed through `--settings`.
- Added credential caveat: bare does not read OAuth credentials or system keychain; Anthropic API calls need `ANTHROPIC_API_KEY` or `apiKeyHelper`, while cloud-provider credentials remain supported.
- Source: https://code.claude.com/docs/en/headless
- Difficulty: intermediate; requires knowing what auto-discovery and explicit configuration control.

### `/usage`
- Rechecked current costs guide: Pro/Max/Ultra/Team/Enterprise users see plan usage breakdown attributed to skills, subagents, plugins, and MCP servers, plus recommendations. Press `d`/`w` for 24-hour/7-day views.
- Clarified that percentages are approximate, computed from local session history, and exclude other devices and claude.ai. MCP attribution counts requests that consumed a server tool result.
- Source: https://code.claude.com/docs/en/costs#plan-usage-breakdown
- Difficulty: intermediate; distinguishes plan-limit attribution from session billing figures.

## Validation
- YAML/card-field validation, Ruby syntax, auto-post tests, navigation tests, and `git diff --check` passed.
