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
- Refined Sourcegraph's “80% problem” card against its September article and search docs. Made the percent metaphor explicit, removed vendor benchmark numbers and overgeneralized search advice, and retained a repository-completeness practice. Audit: `research/ai-routine/20261122-sourcegraph-80-percent-refinement.md`; validation passed (3 runs/14 assertions, YAML/schema and diff checks); commit/push pending.
- The long-term study-android objective remains active: short, evidence-based AI / AI+Android learning cards with difficulty levels, consistent format, and interview retrieval practice. Pure Android topics remain excluded.

## Next actions
1. Run Ruby syntax, both YAML loads, targeted card checks, routine tests, and `git diff --check`.
2. If all checks pass, commit the Sourcegraph refinement + audit + cursor + checkpoint update and push `master`.
3. Continue oldest-first with `chrome-devtools-mcp`; verify current docs, release, popularity signal, Codex Developer Mode claims and topic currency.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
