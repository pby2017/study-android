# Older-card refinement cursor

Purpose: let the local AI card routine revisit existing published cards in oldest-first order and improve detail/readability without losing the main research cadence.

Current position: continue after `Codex CLI — Rust 네이티브 로컬 코딩 에이전트(92k+★)`; next oldest reviewed candidate is `Crush — Charm이 만든 'TUI 맛집' 모델-비종속 터미널 코딩 에이전트`.

Last update: 2026-06-23 12:52 KST

Reviewed:
- `diagnose — 디버깅을 규율로 만드는 스킬`
- `Spec Kit — 명세 주도 개발(SDD)`
- `Karpathy-inspired CLAUDE.md — 에이전트 행동을 네 규칙으로 좁히기`
- `Ouroboros — 모호함을 수치로`
- `서브에이전트 — 컨텍스트를 지키는 분업`
- `Claude Code GitHub Action — PR에 부르면 자동 수정·리뷰`
- `Gemini CLI — 빠른 무료 한도 + 터미널 에이전트`
- `Codex CLI — Rust 기반 터미널 코딩 에이전트`

Refined:
- `diagnose — 디버깅을 규율로 만드는 스킬` — clarified the reproducible red/pass debugging loop and practical AI-agent lesson.
- `Spec Kit — 명세 주도 개발(SDD)` — clarified the SDD artifact flow and the role of specs as AI execution boundaries.
- `Ouroboros — 모호함을 수치로` — clarified the interview/seed/run/evaluate loop and added the ontology convergence threshold alongside the ambiguity threshold.
- `서브에이전트 — 컨텍스트를 지키는 분업` — clarified context isolation, project/user scope precedence, tool/MCP limits, and model routing.
- `Gemini CLI — 빠른 무료 한도 + 터미널 에이전트` — clarified the free-tier limits, tool surface, MCP extensibility, and script-friendly JSON/streaming outputs from the current README.
- `Codex CLI — Rust 네이티브 로컬 코딩 에이전트(92k+★)` — refreshed live GitHub metrics, latest release, install/auth surfaces, and the practical split between local CLI, IDE integration, and Codex Web.

Skipped:
- `Karpathy-inspired CLAUDE.md — 에이전트 행동을 네 규칙으로 좁히기` — source reachable, but the existing card was already concise and the source claim is intentionally small.
- `Claude Code GitHub Action — PR에 부르면 자동 수정·리뷰` — source re-checked; the existing refined card already captures triggers, review/implementation features, structured outputs, runner location, and authentication/provider choices.

Next:
- Continue with `Crush — Charm이 만든 'TUI 맛집' 모델-비종속 터미널 코딩 에이전트`; refine only if current public sources support clearer detail than the existing card.

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
