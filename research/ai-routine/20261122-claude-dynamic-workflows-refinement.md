# Claude Code dynamic workflows card refinement

Date: 2026-11-22 (Asia/Seoul)

## Sources checked

- Official workflow guide: https://code.claude.com/docs/en/workflows
  - Dynamic workflows are JavaScript orchestration scripts; `agent()`, `parallel()`, and `pipeline()` coordinate subagents. Script variables retain intermediate results while the session receives the final result.
  - Documentation describes use for large audits, migrations, and cross-checked research, and warns that runs can consume meaningfully more tokens and count toward plan usage/rate limits.
  - Default workflow size is medium (small on Pro with a documented minimum version); `workflowSizeGuideline` is advice, not a hard agent cap. Removed old hard-coded scale claims from the card.
  - `disableWorkflows` can disable the feature; `/workflows` shows progress and agent token usage.
  - The `ultracode` keyword is only an opt-in for a prompt typed by the user. It does not trigger when prompt text comes through `claude -p`, scheduled tasks, webhooks, or other relayed input. `claude -p` can use workflows, but its invocation and permission rules need separate handling.
- Official settings reference: https://code.claude.com/docs/en/settings

## Corrections

- Removed version/GA date claims, fixed simultaneous-agent limits, and an unrelated Bun rewrite example; current official docs do not support presenting those as stable general properties.
- Clarified that workflow scripts hold orchestration/branching and intermediate results, and that this is a fit for large repeatable tasks rather than every request.
- Added token/usage cost warning and the fact that `workflowSizeGuideline=small` is guidance, not a hard cap.
- Corrected the important headless boundary: `ultracode` in a `claude -p` prompt does not itself trigger a workflow.
- Added an intermediate difficulty and interview question/answer around designing non-interactive execution correctly.

Confidence: high for current documented behavior and controls. Exact availability and limits can vary by plan, runtime surface, settings, and Claude Code version; card avoids fixed model/version and scale claims.
