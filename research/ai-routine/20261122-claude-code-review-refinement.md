# Claude Code review-context card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked current official best-practices guide: https://code.claude.com/docs/en/best-practices
- Confirmed `/code-review` uses a fresh subagent that has not seen the implementation conversation, and the reviewer should report evidence from the diff.
- Added the spec-based review pattern: check each requirement and edge-case test, and say to skip style to reduce low-value findings.
- Removed unsupported generalizations that every same-session review is biased and that a reviewer only sees the diff; the official guidance describes the fresh-context subagent and its review target.
- Added a guard against blindly fixing every finding; review whether each affects correctness.
- Added intermediate difficulty and an interview retrieval question.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
