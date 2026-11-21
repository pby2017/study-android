# Claude Code disableBundledSkills card refinement

- Reviewed: 2026-11-22 07:49 KST
- Candidate: existing `disableBundledSkills — 번들 스킬·내장 명령을 모델 눈앞에서 치우기` card.
- Decision: keep and refine. It is a documented Claude Code configuration that helps developers control which bundled workflows the model can invoke without removing their own project tooling.
- Primary source checked: https://code.claude.com/docs/en/settings-reference

## Verified claims

- `disableBundledSkills: true` removes skills and workflows included with Claude Code.
- Built-in commands such as `/init` remain typable by the user, but are hidden from the model.
- Plugin skills and project entries under `.claude/skills/` and `.claude/commands/` are unaffected.
- `CLAUDE_CODE_DISABLE_BUNDLED_SKILLS=1` disables bundled skills for a session.
- The setting and environment variable interact restrictively: if either disables bundled skills, the other cannot turn them back on.

## Card changes

- Separated bundle removal from built-in command visibility and user typing behavior.
- Explicitly named the unaffected plugin and project-local custom skills/commands.
- Added the cross-source re-enable limitation and an interview question that tests it.

## Validation

- Claims checked against the official all-settings reference, especially the `disableBundledSkills` entry.
- No popularity metric applies; this is a built-in setting, not a third-party candidate.
- Confidence: high.
