# Claude Code status-line rate-limit card refinement

- Reviewed: 2026-11-22 07:43 KST
- Candidate: existing `상태줄 rate_limits — 5시간·7일 사용량을 항상 눈에 보이게` card.
- Decision: keep and refine. This built-in developer feature is directly useful for monitoring Claude Code usage, but its availability is conditional; GitHub stars do not apply.
- Primary source checked: https://code.claude.com/docs/en/statusline

## Verified claims

- Status-line JSON can include `rate_limits.five_hour` and `rate_limits.seven_day`. Each window has `used_percentage` and `resets_at` (Unix seconds).
- `rate_limits` is available to Claude.ai Pro, Max, or Ultra subscribers, or behind a Claude apps gateway that sets a spend limit. It appears after the first API response.
- Each window may independently be absent, and Claude Code removes a window after its `resets_at`. Missing is not equivalent to 0%; the documentation shows optional-value handling such as `// empty`.
- Status-line scripts run locally and do not consume API tokens. Context usage is separately represented by `context_window.used_percentage`.
- The current documentation does not support claiming these values are always present or available only to Pro/Max.

## Card changes

- Replaced the absolute "always visible" title with neutral usage/reset display wording.
- Expanded eligible plan/gateway conditions and the first-response timing.
- Added absent-window/reset handling and explicitly separated context-window usage.
- Added an interview question on interpreting a missing seven-day value.

## Validation

- The source URL above was checked against the current official documentation.
- No popularity metric was used because this is a built-in statusline capability, not a repository candidate.
- Confidence: high.
