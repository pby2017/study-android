# Sentry Seer Android debugging card refinement — 2026-11-22

## Decision
Retain and reframe the card as an AI+Android debugging workflow. Android mobile telemetry supplies the runtime evidence; Seer correlates it to form a root-cause diagnosis; an MCP-connected coding agent can implement the fix, or Seer Autofix can create a draft PR. Keep the role boundary explicit instead of implying a code model alone can infer production behavior from a stack trace.

## Sources checked
- https://sentry.io/solutions/mobile-developers/ — Sentry's mobile product page describes Android support, crashes/ANRs, and context such as stack traces, device/OS, and user actions; it also describes AI debugging with Seer.
- https://blog.sentry.io/seer-mcp-cli-or-coding-agent/ — Sentry's October 2, 2026 workflow comparison says Seer reasons across errors, traces, logs, profiles, and linked repos; MCP/agent plugin exposes event data and Seer RCA to coding tools; simple issues may need only event retrieval, while Seer returns structured diagnosis for fuller RCA; coding agents can implement it or Autofix can create a PR.
- https://sentry.io/about/press-releases/sentry-expands-seer-ai-debugging-agent/ — January 27, 2026 announcement describes connecting local coding agents through Sentry MCP, sending reproduction telemetry to Sentry, and using Seer root-cause analysis before code is committed; it also introduced the code-review workflow.
- https://sentry.io/changelog/seer-agent-updates/ — September 29, 2026 changelog says Seer Agent can perform Sentry write actions with the user's existing permissions and asks before acting if the required write scope is missing; external Datadog/GCP connectors use API keys. The card includes only the permission boundary relevant to safe use.
- https://blog.sentry.io/seer-debug-with-ai-at-every-stage-of-development/ — January 27 blog stated `$40` per active contributor/month for Seer, while the September 29 Seer Agent changelog said Seer Agent was in beta and free for all users at that time.

## Fact-check and limits
- The prior card mixed production Seer, MCP/local coding-agent integration, code review, Seer Autofix, and a per-contributor price in one description. Later official material distinguishes Seer Agent, MCP/CLI/plugin, and Autofix workflows. Removed the price rather than implying the January `$40` plan applies to every Seer surface or current beta state.
- Sentry's October article is primary product guidance, not an independent evaluation of diagnostic accuracy. The card makes no accuracy or guaranteed-fix claim.
- Android telemetry context is grounded in Sentry's mobile product page; the card does not claim Seer itself is an Android SDK or that every stack supports all features equally.
- The point about using raw MCP retrieval for simple bugs versus full Seer RCA for complex issues follows Sentry's own October tool-selection guidance.
- Attention signal: Sentry published product updates for Seer Agent on Sept 29 and a workflow-selection guide on Oct 2, 2026, showing recent active investment. This is a recency signal, not a usage metric.

## Card changes
- Added intermediate level and an interview retrieval question about connecting Android crash context, RCA, and code implementation.
- Removed stale/ambiguous pricing and reframed the content around the division of labor between telemetry, Seer, MCP, and coding agents.

Confidence: high for stated product boundaries and documented behavior; medium for generalizing marketing descriptions to every account/plan configuration.
