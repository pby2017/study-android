# Claude Agent SDK billing card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked Anthropic's current primary Help Center pages:
  - https://support.claude.com/en/articles/15036540-use-the-claude-agent-sdk-with-your-claude-plan
  - https://support.claude.com/en/articles/17154008-monthly-api-credits-for-max-ultra-and-team-plans
- Removed the obsolete claim that a June 15, 2026 change split subscription-authenticated SDK / `claude -p` usage into monthly Agent SDK credits. Anthropic says that change was paused; plan-authenticated SDK and `claude -p` still draw from subscription limits.
- Distinguished subscription login from a linked Claude Console API key. Max, Ultra, and Team plans have monthly Console API credits ($100, $200, and Team Standard/Premium seat credits of $20/$100, pooled up to $500); the official page says these credits cover directly run Agent SDK / `claude -p` with the linked organization's API key.
- Excluded interactive Claude Code and runs started by Claude Code GitHub Action, IDE extension, or Desktop app from those API credits. The decisive distinction is credentials and run origin, not simply whether a command is non-interactive.
- Added intermediate difficulty and an interview question. Removed unsupported Pro credits, automatic-renewal, and usage-credit exhaustion claims.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
