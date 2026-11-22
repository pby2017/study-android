# ccusage card refinement — 2026-11-22

## Decision
Keep ccusage as a practical AI-developer utility, but replace the oversized source/flag inventory with the metric's actual limits: local usage-log aggregation, estimates rather than invoices, and a Claude-only 5-hour block view.

## Sources checked
- https://github.com/ccusage/ccusage — current canonical repository README lists 20+ source adapters, all-source reports and MIT license; GitHub showed 19.5k stars and 934 forks on 2026-11-22.
- https://github.com/ccusage/ccusage/blob/main/docs/guide/index.md — local data-file inputs, daily/weekly/monthly/session reports, token-and-pricing cost estimates, and stated limitations: local files only, some tool API tokens excluded, and estimates may differ from actual billing.
- https://ccusage.com/guide/codex/ — Codex usage is read from local Codex session JSONL/Zstandard logs under `CODEX_HOME`; supports source-focused daily/monthly/session reports and statusline, with embedded prices and optional online price refresh.
- https://ccusage.com/guide/blocks-reports — `blocks` is specifically Claude Code's 5-hour billing-window report; it is not a cross-source usage-limit view.
- https://ccusage.com/guide/config-files — `--offline` skips network pricing refresh and uses embedded LiteLLM/models.dev pricing. The offline setting is configurable; it should not be presented as universally enabled by default. In `auto` mode, logged cost values take precedence entry by entry when present.

## Fact checks and corrections
- Unified reports aggregate detected sources; commands such as `ccusage codex daily` narrow the view to one source.
- Default `auto` uses each entry’s stored `costUSD` when present and otherwise calculates from tokens and model pricing. Stored costs are also not a billing statement. The official guide cautions that some tool API tokens (for example Web Search) are not included and estimates may differ from actual billing.
- `blocks` is Claude Code-only. The previous card already signaled this; the refinement makes the scope explicit to prevent applying its 5-hour windows to Codex or other tools.
- Corrected the stale claim that normal execution defaults to offline pricing: `--offline` explicitly uses embedded pricing; online price refresh is controlled by options/configuration. Clarified that usage data is read locally while price lookup may be online.
- Updated the repository URL to the canonical `ccusage/ccusage`, and refreshed the dated live GitHub snapshot to ~19.5k stars / 934 forks.

## Card updates
- Added intermediate level, shorter explanation, source-aware command examples, cost-estimate/data-coverage caveats, Claude-only block semantics, current source links, and interview retrieval Q/A.
- Removed the exhaustive supported-tool list and obsolete June star count; these details age quickly and distract from interpreting the report correctly.

Confidence: high for command scope, local input format, report limitations, and star snapshot at check time.
