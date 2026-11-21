# Claude Code subagent status line and dynamic prompt flag refinement

Updated: 2026-11-22 08:53 KST

## Cards refined

### `subagentStatusLine`
- Rechecked the official Claude Code changelog. It states that v2.1.323 removed the setting; subagent rows use the default appearance and existing settings files may retain the key without effect.
- Changed the card from presenting a removed setting as currently usable to a versioned compatibility lesson.
- Source: https://github.com/anthropics/claude-code/blob/main/CHANGELOG.md
- Difficulty: intermediate; learners need to reason about version-specific configuration behavior.

### `--exclude-dynamic-system-prompt-sections`
- Rechecked the current CLI reference. The option moves per-user context (the current example is auto-memory location) from system prompt to first user message, targets cross-user/machine prompt-cache reuse, and is ignored with either custom system-prompt flag.
- Narrowed the card's older list of dynamic fields to match the current reference wording and retained the documented `-p` multi-user workload use case.
- Source: https://code.claude.com/docs/en/cli-reference
- Difficulty: intermediate; requires understanding prompt boundaries and cache reuse.

## Validation
- YAML parsing and card learning-field checks passed.
- Auto-post tests and card-navigation tests passed; `git diff --check` passed.
