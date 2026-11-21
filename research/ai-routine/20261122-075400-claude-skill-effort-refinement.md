# Claude Code skill effort frontmatter refinement

- Reviewed: 2026-11-22 07:54 KST
- Candidate: existing `스킬 effort 프런트매터 — 명령마다 추론 강도 따로 주기` card.
- Decision: retain and refine. Per-workflow effort and model selection can prevent unnecessary manual model switching, but the scope and precedence must be precise.
- Primary source checked: https://code.claude.com/docs/en/skills

## Verified claims

- Skill frontmatter `effort` applies for the rest of the current turn. It overrides the session effort, but not `CLAUDE_CODE_EFFORT_LEVEL`.
- Available effort values are `low`, `medium`, `high`, `xhigh`, and `max`; availability depends on the selected model.
- With `context: fork`, the value configures the forked subagent's effort.
- The `${CLAUDE_EFFORT}` substitution exposes the current effort level in skill content.
- Frontmatter `model` is also a current-turn override; the session model resumes on the next user prompt. A model excluded by the organization allowlist is not used.

## Card changes

- Replaced the ambiguous "while skill is active" with the precise current-turn scope.
- Added model-dependent support, environment-variable precedence, and forked-subagent behavior.
- Kept `model` and `${CLAUDE_EFFORT}` as practical related details.
- Removed the unsupported assertion about a named product workflow always using `xhigh`.
- Added an interview question about scope and precedence.

## Validation

- Checked the official skills guide's frontmatter reference and variable substitution table.
- No popularity metric applies; this is a built-in frontmatter feature.
- Confidence: high.
