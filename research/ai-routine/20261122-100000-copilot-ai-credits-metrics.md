# Copilot AI credits user metric — 2026-11-22

## Decision

Refine the existing card rather than create a duplicate. The June 2026 feature remains useful, but the card's prior framing could be read as if it reported team-level spend or an invoice total.

## Verified facts

- GitHub announced `ai_credits_used` in Copilot usage metrics on June 19, 2026. It is the overall AI-credit consumption per user for the report period, available in user-level 1-day and 28-day reports.
- The field is not broken down by feature, model, or client surface. GitHub explicitly describes it as a consumption-analysis metric, not a billed total.
- Metrics are accessible to enterprise administrators and organization owners (subject to enabled policy and metrics permissions) through the REST API.
- To derive team-level views, user-level usage can be joined with user-team reports; team values are not simply a pre-aggregated bill.
- Billing APIs/reports provide invoicing usage. A usage metric by itself does not show the final amount charged, nor does usage alone establish productivity or value.

## Sources checked (official)

- GitHub Changelog, [AI credits consumed per user in usage metrics](https://github.blog/changelog/2026-06-19-ai-credits-consumed-per-user-now-in-the-copilot-usage-metrics-api/)
- GitHub Docs, [Data available in Copilot usage metrics](https://docs.github.com/en/copilot/reference/copilot-usage-metrics/copilot-usage-metrics)
- GitHub Docs, [REST API endpoints for Copilot usage metrics](https://docs.github.com/en/rest/copilot/copilot-usage-metrics)
- GitHub Docs, [Billing usage API](https://docs.github.com/en/rest/billing/usage)

## Card implications

Focus on metric interpretation, missing breakdown dimensions, permissions, team joins, and the difference between usage analysis and billing. Avoid exact credit totals or causal productivity claims without independent evidence.

## Popularity / relevance signal

Primary-source evidence: GitHub shipped this field in its official enterprise/organization usage metrics API and documents its role in monitoring consumption for usage-based billing. This is a practical administrative API capability, not a GitHub-star topic; no popularity count is applicable.
