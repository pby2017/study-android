# Claude Code session branching card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official session documentation: https://code.claude.com/docs/en/sessions
- Fixed a security-relevant error: `/branch` carries session-scoped permission grants because it remains in the same process; CLI `--fork-session` starts a separate process and requires approvals again.
- Replaced the absolute transcript-mixing claim with current caution: simultaneous resumes can conflict or cause messages to be missing; fork when separate conversations are needed.
- Kept the distinction between conversation branching and checkpoint rewind.
- Added beginner difficulty and a focused interview question.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
