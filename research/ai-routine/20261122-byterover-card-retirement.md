# ByteRover CLI card retirement

Date: 2026-11-22 (Asia/Seoul)
Scope: Assess the next oldest eligible AI card after Chrome DevTools MCP.

## Decision

- Remove the standalone `Cipher → ByteRover CLI` card from the published deck instead of refreshing it as a current recommendation.
- The card's subject is the specific CLI product and a portable agent-memory layer. That repository is archived and read-only as of Sep 27, 2026; its last release was v3.16.1 (May 27, 2026).
- The current `byterover.ai` home page describes a different direction—open-book document search for agents—rather than the CLI memory-layer positioning in the card. The old card would now mislead readers about the current product and project maintenance.
- The card also overlaps with existing deck coverage of memory/context layers (`Memory Bank`, `memoryx`, `Cognee`, `LangMem`, `Supermemory`, `Honcho`, `Praxia`, and others). Keeping it as a historical case study would add little unique learning value.

## Evidence

1. Archived repository: <https://github.com/campfirein/byterover-cli>
   - GitHub marks it archived/read-only on Sep 27, 2026.
2. Releases: <https://github.com/campfirein/byterover-cli/releases>
   - Latest listed release v3.16.1 is dated May 27, 2026.
3. Former official transition announcement: <https://www.byterover.dev/blog/opensource_long_term_memory_for_agents_openclaw_hermes_claudecode>
   - Describes the Cipher-to-ByteRover CLI rename and the CLI's file-based Context Tree / local operation design.
4. Current official domain: <https://www.byterover.ai/>
   - Redirects from byterover.dev and now describes document search with source passages/pages, not the same CLI memory product.

## Deletion rationale

- Removed stale June stars, benchmark scores, compatibility counts, `brv vc` commands, and previous positioning.
- Did not replace it with a generic memory architecture card because those concepts are already covered by several more distinct cards.
- The change reduces published card count by one and keeps historical evidence in this audit note.

## Validation

Validation: Ruby syntax passed; `_data/cards.yml` and `_data/ai_queue.yml` load; the retired title is absent and the published card count decreased to 984; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high that the GitHub CLI repository is archived and that the current official landing page has shifted product framing; medium on exact conceptual overlap because the existing memory cards cover several distinct architectures.
