# Claude Code reloadSkills card refinement — 2026-11-22

## Decision

Refined the existing SessionStart hook card to teach one mechanism clearly: a hook can install skills after initial discovery, then request a same-session rescan. Removed `sessionTitle` as an unrelated feature from the title and body.

## Sources checked

- [Claude Code Hooks reference](https://code.claude.com/docs/en/hooks) — current docs say skill discovery normally runs before SessionStart hooks finish; returning `hookSpecificOutput.reloadSkills: true` makes skills installed by the hook available in that session. `/reload-skills` is the manual rescan path. SessionStart has separate output fields for `sessionTitle` and `reloadSkills`.
- [Claude Code changelog](https://code.claude.com/docs/en/changelog) — v2.1.152 (May 27, 2026) added `/reload-skills`, SessionStart `reloadSkills`, and SessionStart `sessionTitle`. The changelog also records automatic skill hot-reload earlier in v2.1.0, so the refined card explicitly frames this as the startup hook/discovery ordering edge case, not a claim that all in-session skill changes require a restart.

## Card changes

- Title now isolates the `reloadSkills` lesson.
- Clarified the discovery-before-hook race and the JSON field returned to request a rescan.
- Kept `/reload-skills` as the manual path for in-session edits.
- Removed the broad phrasing that could imply skills are only scanned once in every context and removed unrelated `sessionTitle` content.
- Added intermediate level and an interview question/answer.

## Attention and confidence

- Current first-party product docs and changelog are the attention signal; no GitHub popularity metric is relevant to this built-in feature.
- Confidence: high; exact lifecycle behavior and version history checked against official references.
