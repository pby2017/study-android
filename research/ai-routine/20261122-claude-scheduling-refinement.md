# Claude Code scheduling card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official Claude Code workflow docs: https://code.claude.com/docs/en/common-workflows and interactive mode: https://code.claude.com/docs/en/interactive-mode
- Kept the four current options (cloud Routines, Desktop scheduled tasks, GitHub Actions, and session-local `/loop`) but organized them by execution location and access needs.
- Removed the claim that `/loop` can be resumed with `--resume`/`--continue` after it stops. The docs distinguish session-local loops from cloud scheduled tasks, and session expiry can discard pending loops; avoid promising automatic continuation.
- Added beginner difficulty and a scenario-based interview question.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
