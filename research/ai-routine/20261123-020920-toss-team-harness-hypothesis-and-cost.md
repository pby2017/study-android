# Team AI harness: distinguish the proposed model from verified outcomes

- Reviewed: 2026-11-23 02:09 KST
- Card: `팀 AI 하네스 — 지식을 계층화하고 플러그인 비용을 검증하기`
- Scope: AI-native developer workflow; apply team context and plugins to software delivery.

## Sources checked

1. Toss Tech, “Software 3.0 시대, Harness를 통한 조직 생산성 저점 높이기” (2026-02-26): https://toss.tech/article/harness-for-team-productivity
   - Proposes Global (organization-wide), Domain (business/team), and Local (repository) knowledge layers.
   - Proposes plugins/marketplaces as a way to distribute team workflows.
   - The author explicitly says the article is closer to a direction than a concrete success case and labels later flywheel ideas as hypotheses. The article does not supply measured before/after productivity results.
2. Claude Code official plugin docs: https://code.claude.com/docs/en/plugins
   - A plugin can bundle skills, agents, hooks, MCP servers, or other components; these also work independently without a plugin.
   - Skill/agent/command names and descriptions may occupy context every turn; MCP servers run and hooks fire in enabled sessions.
   - Plugin components run with the user's permissions. Docs recommend checking footprint and security before installation.

## Decision and edits

- Kept the card because scoped reusable context plus workflow packaging is practically useful for teams adopting coding agents.
- Corrected the original framing so the three-layer structure is identified as the author's proposal, not a Claude Code built-in feature or measured best practice.
- Added the missing operational tradeoffs: persistent context footprint, per-session MCP processes/hooks, and user-level execution permissions.
- Replaced the broad organizational-productivity assertion with a test plan: compare representative task quality, correction cycles, and token/cost; preserve human review for important changes.
- Added intermediate level and an interview retrieval pair.
- Confidence: high on official plugin behavior; the business-layering model is an attributed proposal, not independently validated.
