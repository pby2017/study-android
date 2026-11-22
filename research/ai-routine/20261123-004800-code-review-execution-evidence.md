# Claude Code review commands: execution evidence, not prompt intent

## Scope and decision

Refined the existing official code-review plugin card. The old card treated its documented four-agent workflow as if every run followed it and lacked the current distinction between Claude Code's bundled review command and the separate official plugin. Kept the transferable review-pipeline lesson, but made actual execution verification the main point.

## Sources checked (2026-11-23 KST)

- Official plugin README: https://github.com/anthropics/claude-plugins-official/blob/main/plugins/code-review/README.md
  - Still documents four parallel agents, per-issue 0-100 confidence scoring, an 80 threshold, and output/comment behavior.
- Exact plugin command: https://github.com/anthropics/claude-plugins-official/blob/main/plugins/code-review/commands/code-review.md
  - Confirms the prompting sequence: eligibility, CLAUDE.md paths, summary, four review agents, issue-by-issue validation, discard unvalidated findings, then optional `--comment`.
- Official Claude Code v2.1.274 release: https://github.com/anthropics/claude-code/releases/tag/v2.1.274
  - Release notes say `/code-review` uses leaner inline prompts for models without tuned settings instead of many review subagents. This is built-in behavior and should not be conflated with the plugin's written process.
- Public implementation-name issue: https://github.com/anthropics/claude-code/issues/69232
  - Describes separate bundled `/code-review` and plugin `/code-review:code-review` command paths. The issue was closed as not planned; used it only to support the command distinction, not as proof of a current bug.
- Open reported CI regression: https://github.com/anthropics/claude-code/issues/100401
  - The reporter describes GitHub Actions runs on Claude Code 2.1.285+ that launched 0-2 agents rather than the documented sequence but still posted the plugin's “No issues found” text. A Nov 8 comment includes 2.1.316, and the issue remains open on the check date. This is a user report, not an independently verified general failure or a confirmed root cause.

## Card changes

- Changed title and summary from “four agents reliably reject false positives” to the stronger transferable lesson: distinguish command implementation and verify executed steps.
- Added advanced level and interview retrieval Q&A.
- Kept the plugin's actual documented four-reviewer/80-threshold structure, but labeled it as a requested procedure rather than proof that the model executed it.
- Added the built-in review's inline-prompt behavior and bounded the open CI report to the affected reported setup/version; did not claim that all models or versions fail.
- Removed stale paths under `anthropics/claude-code/plugins/code-review`; linked the current official `anthropics/claude-plugins-official` source.

## Attention / selection signal

This is a refinement, not a new adoption recommendation. No star count or popularity claim is used. Evidence is from the official plugin implementation, official release notes, and public issue reports.

## Confidence and limitations

High confidence in what the public plugin command and release notes specify. Medium confidence in the reported CI gap: the issue provides concrete versioned run reports, but these are user-reported and do not prove universal or current behavior. The operational advice is to inspect actual traces and fail closed when required review steps are absent.
