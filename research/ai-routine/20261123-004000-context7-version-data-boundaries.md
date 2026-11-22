# Context7: version-aware retrieval, freshness, and hosted-data boundaries

## Primary sources checked
- https://github.com/upstash/context7 — README, MIT license, current feature modes, backend visibility, current repository metrics.
- https://context7.com/docs/clients/cli — CLI `library`/`docs` workflow, version matching, setup modes, on-prem option, telemetry and update checks.
- https://context7.com/docs/api-guide — current lookup endpoints, request/query behavior, rate limits and version-tag guidance.
- https://upstash.com/trust/context7addendum.pdf — first-party Context7 data-processing and documentation disclaimer.
- https://github.com/upstash/context7/releases — release/activity cross-check (recent CLI/MCP releases were published Nov. 9, 2026).

## Verified facts
- Context7 offers MCP and CLI + Skills setups. MCP exposes `resolve-library-id`/`query-docs`; CLI uses `ctx7 library`/`ctx7 docs`.
- CLI docs say a requested version is served when indexed, otherwise the closest available version may be used. Context7's addendum says it does not guarantee a specific index refresh frequency; its README says community-contributed projects may be included and does not guarantee all content's accuracy, completeness, or security.
- CLI sends anonymous usage events to Context7 and checks npm for updates on hosted use. `CTX7_TELEMETRY_DISABLED=1` disables usage events, not update checks. On-prem deployments turn off both checks and telemetry; some hosted features are unavailable on custom deployments.
- Context7's addendum defines prompts/queries/library names/version specifications as Inputs and treats customer Inputs and usage patterns as Customer Data. The card warns not to query with sensitive details; it does not claim source code is uploaded unless included by a user/agent in a query.
- The public GitHub repository is MIT and states that it contains MCP server source while the hosted API backend, parsing engine, and crawling engine are private. GitHub displayed about 65.3k stars and 3.3k forks during this review (2026-11-23); this is attention, not adoption or quality proof.

## Card edits
- Removed an obsolete June star/fork count, outdated Thoughtworks Radar claim, and the implication that the `ctx7` CLI itself is an MCP server.
- Added current MCP vs CLI + Skills flow, version-matching caveat, no freshness guarantee, source verification, query/telemetry boundary, hosted-vs-open-source distinction, and a dated attention snapshot.
- Added intermediate level and an interview retrieval question on validating retrieved docs and protecting query inputs.

## Confidence
High for described features and limits because they are documented in current first-party docs, README, and terms addendum. The star count is a volatile GitHub snapshot, explicitly dated and not used as evidence of adoption.
