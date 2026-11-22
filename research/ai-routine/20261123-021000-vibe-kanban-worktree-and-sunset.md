# Vibe Kanban: worktree boundary and service continuity

- Reviewed: 2026-11-23 02:10 KST
- Card: `Vibe Kanban — 에이전트 작업 분리와 서비스 지속성을 함께 보기`
- Scope: AI coding agent orchestration and operational continuity.

## Sources checked

1. Current Vibe Kanban GitHub README/repository: https://github.com/BloopAI/vibe-kanban
   - Describes task planning with kanban issues, workspaces with coding-agent sessions, diff review, browser preview, and PR workflow; documents `npx vibe-kanban` and 10+ supported agents.
   - README banner still states “Vibe Kanban is sunsetting.” Live GitHub page showed 28.8k stars, 3.1k forks, and 2,093 commits. These are dated attention/activity signals, not proof of adoption, quality, or continuity.
2. Official shutdown announcement, Apr 10, 2026: https://www.vibekanban.com/blog/shutdown
   - Company shut down; project planned to continue as open source/community maintained.
   - Announcement said remote services would remain for 30 days, followed by a transition to fully local architecture; it separately said local workspaces would continue functioning.
   - This audit records the announcement's plan, not independent proof that every promised migration completed.
3. Current Workspaces overview: https://vibekanban.com/docs/workspaces
   - Workspace includes one or more repositories and agent sessions; creating it uses a Git worktree and branch, while review and PR are explicit later actions.
4. Git `worktree` reference: https://git-scm.com/docs/git-worktree
   - Worktrees are multiple working trees attached to the same repository, with per-worktree and shared refs. This is Git workflow separation, not OS process/network/filesystem sandboxing.

## Decision and edits

- Kept the card because the repo remains a high-attention AI agent workflow project and provides two reusable lessons: worktree-based parallelism and checking maintainer/cloud continuity.
- Replaced the unsupported implication that worktree isolation prevents agents from interfering with each other's workspace. Clarified that Git worktree does not restrict process permissions or network access.
- Removed stale 27k star figure and feature inventory claims that were not useful to the lesson. Preserved the sunset status but distinguished the company's announcement and promised transition from verified post-transition state.
- Added intermediate level and an interview retrieval pair focused on worktree guarantees vs sandbox guarantees.
- Confidence: high on Git/workspace behavior and historical announcement; medium on current service-transition completion, so the card does not claim that the migration completed.
