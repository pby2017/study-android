# Claude Code shell mode card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked the official interactive mode reference: https://code.claude.com/docs/en/interactive-mode
- Removed stale key-history autocomplete/exit details and clarified the user-controlled sequence: `!` enters shell mode; the user enters a command and submits it to execute; command and output become session context.
- Distinguished interactive shell mode from `!`command`` dynamic-context injection in a skill, which runs before the skill body reaches Claude.
- Included current `Ctrl+B` backgrounding behavior and tmux's double-press caveat.
- Added beginner difficulty and interview retrieval question.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
