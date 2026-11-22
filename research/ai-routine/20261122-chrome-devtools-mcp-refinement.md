# Chrome DevTools MCP card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh next oldest eligible AI developer-tool card after Sourcegraph.

## Decision

- Retain the topic due to practical debugging/performance use and high repository attention (58.7k stars observed Nov 22, 2026), but distinguish the standalone Chrome DevTools MCP server from Codex desktop's built-in Developer mode.
- Difficulty: Intermediate; the key is selecting browser evidence while controlling access to page and profile data.
- Avoid presenting the two separate integrations as one setup or claiming that an isolated profile automatically enforces access controls.

## Current official evidence

1. Chrome DevTools MCP README: <https://github.com/ChromeDevTools/chrome-devtools-mcp>
   - Latest observed release: v1.13.0 (Nov 11, 2026). GitHub page shows 58.7k stars.
   - Provides MCP and CLI access to Chrome DevTools for browser automation, DOM/console/network debugging, screenshots and performance traces.
   - Explicitly warns that MCP clients can inspect, debug, and modify browser/DevTools data; don't share sensitive information. Usage statistics are collected by Google by default; `--no-usage-statistics` disables them.
2. Advanced usage: <https://github.com/ChromeDevTools/chrome-devtools-mcp/blob/main/docs/advanced-usage.md>
   - When an MCP server instance is shared, page-scoped tools use pageId routing by default. `--isolated` uses a temporary user data directory that is cleared when Chrome closes; the normal profile directory persists across runs.
3. OpenAI/Codex Browser docs: <https://developers.openai.com/codex/app/browser>
   - Codex desktop Developer mode is a separate feature for Browser/Chrome computer-use sessions, gives controlled full CDP access, requires explicit site/task approval before full CDP inspection, and can be disabled by an organization through `browser_use_full_cdp_access = false`.

## Removed / corrected

- Removed outdated 44.4k-star snapshot; replaced with a dated current attention signal.
- Removed obsolete `--experimentalPageIdRouting`; current shared-server routing is pageId-based by default, with `--no-page-id-routing` as the opt-out.
- Clarified that `--isolated` is a temporary browser profile, not the same as reduced tools (`--slim`) or headless mode.
- Split Codex's built-in Developer mode from connecting the separate Chrome DevTools MCP server.
- Added the MCP project's explicit browser-data and default usage-statistics disclosures.
- Added difficulty, sources, and an interview retrieval question/answer.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card schema, level, four points and four sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high for current documented MCP behavior and Codex CDP permission flow; star count is a dated GitHub snapshot.
