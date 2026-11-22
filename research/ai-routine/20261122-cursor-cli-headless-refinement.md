# Cursor CLI headless card refinement — 2026-11-22

## Decision
Reframe the card around the permission semantics that matter in automation. `agent -p` is non-interactive, not inherently read-only: actions permitted by the current approval rules can execute, including workspace file edits; actions that need approval are rejected because print mode cannot ask. `--force`/`--yolo` expands execution to actions that otherwise require approval, except policy denies and team restrictions.

## Sources checked
- https://cursor.com/docs/cli/headless — current print-mode semantics, approval behavior, workspace file edits, protected paths, `--force`/`--yolo`, team disable-headless setting, and headless usage examples.
- https://cursor.com/docs/cli/reference/output-format — `text`, single-object `json`, newline-delimited `stream-json`, failure behavior, and `--stream-partial-output`.
- https://cursor.com/docs/cli/reference/authentication — browser login and API-key authentication; `CURSOR_API_KEY` is recommended for automation.
- https://cursor.com/docs/cli/overview — differentiates interactive `agent` from print mode for CI and scripts.

## Fact checks and corrections
- Replaced the old wording that implied the default print-mode path leaves edits for human review. The docs explicitly say workspace edits can run without `--force`; print mode only rejects actions that need approval.
- Scoped `--force` accurately: it runs actions without approval except actions blocked by `permissions.deny` and team policies. Team admins can also disable print mode.
- Distinguished final-output JSON from event-stream NDJSON; only `stream-json` with `--stream-partial-output` provides incremental text chunks.
- Kept setup/model/version details out of the card because the permission boundary is the durable, interview-useful lesson.

## Card updates
- Added intermediate level, concise permission guidance, 3 key points, 3 official source links, and a retrieval question/answer.

Confidence: high; each claim is supported by current official Cursor documentation.
