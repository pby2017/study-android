# Older-card refinement cursor

Purpose: let the local AI card routine revisit existing published cards in oldest-first order and improve detail/readability without losing the main research cadence.

Current position: continue after `Agent Client Protocol(ACP) — '에디터'와 '코딩 에이전트'를 분리하는 개방형 표준(Zed·JetBrains)`; next oldest reviewed candidate is `Conductor — 한 화면에서 Claude Code·Codex·Cursor를 '병렬로' 돌리는 맥용 오케스트레이터`.

Last update: 2026-06-27 18:17 KST

Reviewed:
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

Refined:
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

Skipped:
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

Next:
- Continue with `Conductor — 한 화면에서 Claude Code·Codex·Cursor를 '병렬로' 돌리는 맥용 오케스트레이터`; refine only if current public sources support clearer detail than the existing card.

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
