# Claude security-guidance plugin card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Verify current behavior, enforcement boundary, credentials, and data handling in the official plugin.

## Decision

Keep the AI developer-security card, but center it on an operational boundary: automated model review is advisory and has a data-transfer/cost footprint; it is not a commit-blocking security gate.

## Evidence

- Official plugin README: <https://github.com/anthropics/claude-plugins-official/blob/main/plugins/security-guidance/README.md>
  - Describes three layers: regex reminders on edits, LLM diff review on Stop, and agentic review on commit that reads related files.
  - Says high-severity findings are fed back to Claude; this does not constitute an enforced commit block or guarantee complete detection.
  - States that diff-review prompts include changed paths, diff hunks, and relevant changed file contents; agentic review can send additional files it reads.
  - Review data goes to the configured endpoint/provider, and LLM reviews consume API/subscription usage.
  - Without credentials reaching the plugin, LLM reviews may be skipped while pattern warnings remain.
  - Advises sandboxing sessions for code that is not fully trusted; the plugin adds no isolation layer to the session.
- Official plugin manifest: <https://github.com/anthropics/claude-plugins-official/blob/main/plugins/security-guidance/.claude-plugin/plugin.json>
  - Confirms the official plugin identity and three-layer description.

## Card changes

- Replaced stale model/version names, quotas, implementation-specific internal details, and install command with stable behavior and tradeoffs.
- Corrected the security boundary: the plugin is a best-effort reviewer, not a blocking gate.
- Added endpoint data-transfer and usage-cost caveats, plus repository trust/sandbox guidance.
- Added level and interview retrieval question.

## Validation

Ruby syntax, YAML loads, targeted card assertions, routine tests, and `git diff --check` are run before commit.

Confidence: high for README-documented behavior and privacy model; the specific effectiveness of findings remains workload-dependent and is not claimed.
