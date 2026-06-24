# Older-card refinement cursor

Purpose: let the local AI card routine revisit existing published cards in oldest-first order and improve detail/readability without losing the main research cadence.

Current position: continue after `Google Antigravity — Gemini CLI를 접고 갈아타라는 '에디터·터미널·브라우저' 통합 에이전트 플랫폼`; next oldest reviewed candidate is `Mastra — 'Gatsby 팀'이 만든 TypeScript용 AI 에이전트 프레임워크`.

Last update: 2026-06-24 13:43 KST

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

Skipped:
- `Karpathy-inspired CLAUDE.md — 에이전트 행동을 네 규칙으로 좁히기` — source reachable, but the existing card was already concise and the source claim is intentionally small.
- `Claude Code GitHub Action — PR에 부르면 자동 수정·리뷰` — source re-checked; the existing refined card already captures triggers, review/implementation features, structured outputs, runner location, and authentication/provider choices.

Next:
- Continue with `Mastra — 'Gatsby 팀'이 만든 TypeScript용 AI 에이전트 프레임워크`; refine only if current public sources support clearer detail than the existing card.

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
