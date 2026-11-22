# Claude Code structured JSON output card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official programmatic-use guide: https://code.claude.com/docs/en/headless
- Confirmed `--output-format json` + `--json-schema` places structured data in `structured_output` alongside response metadata.
- Added failure-path handling: when a run ends without valid structured output (for example, a refusal), the field is absent; consumers must check before use.
- Added schema nuance: invalid schemas fail validation; `format` is accepted as an annotation but not enforced.
- Replaced the unsupported assertion that schema output makes automation generally “stable” with explicit absence validation and a `jq` guard example.
- Added intermediate difficulty and an interview retrieval question.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
