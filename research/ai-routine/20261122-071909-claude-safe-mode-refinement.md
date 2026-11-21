# Claude Code safe-mode card refinement — 2026-11-22

## Decision

Refined the existing `--safe-mode` card to emphasize its diagnostic use and the managed-policy boundary. The old list was long but did not clearly distinguish user customizations from organizational policy.

## Sources checked

- [Claude Code CLI reference](https://code.claude.com/docs/en/cli-reference) — current `--safe-mode` behavior, what remains enabled, and the policy exception. Safe mode turns off CLAUDE.md, skills, plugins, hooks, MCP servers, custom commands/agents, output styles, workflows, themes, keybindings, status line, file-suggestion commands, LSP servers, and auto memory. Authentication, model selection, built-in tools, and permissions continue to work. Managed policy hooks, status line, and file-suggestion commands still apply; managed plugins, skills, CLAUDE.md, and policy MCP servers do not.
- [Claude Code changelog](https://code.claude.com/docs/en/changelog) — `--safe-mode` was added in v2.1.169. This release history was checked; the card avoids hardcoding the version to keep the troubleshooting concept durable.

## Card changes

- Reframed `--safe-mode` as a comparison for isolating customization-related failures.
- Clarified that authentication/model/built-in tools/permissions remain; it is not equivalent to `--bare` or a security sandbox.
- Added the selective managed-policy exception, including which policy components continue to load and which are excluded.
- Condensed the inventory and added an interview prompt/answer around diagnosis and policy boundaries.

## Attention and confidence

- Attention signal: current first-party CLI docs and product changelog; no star count applies to this built-in diagnostic flag.
- Confidence: high for the documented list and policy boundary.
