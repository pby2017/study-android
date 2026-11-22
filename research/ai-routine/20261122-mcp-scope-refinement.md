# Claude Code MCP scope card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked the current official MCP reference: https://code.claude.com/docs/en/mcp
- Corrected the claim that project-scoped servers require approval “before writing”: project `.mcp.json` servers require workspace trust and server approval before connection; that is distinct from permissions for individual tool calls.
- Clarified that MCP `local` scope is stored in `~/.claude.json`, unlike general project-local settings in `.claude/settings.local.json`.
- Preserved the selection rule across local (one project/private), project (version-controlled/team), and user (all projects/private) scopes.
- Added beginner difficulty and a retrieval question about server approval versus tool-call authorization.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
