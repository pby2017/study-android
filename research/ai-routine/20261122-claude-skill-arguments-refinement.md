# Claude Code skill arguments card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official skill reference: https://code.claude.com/docs/en/slash-commands
- Clarified the fallback precisely: invocation arguments are appended as `ARGUMENTS: ...` only when no placeholder receives an argument. A missing indexed placeholder such as `$2` remains literal; a declared named argument expands to empty when absent.
- Kept the zero-based position rule and shell-style quoting for multi-word values; added named arguments and a beginner-level interview question.
- Validation: YAML parsing; Ruby syntax; auto-post and card-navigation tests; `git diff --check`.
