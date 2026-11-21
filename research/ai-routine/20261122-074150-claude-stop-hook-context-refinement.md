# Claude Code Stop hook context card refinement — 2026-11-22 07:41 KST

## Candidate and practical value

- Oldest-first candidate: `Stop 훅 additionalContext — 턴 끝에 컨텍스트 주입해 작업 이어가기`.
- AI agent-control topic. Clarifies where hook context lands and how to avoid repeated Stop-hook continuations.

## Official source checked

- Current Hooks reference, context injection and Stop/SubagentStop sections: https://code.claude.com/docs/en/hooks

## Verified claims

- Stop and SubagentStop accept `hookSpecificOutput.additionalContext`; Claude Code wraps it in a system reminder at the end of the turn, and the conversation continues so Claude can act on it.
- `decision: "block"` with a reason is blocking control; `additionalContext` is non-error feedback. Both use the same continuation protections, including the `stop_hook_active` input and the eight-consecutive-continuation cap.
- SubagentStop context is addressed to the subagent's next instruction. To inject context into the parent after a subagent returns, use PostToolUse on the Agent tool.
- Multiple values for the same event are all passed. Each string is capped at 10,000 characters; an oversized value is saved to a session-directory file and replaced with a path and up to 2,000-character preview.
- Popularity signal is not applicable to a built-in hook API.

## Change and decision

- Removed the ambiguous assumption that SubagentStop context reaches the parent.
- Added `stop_hook_active`, continuation-loop limit, parent-context routing, and an interview question.
- Confidence: high; behavior and limits are stated in the current official reference.
