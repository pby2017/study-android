# Claude Code `@` file references card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked the official common workflows guide: https://code.claude.com/docs/en/common-workflows
- Corrected the unconditional “whole file” claim: inclusion is subject to the Read tool's default 25,000-token limit and text files over 256KB are not included.
- Kept directory references distinct (listings, not contents); noted `CLAUDE.md` inclusion from the referenced file's directory and parents.
- Added the security boundary: `@` insertion makes no tool call, so `PreToolUse` hooks do not run. The docs recommend a `Read` deny rule or `CLAUDE_CODE_DISABLE_FILE_MENTIONS=1` when needed.
- Preserved relative/absolute paths, multiple references, and MCP resource syntax; added an intermediate-level interview retrieval question.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
