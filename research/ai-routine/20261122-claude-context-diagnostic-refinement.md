# Claude Code `/context` card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- Claude Code official cheatsheet (2026-08-07): https://support.claude.com/en/articles/14553413-claude-code-cheatsheet
  - Defines `/context` as a view of what is currently loaded into the context window and where it is being spent.
- Official costs guide: https://code.claude.com/docs/en/costs
  - Describes `/usage` for token usage and context management, including `/clear` for unrelated work and `/compact` for preserving a summarized session.
- Official MCP guide: https://code.claude.com/docs/en/mcp#scale-with-mcp-tool-search
  - MCP tool search is on by default; it defers tool definitions, leaving tool names and server instructions loaded at session start. Microsoft Foundry deployments do not support tool search and load tools upfront instead.
- Note: the current costs page does not document the detailed `/context` breakdown categories stated in the old card. The card now makes only the current official high-level claim and avoids preserving the undocumented category list.

## Changes and rationale

- Removed the “200k context” title because context capacity is not a universal fixed number across models and execution surfaces.
- Narrowed `/context` to the supported claim: inspect what is loaded and where context is spent; distinguished it from `/usage`.
- Updated MCP loading to current default tool-search behavior and included the documented Microsoft Foundry exception.
- Added the practical distinction between `/clear` for unrelated tasks and `/compact` when continuing with a summary; clarified that CLI command output also consumes conversation context.
- Added beginner difficulty and an interview retrieval pair.

Confidence: high for `/context`, `/usage`, `/clear`, `/compact`, and MCP tool-search behavior from current official sources. Detailed `/context` visualization categories vary and were intentionally omitted.
