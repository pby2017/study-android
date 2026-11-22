# Firecrawl MCP card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official product docs and repository:
  - https://docs.firecrawl.dev/mcp-server/tools
  - https://docs.firecrawl.dev/mcp-server
  - https://github.com/firecrawl/firecrawl-mcp-server
  - https://github.com/firecrawl/firecrawl-mcp-server/commits
- Replaced the stale framing that this is “the most popular” server and removed the old 6.6k-star figure. GitHub showed about 7.9k stars on 2026-11-22; the repository had recent activity (3.41.0 release commit on Nov 18). The count is a dated snapshot, not a popularity guarantee.
- Replaced stale tool names/setup-only claims and the unsupported blanket claim that more MCP tools inherently confuse agents. Current official docs describe hosted OAuth/API-key access and a keyless mode limited to Search, Scrape, and Parse (within daily limits); full surface depends on plan/team policy.
- Added a practical decision sequence: query -> `firecrawl_search`; known URL -> `firecrawl_scrape`; discover paths -> `firecrawl_map`; bounded multi-page retrieval -> `firecrawl_crawl`; interactive browser actions -> `firecrawl_interact`.
- Added the cost boundary: `scrapeOptions` fetches and bills each search result page; fetch only selected URLs when full content is needed.
- Checked nearby cards: Playwright CLI + MCP is about browser automation architecture; this card is about choosing a hosted web-retrieval service by task. `llms.txt` and code-execution-with-MCP cover different retrieval/context patterns. No duplicate learning objective found.
- Added intermediate difficulty and an interview prompt.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
