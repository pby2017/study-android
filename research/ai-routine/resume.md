# Local AI routine checkpoint — 2026-11-22

## Current phase
- AAIF `e298784`, security-guidance `d8aab9e`, and Factory Droid Exec `653a2b9` were pushed successfully; remote `master` matched `653a2b9` at verification.
- Terminal-Bench refinement was committed/pushed as `267f81a`.
- Current uncommitted task refines SWE-bench Multimodal using its current v2 page, ICLR paper, and dataset card. Historical counts (617/619 paper instances, 517 initial visual issues, 612 issue–PR pairs, 480 v2 reproducible tasks) use differing sources/units; audit records the unresolved discrepancy. Audit: `research/ai-routine/20261122-swe-bench-multimodal-refinement.md`.
- The earlier `AGENTS.md — 저장소 지침을 루트와 하위 폴더에 나누기` card was checked against AGENTS.md, Codex, and GitHub Copilot docs. Its host-specific discovery caveats were already accurate; no content change was required.
- The older-card objective remains active: concise, evidence-based AI / AI+Android cards with levels and interview retrieval; pure Android-only topics are excluded.

## Next actions
1. Run Ruby syntax/YAML/card checks, routine tests, and `git diff --check` for SWE-bench Multimodal.
2. Commit and push the refinement with its audit and cursor updates.
3. Continue oldest-first with `claude --worktree`; verify official command semantics and worktree/sandbox boundary.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
