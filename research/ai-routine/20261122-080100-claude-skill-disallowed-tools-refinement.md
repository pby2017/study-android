# Claude skill tool restrictions card refinement

Date: 2026-11-22 08:01 KST

## Decision
Retain the card as a practical AI-agent configuration concept. Use the current Skills reference as the source of truth and emphasize the scope and lifetime of each frontmatter field.

## Verified details
- `disallowed-tools` removes listed tools from Claude's available pool while a skill is active. The restriction clears when the next user message is sent. The official example is preventing `AskUserQuestion` in an autonomous background skill.
- `allowed-tools` makes listed tools available without asking permission during the turn that invokes the skill. It does not restrict unlisted tools, and baseline permission settings still apply.
- Deny rules in permission settings are the documented approach to block tools across skills and prompts.
- `EndConversation` cannot be removed while any other tool remains.

## Source
- [Claude Code Skills reference](https://code.claude.com/docs/en/skills), frontmatter reference and pre-approve tools for a skill.

## Confidence
High. The scope, lifetime, examples, and exception are stated in the current official documentation.
