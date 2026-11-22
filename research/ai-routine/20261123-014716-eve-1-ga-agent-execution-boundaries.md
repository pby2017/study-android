# Local AI card routine — Vercel eve 1.0 — 2026-11-23 01:47 KST

## Scope and sync

- Read `.codex/skills/local-ai-card-routine/SKILL.md`, the current resume checkpoint, the refinement cursor, and `specs/001-ai-card-routine/plan.md`.
- Worktree was clean before sync. `git fetch origin` and `git pull --ff-only origin master` completed; branch was already up to date.
- Repository scope only. No GitHub Actions, app-factory-android issues/branches/PRs, commit, or push.

## Older-card refinement

- Cursor target: `Claude Code reloadSkills — SessionStart 훅이 설치한 스킬을 같은 세션에서 읽기`.
- Rechecked its source at https://code.claude.com/docs/en/hooks and history at https://code.claude.com/docs/en/changelog.
- Current Hooks reference still says discovery normally runs before SessionStart hooks finish, and `hookSpecificOutput` with `hookEventName: SessionStart` and `reloadSkills: true` requests a rescan after the hooks complete. It still documents `/reload-skills` separately. This preserves the distinction between a hook-installed skill and a manual same-session rescan.
- Decision: no card edit; the current card and interview pair already express these details accurately. Confidence high. This is the oldest cursor entry and avoids duplicating its prior Nov 22 refinement.

## Fresh-topic screening

| Candidate | Evidence | Decision |
| --- | --- | --- |
| Claude Code reloadSkills | Current official Hooks reference and changelog; existing card plus Nov 22 refinement audit | Reverified; no change needed. |
| Microsoft Agent Framework PyPI compromise | GitHub Advisory Database, Wiz incident analysis, PyPI history; existing card covers the same 1.26.1/1.26.2 incident | Reject duplicate. |
| MAI Code 2 / Code 2 Flash | Microsoft model card | Reject: the recent model release alone did not establish a distinctive educational developer lesson. |
| Claude Code Agent Teams | Current official product documentation; existing deck card | Reject duplicate. |
| Vercel eve 1.0 | Vercel 1.0 announcement, current `vercel/eve` repository, current GitHub repository metadata | Selected: new GA milestone with teachable boundaries for resumable execution, human approval, trace collection, and hosted isolation. |

### Selected card: Vercel eve 1.0 — agent execution boundaries

- Primary source: https://vercel.com/blog/eve-is-now-generally-available. It describes the harness, Workflow SDK recovery, approval policy, multiplayer sessions, OpenTelemetry tracing/privacy controls, and Vercel Workflows/Sandbox deployment split.
- Repository source: https://github.com/vercel/eve. It identifies eve as a filesystem-first framework, shows its agent directory structure, and lists Apache-2.0. Live GitHub snapshot on this run: 6.0k stars, 673 forks, 2,721 commits. The star count is an attention signal only, not adoption or quality evidence.
- Selection signal: official 1.0 GA (Nov 17, 2026), active public project, and substantial current GitHub attention. The card does not repeat vendor-reported customer or performance metrics.
- Level: `중급`; the retrieval pair assumes the reader can reason about long-running async workflows, tool permissions, and traces, but does not require expertise in eve itself.
- Confidence: high for documented feature boundaries; medium for production readiness outside Vercel because managed Workflows and Sandbox remain Vercel deployment components.
- Added one card with a source-backed level and interview Q&A. Updated `auto-post-log.md`.

## Sources checked

- https://code.claude.com/docs/en/hooks
- https://code.claude.com/docs/en/changelog
- https://vercel.com/blog/eve-is-now-generally-available
- https://github.com/vercel/eve
- https://github.com/advisories/GHSA-764m-3ppc-5m73
- https://www.wiz.io/blog/malicious-version-of-microsofts-agent-framework-published-to-pypi
- https://pypi.org/project/agent-framework/
- https://microsoft.ai/pdf/MAI-Code-2-And-MAI-Code-2-Flash-Model-Card.pdf
- https://code.claude.com/docs/en/agent-teams

## Verification

- `ruby -c scripts/auto_post.rb`: pass (`Syntax OK`).
- YAML loading for `_data/cards.yml` and `_data/ai_queue.yml`: pass; 984 cards loaded. The new card has category, supported level, summary, points, source(s), interview, and answer.
- `ruby scripts/auto_post_test.rb`: pass (3 runs, 14 assertions, 0 failures/errors/skips).
- `git diff --check`: pass.
- No commit or push will be made, per the explicit task constraint. Wrapper push behavior is therefore not invoked.
