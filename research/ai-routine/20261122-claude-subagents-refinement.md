# Claude Code custom subagents card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official subagent docs: https://code.claude.com/docs/en/sub-agents
- Corrected `/agents` behavior: current documentation describes it as a reminder to create/edit files; the interactive wizard is only documented for Claude Code v2.1.197 and earlier.
- Clarified that omitting `tools` inherits every tool available to subagents rather than automatically restricting access; `description` guides delegation decisions.
- Retained the context-management value and project/user scope distinction; added intermediate difficulty and an interview prompt.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
