# StopFailure hook card refinement

Date: 2026-11-22 07:59 KST

## Decision
Keep the card because it teaches a distinct recovery/observability boundary for AI API calls. State that StopFailure runs instead of Stop when a turn terminates because of an API error. Use the `error` field for matcher examples and describe the event as non-decision-controlling.

## Corrections
- Current official event table defines `Stop` as firing when Claude finishes responding and `StopFailure` when a turn ends due to an API error; API errors fire StopFailure instead of Stop.
- The matcher values include `rate_limit`, `authentication_failed`, `billing_error`, and `server_error`. HTTP 529 overloaded responses map to `server_error`; removed `overloaded` as a matcher value.
- The event has no decision control and ignores output/exit code apart from documented `terminalSequence` terminal notifications.

## Source
- [Claude Code Hooks reference](https://code.claude.com/docs/en/hooks), event table and StopFailure section.

## Confidence
High. Claims are directly documented in the current official reference. No version-sensitive numeric metric included.
