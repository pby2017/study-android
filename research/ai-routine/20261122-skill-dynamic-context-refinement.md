# Claude Code skill dynamic-context card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked current official skill docs: https://code.claude.com/docs/en/slash-commands
- Replaced outdated positional argument semantics (`$1`/`$2` shell-style splitting) with current `$ARGUMENTS` and zero-indexed `$0`/`$ARGUMENTS[0]` behavior.
- Added a security-relevant execution boundary: injected shell commands run before skill content reaches Claude and must pass permission checks; outside Auto mode, non-allow results abort the invocation. This rejects the inaccurate implication that invocation alone automatically authorizes command execution.
- Kept the compact concept focused on dynamic context, arguments, and permission boundaries.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
