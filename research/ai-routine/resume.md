# Local AI routine checkpoint — 2026-11-23

## Current phase
- Local launchd routine is configured for a 14,400-second interval. The latest actual run at 01:45 KST completed at 01:49 KST with launchd exit code 0 and pushed commit `6158966`.
- The routine uses Codex only; unsupported `--search` was removed. LaunchAgent starts the script directly and sets UTF-8 locale. Ruby log assertion reads UTF-8 explicitly.
- Added/refined AI cards: ML Kit Agent API (`bde964c`), Vercel eve 1.0 (`6158966`), coding-agent harness (`a6daff3`), Agent Skills host-portability boundaries, merged OpenHands Agent Canvas sandbox card, Android Skills host-discovery boundaries (`0f25a07`), Vibe Kanban worktree/security/continuity boundaries (`676e6c3`), and Toss team-harness evaluation boundaries (latest uncommitted batch; audits below).
- The original learning-card goal remains active. Continue auditing older AI-only cards for factual accuracy, overlap, and missing difficulty/interview retrieval; pure Android-only subjects are excluded from routine additions.

## Current batch validation
- YAML load: 983 cards; Android Skills, Vibe Kanban, and Toss team harness have levels, evidence sources, and interview retrieval pairs. OpenHands overview and later Canvas automation remain consolidated into one card.
- `ruby -c scripts/auto_post.rb`: pass.
- `ruby scripts/auto_post_test.rb`: 3 tests, 14 assertions, 0 failures/errors.
- `node --test scripts/card-navigation.test.js`: 6/6 pass.
- `git diff --check`: pass.
- Full site build remains unverified because bundle dependencies are missing.

## Next actions
1. Commit and push the Toss team-harness card refinement and research audit.
2. Continue oldest-first with the next eligible AI-only or AI+Android card; inspect its refinement history and current primary sources before editing.
3. Verify the next scheduled Codex-only launchd run and keep its generated outputs source-backed.

Audits: `research/ai-routine/20261123-015455-agent-skills-portability-boundaries.md`, `research/ai-routine/20261123-015700-openhands-canvas-sandbox-merge.md`, `research/ai-routine/20261123-020400-android-skills-host-boundaries.md`, `research/ai-routine/20261123-021000-vibe-kanban-worktree-and-sunset.md`, `research/ai-routine/20261123-020920-toss-team-harness-hypothesis-and-cost.md`.
