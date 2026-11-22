# Claude Code subagent catalog card refinement

## Scope

Reviewed the next oldest AI card. It had stale size/star counts, promoted broad category installation, and called prewritten roles “verified.” Current official docs and the catalog itself show a more useful lesson: inspect the role definition, limit what is installed, and independently validate its output.

## Evidence checked (2026-11-22)

- VoltAgent's [repository](https://github.com/VoltAgent/awesome-claude-code-subagents) currently describes 161+ agents across 10 categories and showed 26.7k GitHub stars. Stars indicate attention, not quality or correctness.
- The repository's [`kotlin-specialist`](https://github.com/VoltAgent/awesome-claude-code-subagents/blob/main/categories/02-language-specialists/kotlin-specialist.md) description explicitly includes Android/Compose. It is an editable prompt with broad Kotlin/Android claims and its own prescribed checklists; it is not evidence of validated expertise. The separate `mobile-developer` entry is currently framed around React Native.
- The catalog offers category plugins as well as individual Markdown definitions installed under `.claude/agents/` or `~/.claude/agents/`. Project-level scope avoids exposing a personal role to unrelated repositories.
- Claude Code's [subagent docs](https://code.claude.com/docs/en/sub-agents) explain that tool access and model are configured in frontmatter. They also state that subagent names/descriptions occupy context, and that requests count toward usage limits.
- Claude Code's [plugin security docs](https://code.claude.com/docs/en/plugins/security) warn that installed plugins can execute arbitrary code with the user's privileges. Inspect hooks, MCP servers, executables, and declared components before installing.
- The plugin overview further says enabled plugin skills/agent/command descriptions enter context on every turn, and plugin processes/hooks may run alongside sessions: https://code.claude.com/docs/en/plugins

## Card changes

- Replaced stale 154/21.8k claims with dated repository snapshot 161+/26.7k; explicitly separated popularity from validation.
- Added the actual Android relevance: `kotlin-specialist` names Android/Compose, while `mobile-developer` is React Native-oriented.
- Reframed catalog content as customizable prompts rather than verified expertise; require official docs, project versions, and tests for Android recommendations.
- Recommended project-scoped individual definitions over broad plugin installation; added permission/context-footprint checks.
- Added intermediate level, multi-source evidence, and an interview retrieval prompt.

## Overlap check

Existing cards on subagent mechanics explain how delegation works; this card teaches how to evaluate and safely select a community-provided role prompt. Distinct learning objective; no merge.
