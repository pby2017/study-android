# Claude Code PR session retrieval card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official workflow docs: https://code.claude.com/docs/en/common-workflows
- Clarified session-link conditions: Claude Code links the session when it creates a PR/MR with `gh pr create` / `glab mr create`, or works on an existing PR; it is not a generic promise for any PR creation outside the documented commands.
- Corrected the title/summary implication that `--from-pr` directly resumes a conversation: it opens the session picker filtered to linked sessions.
- Added `claude agents` as the current surface for monitoring background sessions and PR status; kept the retrieval card focused rather than duplicating agent-view behavior.
- Added beginner difficulty and an interview retrieval question.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
