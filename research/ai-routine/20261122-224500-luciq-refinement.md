# Luciq Companion + MCP card refinement — 2026-11-22

## Decision

Keep and refine the AI+Android operations card. The subject is useful to Android engineers because it connects production mobile telemetry with IDE agents, but the card must separate diagnosis, data access, and code modification. Current Luciq branding presents the AI Debugging Assistant inside Companion; MCP hands context to external coding agents, while Autopilot is a separate PR-preparation path.

## Primary sources checked

- Current Companion product page: https://www.luciq.ai/platform/companion — describes prioritization, grouping, summaries, reproduction context, root-cause explanation, MCP handoff to Claude/Cursor, and separate Autopilot PR preparation. Vendor capability description, not independent performance evidence.
- Luciq MCP help guide (June 2, 2026): https://help.luciq.ai/en/articles/14727965-your-guide-to-luciq-mcp-server — lists 10 tools across crashes, occurrences, app hangs, bug reports, and App Store reviews; names IDE clients; says MCP is available to every Luciq customer and supports personal access tokens.
- Luciq MCP data access FAQ (April 27, 2026): https://help.luciq.ai/en/articles/14788509-what-data-does-mcp-not-access — says MCP does not access source code/repository contents, SDK settings, or billing/account details; PII already in crash/bug reports may still be present.
- AI Debugging Assistant product explanation: https://www.luciq.ai/blog/luciq-ai-debugging — describes crash root-cause analysis, reproduction steps, and pattern insights. Claims are vendor descriptions and should not be treated as independently validated diagnostic accuracy.
- Older developer docs: https://docs.luciq.ai/product-guides-and-integrations/product-guides/ai-features/luciq-mcp-server — still labels MCP private beta, conflicting with the newer June help-center guide that says it is available to all customers. Prefer the newer help center for availability; note docs freshness discrepancy.

## Popularity / freshness / overlap

This is a closed product surface, not a public MCP implementation repository; no applicable GitHub star count or independent usage/adoption metric was verified in this pass. The company's current product page and customer stories show active product positioning, but do not establish adoption scale or diagnostic accuracy. Do not market it as a broadly popular tool. No competing card title covers the same exact Companion + MCP handoff; adjacent mobile-testing and crash-analysis topics are related but distinct.

## Card change

- Updated the stale `Resolve Agent` framing to current `Companion + MCP` branding.
- Added `중급` level and a retrieval prompt about whether telemetry-only MCP evidence can justify a source-code change.
- Added the current 10-tools / five-domain scope and the vendor's customer-availability statement, without implying independent validation.
- Clarified MCP's data boundary and separated Companion diagnosis, MCP context transfer, and Autopilot PR preparation.
- Replaced the prior claim that the assistant simply does not make code changes with a more accurate handoff boundary.

## Confidence

High for the cited help-center scope, data boundaries, and current product flow as vendor-documented. Medium for real-world accuracy, release availability across all regions/accounts, and actual adoption; these remain vendor claims or unverified.
