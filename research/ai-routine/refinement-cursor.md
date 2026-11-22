# Older-card refinement cursor

Purpose: let the local AI card routine revisit existing published cards in oldest-first order and improve detail/readability without losing the main research cadence.

Current position: refined the Claude Code subagent catalog card for Android relevance, validation, and plugin safety; continue the oldest-first scan with the next remaining AI/AI+Android card.

Last update: 2026-11-22 15:57 KST

## Latest pass
- Updated the catalog snapshot to 161+ agent definitions, 10 categories, and 26.7k GitHub stars (2026-11-22); popularity is not treated as quality evidence.
- Verified that `kotlin-specialist` explicitly targets Android/Compose, while `mobile-developer` is React Native-oriented; clarified prompts are not validated experts.
- Recommended project-scoped selection and review of tool definitions, plugin hooks/MCP, user-level execution privileges, and context footprint.
- Sources and rationale: `research/ai-routine/20261122-claude-code-subagents-catalog-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Reframed 12-Factor Agents as the author's design guide, not an industry standard or universal checklist.
- Scoped “70–80% quality” to the author's anecdotal conversations with builders; clarified Factor 12 is described by the author as “mostly just for fun.”
- Focused the card on structured model outputs, deterministic application-side validation/execution, and context-sensitive state/resume design.
- Sources and rationale: `research/ai-routine/20261122-12-factor-agents-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Reframed the three tiers as a practical execution-boundary model instead of a stable product taxonomy.
- Removed the unsupported “3–5 agents is optimal” claim and corrected the claim that worktrees eliminate merge conflicts.
- Removed Jules from active examples because its official changelog says it is read-only after 2026-11-11 and winds down on 2026-12-31.
- Added primary docs for subagents, GitHub Copilot cloud, and Codex Cloud; added an interview question about worktree limits and task placement.
- Sources and rationale: `research/ai-routine/20261122-multi-agent-work-placement-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Separated interactive `@claude` mention mode from automation mode selected by a `prompt` input; clarified default output location.
- Added actor checks, minimum-permission guidance, setup prerequisites, and the two cost categories (Actions minutes and model billing).
- Removed the unsupported fixed API-cost estimate and stale star count; added current official docs/repository sources and an interview prompt.
- Sources and rationale: `research/ai-routine/20261122-claude-code-action-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Reframed MCP code execution as an agent architecture pattern, not an MCP-standard feature; one-file-per-tool is one implementation example.
- Scoped the 150k→2k token result to Anthropic's Google Drive→Salesforce example and clarified that PII tokenization is harness behavior, not automatic MCP protection.
- Added advanced difficulty, an interview prompt, and the sandbox/resource-limit/monitoring safety boundary.
- Sources and rationale: `research/ai-routine/20261122-mcp-code-execution-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Replaced the stale “AI Checks pivot” and old 33.7k-star claim with current Continue acquisition/status evidence.
- Distinguished the open-source code and Apache-2.0 reuse rights from the repository's explicit no-longer-maintained notice. Corrected release labels: 2.0.0 VS Code is marked Latest; 2.1.0 is marked Pre-release (both dated June 19, 2026).
- Kept the current `cn` CLI docs in view without treating available docs/install paths as a support guarantee. Added a dated ~36.5k★ snapshot and adoption-risk interview prompt.
- Sources and rationale: `research/ai-routine/20261122-continue-status-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Corrected the employee-case-study card against Anthropic's July 24, 2025 article; removed the unsupported “10 teams” count.
- Labeled the 3x and ~80% time figures as company-reported cases, not controlled benchmarks or general guarantees.
- Kept practical developer/nondeveloper task patterns, added beginner level and an interview prompt; no overlap with the Agent Teams mechanics card.
- Sources and rationale: `research/ai-routine/20261122-anthropic-internal-claude-code-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Confirmed Agent Teams remain experimental, require an interactive session, and are unavailable in `claude -p`/Agent SDK runs (which use ordinary subagents).
- Added the named-subagent-to-teammate behavior and clarified that team members do not inherit the lead's conversation history.
- Corrected a false plan-approval claim: Plan mode plans auto-approve unless the teammate's permission mode is changed.
- Sources and rationale: `research/ai-routine/20261122-claude-agent-teams-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Replaced the inaccurate “standard” and automatic-search claims with the v2 proposal's scope and structure. Corrected `Optional` to a convention, not a parser directive.
- Added Google's explicit statement that Search (including AI features) does not use llms.txt and that it has no visibility impact.
- Added labeled multi-source links while retaining the existing single-source card format as a fallback; added a regression check.
- Sources and rationale: `research/ai-routine/20261122-llms-txt-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Replaced the stale “most popular” claim and 6.6k-star snapshot with a dated, verified ~7.9k★ repository signal.
- Updated the card for current hosted OAuth/API-key and keyless modes; explained when to search, scrape, map, crawl, or interact, including the per-result scrape-cost caveat.
- Checked adjacent Playwright, llms.txt, and MCP code-execution cards; their learning objectives are distinct.
- Sources and rationale: `research/ai-routine/20261122-firecrawl-mcp-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Corrected the Claude Agent SDK billing card against Anthropic’s current Help Center: the announced June separation was paused; plan-authenticated `claude -p` remains within subscription limits.
- Distinguished linked Console API-key credits from plan authentication and excluded interactive Claude Code and GitHub Action/IDE/Desktop-started runs from those API credits.
- Removed stale Pro credit and auto-renewal assertions; added difficulty and an interview prompt.
- Sources and rationale: `research/ai-routine/20261122-claude-agent-sdk-billing-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Replaced the outdated Cursor + Claude Code “dual stack” recommendation with a source-grounded Cursor model-selection card.
- Removed stale claims about fixed product roles and Claude Code using one model; documented task complexity, plan eligibility, and the distinct usage/billing paths for Cursor vs third-party models.
- Avoided fixed pricing/model catalog details; added intermediate difficulty and an interview question.
- Sources and rationale: `research/ai-routine/20261122-cursor-model-selection-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against current primary sources and check overlap.

## Latest pass
- Refined the Claude Code review card against the current official best-practices guide.
- Scoped `/code-review` to a fresh subagent that has not seen the implementation conversation; added spec/edge-case review guidance and “skip style” to limit noise.
- Removed unsupported blanket claims about same-session bias and what the reviewer sees; added a warning not to auto-fix every finding.
- Source and rationale: `research/ai-routine/20261122-claude-code-review-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Refined the multi-agent research card against Anthropic's current primary article.
- Scoped the 90.2% result to its internal benchmark; corrected the token-cost comparison and preserved the parallelism/dependency tradeoff.
- Replaced brittle implementation-specific details with reusable delegation principles; added intermediate difficulty and an interview question.
- Source and rationale: `research/ai-routine/20261122-claude-multi-agent-research-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check overlap.

## Latest pass
- Refined the Claude Code `--json-schema` card against the current official programmatic-use guide.
- Added the absent-`structured_output` failure case, required consumer-side presence checks, and the `format`-is-annotation nuance; removed the overly broad “stable automation” claim.
- Added intermediate difficulty and an interview question about missing structured output.
- Source and rationale: `research/ai-routine/20261122-claude-json-schema-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check for overlap.

## Latest pass
- Refined the Claude Code PR-session retrieval card against the current official workflow guide.
- Clarified when sessions are linked and that `claude --from-pr` filters the session picker rather than creating, merging, or directly restoring a PR.
- Added beginner difficulty, an interview prompt, and the current `claude agents` monitoring surface without expanding the card into a separate agent-view lesson.
- Source and rationale: `research/ai-routine/20261122-claude-from-pr-refinement.md`.
- Next: continue auditing the next AI/AI+Android card against primary sources and check for conceptual overlap.

## Latest pass
- Refined the remote MCP OAuth card against current official Claude Code MCP documentation.
- Clarified that 401/403 does not always trigger OAuth (configured Authorization headers fail as connection errors), covered refresh-token retry, and distinguished local credential clearing from server-side token revocation.
- Added intermediate difficulty and an interview question about token revocation.
- Source and rationale: `research/ai-routine/20261122-claude-remote-mcp-oauth-refinement.md`.
- Next: continue auditing the next AI/AI+Android card, verifying primary-source behavior and avoiding overlap.

## Latest pass
- Refined the Claude Code `@` file-reference card against the current official common-workflows guide.
- Corrected file-size/token-limit caveats and clarified the security boundary: direct `@` insertion bypasses `PreToolUse`; use a `Read` deny rule or disable file mentions where appropriate.
- Preserved directory-listing, inherited `CLAUDE.md`, and MCP resource details; added intermediate difficulty and an interview question.
- Source and rationale: `research/ai-routine/20261122-claude-at-file-reference-refinement.md`.
- Next: continue auditing the next remaining AI/AI+Android card, checking primary sources and overlap before editing.

## Latest pass
- Corrected the beginner card `Kotlin — 정적 타입·다중 플랫폼·Java 상호운용` against Kotlin's official FAQ and language specification.
- Replaced the JVM-only framing with multiplatform targets and Java interoperability; removed unsubstantiated performance/quality guarantees and clarified that Kotlin supports both OO and functional styles.
- Qualified null-safety: it catches many nullability errors but does not eliminate NPEs at `!!` or Java platform-type boundaries.
- Sources and rationale: `research/ai-routine/20261122-081300-kotlin-intro-refinement.md`.
- Next: continue auditing foundation cards for absolute claims or out-of-date platform assumptions.

## Latest pass
- Refined `Compose UI 테스트 — 사용자가 보는 의미를 검증` against current Android Compose testing and Semantics references.
- Clarified that semantics serve accessibility and testing; the test framework searches the merged tree by default, while `onRoot(useUnmergedTree = true).printToLog()` diagnoses merged child nodes.
- Kept it separate from Compose Test v2, which covers coroutine scheduler synchronization rather than semantic node discovery.
- Sources and rationale: `research/ai-routine/20261122-081200-compose-semantics-testing.md`.
- Next: inspect another level-labeled Android or AI+Android card for a concrete source-backed gap.

## Latest pass
- Refined `Compose Flow 수집 — 화면 생명주기에 맞추기` against the current `collectAsStateWithLifecycle` API reference.
- Added the exact default `STARTED` threshold, stop/restart behavior, StateFlow's current value as initial UI state, and the possibility that a cold Flow reruns upstream on recollection.
- Kept the lesson distinct from Compose side-effect API selection; added intermediate difficulty and an interview retrieval question.
- Source and rationale: `research/ai-routine/20261122-081100-compose-flow-lifecycle-collection.md`.
- Next: verify another Android/AI card for one concrete, source-backed gap before changing it.

## Latest pass
- Merged the duplicate Android cards `화면 상태 복원 — ViewModel·SavedState·DB의 수명 구분` and `ViewModel은 프로세스 사망까지 기억하지 않는다` into one intermediate retrieval card.
- Rechecked the lifecycle boundaries against Android's current Save UI States and Saved State module guides: ViewModel survives configuration changes, saved state supports system process restoration for small state while the task remains, and user dismissal removes that saved state; durable app data belongs in persistent storage.
- Preserved the distinct task-stack/process-death nuance, added an interview question, and removed one redundant card.
- Source and rationale: `research/ai-routine/20261122-080900-android-state-restoration-merge.md`.
- Next: inspect another closely related Android/AI card cluster and merge only when the learning objective is demonstrably redundant.

## Latest pass
- Reworked `Gemini Nano 하이브리드 추론 — 실제 실행 경로와 fallback 확인` against current Android and Firebase AI Logic documentation.
- Added the privacy-critical behavior: `PREFER_ON_DEVICE` can fall back to cloud; the SDK does not download the on-device model on an inference request; `inferenceSource` identifies the path actually used.
- Added the current maturity boundary (hybrid SDK Experimental, Prompt API Beta) and an interview prompt about verifying execution locality.
- Sources and rationale: `research/ai-routine/20261122-080200-gemini-nano-hybrid-execution-path.md`.
- Next: continue reviewing existing AI+Android cards for practical boundary errors and duplicate concepts.

## Latest pass
- Refined `스킬 disallowed-tools — 호출 중 도구 가용성 줄이기` against the current official Claude Code skills guide.
- Distinguished per-skill invocation tool removal (clears on the next user message) from persistent permission deny rules across skills/prompts; clarified that `allowed-tools` grants approvals without hiding other tools.
- Added the documented `EndConversation` exception and an interview prompt to practice the scope distinction.
- Source and rationale: `research/ai-routine/20261122-080100-claude-skill-disallowed-tools-refinement.md`.
- Next: continue the oldest-first AI/AI+Android card scan, checking overlap and current primary sources before editing.

## Latest pass
- Reviewed `StopFailure 훅 — API 에러로 턴이 끝날 때만 잡아내기` against the current official Claude Code hooks reference.
- Corrected the event contract: StopFailure replaces Stop on API-error termination; `error` is the matcher field, and HTTP 529 overloads are reported as `server_error`.
- Preserved the decision-control boundary while noting the documented `terminalSequence` output exception; removed the outdated `overloaded` matcher example.
- Source and rationale: `research/ai-routine/20261122-075900-claude-stopfailure-refinement.md`.
- Next: resume the oldest-first AI/AI+Android card scan and verify candidate relevance before changing another card.

## Latest pass
- Reviewed and refined `설정형 훅 핸들러 5종 — 이벤트별 지원과 검토` against the current official Claude Code hooks reference.
- Scoped the five types to settings-based hooks; documented that support varies by event (`PreCompact`: command/http/mcp_tool; `Setup`: command only) and agent hooks remain experimental.
- Corrected the stale `/hooks` claim: it is now a read-only browser, not an editor; settings files are where hooks are changed.
- Distinguished prompt's single model evaluation from agent's tool-using subagent verification.
- Source and rationale: `research/ai-routine/20261122-080000-claude-hook-handler-types-refinement.md`.
- Next: continue oldest-first with `스킬 disallowed-tools`; verify how temporary tool removal interacts with baseline deny rules and duration.

## Latest pass
- Reviewed and refined `PreCompact 훅 — 요약 지침과 외부 저장 분리` against the current official Claude Code hooks reference.
- Clarified `manual` (`/compact`) and `auto` (auto/idle compaction), and that successful hook stdout becomes compaction-summary instructions (10,000 characters per hook), not a durable log.
- Distinguished explicit external persistence from summary instructions and documented that blocking proactive auto-compaction differs from blocking recovery after a context-limit error.
- Source and rationale: `research/ai-routine/20261122-075700-claude-precompact-refinement.md`.
- Next: continue oldest-first with `훅 핸들러 5종`; verify current handler types, availability in `/hooks`, and MCP/prompt/agent behavior.

## Latest pass
- Reviewed and refined `스킬 effort 프런트매터 — 턴 단위 추론 강도 조절` against the current official Claude Code skills guide.
- Corrected scope from "while the skill is active" to the current turn; documented that model support varies, `CLAUDE_CODE_EFFORT_LEVEL` takes precedence, and forked skills set the subagent's effort.
- Confirmed `model` is also a turn-only override and `${CLAUDE_EFFORT}` exposes the current level; removed the unsupported product-specific xhigh assertion.
- Source and rationale: `research/ai-routine/20261122-075400-claude-skill-effort-refinement.md`.
- Next: continue oldest-first with `PreCompact 훅`; verify current matcher/blocking/output semantics before refining.

## Latest pass
- Reviewed and refined `스킬 호출 권한 — 모델 자율 호출과 사용자 호출 분리` against the current official Claude Code skills guide.
- Clarified that `disable-model-invocation: true` prevents autonomous model selection but does not turn a trailing `/name` mention into a direct command; the mention grants permission for the model to decide whether to invoke it.
- Distinguished this from `user-invocable: false`, which hides a skill from user invocation while keeping it available to the model.
- Source and rationale: `research/ai-routine/20261122-075200-claude-skill-invocation-controls-refinement.md`.
- Next: continue oldest-first with `스킬 effort 프런트매터`; verify supported values/models and whether any scope/version caveat has changed.

## Latest pass
- Reviewed and refined `disableBundledSkills — 번들 스킬·내장 명령을 모델 눈앞에서 치우기` against the current official Claude Code settings reference.
- Distinguished skills/workflows (removed) from built-in slash commands (hidden from the model but still typable); confirmed plugin and project user-defined skills/commands are unaffected.
- Added the interaction rule: either the setting or the session environment variable can disable bundled skills, and the other cannot re-enable them.
- Source and rationale: `research/ai-routine/20261122-074900-disable-bundled-skills-refinement.md`.
- Next: continue oldest-first from the next AI/AI+Android card not yet explicitly reviewed; skip pure Android topics.

## Latest pass
- Reviewed and refined `상태줄 rate_limits — 사용 한도와 리셋 시각 표시` against current official Claude Code statusline documentation.
- Corrected the old Pro/Max-only and "always visible" claims: data is available to Pro/Max/Ultra subscribers or Claude apps gateways with a spend limit, after the first API response; individual windows can be absent and are removed after their reset.
- Clarified that missing rate-limit data is not 0%, the statusline is local, and context-window usage is a separate field.
- Source and rationale: `research/ai-routine/20261122-074300-claude-statusline-rate-limits-refinement.md`.
- Next: continue from the next oldest AI/AI+Android card not yet explicitly reviewed; skip pure Android topics.

## Latest pass
- Reviewed and refined: `Stop 훅 additionalContext — 턴 끝에 컨텍스트 주입해 작업 이어가기`
- Source re-checked: current official Claude Code Hooks reference (context injection and Stop/SubagentStop)
- Clarified that `SubagentStop` context reaches the subagent, not its parent; documented Agent `PostToolUse` for parent context
- Added `stop_hook_active`, shared eight-consecutive-continuation guard, and the 10,000-character per-value file/preview behavior
- Next: continue oldest-first with the next AI/AI+Android card not yet explicitly reviewed; skip pure Android topics

- Reviewed and refined: `fallbackModel — 기본 모델이 막힐 때 대체 모델로 자동 전환`
- Sources re-checked: official Claude Code model configuration, settings reference, settings precedence, and CLI reference
- Specified which server/model errors trigger fallback and which errors do not; documented turn-only switching, primary retry next turn, three-distinct-allowed-model cap, and allowlist filtering
- Kept the special non-merging precedence rule and session-only `--fallback-model` override; added a rate-limit/inter-file-precedence interview question
- Next: continue oldest-first with the next AI/AI+Android card not yet explicitly reviewed; skip pure Android topics

- Reviewed and refined: `Claude Code 출력 스타일 — 세션 응답의 역할·톤·형식 조정`
- Source re-checked: current official Claude Code Output styles documentation
- Corrected the built-in count (four styles besides Default), `/output-style` command availability (v2.1.269), and next-message activation (v2.1.251+); removed the stale `/clear` requirement
- Clarified that styles are instructions, not enforcement; distinguished CLAUDE.md, Skills, Hooks/permissions, and custom style coding-instruction retention
- Next: continue oldest-first with the next unreviewed AI/AI+Android card; skip pure Android topics

- Reviewed and refined: `Claude Code /cd — 대화를 유지하며 작업 디렉터리와 프로젝트 설정 이동`
- Sources re-checked: current Claude Code Permissions/working-directory docs, Commands reference, and official changelog
- Separated `/cd` availability in v2.1.169 from immediate destination-project configuration loading in v2.1.246; removed the unsupported internal explanation about appending CLAUDE.md as a user message
- Clarified `/cd` (switch primary project context) versus `/add-dir` (add file access); documented trust prompt and session resume behavior
- Next: continue oldest-first from the next AI/AI+Android card not yet explicitly checked in this cursor; avoid pure Android cards

- Reviewed and refined: `Dia2 — 대화형 TTS의 조기 생성과 실제 스트리밍을 구분하기`
- Source re-checked: official Nari Labs Dia2 repository README; current repository page showed 1.2k stars and 103 forks (volatile attention signal, not quality evidence)
- Corrected Python/CUDA-only implication: documented CUDA 12.8+ setup and CPU fallback, while explicitly noting this does not establish Android support
- Reaffirmed that the separate TTS server remains an upcoming item; added third-party asset license and Android runtime/device profiling checks
- Next: recompute the next oldest unreviewed AI/AI+Android card from `_data/cards.yml`; do not assume the previous stale cursor sequence is complete

Current run:
- Reviewed and refined: `PowerLens` (replaced headline-first product framing with a rooted/cloud-backed research case study on policy constraints and privileged Android actions)
- Sources checked: arXiv full paper and author project page; GitHub repository search returned zero matching repositories
- Corrected experiment scope: benchmark on one rooted OnePlus ACE 5 / Android 15; separate 14-day study involved 10 people and 8 rooted devices; removed the extrapolated 0.5% daily-overhead headline
- Flagged unresolved safety-critical discrepancy: PDF says LLM generates shell commands; author page says deterministic lookup; no public code verified to resolve it
- Kept separate from `MNN-AECS`: system-level power policy versus inference-runtime decode scheduling
- Reviewed and refined: `Locanara Android` (replaced the cross-platform backend/router summary with the Android SDK's install-floor versus Gemini Nano runtime-readiness distinction; added explicit status/download flow and AGPL-3.0 deployment check)
- Sources re-checked: Locanara Android Gradle module and `MLKitPromptClient` implementation; Google's current ML Kit Prompt API setup and availability guidance
- Repository attention signal: GitHub API showed 9 stars, 3 forks, and last push 2026-08-08; weak/stale adoption evidence, so the card is retained as a concrete integration lesson rather than a product recommendation
- Rejected the README's cross-platform automatic-engine-routing claim for this Android-focused card; platform README tables do not prove identical Android implementation behavior
- Reviewed and refined: `v0` (distinguished its current AI web-app/full-stack creation workflow from Stitch's design-canvas/prototype use case; removed unsupported Figma/React/$20 pricing claims)
- Sources re-checked: current official v0 product page
- Added explicit note: responsive mobile web is not a native Android app
- Reviewed and refined: `Google Stitch` (updated from the March 2026 Google Labs announcement; replaced stale launch-era features with current AI canvas, design agent, voice iteration, prototype, DESIGN.md, MCP/SDK workflow)
- Sources re-checked: current official Google Labs announcement
- Explicitly framed generated prototypes as design aids, not validated Android UI implementations
- Reviewed and refined: `React Native ExecuTorch + RAG` (updated model examples and platform backend mapping; documented first-load downloads, runtime prerequisites, in-memory versus persistent vector stores, and privacy/network caveat)
- Sources re-checked: official React Native RAG ExecuTorch integration README, project repository, ExecuTorch repository, and Expo implementation article
- RAG repository displayed 351 stars at review; treated as a volatile activity signal, not quality evidence
- Reviewed and refined: `gptme` (reframed from terminal coding agent to current extensible agent platform; clarified CLI/server/agent-template distinction, Skills/Lessons/plugins, MCP/ACP, local-first limitations, and permission boundary)
- Sources re-checked: official gptme GitHub README and current documentation index
- GitHub displayed 4.5k stars at review; volatile popularity signal, omitted from the card
- Reviewed and refined: `GitHub Copilot Code Review` (qualified the June AGENTS.md GA announcement; corrected Skills/MCP conditional use and added review effort, AI credit, Actions runner, and human-validation boundaries)
- Sources re-checked: official GitHub Changelog and current GitHub Docs
- Current docs distinguish base review from agentic capabilities and document both AI-credit and Actions-minute usage
- Reviewed and refined: `smol developer` (reframed as an early coding-agent case study; replaced stale model/popularity claims with the current README's plan → file list → per-file generation flow and explicit human validation)
- Source re-checked: current public GitHub README; repository displays 12.2k stars, recorded only as a volatile attention signal, not evidence of current support or quality
- Marked README's GPT-4-era examples as historical rather than current compatibility guidance
- Reviewed and refined: `AgenTest` (stated Android-only scope; qualified ~80ms UI-tree and 60fps gRPC measurements to documented helper/emulator paths; distinguished exploratory AI testing from deterministic regression suites; clarified debug-only data inspection)
- Source re-checked: official AgenTest README
- Repository page displayed 5 stars at review; recorded as a low attention signal, not proof of usefulness or maturity
- Reviewed and refined: `MobileSAM` (removed implication that 12ms is Android performance; tied it to the paper's single-GPU benchmark and split 8ms encoder/4ms decoder; distinguished model pipeline intent from universal deployment compatibility; added Android runtime/device profiling requirements)
- Sources re-checked: official MobileSAM repository README and arXiv paper
- Official repository displayed 5.9k stars; recorded as a volatile interest signal, not evidence of Android readiness or model quality
- Reviewed and refined: `MediaPipe` (removed unsupported 30–60 FPS guarantee, CPU/GPU/NPU auto-dispatch, PyTorch comparison, and bundled landmark counts; updated to current MediaPipe Tasks scope and Android IMAGE/VIDEO/LIVE_STREAM behavior)
- Sources re-checked: official Google AI Edge MediaPipe Tasks overview and official Android Kotlin examples embedded in the current overview
- Added target-device end-to-end performance and live-frame/backpressure selection as the practical Android lesson
- Reviewed and refined: `Genkit Dart` (updated preview to stable 1.0 GA; removed unsupported Gemma-on-device/Apple Intelligence package claims; clarified Flutter remote action/model architectures, API-key exposure, provider differences, and experimental agent APIs)
- Sources re-checked: official Dart 1.0 release announcement, current Genkit Dart API stability docs, and current Get started docs
- Reframed as AI+Flutter/Android-adjacent knowledge; distinguished shared Dart client/backend types from moving all logic freely between tiers
- Reviewed and refined: `Sentry` (framed as mobile telemetry plus Seer investigation; qualified 94.5% as Sentry's historical internal Autofix root-cause result and paired with its separate 53.6% fix-success claim; removed unverified offline-cache claim; added telemetry minimization and human review)
- Reviewed and refined: `Novu` (reframed the generic notification-platform description around its current AI MCP server and Agent Communication Infrastructure; documented the native Android SDK/Inbox gap, FCM server integration, and backend-only secret key)
- Sources re-checked: Novu's official MCP docs, SDK support matrix, API key security docs, FCM integration guide, and current GitHub README
- GitHub displayed 40.4k stars during review; recorded as a volatile attention signal and omitted from the card
- Removed `GrowthBook`: its existing card described general-purpose feature flags and experimentation without a core AI workflow; historical publication logs remain unchanged.
- Reviewed and refined: `Firebase Remote Config` (separated Android client-template A/B tests and Personalization from server-template AI model/prompt selection; removed the unqualified “free” claim and stated the current fetch quota and billing boundary)
- Sources re-checked: official Firebase Remote Config Android guide, client/server template comparison, A/B Testing, Personalization, security guidance, and pricing page
- Added the critical client-value visibility boundary and an interview prompt about where to keep system prompts and API keys
- Replaced the unsupported multi-tool `AI 로컬라이제이션 CLI` catalog with a focused Tolgee Android/AI workflow card; checked official AI translator, Android XML, Android SDK, GitHub adoption, and release evidence
- Removed `LinkForty`: its card describes generic deep-link infrastructure without a central AI or AI+Android use case; historical publication records remain unchanged
- Rejected the previous tool-list framing: `android-localisation` and `LocalizeKit` each showed 2 GitHub stars; `Localization-CLI` showed 116 stars but its repository is a Node.js iOS `.xcstrings` tool and lists Android XML as future work
- Sources re-checked: official Sentry mobile solution page and Sentry blog posts documenting Seer/Autofix accuracy and fix success
- No independent evaluation set or Android-only accuracy guarantee was found in reviewed sources; card no longer generalizes the number
- Reviewed and refined: `Koog` (removed unsupported GA date and sweeping platform/pro-vider claims; captured Android target documentation ambiguity; clarified agent orchestration vs on-device inference and client-secret risk)
- Sources re-checked: official Koog documentation and GitHub README
- Reviewed and refined: `Maestro` (replaced stale MaestroGPT claims with the current built-in MCP agentic UI testing workflow; highlighted YAML review and device-action risk)
- Sources re-checked: official Maestro README and documentation
- Reviewed and refined: `Gemma 4` (removed unsupported Samsung throughput claim and incorrect parameter implication; distinguished AICore system-model access from in-app LiteRT-LM deployment; added memory/KV-cache caveat)
- Sources re-checked: Google AI Edge announcement and current Gemma model docs
- Reviewed and refined: `Apple Core AI` (distinguished model conversion, device specialization, and ahead-of-time compilation; stated Apple-platform scope and Android non-portability)
- Sources re-checked: official WWDC26 video transcript and linked Apple resources
- Reviewed and refined: `Distilabel` (removed named-recipe and “any provider” claims without scope; added synthetic-data quality checks and current community-maintenance status)
- Sources re-checked: official repository README and current documentation
- Reviewed and refined: `MLflow` (removed unsupported “industry standard”, ownership/cost comparison, and vendor-lock-in claims; refocused on trace + evaluation workflow)
- Sources re-checked: official MLflow README and current documentation
- Reviewed and refined: `BentoML` (removed absolute ease and competitor-ranking claims; clarified API packaging, Bento artifacts, Docker, and production validation responsibilities)
- Sources re-checked: official BentoML README and current GitHub repository metadata
- Reviewed and refined: `Qwen3-Embedding` (removed stale present-day leaderboard claim, corrected wrong source URL, clarified dimensions/instructions and dated official benchmark)
- Sources re-checked: official Qwen3-Embedding model card and repository
- No device-side/mobile support inferred from model size or dimension flexibility
- Reviewed and refined: `BGE-M3` (removed unsupported consensus, model ranking, and CPU suitability claims; clarified three retrieval representations and RAG evaluation guidance)
- Sources re-checked: official Hugging Face model card, FlagEmbedding repository, and latest arXiv paper version
- Metrics: GitHub repository displayed about 12.3k stars; no popularity metric used as evidence of model quality
- Reviewed and refined: `ComfyUI` (corrected dated star count and unsupported claims about best-in-class, guaranteed privacy, and consumer GPU requirements; documented workflow reproducibility and dependency checks)
- Sources re-checked: official ComfyUI README and current GitHub repository metadata
- Reviewed and refined: `Tabby` (replaced old code-completion-only framing with current coding-assistant scope; removed dated star count/model recommendations; added self-hosting responsibility interview practice)
- Sources re-checked: official Tabby README and current GitHub repository metadata
- Reviewed and refined: `Dia2` (corrected 1.6B to current 1B/2B checkpoints; distinguished early audio generation from real-time streaming server; stated English and 2-minute limits; added Android feasibility interview practice)
- Sources re-checked: official Dia2 GitHub README, license, and Hugging Face model cards; live repository metadata
- No evidence of upstream Android SDK or product-level Android streaming support
- Reviewed and refined: `Kokoro-82M` (removed unsourced 14x quality claim; corrected 44 to 54 voices; added voice-quality/runtime limits and Android integration interview practice)
- Sources re-checked: official model card, voice list, evaluation note, and inference repository; live GitHub/Hugging Face metadata
- No performance or Android support claim beyond upstream evidence
- Next: continue with `Dia2(Nari Labs) — 웃음·기침·한숨까지 재현하는 대화 전용 TTS 모델(Apache-2.0·1.6B)`

Reviewed:
- `Google Stitch(구 Galileo AI) — 텍스트·음성으로 모바일·웹 UI와 프런트엔드 코드를 빠르게 시도하는 Google Labs 도구`
- `diagnose — 디버깅을 규율로 만드는 스킬`
- `Spec Kit — 명세 주도 개발(SDD)`
- `Karpathy-inspired CLAUDE.md — 에이전트 행동을 네 규칙으로 좁히기`
- `Ouroboros — 모호함을 수치로`
- `서브에이전트 — 컨텍스트를 지키는 분업`
- `Claude Code GitHub Action — PR에 부르면 자동 수정·리뷰`
- `Gemini CLI — 빠른 무료 한도 + 터미널 에이전트`
- `Codex CLI — Rust 기반 터미널 코딩 에이전트`
- `Crush — Charm이 만든 'TUI 맛집' 모델-비종속 터미널 코딩 에이전트`
- `promptfoo — 프롬프트·모델을 바꿔도 품질이 안 깨졌는지 자동으로 재는 eval 툴`
- `awesome-agent-skills — 코딩 에이전트 가리지 않고 쓰는 스킬 1400+개 모음(VoltAgent·25k★)`
- `Roo Code 셧다운 — 24k★ 오픈소스 에디터 에이전트가 'IDE는 코딩의 미래가 아니다'며 접은 사건`
- `Ruler — CLAUDE.md·AGENTS.md·.cursorrules를 한 곳에서 써서 모든 에이전트에 뿌리기`
- `Pi — '고쳐 쓰라고' 만든 자기확장형 터미널 코딩 에이전트(earendil-works·65k+★)`
- `Droid(Factory AI) — '모델보다 에이전트 설계'를 Terminal-Bench로 증명한 CLI`
- `Cursor 코드베이스 인덱싱 — 임베딩으로 '의미 검색'하되 원문은 서버에 안 남긴다`
- `Continue CLI(cn) — 모델·규칙·도구를 끼워 쓰는 모듈형 오픈소스 터미널 에이전트`
- `Continuous Claude — Ralph 루프에 PR·CI·머지까지 붙인 '무인 개발 파이프라인'`
- `Codebuff — 단일 모델이 아니라 '에이전트 4종 팀'으로 코드를 고치는 터미널 에이전트`
- `Google Antigravity — Gemini CLI를 접고 갈아타라는 '에디터·터미널·브라우저' 통합 에이전트 플랫폼`
- `Mastra — 'Gatsby 팀'이 만든 TypeScript용 AI 에이전트 프레임워크`
- `Cursor CLI 헤드리스 모드 — agent -p로 CI·스크립트에서 코드 작업 자동화`
- `Gartner가 'AI 코드 어시스턴트'를 'AI 코딩 에이전트'로 다시 부르다 — 4강 굳히기`
- `ETH Zurich 연구 — AGENTS.md를 LLM에게 자동 생성시키면 오히려 성공률이 떨어진다`
- `Dreams(Anthropic) — 에이전트가 세션 사이에 '잠자며' 메모리를 정리하는 리서치 프리뷰`
- `OpenClaw — 메신저로 부리는 self-hosted·모델 비종속 에이전트(MIT)`
- `ccusage — 코딩 에이전트 토큰·비용을 로컬 로그만으로 집계하는 CLI(16.2k★)`
- `Claude Code on the web — 터미널 안 열고 브라우저·모바일에서 작업을 클라우드에 던지기`
- `AI-research-SKILLs(Orchestra Research) — 에이전트를 'AI 리서치 전문가'로 만드는 98개 스킬 묶음(10k★)`
- `서브레시피 파이프라인 — 복잡한 작업을 'YAML 레시피'로 쪼개 단계·병렬로 돌리기`
- `GNAP — git 저장소 하나로 AI·사람 에이전트를 조율하는 프로토콜`
- `Open SWE(LangChain) — 깃허브 이슈에 라벨만 붙이면 도는 비동기 클라우드 코딩 에이전트`
- `DX 도구별 PR 처리량 벤치마크 — '얼마나 자주 쓰느냐'가 도구 이름보다 크다`
- `Everything Claude Code(ECC) — 200k★ 넘긴 '에이전트 설정 모음', AgentShield 보안 감사기까지`
- `Sim — '채팅·비주얼·코드'로 AI 에이전트를 짜는 오픈소스 워크스페이스(28.9k★)`
- `Sentry Seer — 프로덕션 텔레메트리로 근본원인을 찾아 코딩 에이전트에 넘기는 디버깅 에이전트`
- `Jules(Google) — 계획을 먼저 보여주고 VM에서 자율로 도는 GitHub 코딩 에이전트`
- `/fork — 서브에이전트와 달리 '대화 전체'를 물려받는 분신 띄우기`
- `Task Master — PRD를 던지면 '의존성 달린 태스크 목록'으로 쪼개주는 에이전트(MIT+CC)`
- `Claude Agent SDK — 'Claude Code를 라이브러리로' 받아 자체 에이전트를 짜는 공식 SDK`
- `AI 랩이 개발 툴체인을 사들이는 중 — Anthropic→Bun, OpenAI→Astral(uv·ruff)`
- `ccpi + tonsofskills.com — 플러그인·스킬·에이전트를 키워드로 검색·설치하는 오픈소스 마켓플레이스 CLI`
- `BMAD-METHOD — '애자일 팀 전체'를 에이전트로 흉내 내는 IDE 비종속 개발 방법론(49.7k★)`
- `OpenSpec — Spec Kit보다 가볍게, 코드 짜기 전에 '무엇을 만들지'부터 합의하는 SDD(56.6k★)`
- `Code Mode(Cloudflare) — MCP 도구를 'TypeScript API'로 바꿔 LLM에게 코드로 호출하게 하기`
- `에이전트 팀으로 C 컴파일러 짜기(Anthropic) — 병렬 자율 에이전트 '하네스'를 설계하는 실전 교훈`
- `서브에이전트 4가지 패턴(Philipp Schmid) — '메인 에이전트가 쥔 통제권' 순으로 줄 세우기`
- `에이전트 코딩의 '80% 문제' — 보이는 80%는 끝내고 안 보이는 20%(인증·DTO·타 레포)를 빼먹는다`
- `Cipher → ByteRover CLI — 도구가 바뀌어도 따라다니는 '코딩 에이전트용 휴대 메모리 레이어'`
- `Kilo Code — VS Code·JetBrains·CLI를 오가는 오픈소스 코딩 에이전트(MIT·24.6k★)`
- `Bumblebee(Perplexity) — 에이전트가 깐 MCP 서버·확장을 '코드 실행 없이' 훑어 공급망 노출을 잡는 스캐너`
- `Deep Agents(LangChain) — harness engineering로 Terminal Bench 2.0 Top 5`
- `Agentic AI Foundation(AAIF) — MCP·goose·AGENTS.md가 리눅스재단 중립 거버넌스로 모이다`
- `security-guidance 플러그인 — Claude가 짠 코드의 취약점을 같은 세션에서 잡아 고치게 하기`
- `AGENTS.md 실전 — 'README for agents'를 모노레포에 어떻게 까는가(중첩·우선순위 규칙)`
- `Factory droid — Terminal-Bench 1위·Mission·Custom Droid로 미는 모델 비종속 엔터프라이즈 코딩 플랫폼`
- `Terminal-Bench 2.1 — 셸 전체가 문제, 에이전트+모델 쌍·Claude 5 Fable 83.1% (2026-06)`
- `SWE-bench Multimodal — 스크린샷 보고 'JS UI 버그'를 고치는 능력을 따로 재는 벤치마크`
- `claude --worktree — 한 레포에서 여러 Claude 세션을 'git 워크트리'로 격리해 동시에 돌리기`
- `Context Rot(Chroma 연구) — '컨텍스트만 길어져도' 18개 모델 전부 정확도가 무너진다`
- `서브에이전트 모델 라우팅 — 탐색은 Haiku, 리뷰는 Sonnet으로 강제해 비용 천장을 거는 법`
- `에이전트 스킬의 '점진적 로딩' — 메타 100토큰만 항상 보이고, 본문은 필요할 때만 끌어오기`
- `Frequent Intentional Compaction — 컨텍스트를 40~60%로 유지하며 리뷰는 코드 아닌 '리서치·플랜'에 거는 워크플로`
- `claude-code-security-review — PR마다 도는 Anthropic 공식 AI 보안 리뷰 액션(diff 인지·오탐 필터)`
- `Serena(oraios) — 에이전트에게 IDE급 '심볼 단위' 코드 탐색·편집을 주는 MCP 툴킷(~24k★)`
- `Agent Client Protocol(ACP) — '에디터'와 '코딩 에이전트'를 분리하는 개방형 표준(Zed·JetBrains)`
- `Conductor — 한 화면에서 Claude Code·Codex·Cursor를 '병렬로' 돌리는 맥용 오케스트레이터`
- `MCP Tool Search — MCP 서버 수십 개 붙여도 컨텍스트가 안 터지는 'on-demand 로딩'(Claude Code 기본값)`
- `DeepSWE(Datacurve) — 채점기 오류를 줄이고 '오래 걸리는 일'로 다시 줄 세운 코딩 에이전트 벤치마크`
- `Context7(Upstash) — '낡은·환각 API'를 막으려 버전별 최신 문서를 매 요청에 끼워 넣는 MCP 서버(MIT)`
- `공식 /code-review 플러그인 — '리뷰 4개 병렬 → 한 건씩 재검증'으로 오탐을 떨궈내는 구조`
- `Spotify Honk — Agent SDK·K8s pods·Slack @Honk·Fleet Management 위 백그라운드 agent`
- `mini-SWE-agent — '도구·설정 다 빼고' 100줄 bash만으로 SWE-bench 74%를 찍은 미니멀 에이전트(SWE-agent 후속)`
- `Kiro(AWS) — '코드가 아니라 스펙이 산출물'이라며 requirements→design→tasks 3단계를 강제하는 Spec-Driven 에이전트`
- `cc-sdd(Spec-Driven Development) — Kiro의 '스펙→설계→태스크' 워크플로우를 아무 코딩 에이전트에서 쓰기(오픈소스)`
- `Axolotl — YAML 한 장으로 멀티GPU LLM 파인튜닝 파이프라인을 관리하는 엔터프라이즈 오케스트레이터(Apache-2.0·~11k★)`
- `Qwen3-Coder-Next — 80B MoE에서 3B만 활성화하는 로컬 개발용 코딩 에이전트(오픈웨이트·256K ctx)`
- `DSPy — '프롬프트를 짜지 말고 프로그래밍하라', Stanford NLP의 LLM 파이프라인 최적화 프레임워크(MIT·~35k★)`
- `LiteLLM — 100+ LLM 프로바이더를 OpenAI 호환 API 하나로 통합하는 셀프호스팅 게이트웨이(MIT·~40k★)`
- `E2B — AI 에이전트가 생성한 코드를 Firecracker 샌드박스에서 실행하는 클라우드 인프라(Apache-2.0·~12.8k★)`
- `Dify — LLM 앱을 비주얼 워크플로우로 빌드·배포하는 LLMOps 플랫폼(100k★·Apache-2.0 기반)`
- `Keploy — 실제 API 트래픽을 녹화해서 테스트 케이스를 자동 생성하는 오픈소스 AI 테스트 도구`
- `Instructor — Pydantic 스키마로 LLM 출력을 '구조화 데이터'로 강제하는 라이브러리(MIT·~12k★·6개 언어)`

Refined:
- `SWE-agent — GitHub 이슈를 직접 고치는 ACI 연구용 에이전트` — re-checked the current official architecture docs and live GitHub API metadata; clarified the ACI lesson via the documented SWE-ReX/YAML Agent/tools/history processor/action parser architecture, retained maintenance-only and mini-swe-agent guidance, and refreshed stars to 20,835 (2026-11-22).
- `Google Stitch(구 Galileo AI) — 텍스트·음성으로 모바일·웹 UI와 프런트엔드 코드를 빠르게 시도하는 Google Labs 도구` — re-checked the current Google Labs Stitch blog and removed the unsupported quota wording; clarified the current voice, interactive prototype, and MCP/SDK/skills bridge while keeping the card scoped to design-to-code workflow.
- `kmp-ai — Kotlin Multiplatform llama.cpp 런타임으로 Android·iOS·Desktop에서 오프라인 LLM 돌리기(Maven Central)` — re-checked the current README and GitHub API metrics; clarified the KMP/llama.cpp runtime boundary, `Flow<Token>` streaming, resumable downloads, KV-cache reuse, GBNF constraints, Maven Central AAR packaging, and the Android+iOS+Desktop lesson, while noting that the repo is live but has no meaningful current popularity signal.
- `SWE-agent — GitHub 이슈를 받아 LM이 직접 도구를 써서 자동으로 고치게 하는 ACI 기반 에이전트` — re-checked the current README, docs, docs background, docs usage/FAQ, and live GitHub API metrics; refreshed the star/fork/license/pushed_at signal, clarified the ACI lesson, current mini-swe-agent recommendation, and maintenance-only status, and tightened the benchmark/config/tool-bundle takeaways.
- `llama.cpp + GGUF — HF→GGUF→quantize, 로컬 배포의 기본 파이프라인` — re-checked the current README, quantize docs, imatrix discussion, and live GitHub API metrics; removed the stale 2026 standard claim, clarified the convert→quantize boundary, and kept Q4_K_M as a practical upstream baseline.
- `GraphRAG(Microsoft) — 지식 그래프로 RAG를 강화, '벡터만으로는 못 잡는 관계'를 추론(오픈소스)` — re-checked the official docs and GitHub repo; removed unsupported Neo4j/LazyGraphRAG wording, clarified the knowledge-graph extraction plus community-hierarchy pipeline, and tightened the practical takeaway around local/global/DRIFT search paths.
- `Outlines — 로컬 LLM 출력을 FSM으로 100% 스키마 준수시키는 구조화 생성 엔진(Apache-2.0·~13k★)` — re-checked official docs and GitHub repo page; softened the absolute schema guarantee into a source-backed generation-time constraint, clarified supported integrations, and kept the Instructor contrast focused on post-hoc validation versus generation-time masking.
- `diagnose — 디버깅을 규율로 만드는 스킬` — clarified the reproducible red/pass debugging loop and practical AI-agent lesson.
- `Spec Kit — 명세 주도 개발(SDD)` — clarified the SDD artifact flow and the role of specs as AI execution boundaries.
- `Ouroboros — 모호함을 수치로` — clarified the interview/seed/run/evaluate loop and added the ontology convergence threshold alongside the ambiguity threshold.
- `서브에이전트 — 컨텍스트를 지키는 분업` — clarified context isolation, project/user scope precedence, tool/MCP limits, and model routing.
- `Gemini CLI — 빠른 무료 한도 + 터미널 에이전트` — clarified the free-tier limits, tool surface, MCP extensibility, and script-friendly JSON/streaming outputs from the current README.
- `Codex CLI — Rust 네이티브 로컬 코딩 에이전트(92k+★)` — refreshed live GitHub metrics, latest release, install/auth surfaces, and the practical split between local CLI, IDE integration, and Codex Web.
- `Crush — Charm이 만든 'TUI 맛집' 모델-비종속 터미널 코딩 에이전트` — refreshed live GitHub metrics and current README-supported model/LSP/MCP/platform details, while removing unsupported local-model wording from the older card.
- `promptfoo — 프롬프트·모델을 바꿔도 품질이 안 깨졌는지 자동으로 재는 eval 툴` — refreshed live GitHub metrics, OpenAI acquisition/open-source continuity, and the practical test-driven LLM development workflow.
- `awesome-agent-skills — 코딩 에이전트 가리지 않고 쓰는 스킬 1400+개 모음(VoltAgent·25k★)` — refreshed live GitHub metrics, README skill count, current compatibility list, official/team source examples, and the practical lesson of treating SKILL.md as a reusable cross-agent knowledge unit.
- `Roo Code 셧다운 — 24k★ 오픈소스 에디터 에이전트의 피벗과 포크 생존` — refreshed live GitHub metrics, archive status, official README shutdown notice, Zoo Code continuation source, and removed older unsupported Cloud/Router/install-count wording.
- `Ruler — CLAUDE.md·AGENTS.md·.cursorrules를 한 곳에서 써서 모든 에이전트에 뿌리기` — refreshed live GitHub metrics, current supported-agent table, root AGENTS.md precedence, source-marker traceability, nested-rule caveat, and MCP/skills/subagents propagation surface.
- `Pi — '고쳐 쓰라고' 만든 자기확장형 터미널 코딩 에이전트(earendil-works·65k+★)` — refreshed live GitHub metrics, current package split, explicit no-built-in-permission caveat, sandbox options, and supply-chain hardening details from the README.
- `Droid(Factory AI) — '모델보다 에이전트 설계'를 Terminal-Bench로 증명한 CLI` — clarified the reusable agent-harness lessons behind the Terminal-Bench result: hierarchical prompting, model-specific tool/edit handling, minimal schemas, environment bootstrapping, timeout planning, plan-state reminders, and controlled background execution.
- `Cursor 코드베이스 인덱싱 — 임베딩으로 '의미 검색'하되 원문은 서버에 안 남긴다` — refreshed the source URL to the current Search docs, removed an older unsupported accuracy metric, and clarified the grep/semantic search/Explore subagent split plus current privacy/indexing behavior.
- `Continue CLI(cn) — 모델·규칙·도구를 끼워 쓰는 모듈형 오픈소스 터미널 에이전트` — preserved the CLI design lesson, refreshed live maintenance state from the README, removed stale active-development wording, and clarified TUI/headless/config-sharing behavior without calling the repository archived.
- `Continuous Claude — Ralph 루프에 PR·CI·머지까지 붙인 '무인 개발 파이프라인'` — refreshed live GitHub metrics, provider support, PR lifecycle, context continuity, worktree support, GitHub-only automation boundary, and bounding/safety flags from the current README.
- `Codebuff — 단일 모델이 아니라 '에이전트 4종 팀'으로 코드를 고치는 터미널 에이전트` — refreshed live GitHub metrics, current README-supported multi-agent architecture, `/init` custom-agent setup, TypeScript generator, SDK embedding, and removed stale OpenRouter wording from the older card.
- `Google Antigravity — Gemini CLI를 접고 갈아타라는 '에디터·터미널·브라우저' 통합 에이전트 플랫폼` — replaced third-party-source wording with Google I/O 2026 official-source details about Antigravity 2.0 desktop app, CLI, SDK, Gemini CLI migration guidance, dynamic subagents, scheduled tasks, and Google ecosystem integrations.
- `Mastra — 'Gatsby 팀'이 만든 TypeScript용 AI 에이전트 프레임워크` — refreshed live GitHub metrics, README-supported model routing/Agent/Workflow/HITL/RAG/MCP/evals surface, and clarified the core/enterprise license split while preserving the original TypeScript agent-framework lesson.
- `Cursor CLI 헤드리스 모드 — agent -p로 CI·스크립트에서 코드 작업 자동화` — re-checked the current Cursor headless CLI source and clarified the automation lesson around non-interactive execution, output formats, and explicit edit-permission risk.
- `Gartner가 'AI 코드 어시스턴트'를 'AI 코딩 에이전트'로 다시 부르다 — 4강 굳히기` — re-checked the public GitHub/Gartner-summary source and made the wording more careful: the educational point is category expansion toward SDLC agent workflows, not vendor ranking as a product recommendation.
- `Dreams(Anthropic) — 에이전트가 세션 사이에 '잠자며' 메모리를 정리하는 리서치 프리뷰` — re-checked Anthropic Managed Agents docs and clarified input/output store immutability, future-session attachment, partial output handling, and the limits of `instructions`.
- `OpenClaw — 메신저로 부리는 self-hosted·모델 비종속 에이전트(MIT)` — re-checked the current README plus GitHub API metrics and clarified channel routing, Gateway/onboard operation, provider/OAuth wording, and live popularity signals while removing unsupported host-tool/sandbox phrasing.
- `ccusage — 코딩 에이전트 토큰·비용을 로컬 로그만으로 집계하는 CLI(16.2k★)` — re-checked the current README plus GitHub API metrics and clarified unified source reports, `blocks`/`statusline`, source-focused commands, JSON/breakdown/offline controls, and live star count.
- `Claude Code on the web — 터미널 안 열고 브라우저·모바일에서 작업을 클라우드에 던지기` — re-checked current Anthropic web and quickstart docs, then clarified cloud-session lifecycle, same-session review loop, fit versus local/Remote Control, and GitHub permission caveat.
- `AI-research-SKILLs(Orchestra Research) — 에이전트를 'AI 리서치 전문가'로 만드는 98개 스킬 묶음(10k★)` — re-checked README plus GitHub API metrics, refreshed the title star signal, clarified 98-skill/23-category scope, autoresearch lifecycle routing, npx installer, marketplace install, MIT license, and live popularity signal.
- `Goose Subrecipes — YAML 레시피를 격리 세션 도구로 쪼개기(Apache-2.0·50k★)` — re-checked current subrecipes docs plus GitHub API metrics, refreshed the title/source-supported popularity signal, clarified `sub_recipes` registration, isolated session behavior, parameter precedence, experimental status, and independent-test guidance.
- `GNAP — git 저장소 하나로 AI·사람 에이전트를 조율하는 프로토콜` — re-checked current README plus GitHub API metrics, clarified the `.gnap/` version + four-entity protocol, heartbeat loop, git-history audit log, Farol Labs production-use claim, and added a caution that its live star signal is small.
- `Open SWE(LangChain) — 깃허브 이슈에 라벨만 붙이면 도는 비동기 클라우드 코딩 에이전트` — re-checked the LangChain launch post, GitHub repo, and GitHub API metrics, then clarified GitHub-native tracking issues, human-in-loop planning, double texting, Daytona sandboxing, LangGraph Platform persistence/autoscaling, Reviewer gate, and live popularity/license signal.
- `DX 도구별 PR 처리량 벤치마크 — '얼마나 자주 쓰느냐'가 도구 이름보다 크다` — re-checked the DX Q1 2026 benchmark, preserved the PR-throughput claims, clarified adoption metrics as usage-frequency signals rather than direct productivity proof, and added the daily/weekly/monthly adoption patterns from the same source.
- `Everything Claude Code(ECC) — 200k★ 넘긴 '에이전트 설정 모음', AgentShield 보안 감사기까지` — re-checked the current ECC README, AgentShield README, and GitHub API metrics; refreshed live stars/forks/license/archive state, updated the repository source URL, clarified ECC v2.0.0 operational surface and install-path caveat, and reframed the lesson around managing agent-asset install state and permission boundaries rather than copying approximate asset counts.
- `Sim — '채팅·비주얼·코드'로 AI 에이전트를 짜는 오픈소스 워크스페이스(28.9k★)` — re-checked the current README plus GitHub API metrics, refreshed live stars/forks/license/archive state, clarified Chat/Workflow builder/code, knowledge base, Tables, document generation, self-hosting requirements, and reframed the lesson around team workspace and operations boundaries rather than only low-code setup.
- `Sentry Seer — 프로덕션 텔레메트리로 근본원인을 찾아 코딩 에이전트에 넘기는 디버깅 에이전트` — re-checked Sentry's current press release and pricing docs, clarified runtime telemetry plus source-code RCA, local Sentry MCP and PR review workflows, production-risk focus, and active-contributor pricing semantics.
- `Jules(Google) — 계획을 먼저 보여주고 VM에서 자율로 도는 GitHub 코딩 에이전트` — re-checked current Jules getting-started docs, usage limits, and FAQ; clarified Public Beta status, fresh VM task execution, plan approval before edits, AGENTS.md automatic reading, no private-repo training, and practical security/setup-script caveats.
- `/fork — 서브에이전트와 달리 '대화 전체'를 물려받는 분신 띄우기` — re-checked current Claude Code subagent and session docs, clarified full-conversation inheritance, running-fork panel steering, shared prompt-cache semantics, no nested forks, and the need for worktree isolation or explicit write boundaries for edit-heavy fork work.
- `Task Master — PRD를 던지면 '의존성 달린 태스크 목록'으로 쪼개주는 에이전트(MIT+CC)` — re-checked the current README plus GitHub API metrics and clarified PRD/spec/issue decomposition, MCP/CLI split, task graph operations, model roles, workstream/tag surface, live popularity signal, and license wording.
- `Claude Agent SDK — 'Claude Code를 라이브러리로' 받아 자체 에이전트를 짜는 공식 SDK` — re-checked current Anthropic Agent SDK overview and clarified SDK vs CLI vs Managed Agents, built-in tool/loop/session scope, Python/TypeScript install/runtime notes, and production automation fit.
- `AI 랩이 개발 툴체인을 사들이는 중 — Anthropic→Bun, OpenAI→Astral(uv·ruff)` — re-checked Anthropic, OpenAI, and Astral official announcements; corrected the timing from a vague "similar period" to 2025-12 Anthropic/Bun and 2026-03 OpenAI/Astral, removed unsupported "first acquisition" wording, and clarified the agent-toolchain ownership risk.
- `ccpi + tonsofskills.com — 플러그인·스킬·에이전트를 키워드로 검색·설치하는 오픈소스 마켓플레이스 CLI` — re-checked the current README plus GitHub API metrics, refreshed plugin/skill/agent/contributor counts, clarified the shared marketplace catalog source, validator/rubric gate, and reframed the lesson around validated team agent-asset distribution.
- `BMAD-METHOD — '애자일 팀 전체'를 에이전트로 흉내 내는 IDE 비종속 개발 방법론(49.7k★)` — re-checked the current README, docs, GitHub API metrics, and latest release; refreshed live stars/forks/release, clarified V6 modules, 34+ workflows, `bmad-help`, Party Mode, web-bundle planning, and the practical lesson of handing polished planning artifacts to IDE agents.
- `OpenSpec — Spec Kit보다 가볍게, 코드 짜기 전에 '무엇을 만들지'부터 합의하는 SDD(56.6k★)` — re-checked the current README plus GitHub API metrics and latest release; refreshed live stars/forks/release, added `/opsx:explore` as the pre-change thinking step, clarified artifact-guided change folders, 25+ tool support, install paths, Node 20.19+ requirement, and narrowed the Spec Kit comparison.
- `Code Mode(Cloudflare) — MCP 도구를 'TypeScript API'로 바꿔 LLM에게 코드로 호출하게 하기` — re-checked the current Cloudflare MCP README and Code Mode blog; removed an unsupported benchmark sentence, corrected the current tool surface to docs/search/execute, refreshed token-footprint comparison, and clarified the V8 isolate/MCP binding/API-key boundary.
- `chrome-devtools-mcp(Google) — CDP MCP·Codex Developer mode, 브라우저 F12를 에이전트에(44.4k★)` — re-checked the current ChromeDevTools README, GitHub API metrics, and OpenAI Codex browser docs; refreshed live stars/forks/license/archive state, clarified Codex CLI install, slim/headless/isolation/concurrency flags, @Browser/@Chrome Developer mode, explicit CDP approval, enterprise disablement, and the sensitive-browser-internals permission boundary.
- `Cipher → ByteRover CLI — 도구가 바뀌어도 따라다니는 '코딩 에이전트용 휴대 메모리 레이어'` — re-checked the redirected ByteRover CLI README plus GitHub API metrics; refreshed live stars, current `brv vc` version-control commands, `brv webui`, MCP/provider/tool/agent support, benchmark framing, and removed unsupported license wording.
- `Kilo Code — VS Code·JetBrains·CLI를 오가는 오픈소스 코딩 에이전트(MIT·24.6k★)` — re-checked the current README plus GitHub API metrics and latest release; refreshed live stars/forks/license/release, corrected mode names to Code/Plan/Ask/Debug/Review, clarified VS Code/JetBrains/CLI/Cloud/code-review surfaces, and added the `kilo run --auto` permission-prompt caveat.
- `Bumblebee(Perplexity) — MCP·확장·패키지 로컬 노출을 읽기 전용으로 찾는 스캐너(4.6k★)` — re-checked the current README plus GitHub API metrics and latest release; clarified the SBOM/EDR gap, read-only local-inventory scope, exact-match exposure-catalog model, scan profiles, selftest, credential-output boundary, and live popularity/release signal.
- `Deep Agents(LangChain) — harness engineering로 Terminal Bench 2.0 Top 5` — re-checked the LangChain harness engineering post plus GitHub API metrics and latest release; clarified the trace-analysis improvement loop, prompt/tool/middleware knobs, PreCompletionChecklistMiddleware, LocalContextMiddleware, loop detection, and live popularity/release signal.
- `Agentic AI Foundation(AAIF) — MCP·goose·AGENTS.md가 리눅스재단 중립 거버넌스로 모이다` — re-checked the Linux Foundation launch announcement plus current AAIF site; clarified MCP/goose/AGENTS.md roles, added current project-list signal including agentgateway, and reframed the practical lesson around governance, portability, and repo instruction files as agent interfaces.
- `Factory droid — Terminal-Bench 1위·Mission·Custom Droid로 미는 모델 비종속 엔터프라이즈 코딩 플랫폼` — re-checked Factory Terminal-Bench post, current Factory CLI docs, and Terminal-Bench public site; preserved the original score/topic, clarified the reusable harness-design lesson, and refreshed current droid exec mission, MCP, Custom Droids, and model-routing wording.
- `SWE-bench Multimodal — 스크린샷 보고 'JS UI 버그'를 고치는 능력을 따로 재는 벤치마크` — re-checked the current SWE-bench Multimodal page and arXiv paper; clarified the official-page 517 visual issue wording versus the original paper's 617 task instances, tightened the visual-software lesson, and kept the card scoped to benchmark interpretation rather than frontend implementation.
- `Context Rot(Chroma 연구) — '컨텍스트만 길어져도' 18개 모델 전부 정확도가 무너진다` — re-checked Chroma's public report plus the replication repository, clarified the long-context reliability lesson, and split dense experiment details into NIAH distractors, LongMemEval compression, and reproducibility signals.
- `서브에이전트 모델 라우팅 — 탐색은 Haiku, 리뷰는 Sonnet으로 강제해 비용 천장을 거는 법` — re-checked the current Claude Code subagents docs and clarified model resolution order, Explore/Haiku routing, organization allowlist fallback, and the practical split between cost routing and context isolation.
- `에이전트 스킬의 '점진적 로딩' — 메타 100토큰만 항상 보이고, 본문은 필요할 때만 끌어오기` — re-checked current Anthropic Agent Skills docs, the public skills repository, and the Agent Skills spec; clarified discovery/activation/execution progressive disclosure, description-as-router behavior, and install/security boundaries.
- `Frequent Intentional Compaction — 컨텍스트를 40~60%로 유지하며 리뷰는 코드 아닌 '리서치·플랜'에 거는 워크플로` — re-checked the public ace-fca source and simplified a dense card into a clearer workflow lesson: 40-60% context, research/plan/implement split, progress.md compaction, BAML example, expert-review caveat, and subagents as context-control tools.
- `claude-code-security-review — PR마다 도는 Anthropic 공식 AI 보안 리뷰 액션(diff 인지·오탐 필터)` — re-checked the current README, `/security-review` command file, and GitHub API metrics; refreshed live stars/license, clarified PR Action versus local slash-command surfaces, preserved the trusted-PR prompt-injection warning, and made the false-positive filtering details source-specific.
- `Serena(oraios) — 에이전트에게 IDE급 '심볼 단위' 코드 탐색·편집을 주는 MCP 툴킷(~24k★)` — re-checked the current README plus GitHub API metrics; refreshed live stars/forks/license/archive state, clarified MCP client coverage, LSP versus JetBrains backend split, 40+ language support, and the structure-aware tooling lesson.
- `Agent Client Protocol(ACP) — '에디터'와 '코딩 에이전트'를 분리하는 개방형 표준(Zed·JetBrains)` — re-checked current ACP/Zed public docs and clarified the Client/Agent split, JSON-RPC lifecycle, local stdio versus remote HTTP/WebSocket transport boundary, ACP Registry role, and the editor-as-host interoperability lesson.
- `Conductor — 한 화면에서 Claude Code·Codex·Cursor를 '병렬로' 돌리는 맥용 오케스트레이터` — re-checked the current Conductor page, Orca README, and GitHub API metrics; refreshed Orca from stale ~7k★ to 8,108★, removed dense landscape wording, and clarified worktree isolation, BYO subscription, diff-first review, cleanup, and human merge gate lessons.
- `DeepSWE(Datacurve) — 채점기 오류를 줄이고 '오래 걸리는 일'로 다시 줄 세운 코딩 에이전트 벤치마크` — re-checked DeepSWE v1.1 public source and replaced a dense metric-heavy card with a clearer lesson around long-horizon tasks, committed-diff grading, isolated verifier containers, CTRF reports, and comparing cost/tokens/steps alongside pass rate.
- `Context7(Upstash) — '낡은·환각 API'를 막으려 버전별 최신 문서를 매 요청에 끼워 넣는 MCP 서버(MIT)` — re-checked current README/docs, GitHub API metrics, and Thoughtworks Radar page; refreshed live stars/forks/license/activity, clarified MCP versus CLI+Skills modes, and kept the private backend/crawler caveat.
- `공식 /code-review 플러그인 — '리뷰 4개 병렬 → 한 건씩 재검증'으로 오탐을 떨궈내는 구조` — re-checked the current Anthropic command file and tightened the card around skip gates, CLAUDE.md path collection, 4 parallel reviewers, high-signal-only bug criteria, per-issue validation, and `--comment` behavior.
- `Spotify Honk — Agent SDK·K8s pods·Slack @Honk·Fleet Management 위 백그라운드 agent` — re-checked Spotify Engineering's 2026 Code with Claude post, Spotify's 2025 Honk Part 1 post, and the Anthropic customer page; kept the original claims but split the dense card into platform foundation, runtime architecture, Slack trigger, validation path, and practical golden-path lesson.
- `mini-SWE-agent — '도구·설정 다 빼고' 100줄 bash만으로 SWE-bench 74%를 찍은 미니멀 에이전트(SWE-agent 후속)` — re-checked the current README, official site, SWE-bench page, and GitHub API metrics; refreshed live stars/forks/license/pushed_at, clarified v2, bash-only/no tool-calling design, `subprocess.run`, linear history, baseline/fine-tuning fit, SWE-agent comparison, and broad usage examples.
- `Kiro(AWS) — '코드가 아니라 스펙이 산출물'이라며 requirements→design→tasks 3단계를 강제하는 Spec-Driven 에이전트` — re-checked current Kiro Specs docs, removed stale or unsupported runtime/model details, clarified Feature Specs, Bugfix Specs, Quick Plan, task execution status, dependency waves, and the practical lesson that specs are execution boundaries and task queues.
- `cc-sdd(Spec-Driven Development) — Kiro의 '스펙→설계→태스크' 워크플로우를 아무 코딩 에이전트에서 쓰기(오픈소스)` — re-checked the current README, npm metadata, and GitHub API metrics; moved source from a secondary Medium post to the project README, clarified v3.0 Agent Skills, 8-agent support, `kiro-discovery`, `kiro-impl`, Boundary/Depends annotations, and the contract-boundary lesson.
- `Axolotl — YAML 한 장으로 멀티GPU LLM 파인튜닝 파이프라인을 관리하는 엔터프라이즈 오케스트레이터(Apache-2.0·~11k★)` — re-checked the current README plus GitHub API metrics and latest release; clarified YAML-backed reproducibility, training methods, distributed/optimization surface, agent-docs/config-schema support, and refreshed live popularity/release signals.
- `Qwen3-Coder-Next — 80B MoE에서 3B만 활성화하는 로컬 개발용 코딩 에이전트(오픈웨이트·256K ctx)` — re-checked the current README, Hugging Face model cards, and GitHub API metrics; removed an unsupported Ollama package-size claim, clarified 80B/3B MoE, 256K/1M context, agentic training recipe, SGLang/vLLM tool-parser support, and refreshed live popularity/license signals.
- `DSPy — '프롬프트를 짜지 말고 프로그래밍하라', Stanford NLP의 LLM 파이프라인 최적화 프레임워크(MIT·~35k★)` — re-checked the current README, GitHub API metrics, latest release, first-program docs, GEPA optimization docs, and MCP tutorial; replaced stale Assertion/TypedPredictor emphasis with the current contract/module/metric/optimizer loop, GEPA reflection, MCP/ReAct tool-use angle, and refreshed live popularity/release signals.
- `LiteLLM — 100+ LLM 프로바이더를 OpenAI 호환 API 하나로 통합하는 셀프호스팅 게이트웨이(~51.9k★)` — re-checked the current README plus GitHub API metrics and latest release; refreshed live popularity/release signals, dropped unverifiable MIT title wording because GitHub API returns `NOASSERTION`, removed an unsupported Python-versus-Go throughput comparison, and clarified SDK versus AI Gateway, virtual keys, spend tracking, guardrails, load balancing, admin dashboard, MCP Gateway, and A2A Agent Gateway.
- `E2B — AI 에이전트가 생성한 코드를 Firecracker 샌드박스에서 실행하는 클라우드 인프라(Apache-2.0·~12.8k★)` — re-checked the current README, self-hosting guide, and GitHub API metrics; removed unsupported Fortune 100/88% and cold-start emphasis from the older card, refreshed live popularity/license signals, and clarified SDK command execution, Code Interpreter, Terraform self-hosting, AWS/GCP, and Firecracker isolation.
- `Dify — 비주얼 캔버스로 agentic workflow·RAG·LLMOps를 묶는 LLM 앱 플랫폼(~147k★)` — re-checked the README, LICENSE, and GitHub API metrics; refreshed live popularity, clarified workflow/RAG/agent/model/observability/API scope, and corrected license wording from plain Apache-2.0 to Apache-2.0-based Dify Open Source License with additional conditions.
- `Keploy — 실제 트래픽을 eBPF로 녹화해 API·통합 테스트와 mocks를 만드는 AI 테스트 도구(~17.8k★)` — re-checked the current README plus GitHub API metrics; removed unsupported self-healing locator wording, clarified eBPF traffic capture, record/replay mocks, CI reports, and AI coverage expansion from recordings plus OpenAPI schema.
- `Instructor — Pydantic 스키마로 LLM JSON 파싱·검증·재시도를 한 API에 묶기(MIT·~13.3k★)` — re-checked official docs, README, and redirected GitHub API metrics; refreshed live popularity/license signal and clarified the schema-first extraction boundary versus full agent runtimes.
- `Argilla — LLM 파인튜닝용 데이터를 사람이 검수·큐레이션하는 오픈소스 플랫폼(Apache-2.0·HuggingFace)` — re-checked Argilla docs, Argilla GitHub, and Distilabel docs; removed the stale Label Studio star comparison, tightened the workflow around Dataset/Record/Question/Workspace plus suggestions and semantic search, and clarified the distilabel-assisted synthesize → human-review loop.
- `Kiro(AWS) — 코드보다 스펙을 먼저 굳히는 requirements.md·design.md·tasks.md 에이전트` — re-checked current Kiro specs docs, tightened the title and summary to match the official three-file workflow, clarified Quick Plan versus standard Feature/Bugfix Specs, and kept the wave-based parallel execution lesson.
- `Plandex — AI가 만든 변경을 '리뷰 샌드박스'에 격리해 승인 전까지 실제 파일과 분리하는 터미널 코딩 에이전트` — re-checked the current README and docs, removed an unsupported cloud-enrollment claim, clarified current self-hosted/cloud model modes, and kept the cumulative diff sandbox and large-context lesson intact.

Skipped:
- `Gemini in Android Studio — Compose·Gradle·크래시 분석까지 읽는 Android 전용 AI 코딩 동료` — adjacent current AI+Android card reviewed for overlap, but unchanged because the new Android Studio Agent Skills card covers the latest Android Studio workflow update and the existing Gemini card already covers the core companion claim.
- `Karpathy-inspired CLAUDE.md — 에이전트 행동을 네 규칙으로 좁히기` — source reachable, but the existing card was already concise and the source claim is intentionally small.
- `Claude Code GitHub Action — PR에 부르면 자동 수정·리뷰` — source re-checked; the existing refined card already captures triggers, review/implementation features, structured outputs, runner location, and authentication/provider choices.
- `ETH Zurich 연구 — AGENTS.md를 LLM에게 자동 생성시키면 오히려 성공률이 떨어진다` — source was reachable, but this run did not find a clearer public-source-supported improvement than the existing warning without broadening the card.
- `에이전트 팀으로 C 컴파일러 짜기(Anthropic) — 병렬 자율 에이전트 '하네스'를 설계하는 실전 교훈` — source re-checked; existing card already captures the experiment metrics and verifier/logging/parallelism lessons.
- `서브에이전트 4가지 패턴(Philipp Schmid) — '메인 에이전트가 쥔 통제권' 순으로 줄 세우기` — source re-checked; existing card already preserves the pattern ladder and "start with Pattern 1" lesson.
- `에이전트 코딩의 '80% 문제' — 보이는 80%는 끝내고 안 보이는 20%(인증·DTO·타 레포)를 빼먹는다` — source re-checked; existing card already captures the context-layer and exact-search lesson without overextending the vendor post.
- `security-guidance 플러그인 — Claude가 짠 코드의 취약점을 같은 세션에서 잡아 고치게 하기` — source re-checked; existing card already captures the three review depths, independent Claude review context, limits, non-blocking caveat, and shell-commit boundary.
- `AGENTS.md 실전 — 'README for agents'를 모노레포에 어떻게 까는가(중첩·우선순위 규칙)` — source re-checked; existing card already captures nested file placement, conflict precedence, supported tools, and verification behavior.
- `Terminal-Bench 2.1 — 셸 전체가 문제, 에이전트+모델 쌍·Claude 5 Fable 83.1% (2026-06)` — re-checked the current Terminal-Bench 2.1 leaderboard and docs; removed unsupported availability/shutdown wording, corrected Terminus 2+GPT-5.5 from 76.4% to 78.2%, and clarified the agent+harness+model lesson.
- `claude --worktree — 한 레포에서 여러 Claude 세션을 'git 워크트리'로 격리해 동시에 돌리기` — source re-checked; existing card already captures named worktrees, PR worktrees, `.worktreeinclude`, non-git hooks, and cleanup without needing more detail.
- `MCP Tool Search — MCP 서버 수십 개 붙여도 컨텍스트가 안 터지는 'on-demand 로딩'(Claude Code 기본값)` — source re-checked; existing card already captures default deferral, `ENABLE_TOOL_SEARCH` modes, tool_reference/model limits, and server-instructions guidance.
- `Plandex — AI가 만든 변경을 '리뷰 샌드박스'에 격리해 승인 전까지 실제 파일과 분리하는 터미널 코딩 에이전트` — re-checked the GitHub README and plandex.ai landing page; tightened the summary around the cumulative diff sandbox, 2M-token context, tree-sitter project maps, auto-debugging, and git integration without changing the topic.

Next:
- Continue with `Aide — Gemma 4 온디바이스로 구동하는 안드로이드 AI 키보드·어시스턴트`; re-check current repository claims and device/model requirements before refining.
- GrowthBook was removed from the deck because the reviewed card had no central AI use case; the historical publication log is retained.
- LinkForty was removed because the reviewed card had no central AI use case; the historical publication log is retained.

Per successful refinement run, update this file with:
- timestamp
- titles reviewed
- titles refined
- titles skipped and why
- next oldest title or approximate file position to continue from

Rules:
- Only refine when the card's source can be re-verified from public sources.
- Keep cards scoped to AI or AI+Android developer education.
- Prefer clearer summaries and practical bullets over longer prose.
- Do not update this cursor if verification fails or changes are not committed.


## 2026-11-22 03:45 KST

- Reviewed and refined: `RevenueCat SOSA 2026` → `RevenueCat 2026 — AI 앱은 더 벌지만 구독 유지율은 낮다`
- Re-checked official 2026 AI retention study, report methodology, and Android paywall analysis.
- Kept AI-only payer LTV and plan-specific 12-month retention; removed general-market paywall conversion comparison, unsupported price bands, and unsupported 3–6 month claim.
- Recorded sample composition, observation period, denominator distinctions, and non-causal inference limits.
- Next: `ADK for Android`.


## 2026-11-22 04:15 KST

- Reviewed and refined: `ADK for Android` → `Google ADK Kotlin + Android — 온디바이스 모델별 도구 지원 차이`.
- Re-checked Android Developers docs, Google ADK Kotlin README, and Google release announcements. Recorded current repository stars (309) as volatile interest signal only.
- Clarified LiteRT-LM tool calling vs. ML Kit Gemini Nano beta/no tool calling vs. Firebase AI cloud tool calling; avoided implying universal device support.
- Skipped `OWASP MASVS-RESILIENCE + R8` because it is pure Android rather than an AI topic.
- Next: `ObjectBox`.


## 2026-11-22 02:56 KST

- Reviewed and merged: `ObjectBox` + `sqlite-vector` → `Android 온디바이스 RAG 벡터 검색 — ObjectBox HNSW vs SQLite-Vector`.
- Re-checked official ObjectBox vector-search docs and both current GitHub repositories.
- Live interest signal: ObjectBox 4.6k stars; SQLite-Vector 1.2k stars (not embedded in card because counts change).
- Removed unsupported/stale resource and benchmark claims; clarified ANN vs SQLite BLOB/extension trade-off and that storage does not generate embeddings or LLM responses.
- Card count reduced by one.
- Next: `koog-compose — Koog + Compose로 온디바이스 AI 에이전트를 Android·iOS UI에 직접 통합`; verify project existence, maintenance, and actual Android/runtime support before deciding whether to keep the card.


## 2026-11-22 02:59 KST

- Refined `Aide` as an AI+Android implementation case study using the creator's primary post.
- The old GitHub URL currently returns 404; replaced it with the creator-authored post and removed any star-count claim.
- Scoped model, keyboard/chat/voice, Sherpa-ONNX, optional Ollama, and permissions to the post; removed unverified translation quantity and absolute privacy language.
- Next: `AppFollow`; re-check current product details and evidence behind outcome metrics.


## 2026-11-22 03:02 KST

- Reframed AppFollow as a current MCP + AI Toolkit integration case for mobile-app feedback analysis.
- Verified official MCP client/data coverage, Toolkit workflows, role-scoped access, OpenAI API processing, workspace API credits, and review draft controls.
- Removed the unsourced customer-use list and clarified Google’s +0.7 figure is not an AppFollow-specific or app-wide guaranteed outcome.
- Toolkit GitHub was at 4 stars / 1 commit; this is a low, volatile adoption signal, not a popularity claim.
- Next: `Driftx`; verify active repository, Android test support, and whether its AI/MCP features are usable beyond the marketing description.


## 2026-11-22 03:04 KST

- Reframed `koog-compose` as an early-stage third-party integration above JetBrains Koog.
- Corrected the license to Apache-2.0 and verified Android LiteRT-LM/Gemma versus iOS Apple Foundation Models support.
- Added StateFlow/Compose and device-tool wiring; explained that a cloud fallback may receive conversation history and tool results.
- Recorded 15 repo stars as a low/volatile project signal; JetBrains Koog itself was 4.7k stars. No popularity overclaim added.
- Next: `Driftx`; audit active support and exact Android AI test path.


## 2026-11-22 03:10 KST

- Reviewed and refined `Driftx` after checking the live repository README and `package.json`.
- Removed inaccurate KMP and MCP-server framing; documented the README's React Native + Metro setup, Android emulator/ADB requirement, and current lack of physical-device support.
- Corrected the practical scope to CLI-based AI-agent screen capture, inspection, interaction, visual comparison, and accessibility checks.
- GitHub displayed 7 stars, 1 fork, and 125 commits; star/fork counts are volatile and indicate low adoption, not popularity. Package metadata is version 1.0.0 and MIT licensed.
- Kept as a narrowly scoped learning example, not a recommendation for native Android/KMP or production-wide testing.
- Next: `Autonoma`; verify current project status, Android scope, and independent interest evidence before editing.


## 2026-11-22 03:12 KST

- Reviewed and refined `Autonoma` using the current GitHub README, repository activity/license, release page, and official mobile-testing documentation.
- Reframed the platform around the current PR preview/test-review flow; clarified Playwright web and Appium mobile execution paths and the screenshot→model action→execution record loop.
- Verified Android-specific camera-image testing in the vendor docs, while noting that the current README's primary PR workflow is web-focused and Android adoption details should be confirmed before rollout.
- Corrected “open source” wording: repository uses Business Source License 1.1, with a restriction on selling it as a competing commercial service and a stated Apache-2.0 conversion date of 2028-03-23.
- GitHub displayed 253 stars, 65 forks, and 1,887 commits; latest listed release was v1.260811.1 (2026-08-11). Metrics are volatile attention/activity indicators, not evidence of quality.
- Next: `Luciq Resolve Agent`; separate current shipped functionality from announced/planned features.


## 2026-11-22 03:15 KST

- Reviewed and refined `Luciq Resolve Agent` against current Luciq debugging, Companion, and MCP documentation.
- Corrected the distinction between shipped diagnosis/reproduction/pattern insights, IDE telemetry access over MCP, and the separate coding-agent/Autopilot handoff. Removed unsupported claims that the Debugging Assistant itself edits app code, generates PRs, supports five feedback iterations, or has only planned IDE integration.
- Verified the official MCP help article says the feature is available to Luciq customers and lists crashes, occurrences, hangs, bug reports, and reviews; the product page says issues can be handed to coding agents or Autopilot.
- Kept exact marketing example “90% … Login V2 + iOS 26” out of the card; the blog presents it as one illustrative correlation, not a general rate.
- No public GitHub star count or independent adoption measure used; official documentation is the primary evidence for product capabilities.
- Next: `Baidu Stability Analysis Agent`; verify repository health, Android coverage, and actual AI/repair boundaries.


## 2026-11-22 03:18 KST

- Reviewed and refined `Baidu Stability Analysis Agent` using the current README, Android crash-format documentation, verification-provider contract, changelog, and PyPI metadata.
- Reframed the card around Android logcat/tombstone parsing, matched-symbol symbolication, evidence-linked source context, and a reviewed AI patch—not an indiscriminate multi-OS feature list.
- Clarified verification boundaries: fixes run in an isolated Git worktree; only explicitly configured checks execute; absent verification remains pending and changes are not synced as verified fixes.
- Popularity: GitHub displayed 52 stars / 5 forks / 60 commits (low adoption, with counts volatile); PyPI listed 1.7.4 uploaded 2026-11-18, while the repository organization page last showed an update on 2026-10-30. PyPI reported no provenance metadata for the inspected release.
- Noted package/repository version-history mismatch (PyPI 1.7.4 vs. GitHub changelog 1.5.1 and older GitHub release tags); do not recommend installing without checking release/source correspondence and package provenance.
- Next: `KotlinSyft`; verify project maintenance, Android implementation, and reproducible installation evidence.


## 2026-11-22 03:25 KST

- Reviewed and refined `KotlinSyft` against its README/release page, OpenMined’s original model-centric FL explanation, PMLR research, and NIST privacy guidance.
- Corrected the old card: secure aggregation/MPC are marked in progress, not shipped; README install instructions are stale (0.1.3) relative to the later 0.5.0 release candidate.
- Reframed as a legacy architecture lesson; clarified that local raw-data retention does not guarantee privacy because model updates may leak information.
- GitHub showed 89 stars / 24 forks at review; modest interest, not current adoption evidence.
- Next: `MLC LLM`; confirm active Android runtime support and remove any unsupported “only/3 leaders” comparison claims.


## 2026-11-22 03:27 KST

- Reviewed and refined `MLC LLM` using the live official repository README, Android deployment guide, quick start, and GitHub release page.
- Replaced unqualified shared-checkpoint / “only mature runtime” / top-three claims with Android OpenCL backends (Adreno/Mali), per-model binary compilation, and physical-device compatibility/performance checks.
- GitHub displayed 23.3k stars / 2.2k forks; strong, volatile attention signal. GitHub Releases currently shows only a `v0.1.dev0` prerelease despite current repo/docs, so avoid package-version claims until release metadata is clarified.
- Next: inspect the next oldest AI/AI+Android card after MLC LLM.


## 2026-11-22 03:30 KST

- Reviewed and refined `RunAnywhere Kotlin SDK` against the SDK README, Android sample app README, releases, and live GitHub metadata.
- Replaced blanket offline/privacy and complete voice-pipeline claims with the Android engine-registration/model-loading flow, optional backend boundaries, and verified hardware support.
- QHexRT NPU support is limited to Snapdragon Hexagon v75/v79/v81 on ARM64; Android app README marks x86_64 emulator unavailable. First-use model downloads and optional cloud routes mean offline behavior must be tested with cached models and remote routes disabled.
- GitHub displayed 10.4k stars / 422 forks. Repo README and Android app repository show different SDK versions; avoid fixed versions pending current dependency compatibility check.
- Next: inspect the next AI/AI+Android card in sequence.

## 2026-11-22 03:40 KST

- Reviewed V8V and its Android SpeechRecognizer implementation against the official Android API reference.
- The README claims on-device/offline/private speech recognition, but Android code calls `SpeechRecognizer.createSpeechRecognizer(context)` and does not select `createOnDeviceSpeechRecognizer()` or check on-device availability. Android docs warn the default service may stream audio to remote servers.
- GitHub API displayed 1 star / 1 fork and `pushed_at` 2026-07-16; weak adoption signal, so V8V product promotion was not retained.
- Reframed the existing card into an Android AI data-boundary lesson: check API 31+ availability, select the on-device factory, and test the actual deployment with networking disabled.
- Next: inspect the next AI/AI+Android card after V8V; review the neighboring RecGPT-Mobile source carefully before relying on its production-scale claims.

## 2026-11-22 03:50 KST

- Rechecked RecGPT-Mobile against arXiv full text and abstract metadata; ACM DOI page returned 403 in this review.
- Kept the AI+Android systems lesson: behavior-window drift signals (entropy change, tag overlap, Jensen–Shannon divergence) gate when the on-device LLM runs.
- Replaced broad production claims with author-reported one-month Taobao A/B results across four feed scenarios (average CLICK +1.8%, PAY +2.7%, GMV +2.5%); explicitly not generalized or independently reproduced.
- Avoided implying full pipeline on-device/privacy: the paper describes local behavior collection/cache and a separate item retrieval module. Public reproducible code/data were not verified.
- Next: review `OD-LLM`; distinguish its task-adaptive compression method from RecGPT-Mobile's inference-trigger policy, and validate mobile deployment evidence.

## 2026-11-22 04:00 KST

- Rechecked OD-LLM against arXiv full text and abstract metadata; confirmed WSDM'26, the three Amazon review datasets, the 50% compressed model comparison, and the normalization → SVD → layerwise update method.
- Corrected the critical deployment boundary: reported compression and speed experiments use a single A40 GPU or CPU environment, not an Android handset. No reproducible public code/artifact was verified in the examined sources.
- Removed unproven blanket privacy/offline guarantee and narrowed comparison with GPTQ/AWQ. Performance claims now refer to paper-reported benchmark results and preserve compression-quality tradeoff.
- Kept separate from RecGPT-Mobile: OD-LLM studies task-adaptive model compression; RecGPT-Mobile studies behavior-drift gating for inference calls.
- Next: inspect the next AI/AI+Android card after OD-LLM, verify source freshness and avoid inferring mobile readiness from a paper title.

## 2026-11-22 04:10 KST

- Rechecked Project KARL README claims against repository source and current Gradle declarations.
- GitHub displayed 11 stars / 1 fork, 285 commits; last push shown as 2025-10-06. Activity/adoption signal is weak and stale for a product recommendation.
- Core, KLDL, Room, and Compose modules declare JVM targets; repository runnable example is Desktop. Room's Android source set contained only a manifest in the inspected checkout; no Android app example/artifact was verified.
- Removed unverified “Android-ready / zero egress” product assertions and reframed as an AI+Android dependency-evaluation lesson: inspect target, source set, published artifact, runnable sample, and data paths.
- Next: inspect `Apple Trust Insights`; verify current release/API status, source date, and whether the purported iOS 27 feature is official/available before retaining claims.

## 2026-11-22 04:20 KST

- Verified Trust Insights against Apple's WWDC26 video transcript, Apple Developer symbol page, and Apple Newsroom platform announcement.
- Confirmed iOS 27 API introduction, entitlement/authorization, Swift integration, and Internet reachability requirement for evaluation.
- Corrected the architecture: device signals are processed locally, but the framework combines device and cloud infrastructure, and Apple says outputs may include Apple Account/velocity signals.
- Corrected feedback contract: `reportConsumption` is mandatory per evaluation request; Apple Business Register fraud labels are optional.
- Added interview emphasis: `unknown` is not low risk and Trust Insights must not be the sole decision signal.
- Next: inspect `flutter_doclayout_kit`; validate current repository/model source, Android/iOS runtime paths, exact model sizes, and claimed offline behavior.

## 2026-11-22 04:30 KST

- Rechecked flutter_doclayout_kit README, Dart API, Android Gradle downloader, iOS CocoaPods prepare script, C++ ONNX source, GitHub Release assets, pub.dev metadata, and GitHub activity.
- Split offline inference from provisioning: model asset is user-provided, while Android preBuild and iOS pod prepare download native binaries from GitHub. Offline installation/build requires pre-provisioning these assets.
- Removed unsupported Core ML acceleration and ~1.5GB memory claims; the checked-in iOS implementation is an opaque ~217 MB static archive, while public C++ source does not configure Core ML EP.
- README lists 23 document classes; Android build currently includes arm64-v8a and armeabi-v7a. Live popularity/activity signals are modest/stale (1 star, 3 forks, last push 2025-12-23), so retained only as a concrete offline deployment lesson.
- Next: review `Locanara`; validate current README/implementation, platform target and minimum OS, backend claims, model downloads/network, and license before revising.

## 2026-11-22 04:09 KST

- Reviewed and refined `MNN-AECS` against arXiv full text and the current Alibaba MNN repository/tree.
- Kept it as a research systems lesson, not a drop-in recommendation: paper reports 23% average energy reduction across 7 devices, but Meizu 21 reports about 10% because its OS does not lower idle-cluster frequency; Huawei devices show 1%/7% decode slowdown in dataset evaluation.
- Confirmed Android uses core affinity and per-device tuning in the described modified MNN; current upstream MNN recursive tree has no AECS-named implementation, and exact repository search returned zero.
- Removed cross-engine headline comparisons because the original card did not communicate device/model availability and comparison limits.
- Interest signal: MNN upstream displayed 16.6k stars / 2.5k forks; treated as project-level signal, not AECS adoption; omitted volatile counts from the card.
- Next: `AgentStop (Brave)`; validate metric denominator, model/agent environment, actual Android applicability, and public reproducibility before deciding whether to keep or reframe.

## 2026-11-22 04:13 KST

- Reviewed and refined `AgentStop` against the ACM/Brave paper, Brave announcement, official GitHub README, Zenodo deposit, and CAIS program.
- Replaced generic 15–20% claim with separate step-specific results: FRAMES ~22% at step 5 (<2% utility drop), SimpleQA ~23% at step 4 (<2%), and SWE-Bench Verified ~18–19% at step 5 (~3% utility drop in Brave's summary).
- Captured the method: trajectory token-logprob tail, per-step output length, adjacent-step overlap; task/model/step-specific XGBoost classifier; evaluate savings against false-stop utility loss.
- Explicitly disclaimed Android/phone measurements: public README cites M1 Max and Jetson Orin AGX (64 GB tested; 24 GB minimum), and GitHub offers scripts, processed data, and reproduction notebook. The local-model QA pipeline uses Brave Search API; no blanket offline/privacy claim.
- Interest/reproducibility: ACM CAIS '26 acceptance and three artifact badges are source-backed; GitHub showed only 18 stars / 0 forks / 2 commits. Metrics indicate limited project-level adoption, not research validity.
- Next: `vision_ai`; assess whether the current Flutter card is a meaningful AI topic versus a generic computer-vision package, and verify model, licensing, support, and latency statements.

## 2026-11-22 04:16 KST

- Reviewed `vision_ai` using the official GitHub README/activity, pub.dev package metadata/license, and the repository's physical-device evidence report.
- Removed the standalone card: repository had 4 stars / 1 fork / 44 commits and last push 2026-08-27; the claimed 25–30 FPS had no reproducible benchmark conditions in the inspected sources.
- The project is a valid Flutter Android AI implementation and its Android physical evidence contains useful successes/failures, but the package feature list overlaps the existing official MediaPipe Tasks Android card and has weak independent adoption evidence for a separate card in this collection.
- Preserved `auto-post-log.md` publication history; added the removal rationale and source trail in `research/ai-routine/20261122-041600.md`.
- Next: `Gemini in Android Studio Agent Mode`; re-check current official docs, release/availability, tools, permissions, and device-action behavior.

## 2026-11-22 04:18 KST

- Reviewed and refined `Gemini in Android Studio Agent Mode` against current official Agent Mode docs, Android Studio run/device workflow docs, and the Otter 3 Feature Drop announcement.
- Made the practical loop explicit: plan → edit → build → deploy → inspect screenshots/Logcat/ADB state, then validate evidence rather than trusting the completion statement.
- Added approval configuration nuance: tool use may require permission, and `Don't ask to edit files` changes whether edits are reviewed per change or in batches.
- Added data-boundary warning: basic Gemini prompt/tool results go to Gemini API; BYOM provider selection and remote MCP connections may route data to other endpoints.
- Next: `Mobile Agency`; verify current project and its advertised count/platform/tool/maintenance claims before retaining or pruning the card.


## 2026-11-22 04:23 KST

- Rechecked `Mobile Agency` (legacy repository URL) and followed its redirect to `salmanashraf/mobile-ai-agents`.
- GitHub showed 37 stars, 12 forks, and 127 commits; the current README lists 19 agents, 58 skills, and 17 workflows. The old card's 16-agent/13-workflow counts and its six-tool claim were stale.
- Reframed the card around a reusable lesson supported by the project workflow: plan → build → code/security audit → test/device UI verification → evidence report; missing evidence stays unverified, and release approval remains human-owned. Checked Codex installation command in the README.
- Removed `NeuralPulse` rather than repeat its “clinical-grade”/FDA-adjacent product claims: GitHub showed 3 stars and 1 fork; the README makes broad clinical, biometric, FHIR, and on-device AI claims but provides no clinical validation evidence. Its own build instructions require contributors to supply proprietary Samsung AARs and model files, which weakens the card's implication of a verified, ready-to-run system.
- Preserved publication-history log; the audit note records the removal rationale and source URLs.
- Next: `nsfw_detect(Flutter)`; check current package/platform implementation and privacy claims before refinement.


## 2026-11-22 04:27 KST

- Corrected a stale top-of-file cursor that still pointed to `Mobile Agency` even though the 04:23 run note had already recorded `nsfw_detect(Flutter)` as next.
- Reviewed `nsfw_detect` from pub.dev and its linked GitHub README/changelog. Current pub.dev page showed version 2.8.3, 6 likes, about 1.46k downloads, and an unverified publisher; GitHub showed 3 stars and 2 forks. These are modest interest signals, not a leading-project claim.
- Reframed as an implementation lesson rather than an endorsement: Android TFLite / iOS Core ML, local file/bytes inference, explicit remote `scanUrl` and opt-in model-download network paths, Android media permissions, and probabilistic moderation requiring human/policy safeguards.
- Sources: https://pub.dev/packages/nsfw_detect ; https://github.com/nexas105/flutter_nsfw_scaner
- Next: `SideEye`; independently check the implementation and evidence before deciding whether to retain it or consolidate/remove it due overlap with privacy architecture cards.


## 2026-11-22 04:29 KST

- Reviewed SideEye's GitHub README and linked `ImageAnalyzer.kt`, `ModelDownloader.kt`, `VaultRepository.kt`, and `VaultPinManager.kt`.
- GitHub showed 1 star, 0 forks, 18 commits, and no license grant (README says all rights reserved); treated it as a source-code teaching example only, not a recommended product or reusable codebase.
- Corrected over-broad product card: README says Android 9+/API 28+, Qualcomm NPU required for Smart Scan, and about 2.4 GB model download. `ModelDownloader` retrieves model files from S3 and falls back to Hugging Face; images are sent through the local Nexa VLM inference path according to the checked app code.
- Reframed the lesson around a concrete inference-quality issue in `ImageAnalyzer.kt`: generated `Category: N` text is parsed into a binary label, then `primaryConfidence` becomes 1.0 or 0.0. That value is not a calibrated model probability. The card now teaches class-wise evaluation, false-positive/negative handling, and human review.
- Sources: https://github.com/baseweight/SideEye ; https://github.com/baseweight/SideEye/blob/main/app/src/main/java/ai/baseweight/sideeye/data/ai/ImageAnalyzer.kt ; https://github.com/baseweight/SideEye/blob/main/app/src/main/java/ai/baseweight/sideeye/data/ai/ModelDownloader.kt
- Next: `ORB-SLAM2s(Android)`; check whether the AI angle is central or the card is merely a classical CV/Android port.


## 2026-11-22 04:31 KST

- Reviewed `ORB-SLAM2s(Android)` using its current GitHub README and repository metadata. GitHub showed 71 stars, 10 forks, and 621 commits, but attention alone does not satisfy topic scope.
- The README describes an Android port/enhancement of ORB-SLAM2: ORB feature-based visual SLAM, sparse point maps, pose/relocalization, IMU and AR rendering. It explicitly distinguishes the project's optimizations from a separate ORB-SLAM2S paper whose methods are not integrated. The documented feature path contains no learned model or AI component.
- Removed the card because it is a classical computer-vision/Android implementation, outside the project's allowed AI or AI+Android topic boundary. Did not retain its broad “all Android phones” claim.
- Next: `YOLO26`; validate the Ultralytics model/release, speed-comparison conditions, Android export/runtime support, and current adoption before revising.


## 2026-11-22 04:34 KST

- Rechecked YOLO26 model, LiteRT export, ONNX benchmark, MediaTek Android deployment, and official Flutter plugin docs.
- Corrected NMS claim: official model docs say YOLO26 supports optional end-to-end one-to-one inference with `nms=False`; the default one-to-many path still uses NMS. NMS-free behavior is therefore an export/runtime choice, not an unconditional property.
- Corrected CPU result: “up to 43%” compares YOLO26n with YOLO11n in ONNX Runtime on an Intel Xeon CPU, not a phone. The benchmark docs note latency is inference-stage-only and excludes preprocessing/postprocessing.
- Android deployment confirmed: `format="litert"` produces `.tflite`; legacy `tflite` format still works but logs a deprecation warning. Official Ultralytics Flutter plugin supports Android camera and single-image inference on LiteRT; accelerator/delegate support varies. MediaTek docs specify released plugin CPU/GPU, while NPU figures use an unreleased prototype; do not generalize NPU support.
- Official YOLO26 docs list seven task families: detection, instance segmentation, semantic segmentation, depth, classification, pose, and OBB. This corrects the old five-task count.
- Interest: GitHub showed ultralytics/ultralytics at 63.6k stars and yolo-flutter-app at 516 stars; broad model/tool adoption signal, not proof of mobile accuracy.
- Card rewritten as an Android deployment/benchmark interpretation lesson; removed broad “43% faster on mobile” implication and stale 19-format/quantization claims.
- Sources: https://docs.ultralytics.com/models/yolo26 ; https://docs.ultralytics.com/integrations/litert ; https://docs.ultralytics.com/integrations/onnx ; https://docs.ultralytics.com/integrations/mediatek ; https://github.com/ultralytics/yolo-flutter-app
- Next: `MobileLLM-Flash(Meta)`; verify the source research, compute/platform scope, exact token reduction, and availability of Android-compatible artifacts before retaining claims.

- Reviewed and refined: `MobileLLM-Flash` (reframed as a target-device latency/quality measurement lesson; corrected 35% token scope, accounted for search/IFT tokens, and scoped speedups to the published Galaxy S25 ExecuTorch/XNNPACK benchmark)
- Sources re-checked: arXiv full paper v2 and abstract; exact-name GitHub search did not verify a public Flash implementation, and the older Meta MobileLLM repo was not treated as the Flash artifact
- Added experimental configuration and Android generalization caveats; exact speed ratio remains explicitly paper-reported, not independently reproduced

- Reviewed and refined: `NexaSDK` (now GenieX; old repository URL redirects to Qualcomm/GenieX). Removed unsupported Qualcomm investment, Day-0, ASR/TTS and “NPU-first” claims; clarified GGUF/llama.cpp versus AI Hub bundle/Qualcomm AI Engine Direct routes, Snapdragon-only platforms, Android SDK, and developer-preview status.
- Sources: https://github.com/qualcomm/GenieX ; https://geniex.aihub.qualcomm.com/en/get-started/what-is-geniex ; https://github.com/qualcomm/GenieX/releases
- Live attention snapshot: 8.5k GitHub stars; latest visible release v0.11.0 (2026-11-12). Popularity is not capability evidence.

- Reviewed and refined: `ACE-Step 1.5` (changed from promotional speed/4GB headline to a model-configuration lesson; scoped <=6GB recommendation to 2B Turbo DiT with LM disabled, INT8 and CPU offload; clarified reported benchmarks and LoRA resource example).
- Sources: https://github.com/ACE-Step/ACE-Step-1.5 ; https://huggingface.co/ACE-Step/Ace-Step1.5
- Live attention snapshot: GitHub 15.1k stars and Hugging Face 106,079 downloads last month; volatile signals recorded in the audit note, not the card.


## 2026-11-22 04:55 KST

- Reviewed and refined `Cadence` using its Android README, `PromptBuilder.kt`, `MusicRepository.kt`, Gradle defaults, and privacy policy.
- GitHub showed 4 stars, 0 forks, and 55 commits; the README offers v0.6.0 APK/closed Play test. Treated as a small prototype case study, not a popularity or production endorsement; removed unsupported open-source label.
- Corrected the data-flow lesson: two configurable HTTP endpoints; checked Gradle defaults use OpenRouter for LLM and Cadence API for music generation. README's MiniMax example differs from the build default.
- PromptBuilder includes health/activity context plus four-decimal GPS coordinates; MusicRepository sends context to the LLM and writes prompt text through `Log.d`. Card calls for release-logcat verification; no release artifact was inspected.
- Replaced “fully private” claim with endpoint/payload/logging checks; privacy-policy anonymization statements are not treated as proof that contextual data is non-sensitive.
- Sources: https://github.com/wtgme/cadence ; https://github.com/wtgme/cadence/blob/main/app/src/main/java/io/cadence/music/domain/PromptBuilder.kt ; https://github.com/wtgme/cadence/blob/main/app/src/main/java/io/cadence/music/data/api/MusicRepository.kt ; https://github.com/wtgme/cadence/blob/main/app/build.gradle.kts ; https://github.com/wtgme/cadence/blob/main/docs/privacy-policy.html
- Next: revalidate `GitHub Issues MCP Fields` announcement and current availability.


## 2026-11-22 04:57 KST

- Rechecked `GitHub Issues MCP Fields` against GitHub's official MCP server README and May, June, and November 2026 Changelog announcements.
- Verified the current tools: `list_issue_fields`, `issue_write.issue_fields`, and `list_issues.field_filters`. Retained only schema-backed issue metadata workflow; explicitly requires fields, scopes, tools, and account access to be configured.
- Corrected stale metrics: server page showed 34.6k stars/5.4k forks. The 1,000+ organization figure belongs to adoption of GitHub issue fields, not MCP support.
- Separated the June duplicate-issue suggestions public preview from MCP field access; removed the implication that MCP automatically detects duplicates or triages issues.
- Updated rollout scope: personal-account issue types/fields became GA on 2026-11-11; May announcement had issue fields in public preview for organizations. Do not generalize personal-account GA to all organizations.
- Duplicate scan found adjacent GitHub MCP cards about secret scanning and general agent workflows, but no overlapping issue-fields lesson.
- Sources: https://github.com/github/github-mcp-server ; https://github.blog/changelog/2026-06-18-duplicate-detection-and-issue-fields-mcp-support-for-github-issues/ ; https://github.blog/changelog/2026-05-21-issue-fields-are-now-in-public-preview-for-all-organizations/ ; https://github.blog/changelog/2026-11-11-issue-types-and-fields-are-available-for-personal-accounts/
- Next: `Android AppFunctions 1.0`; verify current API status and AI+Android scope.


## 2026-11-22 05:02 KST

- Reviewed and refined `Android AppFunctions 1.0` against current Android AI, implementation, API-reference, and AndroidX release documentation.
- Confirmed Jetpack 1.0.0 stable release (2026-11-18), Android 16+ support, same-package versus privileged cross-app access, and Gemini's Connected Apps developer-preview requirement.
- Removed the now-stale experimental-preview assertion; added main-thread execution and Android 17+ ADB verification while separating registration checks from agent tool-selection testing.
- Duplicate scan found only an incidental mention in a security roadmap card; no duplicate learning card.
- Sources and rationale: `research/ai-routine/20261122-050249-appfunctions.md`.
- Next: inspect `Android AI Sample Catalog`.


## 2026-11-22 05:05 KST

- Refined `Android AI Sample Catalog` as a learning-resource and production-readiness card; removed stale feature-list/copy-paste framing.
- Verified current official README setup, Firebase/API-key and possible image-generation billing requirements, supported-device limit for Gemini Nano, simplified/non-production demo caveat, and current examples.
- GitHub snapshot: 724 stars, 181 forks, 124 commits; latest push 2026-11-03. Recorded as a modest dated signal; not used as a quality claim.
- Checked for overlap with `Firebase AI Logic Hybrid API`; this card is about evaluating official demos and their readiness boundaries, not routing mechanics.
- Sources and rationale: `research/ai-routine/20261122-050518-android-ai-sample-catalog.md`.
- Next: inspect `Android CLI + Skills`.


## 2026-11-22 05:08 KST

- Refined `Android CLI + Skills` around execution tools, reusable task procedures, and current-doc grounding; updated launch-era preview status to stable CLI 1.0.
- Scoped the >70% token / 3x speed figure to Google's internal project/environment-setup experiment; source publishes no sample size or methodology, so no broad performance guarantee is implied.
- Verified Agent Skills standard compatibility and current `android init`, `android skills add`, `android docs`, and CLI workflow documentation.
- Official `android/skills` snapshot: 10,690 stars / 700 forks; latest push 2026-11-17. High, volatile interest signal recorded in the audit note, not the card.
- Compared with Android Studio Agent Mode: related but distinct cross-agent command/skill/documentation workflow versus IDE-centered agent execution and verification.
- Sources and limitations: `research/ai-routine/20261122-050833-android-cli-skills.md`.
- Next: inspect `Google AI Studio Android prototyping`.


## 2026-11-22 05:11 KST

- Refined `Google AI Studio Android` using the Nov 17 full-stack Android Build announcement and current Google Play Help.
- Replaced the May prototype/internal-track storyline with the current personal Play library route; distinguished private personal apps from public/test-track distribution and Play review.
- Added current personal-app eligibility (US, 18+ age-verified personal account, Play Store 53.5+) and explicitly avoided marketing-language claims of production readiness.
- Historical note: May's AI Studio internal-testing-track announcement is a different Play Console developer-account path; do not conflate it with the new personal-app flow.
- No star count used: this hosted product's current attention signal is the five-day-old first-party feature launch, not repository stars. Capability claims are vendor-reported and not independently tested.
- Sources and limitations: `research/ai-routine/20261122-051100-ai-studio-android.md`.
- Next: inspect `Android Studio Agent Mode parallel conversations`.

- Reviewed and refined: `Android Studio Agent Mode parallel conversations` (separated chat-context concurrency from filesystem/worktree isolation; removed adjacent UI-generation claims already covered elsewhere)
- Sources re-checked: current Android Studio Agent Mode docs; official Quail 2 stable warning; Quail 4 recap; Rabbit 2 stable announcement
- Kept the worktree caveat explicitly scoped to Quail 2 source; later Rabbit 2 material reviewed did not explicitly confirm isolation, so the card uses conservative guidance rather than claiming the limitation is unchanged

- Reviewed and refined: `Android XR + Gemini — Geospatial tour` (corrected 68% accuracy semantics; added RUNNING precondition, VPS/tracking fallback, cloud coordinate flow, and device-data acknowledgement)
- Sources re-checked: current Android XR Geospatial setup docs (updated 2026-11-10 UTC), official Gemini XR guide, official Geospatial Tour implementation post
- Kept Preview status attributed to the demo announcement; current setup docs reviewed do not explicitly label the lifecycle state
- Next: inspect `Android 17 AppFunctions Agent Skill`.

- Reviewed and refined: `Android 17 AppFunctions Agent Skill` (corrected Android 16+ availability; separated the Experimental API status from the Connected Apps developer preview; clarified caller permission and least-privilege boundary)
- Sources re-checked: AppFunctions overview and skill docs (both updated 2026-11-16 UTC); Connected Apps guide; API migration guidance
- Removed outdated `@AppFunction` annotation claim; current migration docs describe the service-entry-point architecture
- Next: inspect `Android 17 NPU 접근 선언`.

- Reviewed and refined: `Android 17 NPU access declaration` (narrowed to targetSdk 37+ direct NPU access; corrected manifest value to `android.hardware.npu`; documented optional-feature install behavior)
- Sources re-checked: Android 17 release announcement, PackageManager API 37 reference, AOSP NPU Manager docs, Android 17 SDK setup, NNAPI migration guide
- Next: inspect `ML Kit GenAI Structured Output`.

- Reviewed and refined: `ML Kit GenAI Structured Output` (replaced deprecated Boolean availability check with `getAvailableFeatures()`; clarified Prompt API Beta vs Structured Output Alpha; aligned error handling with current typed API reference)
- Sources re-checked: Structured Output guide, GenerativeModel and Feature references, direct model access guide, ML Kit release notes
- Kept schema-shape guarantees separate from fact/domain validation; noted sample/reference response-model mismatch in audit trail
- Next: inspect `A2A 1년`.

- Reviewed and refined: `A2A 1년` (removed stale anniversary framing; rewrote around Agent Card discovery, Task status/artifacts, and MCP's distinct application-tool/data boundary)
- Sources re-checked: current A2A specification and Agent Card docs; A2A 1.0 announcement; official MCP 2025-11-25 specification
- Added the security distinction: advertised authentication requirements are metadata, not caller authentication or authorization; do not infer trust or permission from discovery
- Removed the speculative Android AppFunctions/A2A architecture example and unsupported assertion that agent delegation inherently reduces context pollution or privilege scope
- Research note: `research/ai-routine/20261122-060500-a2a-agent-card-task.md`
- Next: inspect `Android Computer Control`

- Reviewed and refined: `Android Computer Control` (replaced generic automation framing with actual Preview, privileged assistant access, consent, six-app sequential-session limit, and user handoff)
- Sources re-checked: current Android Developers Computer Control guide (last updated 2026-05-13) and AppFunctions overview
- Removed the unsupported claim that Computer Control acts as an AppFunctions fallback; Android documents UI operation and explicit app functions as distinct integration paths, not an automatic fallback policy
- Research note: `research/ai-routine/20261122-061000-android-computer-control.md`
- Next: inspect `Firebase AI Logic — Imagen 종료 후 Android 이미지 생성 API 마이그레이션`

- Reviewed and refined: `Firebase AI Logic — Imagen 종료 후 Android 이미지 생성 API 마이그레이션` (confirmed shutdown is past; corrected exact Fast/standard/Ultra model mapping and added thinking levels)
- Sources re-checked: official Firebase Imagen migration guide, Kotlin before/after examples, replacement table and configuration compatibility table (guide last updated 2026-11-18)
- Added migration behavior checks: single image only, PNG output, always-on SynthID, new GenerationConfig/IMAGE modality, and `NO_IMAGE` handling; no output-equivalence claim
- Research note: `research/ai-routine/20261122-062000-firebase-imagen-migration.md`
- Next: inspect `Kakao Mobility Gemini Nano`

- Reviewed and refined: `Kakao Mobility Gemini Nano` against the original Android Developers case study (2025-10-30)
- Corrected conflation: ~200 high-quality examples were used for delivery-message entity extraction; >200 labeled photos were a separate bike/scooter parking evaluation, and that feature was not launched at publication
- Scoped 24% completion-time and new/existing conversion figures to the launched delivery address-entry feature and explicitly attributed them to the published case study, not independent causal evidence
- Added Gemini Flash cloud fallback; excluded the peak-season >200% AI-orders figure from the compact card to avoid unsupported interpretation
- Research note: `research/ai-routine/20261122-063000-kakao-mobility-gemini-nano.md`
- Next: inspect `Firebase AI Logic Hybrid API`

- Reviewed and refined: `Firebase AI Logic Hybrid API` against the current Android and Firebase configuration guides (last updated 2026-11-18)
- Corrected the key policy distinction: `PREFER_ON_DEVICE` may send prompts to cloud; only `ONLY_ON_DEVICE` prevents that SDK fallback and throws when local inference cannot run
- Verified semantics for all four modes, explicit cloud-model requirement, preference-mode `inferenceSource`, supported local capabilities/device limits, and Experimental/no-SLA contract
- Research note: `research/ai-routine/20261122-064500-firebase-ai-logic-hybrid.md`
- Next: inspect `ML Kit Prefix Caching`

- Reviewed and refined: `ML Kit Prefix Caching` against the official guide last updated 2026-10-27 and current Direct Model Access docs
- Corrected API scope: prefix caching is for Gemini Nano Direct Model Access (`GenerativeModel`), not the task-specific ML Kit GenAI APIs
- Qualified Pixel 9 latency values as official estimated cache-hit examples (1,000+100 tokens: 2.11s→0.5s); first use can be a miss
- Verified experimental/subset-device/text-only scope and implicit cache details: encrypted app-private files plus metadata containing original prefix text; LRU and clear support
- Research note: `research/ai-routine/20261122-070000-mlkit-prefix-caching.md`
- Next: inspect `GitHub third-party agent security validation`

- Reviewed and refined: `GitHub third-party agent security validation` against the June 9 GA announcement and current GitHub Docs
- Scoped support to third-party coding agents working directly in repositories; verified CodeQL, new-dependency advisory checks, secret scanning, attempted remediation, default-on behavior, repository Copilot settings, and no GHAS license requirement
- Added explicit limitation: automated checks are not a security guarantee or human PR approval; did not extend cloud-agent-only dependency severity detail beyond what the third-party announcement states
- Research note: `research/ai-routine/20261122-073000-github-third-party-agent-validation.md`
- Next: inspect `Google Agents CLI`

- Reviewed and refined: `Google Agents CLI` using Google Cloud's current end-to-end quickstart (updated 2026-11-20), official repo docs, release notes, and launch post
- Updated to the lifecycle that remains current: `uvx ... setup` → `agents-cli create` → author/evaluate with `eval run` → `deploy`; clarified CLI+skills are developer tooling, not the coding agent or deployed runtime
- Verified Python/Go ADK defaults and LangChain/Claude SDK templates; CLI GA v1.0.0 (2026-06-30), actively maintained through v1.15.0 (2026-11-17)
- Added billing boundary: cloud deploy requires GCP project, billing and target IAM; distinguish from local development and check target pricing
- Research note: `research/ai-routine/20261122-074500-google-agents-cli.md`
- Reviewed and refined: `Copilot SDK GA` into the current Microsoft Copilot SDK v2 runtime/process-boundary guidance
- Replaced stale v1.0.2 memory/defer details with the v2 default in-process architecture, six supported SDK languages, CLI distinction, BYOK/subscription boundary, and subprocess isolation guidance
- Sources re-checked: v2.0.0 and current releases, current SDK README/getting-started/in-process guide, and staged rebrand announcement; v2.0.1 was latest stable release seen on 2026-11-22
- Research note: `research/ai-routine/20261122-080000-microsoft-copilot-sdk-v2.md`
- Reviewed and refined: `GitHub MCP Secret Scanning GA` against the current GitHub setup and push-protection documentation
- Corrected operational boundaries: remote MCP only, explicit tool enablement, public vs Secret-Protection-enabled private/internal eligibility, ephemeral findings, and no automatic scan on every commit
- Reconciled historical GA announcement with the current guide: avoid promising repo-level customization behavior; current documentation says organization security configuration controls MCP scan detections/enforcement
- Research note: `research/ai-routine/20261122-081500-github-mcp-secret-scan.md`
- Reviewed and refined: `Codex Plugins·Sites·Annotations` using the OpenAI launch post and current plugin/Sites help documentation
- Kept the 62-app/110-skill numbers out of the live summary because they describe the June 2026 launch snapshot; clarified app permissions, Site privacy/sharing/publication controls, usage, and targeted annotations
- Research note: `research/ai-routine/20261122-083000-codex-role-plugins-sites-annotations.md`
- Reviewed and refined: `Google Colab CLI` using the Google launch post, upstream README/operator skill/changelog, and current PyPI metadata
- Replaced the launch-era GPU provisioning framing with the current `colab run` create-execute-cleanup workflow; added account quota, compute-unit, `--keep`, and OS boundaries
- Verified PyPI v0.8.0 (2026-11-10), Python >=3.12, and 2.7k GitHub stars at review time; recorded the README/PyPI OS metadata mismatch in the research note rather than overclaiming portability
- Research note: `research/ai-routine/20261122-090000-google-colab-cli.md`
- Reviewed and refined: `Copilot 1M 컨텍스트·추론 레벨` using the current supported-model matrix, Copilot CLI docs, and cloud-agent announcement
- Corrected product-surface scope: 1M context is currently limited to VS Code and Copilot CLI; configurable reasoning also includes Copilot cloud agent; both require supported models and increase AI-credit use
- Research note: `research/ai-routine/20261122-091500-copilot-context-reasoning.md`
- Reviewed and refined: `Copilot Sandboxes` against current GitHub local/cloud sandbox documentation, GA changelog, and billing docs
- Updated lifecycle and practical boundaries: local sandbox is GA and restricts agent-run operations (not a blanket VM for the CLI); CLI/app settings are separate; cloud sessions can resume from snapshots and have compute, memory, and storage meters
- Verified cloud sandbox billing begins November 23, 2026, and draws from shared Actions compute entitlement; removed stale public-preview framing
- Research note: `research/ai-routine/20261122-094500-copilot-sandboxes.md`
- Reviewed and refined: `Copilot AI credits API` using the GitHub changelog, current metrics reference, and REST API/billing documentation
- Clarified that `ai_credits_used` is an overall per-user metric, not feature/model/client breakdown or billed total; team-level metrics require joining user-team and user reports
- Added explicit billing-source distinction and cautioned against treating usage alone as proof of productivity/value
- Research note: `research/ai-routine/20261122-100000-copilot-ai-credits-metrics.md`
- Reviewed and replaced stale `MAI-Code-1-Flash` cards with current `MAI Code 2 / Flash` guidance using GitHub model lifecycle notices, Copilot availability docs, and Microsoft's model card
- Confirmed MAI-Code-1-Flash was deprecated Sep 10; MAI Code 2 and Flash launched Nov 17; MAI-Code-1.1-Flash is scheduled for deprecation Dec 18
- Reframed around task-to-model selection, usage-based billing, and plan/client/admin-policy availability; did not repeat model marketing benchmark claims
- Research note: `research/ai-routine/20261122-101500-mai-code-2-flash.md`
- Reviewed and refreshed `Copilot model deprecations` with GitHub's November 16 completed deprecation, October announcement, and current December notices
- Replaced stale June 2026 dates with reusable checks for scope, exceptions, plan/client availability, org policy, and representative regression prompts
- Verified current example: Opus 4.8/Opus 5/GPT-5.6 Terra deprecated Nov 16; Opus 4.8 remains available to annual individual subscribers; Opus 5.5/GPT-6.1 Sol/GPT-6 Luna are suggested alternatives
- Research note: `research/ai-routine/20261122-103000-copilot-model-deprecations.md`
- Reviewed and refined `ML Kit APO` against current Android Gemini Nano docs, Google Cloud Prompt Optimizer docs (updated Nov 20), and original Android announcement
- Separated cloud-side prompt optimization from on-device app inference; updated optimizer taxonomy to zero-shot, few-shot, data-driven and identified `gemini_nano` target mode
- Removed launch-era Nano v3-specific benchmark numbers from the main card; retained caveat in research note that Google's internal task results are not general guarantees
- Added data-governance and holdout-evaluation guidance; current Prompt Optimizer SDK is documented as experimental despite service GA
- Research note: `research/ai-routine/20261122-104500-mlkit-prompt-optimization.md`
- Reviewed and refined `ADK 장기 실행 에이전트` using Google's long-running ADK tutorial, current Agents CLI session-storage guidance, and ADK state/session concepts
- Strengthened distinction between explicit workflow state and persistence: in-memory sessions do not survive restart/instance change; use a durable session backend
- Added event-resumption reliability concerns: authenticated signals, validated transitions, duplicate/retry safety; removed unqualified claim that any ToolContext state write alone guarantees end-to-end durability
- Research note: `research/ai-routine/20261122-110000-adk-long-running-state.md`
- Reviewed `MCP EMA stable` against the stable extension specification, current support matrix, upstream launch announcement, and ext-auth repository
- Corrected scope: EMA is an opt-in MCP extension, not universal/default OAuth replacement; all of client, IdP, and server authorization service must support/configure the flow
- Added ID-JAG exchange, audience/scope/issuer validation, and compatibility verification; replaced launch-era client/server roster because support status changes
- Checked the upstream ext-auth repository at review time: 181 GitHub stars (current snapshot; not a trend claim)
- Research note: `research/ai-routine/20261122-113000-mcp-enterprise-managed-auth.md`
- Reviewed `Claude WIF GA` against Anthropic's current WIF, authentication, and reference documentation plus the GA announcement
- Added a critical credential-precedence caveat: `ANTHROPIC_API_KEY`/`ANTHROPIC_AUTH_TOKEN` override federation; migration must unset keys, confirm WIF is selected, then revoke the key
- Refined mechanism and least-privilege guidance: OIDC JWT → issuer/rule checks → scoped service-account token; configure workspace/scope and rely on SDK refresh while retaining upstream IdP controls
- Research note: `research/ai-routine/20261122-120000-claude-workload-identity-federation.md`
- Reviewed and refined: `Copilot SDK GA` against GitHub's GA announcement, October SDK transition announcement, current compatibility docs, quickstart, and repository metadata
- Corrected release framing: GA is June 2, 2026; naming transition to Microsoft Copilot SDK began October 28 and is phased
- Clarified SDK versus CLI boundary: SDK exposes JSON-RPC-supported operations; terminal-only interactive features do not automatically become SDK methods
- Recorded GitHub repository attention snapshot (10.7k stars, 1.5k forks on 2026-11-22) as volatile evidence only; explicitly avoided inferring Android deployability or on-device inference from Java support
- Research note: `research/ai-routine/20261122-123000-copilot-sdk-ga.md`
- Reviewed and corrected: `Copilot App GA` against official Android/iOS GitHub Mobile updates, desktop-app GA, and current connected-cloud docs
- Removed the erroneous claim that the Copilot desktop app is an Android/iOS app; Android users access Copilot through GitHub Mobile
- Clarified same cloud-session continuation, mobile session review/control, cloud plan and policy boundaries, and sandbox compute billing starting 2026-11-23
- Research note: `research/ai-routine/20261122-124500-github-mobile-copilot.md`
- Reviewed and refined: `Copilot Sandboxes` using current cloud/local sandbox, CLI remote-control, and billing documentation
- Corrected CLI behavior: local is the default; `copilot --cloud` runs only an interactive session remotely and cannot combine with `-p`/`-i`
- Distinguished local OS sandbox and its in-process built-in file-tool boundary from a GitHub-hosted isolated Linux cloud sandbox
- Split billing: running compute and allocated memory share monthly included compute usage; stopped snapshot storage is separately metered/charged. Omitted volatile exact rates
- Explicitly distinguished remote-control steering of a live local host (`/remote on`) from a cloud sandbox session
- Research note: `research/ai-routine/20261122-130000-copilot-sandboxes-refresh.md`
- Added: `Copilot CLI Remote Control — 실행 중인 세션을 Android에서 조종하기`
- Verified remote control is opt-in and user-specific; basic synced session visibility is view-only; the host must stay online with the interactive CLI running
- Distinguished local-host steering from cloud sandbox execution; documented `/keep-alive`, organization `View and control` policy, session-event transmission to GitHub, and host-local execution
- Research note: `research/ai-routine/20261122-131500-copilot-cli-remote-control.md`
- Reviewed and refined: `GitHub Mobile Copilot` against the April Android client feature changelog, October connected-cloud announcement, cloud sandbox docs, and remote-control docs
- Added task entry paths (Copilot tab, repository, issue, PR), same-session cross-client continuation, cloud-hosted execution, and paid-plan/org/read-only access boundaries
- Clarified this cloud workflow is not a local Android IDE and distinguished it from `/remote on` control of a running local CLI host
- Research note: `research/ai-routine/20261122-133000-github-mobile-cloud-agent.md`
- Reviewed and refined: `Android Live Threat Detection` against Google's 2026 Android security roadmap, 2024 Play Protect launch source, and Android 17 developer feature page
- Separated Play Protect platform detection from app-facing SDKs; no public API to consume detection results was identified in reviewed official sources
- Qualified Android 17 dynamic-signal monitoring as a May 2026 H2 rollout roadmap, not universal current availability; included SMS forwarding, accessibility overlay, icon-hiding/background-launch examples
- Added intermediate level and interview practice; removed unrelated Advanced Protection feature list from this card's core
- Research note: `research/ai-routine/20261122-140000-android-live-threat-detection.md`
- Added `Android Enterprise AI 경계 — AppFunctions와 Agentic Automation 분리` after checking Android 17 Enterprise and DevicePolicyManager references
- Distinguished `setAppFunctionsPolicy(APP_FUNCTIONS_DISABLED)` (current user's AppFunctions) from Agentic Automation policy via `setNearbyAppStreamingPolicy`; work-profile data/automation boundaries stated separately
- Refined adjacent AppFunctions card: Jetpack 1.0.0 stable (Nov 18) does not make platform integration experimental preview or Connected Apps provider support GA
- Research note: `research/ai-routine/20261122-143000-android-enterprise-agent-boundaries.md`
- Next: inspect `A2UI + MCP Apps`
- Reviewed and refined `A2UI + MCP Apps` using the Google Developers Blog, the A2UI project repository/docs, and the MCP Apps extension docs
- Clarified that A2UI requires an A2UI-capable host or an integrated renderer; ordinary MCP compatibility does not imply native A2UI rendering. Added Jetpack Compose as a supported renderer and framed the UI choice around structure, custom interaction, and separate security boundaries
- Verified A2UI repository attention at review time: 17.7k stars and 1.4k forks; treated stars only as a volatile snapshot, not proof of adoption or production readiness
- Research note: `research/ai-routine/20261122-062521-a2ui-mcp-apps.md`
- Reviewed `Android AI Sample Catalog`; next: inspect `Android CLI + Skills` for current command and skill package boundaries
- Reviewed and refined `Android AI Sample Catalog` using the official sample and hybrid README, current Firebase AI Logic FAQ/production checklist, and ML Kit GenAI documentation
- Matched hybrid inference wording to `PREFER_ON_DEVICE`; added Firebase App Check enforcement since 2026-11-02 and differentiated debug tokens from production attestation
- Verified `android/ai-samples` attention snapshot: 724 stars / 181 forks on 2026-11-22; not used as a trend or quality claim
- Research note: `research/ai-routine/20261122-063100-android-ai-sample-catalog.md`
- Reviewed `Android CLI + Skills`; next: inspect `Google AI Studio Android` publication workflow claims and scope
- Reviewed and refined `Android CLI + Skills` against the current Android CLI overview, command and skill references, Android Skills documentation, Knowledge Base docs, and stable-release/update announcements
- Updated command lifecycle and scope (`android init`, `android skills`, `--agent`, `--project`); clarified that standard compatibility does not guarantee identical skill discovery/invocation in every agent
- Removed the 70%+/3x claim from the short card; documented its narrow internal setup experiment scope in the research note
- Research note: `research/ai-routine/20261122-064500-android-cli-skills-refinement.md`
- Reviewed and refined `Google AI Studio Android` against current AI Studio Android build/publish docs, Google Play personal-app eligibility, and Play Console account requirements
- Distinguished the personal-library path from AI Studio → Play Console internal testing (up to 100 testers) and production release; clarified automated safety review versus public catalog review
- Added client-side-only and Firebase App Check / Firestore review boundaries
- Research note: `research/ai-routine/20261122-070000-google-ai-studio-android.md`
- Reviewed and refined `Android Studio Agent Mode parallel chat` against the current Agent Mode docs and Quail 2 / Quail 4 official release announcements
- Scoped “worktree unavailable” to the Quail 2 release; Quail 4 adds live task status and diff-summary UX but does not state whether worktree support changed, so the card now advises checking the installed version
- Research note: `research/ai-routine/20261122-073000-android-studio-parallel-agent-chats.md`
- Next: inspect the next older AI+Android card in sequence after this one; skip pure Android-only content

- Reviewed and refined: `AppFunctions Agent Skill — 앱 기능을 온디바이스 에이전트 도구로 준비`
- Added package-scoped ADB inspection and a concrete prompt-injection defense: function metadata is untrusted input; use it only to understand/invoke the function, never to expand shell/file actions
- Rechecked current Android AppFunctions docs and official skill reference; GitHub issue #251 is closed and the current reference contains the safeguards, so the card does not present the issue as unresolved
- Research note: `research/ai-routine/20261122-074500-appfunctions-metadata-trust.md`
- Next: continue older-card refinement after `Android 17 NPU 접근 선언`; skip pure Android-only cards

- Reviewed and refined: `Android 17 NPU 직접 접근 — API 37 타깃은 manifest 기능 선언 확인`
- Shortened summary; retained targetSdk/direct-access gate, manifest feature literal, API paths, and clarified `required=false` only affects feature filtering, not CPU/GPU fallback implementation
- Sources re-checked: Android 17 behavior changes, Android 17 release blog, PackageManager API reference
- Research note: `research/ai-routine/20261122-080000-android17-npu-card.md`
- Next: review `ML Kit Structured Output` for current SDK state and compactness

- Reviewed and refined: `ML Kit Structured Output — Kotlin 타입은 얻어도 사실 검증은 남는다`
- Corrected stale feature detection (`getAvailableFeatures()` → `isStructuredOutputFeatureAvailable()`); maintained Structured Output Alpha vs Prompt API Beta lifecycle distinction
- Shortened summary and retained schema-vs-truth, Kotlin/minSdk/KSP, parse/constraint/token-limit implementation cautions
- Sources re-checked: ML Kit Structured Output guide, release notes, and direct model access guide
- Research note: `research/ai-routine/20261122-081500-mlkit-structured-output-refresh.md`
- Next: inspect the next older AI+Android card; skip pure Android-only topics

- Reviewed and refined: `Android Computer Control — UI 자동화 대상과 assistant 권한 경계`
- Clarified one active session and that system consent is requested on the first interaction with each target app; maintained privileged OEM assistant requirement and limited Preview scope
- Rechecked official Computer Control and AppFunctions docs; kept UI automation distinct from explicit tools and did not claim automatic fallback
- Research note: `research/ai-routine/20261122-083000-android-computer-control-boundaries.md`
- Next: inspect `Firebase AI Logic — 종료된 Imagen 호출을 Nano Banana로 이전` for model availability and migration facts

- Reviewed and refined: `Firebase AI Logic — 종료된 Imagen 호출을 Nano Banana로 이전`
- Rechecked Imagen shutdown and migration mapping; added key SDK-side caveats: Firebase image generation remains Preview and requires Blaze billing, distinct from model lifecycle
- Preserved API migration, 1-image PNG/SynthID result and `NO_IMAGE` handling
- Sources: Firebase Imagen migration guide, Nano Banana image generation guide, supported models list
- Research note: `research/ai-routine/20261122-090000-firebase-imagen-nano-banana-migration.md`
- Reviewed and refined `Android Bench` after confirming that the existing card described the superseded 1.0 benchmark and stale model scores
- Rechecked current Android Developers leaderboard and Android Bench 2.0 methodology: 30 long-horizon tasks, five runs per task, pass and completion rates, containerized AVD evaluation, deterministic functional checks, multimodal UI and accessibility verification
- Removed volatile model ranking/score claims; explained why pass rate needs completion rate and task/run context
- Research note: `research/ai-routine/20261122-064500-android-bench-2-refinement.md`
- Reviewed and refined `Q4 KV Cache edge` as a multi-agent LLM inference research case study
- Rechecked arXiv paper, HTML full text, and linked implementation; replaced inconsistent PPL summary with the concrete 4K Gemma 3 12B result (15.7s re-prefill vs 577ms warm restore)
- Made the platform boundary explicit: repository requires Apple Silicon/macOS and MLX; no Android runtime support or Android performance evidence was found
- Repository attention snapshot: 18 stars, 0 forks; treated as modest interest, not validation of the claims
- Research note: `research/ai-routine/20261122-070000-q4-kv-cache-refinement.md`
- Reviewed and refined `Codex Remote GA` as an AI+Android remote-development workflow
- Rechecked official Codex Remote release entry and remote-connections guide; clarified phone-as-control-plane, host-side execution/resources, QR phone↔host pairing, retained sandbox/approval controls, and host availability requirements
- Removed outdated app version and unrelated DigitalOcean plugin detail; added intermediate level and interview recall
- Research note: `research/ai-routine/20261122-071500-codex-remote-android-refinement.md`
- Reviewed and refined `MobileRisk-Live / OS-Sentinel` using the v3 paper, project website, repository, and dataset card
- Separated the live Android-emulator testbed from the frozen 204-trajectory MobileRisk benchmark; clarified 102 safe/102 unsafe samples and system-state traces
- Qualified the paper's reported 10–30% baseline improvements as experiment-specific, not a deployment guarantee; added advanced level and interview practice
- Verified research status: ACL 2026 oral and AIWILD@ICLR 2026 best-paper award; repository attention snapshot 51 stars/4 forks, not treated as quality proof
- Research note: `research/ai-routine/20261122-073000-mobilerisk-ossentinel-refinement.md`
- Next: inspect the next older AI/AI+Android card; verify its claims and platform applicability before editing

- Reviewed and refined `ZCode — GLM-5.3 ADE와 휴대폰 원격 조종의 실행 경계`
- Replaced stale GLM-5.2, version, quota, and feature claims with current official ZCode guide facts; excluded claims not needed to explain the product
- Clarified that phone Remote Control is a control surface, while execution stays in the desktop-connected local/SSH/WSL/Docker workspace; documented QR-link authorization and stop/refresh precautions
- Sources: [ZCode guide](https://zcode.z.ai/en/docs/welcome), [Remote Control](https://zcode.z.ai/en/docs/remote-control), [Remote Development](https://zcode.z.ai/en/docs/remote-development)
- Research note: `research/ai-routine/20261122-065700-zcode-glm53-remote-control.md`
- Next: inspect `FrontierCode` and verify current benchmark claims before refining

- Reviewed and refined `FrontierCode 2.0 — 코딩 에이전트의 완성도와 암묵적 요구 평가`
- Replaced the superseded FrontierCode 1.0/1.1 Diamond scores and false-positive comparison with current 2.0 methodology; leaderboard identifies 132 tasks and 2.0 launched 2026-10-27
- Kept the key lesson: agent evaluation must include thoroughness, inferred constraints, compatibility, and blocker criteria; historical model rankings are volatile and omitted
- Sources: [FrontierCode 2.0 methodology](https://cognition.com/blog/frontier-code-2.0), [current leaderboard and revisions](https://cognition.com/frontiercode)
- Research note: `research/ai-routine/20261122-065800-frontiercode-2-methodology.md`
- Next: inspect `MCP-AgentBench` and validate its task/server counts and evaluation claims

- Reviewed and refined `MCP-AgentBench — MCP 에이전트를 경로가 아닌 작업 결과로 평가하기`
- Verified 33 servers/188 tools, 600 queries, six categories and 100 queries per category against the AAAI 2026 paper; described the testbed as a paper-specific snapshot, not a live MCP inventory
- Removed historical model comparisons; retained MCP-Eval's outcome-oriented judging and qualified 91.67% agreement as a 60-item expert comparison (Cohen's κ=.734), not a universal correctness guarantee
- Sources: [AAAI 2026 paper DOI](https://doi.org/10.1609/aaai.v40i37.40347), [paper HTML](https://arxiv.org/html/2509.09734)
- Research note: `research/ai-routine/20261122-070100-mcp-agentbench-refinement.md`
- Next: inspect the next older candidate, `mcptest`, and verify its current repository and feature claims

- Reviewed and reframed `mcptest` as the general lesson `MCP 테스트 계층 — mock 회귀 테스트와 live 통합 평가`
- Corrected the package distinction: distribution is `mcp-agent-test`, CLI is `mcptest`; removed stale fixture-pack/metric-count feature dump and false blanket token-free claim
- Clarified that mocking MCP server responses does not eliminate model API cost when the launched agent calls a real model, and mock tests do not verify live server/auth/network behavior
- Adoption check: the repository showed 0 stars and PyPI lists Alpha 0.1.0 (released 2026-04-16); kept no product popularity claim and used it only as a small example of the test strategy
- Sources: [mcptest repository](https://github.com/josephgec/mcptest), [mcp-agent-test on PyPI](https://pypi.org/project/mcp-agent-test/), [mcp-eval live integration testing](https://github.com/lastmile-ai/mcp-eval)
- Research note: `research/ai-routine/20261122-070200-mcp-mock-vs-live-tests.md`
- Next: inspect the next older card, `mcp-eval`, and validate its current project status and claims

- Merged the duplicate standalone `mcp-eval` card into `MCP 에이전트 테스트 — mock 회귀와 live 통합 평가를 함께 설계하기`
- Kept the reusable distinction: mocks give fast controlled trajectory regression; live agent↔server tests expose authentication/network/implementation behavior and OTEL latency/cost
- Verified current mcp-eval repo snapshot at 41 stars/10 forks; PyPI `mcpevals` latest listed release is 0.1.10 (2025-09-04), so removed “production-ready” and adoption implications; tool serves as a documented example, not an endorsement
- Sources: [mcp-eval repository](https://github.com/lastmile-ai/mcp-eval), [mcpevals on PyPI](https://pypi.org/project/mcpevals/), [mcptest repository](https://github.com/josephgec/mcptest)
- Research note: `research/ai-routine/20261122-070300-mcp-eval-card-merge.md`
- Reviewed and refined `Junie GA` into `Junie Android 개발 — 에이전트에 에뮬레이터·Compose 미리보기·Logcat 연결`
- Replaced a stale, crowded product overview with the documented Android agent feedback loop; separated built-in IDE/CLI capabilities from optional `android-engineer` extension features
- Removed volatile launch-date, broad provider/ACP/debugger, and remote-control assertions that were unnecessary for this AI+Android lesson; made no star/popularity claim for this proprietary product
- Sources: [Junie Android development](https://junie.jetbrains.com/docs/android-development-with-junie.html), [Junie IDE plugin](https://junie.jetbrains.com/docs/junie-ide-plugin.html), [JetBrains AI Assistant](https://www.jetbrains.com/help/idea/ai-assistant-in-jetbrains-ides.html)
- Research note: `research/ai-routine/20261122-071035-junie-android-workflow-refinement.md`
- Reviewed the related `Android Studio BYOA` card against Junie's Android workflow; kept them separate because BYOA teaches agent-agnostic ACP integration and Change Review, while Junie teaches one agent's Android execution/diagnostic loop
- Re-verified `Copilot CLI Remote Control — 실행 중인 세션을 Android에서 조종하기` against current GitHub Docs and clarified that remote control is interactive-only, not available to programmatic `--prompt` runs
- Sources: [Android Studio agent integration](https://developer.android.com/blog/posts/ai-agents-android-studio-integration), [GitHub remote-control usage](https://docs.github.com/en/copilot/how-tos/copilot-cli/use-copilot-cli/steer-remotely), [GitHub remote-control concepts](https://docs.github.com/en/copilot/concepts/agent-capabilities/agent-powered-workflows-and-operations/about-remote-control), [cloud sandboxes](https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-sandboxes)
- Research note: `research/ai-routine/20261122-071300-android-agent-cards-review.md`
- Next: start a fresh oldest-first scan of remaining AI/AI+Android cards; the current end-of-file block through `Copilot CLI Remote Control` has been reviewed
- Revisited `Android Studio Agent Skills — .skills/SKILL.md로 Android 워크플로를 묶기` during the remaining-card scan
- Replaced obsolete `.skills` path and Canary-only wording with on-demand expertise, reusable `SKILL.md` resources, Rabbit 2 stable skill management, and Android CLI distribution; avoided directory claims because official docs are inconsistent
- Sources: [Android Studio skills guide](https://developer.android.com/studio/gemini/skills), [Android skills overview](https://developer.android.com/tools/agents/android-skills), [Rabbit 2 stable announcement](https://developer.android.com/blog/posts/ai-agents-android-studio-integration)
- Research note: `research/ai-routine/20261122-071500-android-studio-skills-refinement.md`
- Next: continue the oldest-first scan from the first remaining unreviewed AI/AI+Android card; the final Android Studio/Copilot card block has now been checked
- Refined `reloadSkills·sessionTitle·/reload-skills` into the focused `Claude Code reloadSkills — SessionStart 훅이 설치한 스킬을 같은 세션에서 읽기` card
- Clarified the discovery-before-SessionStart-hook timing edge case, the `hookSpecificOutput.reloadSkills` response, and the manual `/reload-skills` path; removed unrelated `sessionTitle` details
- Checked current Hooks docs and changelog history (v2.1.152 feature addition; v2.1.0 automatic skill hot-reload) to avoid implying that all skill changes require a restart
- Sources: [Hooks reference](https://code.claude.com/docs/en/hooks), [Claude Code changelog](https://code.claude.com/docs/en/changelog)
- Research note: `research/ai-routine/20261122-071800-claude-reload-skills-refinement.md`
- Refined `--safe-mode` into `Claude Code --safe-mode — 설정 문제를 사용자 정의 기능과 분리 진단`
- Reframed the flag as a diagnostic comparison, distinguished it from `--bare` and security isolation, and documented the selective managed-policy exception
- Re-checked current CLI reference and changelog; omitted the exact minimum version from the card to keep the operational lesson durable
- Sources: [Claude Code CLI reference](https://code.claude.com/docs/en/cli-reference), [Claude Code changelog](https://code.claude.com/docs/en/changelog)
- Research note: `research/ai-routine/20261122-071909-claude-safe-mode-refinement.md`
- Next: continue the oldest-first AI-card scan with `/cd` and verify prompt-cache and workspace behavior

- Refined `Android AI Sample Catalog — 클라우드·온디바이스 예제로 배포 경계 읽기`
- Clarified `PREFER_ON_DEVICE` fallback semantics, Firebase AI Logic App Check automatic enforcement (2026-11-02), and the catalog's explicit demo-not-production boundary; removed broad setup/pricing claims that vary by sample and backend
- Attention signal checked live via GitHub API: 724 stars, 181 forks, latest push 2026-11-03 (snapshot only; not presented as quality proof)
- Sources: [Android AI Sample Catalog README](https://github.com/android/ai-samples/blob/main/ai-sample-catalog/README.md), [Android hybrid inference](https://developer.android.com/ai/hybrid), [Firebase AI Logic App Check](https://firebase.google.com/docs/ai-logic/app-check)
- Research note: `research/ai-routine/20261122-072744-android-ai-sample-catalog-refinement.md`
- Next: inspect `Android CLI + Skills — 에이전트에 실행 도구·절차·최신 문서를 결합` and verify the CLI / Skills / Knowledge Base status and use cases

- Refined `Android CLI + Skills — 에이전트에 실행 도구·절차·최신 문서를 결합`
- Fixed a factual reversal: customized skills are overwritten on update unless renamed; separated `android init`, `android skills`, and Knowledge Base `android docs search/fetch` responsibilities
- Verified agent/project scoping and ecosystem-specific skill discovery against current official Android docs
- Attention signal checked live via GitHub API: android/skills 10,690 stars, 700 forks, latest push 2026-11-17 (snapshot only)
- Sources: [Android CLI overview](https://developer.android.com/tools/agents/android-cli), [CLI skills command](https://developer.android.com/tools/agents/android-cli/commands/skills), [Android skills overview](https://developer.android.com/tools/agents/android-skills), [Android Studio skill guidance](https://developer.android.com/studio/gemini/skills), [CLI docs command](https://developer.android.com/tools/agents/android-cli/commands/docs)
- Research note: `research/ai-routine/20261122-072922-android-cli-skills-refinement.md`
- Next: review `Google AI Studio Android — 개인 라이브러리·내부 테스트·정식 출시 구분` and verify current eligibility and release requirements against official policy

- Refined `Google AI Studio Android — 개인 라이브러리·내부 테스트·정식 출시 구분`
- Rechecked personal-library eligibility (US rollout, verified adult personal account, Play Store 53.5+), private/no public release review, internal testing cap (100), and production-release boundary
- Made App Check behavior concrete: AI Studio uses debug tokens for preview/testing and reCAPTCHA Enterprise for Play release builds; included review of generated Firestore rules and client-only architecture
- Sources: [AI Studio Android guide](https://aistudio.google.com/docs/aistudio-android), [personal apps policy](https://support.google.com/googleplay/answer/18936837?hl=en), [Play testing tracks](https://support.google.com/googleplay/android-developer/answer/9845334)
- Research note: `research/ai-routine/20261122-073051-google-ai-studio-android-policy-refinement.md`
- Next: continue oldest-first refinement with the next unreviewed AI/AI+Android card after the Android Studio Agent Mode cluster


- Refined the obsolete `subagentStatusLine` card against the official changelog: v2.1.323 removed the setting and existing keys no longer affect subagent rows. Reframed it as a version-compatibility lesson.
- Refined `--exclude-dynamic-system-prompt-sections` against the current CLI reference; narrowed the moved context claims to the documented per-user information and retained the custom-system-prompt limitation.
- Sources: [Claude Code changelog](https://github.com/anthropics/claude-code/blob/main/CHANGELOG.md), [CLI reference](https://code.claude.com/docs/en/cli-reference)
- Research note: `research/ai-routine/20261122-085300-claude-statusline-and-cache-flag-refinement.md`
- Next: continue the oldest-first AI card pass with `claude -p --bare`; verify current auto-discovery, explicit configuration, and JSON output details.


- Refined the `claude -p --bare` card against current headless docs: automatic discovery scope, settings/permission exception, hooks staying disabled, and authentication requirements.
- Refined the `/usage` card against the current costs guide: plans covered, per-skill/subagent/plugin/MCP attribution, local-history limitations, and MCP attribution boundary.
- Sources: [Headless mode](https://code.claude.com/docs/en/headless), [Plan usage breakdown](https://code.claude.com/docs/en/costs#plan-usage-breakdown)
- Research note: `research/ai-routine/20261122-085500-claude-bare-and-usage-refinement.md`
- Next: continue the oldest-first AI card pass with `오토 메모리`; verify current memory scope, automatic loads, and deletion/disable semantics.

## Latest pass
- Refined `내장 ide MCP 서버` against the current official VS Code integration guide.
- Clarified the Jupyter execution confirmation is a VS Code Quick Pick separate from MCP hook/allowlist policy; added that `Read` deny excludes both selection and active-file context for matching sensitive files.
- Sources and rationale: `research/ai-routine/20261122-ide-mcp-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `동적 컨텍스트 주입` against the current official Claude Code skills reference.
- Corrected skill argument indexing to zero-based `$0`/`$ARGUMENTS[0]`; added permission-check behavior and clarified that a failed injected command aborts the skill invocation.
- Sources and rationale: `research/ai-routine/20261122-skill-dynamic-context-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `이미지로 대화하기` against the current official Claude Code common workflows guide.
- Corrected image paste shortcuts by platform (macOS Ctrl+V; Windows/WSL Alt+V), retained path/drag alternatives, and added an interview question.
- Sources and rationale: `research/ai-routine/20261122-claude-image-input-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `/branch` against the official Claude Code session guide.
- Corrected permission inheritance: `/branch` retains session grants in the same process; CLI `--fork-session` starts a separate process and requires approval again. Qualified simultaneous-resume transcript risk.
- Sources and rationale: `research/ai-routine/20261122-claude-session-branch-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `셸 모드` against the official Claude Code interactive mode reference.
- Clarified user-submitted shell execution (`!` input mode) versus skill-body dynamic context injection, and refreshed the background shortcut note.
- Sources and rationale: `research/ai-routine/20261122-claude-shell-mode-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `MCP 설치 스코프` against the current official Claude Code MCP reference.
- Distinguished project-server trust/approval before connection from per-tool permission; clarified MCP local storage (`~/.claude.json`) versus general local settings.
- Sources and rationale: `research/ai-routine/20261122-mcp-scope-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `Claude를 정기 실행하는 4가지` against official Common workflows and Interactive mode docs.
- Kept the four execution options, clarified their runtime location/access differences, and removed an unsupported `/loop` resume guarantee.
- Sources and rationale: `research/ai-routine/20261122-claude-scheduling-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `커스텀 커맨드 인자` against the official Claude Code skills reference.
- Clarified when arguments are appended automatically, zero-based argument positions, multi-word quoting, and missing indexed versus named placeholders.
- Sources and rationale: `research/ai-routine/20261122-claude-skill-arguments-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.

## Latest pass
- Refined `커스텀 서브에이전트 만들기` against the current official subagent guide.
- Updated `/agents` behavior and clarified that omitting `tools` inherits the available subagent tool set; emphasized `description` as the delegation signal.
- Sources and rationale: `research/ai-routine/20261122-claude-subagents-refinement.md`.
- Next: continue oldest-first with the next AI or AI+Android card; exclude pure Android subjects.
