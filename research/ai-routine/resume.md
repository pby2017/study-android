# Local AI routine checkpoint — 2026-11-22

## Current phase
- `master` was clean and synchronized with `origin/master` (`e0d9dae`) before this refinement sequence (`git pull --ff-only origin master` reported already up to date).
- Task Master (`24977f9`) and Claude Agent SDK (`03d9a5d`) card improvements are already committed and pushed.
- Refined `AI 랩이 개발 툴체인을 사들이는 중` into an agent-toolchain lesson and pushed as `85ec7ab`.
- Merged the older `ccpi + tonsofskills.com` card into the existing Claude marketplace card to remove a duplicate, corrected current ccpi/marketplace behavior, and pushed as `6cbc5ef` (card count 985, down one).
- Refined BMAD-METHOD against its current docs, releases, and GitHub repository; this work was committed and pushed as `e0d9dae`.
- Refined OpenSpec using current official v2 skills, setup, release and project pages. Removed old `/opsx:*` commands, stale metrics, and unsupported Spec Kit comparisons; updated card difficulty and retrieval Q&A. Audit: `research/ai-routine/20261122-openspec-refinement.md`; committed and pushed as `ae810ad`.
- Refined Cloudflare Code Mode using its current README, Dynamic Workers docs, egress guidance and Check Point's workerd analysis. Corrected token/tool-count claims and removed blanket sandbox guarantees; validated and pushed as `5fa2ae3`.
- Refined the Anthropic agent-team compiler card against the author's primary report and source repository. Recentered on verifier quality and work decomposition, and clarified measured cost and incomplete compiler status; validated and pushed as `6089f1b`.
- Refined Philipp Schmid's subagent pattern card against his primary explainer and bio; clarified escalation choices and orchestration costs; validated and pushed as `9d3302f`.
- Refined Sourcegraph's “80% problem” card against its September article and search docs. Made the percent metaphor explicit, removed vendor benchmark numbers and overgeneralized search advice, and retained a repository-completeness practice. Audit: `research/ai-routine/20261122-sourcegraph-80-percent-refinement.md`; validated and pushed as `1a4fa7b`.
- Refined Chrome DevTools MCP against current GitHub docs/releases and OpenAI's Codex Browser documentation. Corrected page routing and profile flags, distinguished MCP from Codex Developer mode, and added browser-data/telemetry caveats. Audit: `research/ai-routine/20261122-chrome-devtools-mcp-refinement.md`; validation/commit/push pending.
- Retired the ByteRover CLI card because its repository is archived, the current company site has shifted product framing, and the deck already covers agent memory several ways. Audit: `research/ai-routine/20261122-byterover-card-retirement.md`.
- Refined Kilo Code: corrected the `--auto` permission semantics, refreshed live popularity/release evidence, and checked the Anaconda acquisition announcement. Audit: `research/ai-routine/20261122-kilo-code-refinement.md`; validation passed; commit/push pending.
- The long-term study-android objective remains active: short, evidence-based AI / AI+Android learning cards with difficulty levels, consistent format, and interview retrieval practice. Pure Android topics remain excluded.

## Next actions
1. Commit and push the ByteRover retirement + Kilo card refinement and audit/checkpoint updates.
2. Continue oldest-first with Bumblebee (Perplexity); verify scope, evidence, activity, and overlap before deciding whether to keep or remove it.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
