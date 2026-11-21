# Local AI routine checkpoint — paused before sync

Updated at: 2026-11-22 (Asia/Seoul)

## Current phase
- Paused at the mandatory pre-sync check. The working tree was already dirty, so no `git fetch`/`git pull` or card edits were made during this run.
- At the initial gate, `_data/cards.yml` had an unstaged diff rewriting four older cards: Playwright CLI + MCP, `allowManagedHooksOnly`, MCP resources/prompts, and `/btw`. During this run, that diff disappeared from the worktree and the branch advanced to commit `e6ee777` (`origin/master`) without any git mutation by this agent. The current card file is clean; confirm the commit contents and source evidence on the next run.
- This checkpoint edit is now the only observed worktree modification. No sync was attempted after writing it.
- The refinement cursor remains unchanged. It most recently points to continuing the oldest-first AI/AI+Android card scan.

## Candidates checked
- No new-topic candidates were researched or selected; the dirty-tree gate stopped the routine before research.
- URLs visible in the existing card diff, not opened or revalidated in this run: https://playwright.dev/docs/getting-started-cli, https://code.claude.com/docs/en/settings-reference#allowmanagedhooksonly, https://code.claude.com/docs/en/mcp, https://code.claude.com/docs/en/interactive-mode.

## Next actions
1. Inspect commit `e6ee777` and verify whether the four card rewrites from the initial diff were included and supported.
2. Resolve this checkpoint worktree modification without losing its information; once the tree is clean, sync with `git pull --ff-only origin master` before routine edits.
3. Read `research/ai-routine/refinement-cursor.md`; re-verify those four card claims from their public sources if retaining the rewrites.
4. Continue the oldest-first refinement pass, then research current AI or AI+Android educational candidates only; reject pure Android topics.
5. For every selected card, source-check its difficulty level and include one interview question plus concise answer.
6. Write a timestamped research audit note and update the refinement cursor only after successful refinements.
7. Run the required Ruby/YAML checks and `git diff --check`. Do not commit or push in this user-directed run.

No app-factory-android issue, branch, or pull request actions were performed. No GitHub Actions were added.
