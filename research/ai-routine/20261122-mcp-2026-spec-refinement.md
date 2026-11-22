# MCP 2026-07-28 specification card refinement — 2026-11-22

## Decision
Narrow the original acronym-heavy card to the central developer-facing architecture change: protocol-level stateless requests, while applications can preserve state through explicit handles. Explain the main migration risks, optional extensions, and host-side trust/consent boundary.

## Sources checked
- https://modelcontextprotocol.io/specification/2026-07-28 — official versioned specification. Defines MCP as a JSON-RPC protocol; describes self-contained stateless requests, per-request capability negotiation, optional extensions, and trust/safety requirements.
- https://blog.modelcontextprotocol.io/posts/2026-07-28-release-candidate/ — official maintainer announcement, dated 2026-05-21. Describes breaking changes, removal of `initialize` and `Mcp-Session-Id`, explicit state handles, required `Mcp-Method`/`Mcp-Name` for Streamable HTTP, optional extensions, and migration timeline (RC locked May 21; final spec planned July 28).
- https://github.com/modelcontextprotocol/modelcontextprotocol — official spec/docs repository; GitHub displayed approximately 9.7k stars on 2026-11-22.

## Fact checks and corrections
- Official versioned specification page confirms `2026-07-28` is published as a specification version, not merely a release candidate.
- Scoped the removed `initialize`/session header and load-balancing implication to the protocol/Streamable HTTP behavior in the official change announcement; did not imply all application state disappears.
- Corrected the prior card's conflation of “May 21 lock” with the release date: May 21 is the RC lock/announcement timeline, while final spec is dated July 28.
- Replaced long inventory of SEP numbers, OAuth subfeatures, and a Python SDK alpha metric with a single coherent learning outcome. Optional Tasks/MCP Apps require explicit support; user consent and tool authorization remain host implementation concerns.
- Star count (~9.7k) is a live GitHub snapshot, not a protocol-quality metric.

## Card updates
- Replaced keyword-stuffed title with a concise concept title.
- Added advanced level, three key points, source links and retrieval Q/A.
- Kept to AI developer protocol scope; no pure Android claim.

Confidence: high for versioned specification and stateless/stateful distinction; star count is volatile but checked same day.

## Validation
- YAML parsed for `_data/cards.yml` and `_data/ai_queue.yml`; card required fields and three labeled sources verified.
- `ruby -c scripts/auto_post.rb`: passed.
- `ruby scripts/auto_post_test.rb`: passed (3 runs, 14 assertions).
- `node --test scripts/card-navigation.test.js`: passed (6 tests).
- `git diff --check`: passed.
- `bundle exec jekyll build`: not run successfully; local Bundler reports `bundler: command not found: jekyll`. No dependency installation attempted.
