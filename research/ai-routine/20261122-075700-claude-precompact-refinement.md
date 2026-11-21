# Claude Code PreCompact hook card refinement

- Reviewed: 2026-11-22 07:57 KST
- Candidate: existing `PreCompact 훅 — 압축 직전, 컨텍스트를 지킬 마지막 기회` card.
- Decision: retain and clarify. PreCompact is useful for steering compaction and saving important state, but summary instructions and durable storage are different mechanisms.
- Primary source checked: https://code.claude.com/docs/en/hooks

## Verified claims

- `PreCompact` runs before compaction. `manual` matches `/compact`; `auto` matches auto-compaction at the auto-compact window and idle compaction.
- On a successful, non-blocking hook, stdout is used as instructions for the compaction summary. The limit is 10,000 characters per hook; excess output is truncated.
- If information must be durable outside the compacted summary, the hook must write it to a file or another external store. PreCompact stdout is not a log sink.
- Exit code 2 or JSON `{"decision":"block"}` can block compaction.
- If automatic compaction is proactively triggered before the context limit, blocking causes Claude Code to skip compaction and continue uncompacted. If compaction is attempting to recover from a context-limit error already returned by the API, blocking surfaces that error and the current request fails.
- `PreCompact` receives `trigger` and `custom_instructions`; `custom_instructions` contains `/compact` instructions for a manual trigger and is null for auto.

## Card changes

- Replaced "last chance" framing with the distinction between summary guidance and external persistence.
- Added stdout handling and truncation limit.
- Qualified blocking behavior, especially the failure mode for context-limit recovery.
- Added an interview prompt about stdout semantics and auto-compaction recovery.

## Validation

- Checked the current official hooks reference, especially the PreCompact, input, and output sections.
- No popularity metric applies; this is a built-in lifecycle hook.
- Confidence: high.
