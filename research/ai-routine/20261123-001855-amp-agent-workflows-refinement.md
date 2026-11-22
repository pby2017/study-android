# Amp agent workflows, thread semantics, and cost boundaries

## Scope and outcome

Refined the existing Amp card after checking current first-party documentation and news. The old card had several stale or overconfident claims: Amp was described as Sourcegraph-owned, thread forking as supported, Amp Free as interactive-only, and Oracle as an automatic stronger-model route. Replaced these with current, useful distinctions.

## Evidence checked (2026-11-23 KST)

- Threads: https://ampcode.com/docs/threads — thread contents, continuity across clients, access controls, no-longer-supported public discovery, and CLI thread operations.
- Models and subagents: https://ampcode.com/docs/models-and-subagents — Task and Read Thread semantics; subagents use the thread's model and reasoning effort; Oracle/Librarian/Finder are plugins.
- Pricing: https://ampcode.com/pricing — Hobby, paid tier, BYOK/linked subscriptions, no Amp token fee/limit under those routes, and pay-as-you-go for hosted orbs.
- Execute mode: https://ampcode.com/docs/cli/execute-mode — `amp -x` execution, stdout behavior, `AMP_API_KEY` for non-interactive use.
- AGENTS.md: https://ampcode.com/docs/customize/agents-md — guidance-file handling and `AGENT.md`/`CLAUDE.md` compatibility.
- Company status: https://ampcode.com/news/amp-frontier-corporation — Amp announced its spinout from Sourcegraph in December 2025.
- Fork removal: https://ampcode.com/news/stick-a-fork-in-it — thread forking was removed; use a new thread and reference the original.
- Current model selector: https://ampcode.com/news/bye-bye-dial — the old Dial terminology/model routing is stale.

## Card edits

- Changed title to focus on transferable work practices, not Amp marketing or Sourcegraph branding.
- Added intermediate difficulty and an interview retrieval question/answer.
- Distinguished persistent task history from durable project guidance.
- Corrected subagent model behavior and Oracle's plugin status.
- Replaced obsolete “Amp Free is interactive-only” and “unconstrained tokens” statements with current plan/provider/orb cost boundaries; volatile exact amounts are intentionally omitted.
- Removed unsupported default parallelism/write-serialization and outdated JetBrains support assertions.

## Attention / adoption signal

Current official docs and official product news show active product development (2026 model selector and collaboration/CLI docs), enough for a product-workflow learning card. No GitHub star/adoption claim is made: this is a hosted commercial product, not a popularity-ranked OSS dependency.

## Confidence and limitations

High confidence in product behavior as documented by Amp on the check date. Pricing and features can change; links are included for rechecking. This card explains product workflow semantics, not a recommendation to adopt Amp.
