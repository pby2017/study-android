# Claude Code Agent Teams card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked Anthropic's current primary guide: https://code.claude.com/docs/en/agent-teams
- Confirmed Agent Teams remain experimental and disabled by default. They require an interactive session; `claude -p` and Agent SDK runs use ordinary subagents instead.
- Added a potentially surprising setting effect: enabling teams can cause a named subagent to launch as a teammate, even when the user did not explicitly request a team.
- Preserved the core distinction: teammates have independent contexts and can message each other; sessions with Task tools share a task list. The lead's conversation history is not copied, though project context and the spawn prompt are supplied.
- Corrected the plan-approval error: in Plan mode, a teammate plan is auto-approved when the teammate's permission mode has not been changed. Do not present plan mode as a guaranteed human/lead approval gate.
- Kept the practical boundary: teams suit independent exploration, cross-review, and competing hypotheses; sequential/dependency-heavy work usually fits subagents better. Teams use significantly more tokens.
- Checked nearby cards: the general multi-agent landscape/comparison cards cover tool selection; this card teaches Claude Code team's activation and behavioral constraints. No duplicate learning objective found.
- Validation: YAML parse and card fields; Ruby syntax; auto-post tests; card navigation/source tests; `git diff --check`. Jekyll build unavailable because the executable is not installed.
