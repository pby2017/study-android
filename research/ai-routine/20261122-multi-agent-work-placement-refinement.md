# Multi-agent work placement card refinement

## Scope

Reviewed the next card after Claude Code GitHub Action. The prior card presented a secondary author's three-tier tool landscape as a stable taxonomy and included unsupported concurrency advice (“3–5 is the sweet spot”), implied worktrees prevent merge conflicts, and named Jules as an active cloud option.

## Evidence checked (2026-11-22)

- Claude Code [subagent documentation](https://code.claude.com/docs/en/sub-agents): subagents run in separate context windows within a single session; optional `isolation: worktree` gives a separate worktree. Subagent requests still count against usage limits.
- GitHub [Copilot cloud agent documentation](https://docs.github.com/en/copilot/how-tos/use-copilot-agents/cloud-agent/use-cloud-agent-on-github): Copilot cloud can run in a GitHub-hosted cloud sandbox or an Actions-based environment; it creates a branch, and the agent can push changes for review.
- OpenAI [Codex Cloud help](https://help.openai.com/en/articles/20001545-using-codex-cloud): each task starts in its own isolated workspace; cloud work can continue while the local computer sleeps; review changes and test results before using them.
- Jules official [changelog](https://jules.google/docs/changelog/): the October 29, 2026 notice says Jules becomes read-only after November 11 and winds down on December 31, 2026. Removed it from current product examples.
- No authoritative source supports a universal ideal number of concurrent coding agents. The card now states that costs, integration, and review workload can grow with concurrency, without prescribing a numeric sweet spot.

## Card changes

- Replaced unstable vendor tiers with a practical execution-boundary model: same-session subagent, local worktree, or cloud task.
- Clarified that worktrees isolate checkouts; they do not prevent merge or semantic conflicts.
- Made the decision criteria explicit: iteration latency, isolation, async execution, permissions, costs, and review/integration burden.
- Added intermediate level, multi-source primary links, and an interview retrieval prompt.

## Overlap check

The nearby Agent Teams and Claude Code subagent cards explain one session's delegation mechanics. The Conductor and Vibe Kanban cards describe individual local orchestration products. This card's scope is the higher-level choice of where and how to isolate work; keep it distinct.
