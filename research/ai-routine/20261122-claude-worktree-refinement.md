# Claude Code worktree card refinement — 2026-11-22

## Decision

Refine the existing card rather than add another card. The topic remains useful for parallel AI-assisted development, but the old card contained a material `.worktreeinclude` scope error and did not explain the boundary between checkout isolation and security isolation.

## Sources checked

- [Claude Code: Run parallel sessions with worktrees](https://code.claude.com/docs/en/worktrees) — current default path and branch naming, `baseRef`, PR/MR starts, ignored-file copying, cleanup, opt-in subagent worktrees, shared state, and isolation checks.
- [Claude Code: Settings files and precedence](https://code.claude.com/docs/en/settings) — permission approvals made in a worktree can be stored in the main checkout's `.claude/settings.local.json` and apply across worktrees.
- [Git: git-worktree](https://git-scm.com/docs/git-worktree) — multiple working directories share repository administration; each linked worktree has its own per-worktree state such as `HEAD` and index.

## Claims and changes

- Kept the core workflow: a named `claude --worktree` session edits a separate checkout and branch; documented `fresh` (default-branch) versus `head` (local `HEAD`) bases.
- Corrected the old claim that `.worktreeinclude` applies only to manual `git worktree add`: the official guide says it applies to Claude-created Git worktrees, including named, subagent, and desktop-app worktrees. It copies only matching gitignored files; tracked files are not duplicated. A `WorktreeCreate` hook requires copying files in that hook instead.
- Retained PR worktree support with the exact `"#1234"` quoting and `origin` fetch semantics implicit in the official command.
- Clarified that subagent isolation is opt-in (`isolation: worktree` or an explicit request), not automatic for every subagent.
- Added the practical security boundary: worktrees separate files/branches, but share `.git` metadata and some permission approvals; Claude's worktree checks do not detect every shell write into the main checkout. Use OS sandboxing and least privilege when isolation is security-sensitive.
- Added cleanup caveat: non-interactive `-p` runs have no exit prompt and can leave worktrees/locks for later cleanup.
- Added intermediate difficulty and an interview retrieval Q&A; used stable behavior rather than current star counts or other fast-changing metrics.

## Validation

Run repository YAML, Ruby, card assertion, routine tests, and `git diff --check` before commit. No popularity metric was added because the card teaches stable CLI behavior rather than a popularity claim.

Confidence: high; central behavior and caveats are from current official Claude Code documentation, with Git's official manual confirming the linked-worktree model.
