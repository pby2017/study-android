# Claude Code skill invocation controls refinement

- Reviewed: 2026-11-22 07:52 KST
- Candidate: existing `스킬 호출 권한 — disable-model-invocation / user-invocable` card.
- Decision: retain and clarify. This control is useful for safely separating workflow timing from model-selected reference knowledge.
- Primary source checked: https://code.claude.com/docs/en/skills

## Verified claims

- By default, both the user and Claude can invoke a skill.
- `disable-model-invocation: true` prevents Claude from invoking the skill on its own. The skill description is not in model context until invocation; it can still be directly invoked by the user.
- A skill name at the start of a user message invokes it directly. Mentioning `/name` later in a sentence does not directly run it; it grants permission for Claude to decide whether to invoke it.
- `user-invocable: false` removes the skill from user invocation and the slash menu but does not prevent Claude from invoking it. It is suitable for background knowledge that is not a user-facing action.

## Card changes

- Replaced the misleading implication that `disable-model-invocation` makes the skill exclusively user-run in every case with the exact autonomous-selection boundary.
- Added the distinction between leading direct invocation and trailing invocation permission.
- Kept `user-invocable: false` separate: it hides user invocation but preserves model use.
- Added an interview prompt to test both distinctions.

## Validation

- Checked current official skills documentation, including invocation-control table and examples.
- No repository/star metric applies; these are built-in frontmatter controls.
- Confidence: high.
