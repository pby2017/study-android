# Local AI routine checkpoint — headless smoke passed

Updated at: 2026-11-22 (Asia/Seoul)

## Verified state
- LaunchAgent `com.pby2017.study-android.ai-research` is loaded with a 14,400-second (4-hour) interval; it is currently not running.
- `.local-ai-research.disabled` is present and prevents scheduled work until a manual recovery run starts.
- The last recorded routine run (2026-07-06) failed because Codex returned `401 token_invalidated` / `refresh_token_invalidated`; this was an authentication failure, not a hook failure.
- Current `codex login status` reports ChatGPT login. A harmless `codex --search exec` prompt returned `OK` with exit code 0, both with and without the inherited `CODEX_SESSION_ID`.
- The smoke test logs an AppLlama MCP `invalid_token` warning, but the Codex prompt completes. This MCP warning is separate from Codex ChatGPT authentication; do not copy credentials between sessions.
- The card UI and navigation regression tests were pushed as commit `421c9d0` on 2026-11-22.
- Routine docs and timeout are being aligned to the actual 4-hour cadence: ~3h30 research, final 20m implementation/verification, 10m safety margin.

## Resume procedure
1. Commit and push the cadence/documentation correction.
2. Remove `.local-ai-research.disabled` only for one manual run of `./scripts/local_ai_research_pipeline.sh`; the wrapper re-creates it automatically if the headless agent fails.
3. Review that run's log, YAML/script checks, commit/push result, and marker state.
4. Keep the 4-hour local launchd schedule. No GitHub Actions.
5. If Codex authentication fails again, keep the disabled marker and update this checkpoint with the run log path and exact error.

Do not create, update, close, or triage app-factory-android issues or pull requests. Research only AI or AI+Android education topics for study-android cards.
