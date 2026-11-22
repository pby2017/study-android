# Local AI routine checkpoint — 2026-11-22

## Current phase
- `master` was clean and synchronized with `origin/master` (`e0d9dae`) before this pass (`git pull --ff-only origin master` reported already up to date).
- Task Master (`24977f9`) and Claude Agent SDK (`03d9a5d`) card improvements are already committed and pushed.
- Refined `AI 랩이 개발 툴체인을 사들이는 중` into an agent-toolchain lesson and pushed as `85ec7ab`.
- Merged the older `ccpi + tonsofskills.com` card into the existing Claude marketplace card to remove a duplicate, corrected current ccpi/marketplace behavior, and pushed as `6cbc5ef` (card count 985, down one).
- Refined BMAD-METHOD against its current docs, releases, and GitHub repository; this work was committed and pushed as `e0d9dae`.
- Refined OpenSpec using current official v2 skills, setup, release and project pages. Removed old `/opsx:*` commands, stale metrics, and unsupported Spec Kit comparisons; updated card difficulty and retrieval Q&A. Audit: `research/ai-routine/20261122-openspec-refinement.md`; validation passed (3 runs/14 assertions, YAML/schema and diff checks); commit/push pending.
- The long-term study-android objective remains active: short, evidence-based AI / AI+Android learning cards with difficulty levels, consistent format, and interview retrieval practice. Pure Android topics remain excluded.

## Next actions
1. Run Ruby syntax, both YAML loads, targeted card checks, routine tests, and `git diff --check`.
2. If all checks pass, commit the OpenSpec refinement + audit + cursor + checkpoint update and push `master`.
3. Continue oldest-first with `Code Mode (Cloudflare)`; verify implementation details, token claims, sandbox/security boundary, and duplicate overlap.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
