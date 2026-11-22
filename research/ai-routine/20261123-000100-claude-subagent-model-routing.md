# Card refinement audit — Claude Code subagent model routing

Reviewed: 2026-11-23 00:01 KST

## Sources checked

- Current Claude Code subagent documentation: <https://code.claude.com/docs/en/sub-agents>
- Current Claude Code model configuration and provider alias behavior: <https://code.claude.com/docs/en/model-config>

## Findings and corrections

- The documented default priority is per-invocation `model` parameter → subagent definition `model` → `CLAUDE_CODE_SUBAGENT_MODEL` → parent model (or spawning parent's model for nested agents). The per-invocation Agent parameter accepts aliases, not full model IDs or `inherit`.
- The old card reversed the environment-variable and definition priority. Corrected this and distinguished the opt-in `CLAUDE_CODE_SUBAGENT_MODEL_FORCE=1` override, which suppresses role-specific model selections.
- The current docs say built-in Explore normally uses the parent model; a user/project subagent named Explore can override it. Removed the obsolete claim that built-in Explore is always Haiku.
- Aliases such as `haiku`, `sonnet`, and `opus` resolve according to provider and may change over time. A large fixed catalog of current model versions would age quickly; the card instead directs readers to inspect the running model via `/tasks`.
- Subagents use separate context windows, but their requests count toward the same usage limits as the main conversation. The updated card no longer implies that delegating work inherently lowers total usage.
- The card has no difficulty level or retrieval Q&A in the pre-edit version; added intermediate classification and a short question testing priority behavior.

## Decision

Retain the AI developer-tooling topic, remove the stale cost-ceiling/Haiku-vs-Sonnet framing, and focus on the reusable configuration precedence and its failure mode. Confidence: high for current official docs; exact alias resolution remains provider- and version-dependent.
