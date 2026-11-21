# Local AI routine paused — Codex authentication required

Paused at: 2026-11-22 (Asia/Seoul)

## Verified state
- The launchd job `com.pby2017.study-android.ai-research` is loaded with a 14,400-second (4-hour) interval.
- `.local-ai-research.disabled` exists. The pipeline exits before doing work while this marker exists. Do not remove it until a new headless Codex check succeeds.
- The last recorded routine run (2026-07-06) failed because Codex returned `401 token_invalidated` / `refresh_token_invalidated`; this is an authentication failure, not a hook failure.
- The current assistant environment also has a stale `CODEX_SESSION_ID` injected by its launcher. Unsetting it made every configured hook command smoke-test successfully, but changing credentials or stopping other Codex sessions is out of scope.
- The card UI navigation work was pushed as commit `1940727` on 2026-11-22.

## Resume procedure
1. In the user's normal Codex login environment, re-authenticate Codex if its token is still invalid. Do not copy tokens between sessions.
2. Verify headless Codex with a harmless prompt: `codex exec -C "$PWD" --dangerously-bypass-approvals-and-sandbox "Reply OK only."`.
3. Only after that succeeds, run `./scripts/local_ai_research_pipeline.sh` once manually. The script owns marker removal after successful agent execution, checks, commit, and push.
4. Keep the 4-hour local launchd schedule. No GitHub Actions.
5. If authentication still fails, keep the disabled marker and update this checkpoint with the new log path and exact error.

Do not create, update, close, or triage app-factory-android issues or pull requests. Research only AI or AI+Android education topics for study-android cards.
