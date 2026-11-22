# Local AI card routine — 2026-11-23 01:35 KST

## Scope and sync

- Read `.codex/skills/local-ai-card-routine/SKILL.md`, `specs/001-ai-card-routine/plan.md`, the refinement cursor, and the existing resume checkpoint.
- Worktree was clean; `git pull --ff-only origin master` completed with “Already up to date” before edits.
- No app-factory-android issues, branches, or pull requests were accessed. No GitHub Actions were added. No commit or push was performed.

## Older-card refinement

- Rechecked `Karpathy-inspired CLAUDE.md — 에이전트 행동을 네 규칙으로 좁히기` against its [current upstream README](https://github.com/multica-ai/andrej-karpathy-skills).
- The source still documents Think Before Coding, Simplicity First, Surgical Changes, and Goal-Driven Execution. It describes expected workflow benefits, not a controlled evaluation, and warns that the caution bias can slow trivial tasks.
- Refined the card to separate author guidance from measured evidence, make success criteria and verification explicit, and note the trivial-task tradeoff. Kept `초급` because applying the guidance requires only basic familiarity with code changes and tests.
- Next oldest eligible card in deck order: `Claude Code reloadSkills — SessionStart 훅이 설치한 스킬을 같은 세션에서 읽기`; review its prior history before editing.

## Fresh-topic screening

| Candidate | Evidence checked | Decision |
| --- | --- | --- |
| Microsoft Agent Framework malicious PyPI releases | [GitHub Advisory Database](https://github.com/advisories/GHSA-764m-3ppc-5m73), [Wiz incident analysis](https://www.wiz.io/blog/malicious-version-of-microsofts-agent-framework-published-to-pypi), [PyPI project/release history](https://pypi.org/project/agent-framework/) | Reject as duplicate. `_data/cards.yml` already has a card covering 1.26.1/1.26.2, `.pth` startup behavior, the last clean version reported by the advisory, and credential response. Advisory and independent technical analysis corroborate the core claim. |
| Android Developer Summit 2026 intelligent-app updates | [Android Developers Blog, Nov 5 2026](https://developer.android.com/blog/posts/android-intelligence-system-in-app-agents-ads) | Broad recap rejected as overlapping. Follow-up check found the newly announced ML Kit Agent API itself was not represented in the deck; selected that narrow API lesson after checking its official reference. |
| Microsoft MAI Code 2 / Code 2 Flash | [Official model card](https://microsoft.ai/pdf/MAI-Code-2-And-MAI-Code-2-Flash-Model-Card.pdf) | Reject for this run. Release announcement is current, but the sources checked did not establish a distinctive, practically testable developer lesson beyond a new model release. |

### Selected: ML Kit Agent API — Gemini Nano tool loop and session lifecycle

- Sources: [official Android API guide](https://developer.android.com/ai/gemini-nano/mlkit-agent-api), [Android Developer Summit announcement](https://developer.android.com/blog/posts/android-intelligence-system-in-app-agents-ads), and the local `android-skills:mlkit-agent-api` reference skill.
- The API guide documents `AgentRunner` orchestration, AppFunctions tools, managed sessions, `maxTurns`, preview/runtime requirements, and an explicit warning that tool predictions can be wrong. The Summit announcement independently confirms the new API and its difference from direct Prompt API access.
- Practical value: distinguishes model generation from an app-managed agent loop and highlights the tool authorization and session lifecycle that remain application responsibilities.
- Level: `중급`, because the learner should understand Kotlin coroutines, Android ViewModel lifecycle, and function/tool boundaries.
- Popularity/adoption signal: newly announced in the official Android Developer Summit and documented in the Android developer reference; no unsourced adoption or star metric used.
- Confidence: high for documented API behavior and preview limits; medium for long-term availability because the API targets AICore Developer Preview and is alpha.
- Added one card with a source-backed level and interview retrieval pair. `auto-post-log.md` records the routine card addition.

## Source URLs checked

- https://github.com/multica-ai/andrej-karpathy-skills
- https://github.com/advisories/GHSA-764m-3ppc-5m73
- https://www.wiz.io/blog/malicious-version-of-microsofts-agent-framework-published-to-pypi
- https://pypi.org/project/agent-framework/
- https://developer.android.com/blog/posts/android-intelligence-system-in-app-agents-ads
- https://developer.android.com/ai/gemini-nano/mlkit-agent-api
- https://microsoft.ai/pdf/MAI-Code-2-And-MAI-Code-2-Flash-Model-Card.pdf

## Confidence

- Refinement claim: high; checked against the upstream project's current README.
- Duplicate incident rejection: high; card exists and the advisory plus independent research support its central facts.
- New-topic screening: high for the selected ML Kit Agent API because official docs and announcement corroborate a distinct AI+Android workflow absent from the deck; model-release-only candidate rejected.

## Verification status

- The Codex run's interactive environment passed syntax, YAML/card-field checks, 3 routine tests/14 assertions, and `git diff --check`.
- The actual launchd wrapper then exposed an environment-specific defect: with the launchd locale unset, Ruby read the UTF-8 log as US-ASCII and the title assertion raised `Encoding::CompatibilityError` (3 tests, 13 assertions, 1 error).
- Fixed the test to read the log explicitly as UTF-8 and set `LANG`/`LC_ALL` to `en_US.UTF-8` in the LaunchAgent. Re-ran the routine tests with locale variables removed: 3 tests, 14 assertions, 0 failures/errors. Plist validation and card YAML/required fields also pass.
- Full site build was not run because bundle dependencies are unavailable.
