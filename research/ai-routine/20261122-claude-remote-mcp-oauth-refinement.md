# Claude Code remote MCP OAuth card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked current official MCP docs: https://code.claude.com/docs/en/mcp
- Clarified that OAuth sign-in applies to remote HTTP MCP servers and that `401`/`403` does not always launch OAuth: explicitly configured Authorization headers fail as connection errors instead.
- Added the stored refresh-token retry behavior and distinguished local credential clearing (`/mcp` → Clear authentication) from server-side token revocation (`claude mcp logout <name>` where supported).
- Retained add/login commands and added intermediate difficulty plus an interview question about revocation semantics.
- Sources checked: official MCP reference sections “Authenticate with remote MCP servers,” “Authenticate from the command line,” and server removal behavior.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
