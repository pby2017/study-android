# GitHub MCP secret scanning: a pre-commit check, not a durable alert

Reviewed: 2026-11-22 (KST)

## Sources checked

- GitHub GA announcement (2026-05-05): https://github.blog/changelog/2026-05-05-secret-scanning-with-github-mcp-server-is-now-generally-available/
- Current GitHub Docs, scanning secrets with GitHub MCP Server: https://docs.github.com/en/code-security/how-tos/use-ghas-with-ai-coding-agents/scan-for-secrets-with-github-mcp-server
- Current GitHub Docs, push protection and MCP interactions: https://docs.github.com/en/code-security/concepts/secret-security/push-protection-and-the-github-mcp-server
- Current GitHub MCP toolset configuration: https://docs.github.com/en/copilot/how-tos/copilot-in-your-ide/customize-copilot/extend-copilot-with-tools-and-context/configure-toolsets

## Verified current behavior

The feature reached GA on 2026-05-05. An MCP-compatible agent can request a scan of current changes, but this is not an automatic scan on every commit. Current setup requires the GitHub **remote** MCP server: local MCP configurations are unsupported for secret scanning. The `secret_protection` toolset and `run_secret_scanning` tool must be explicitly enabled; default toolsets do not include them. Public repositories are eligible, while private/internal repositories require GitHub Secret Protection. Organization security configuration controls detectable secret types and enforcement.

Findings are ephemeral and visible only in the current agent conversation. They are not persisted as GitHub secret-scanning alerts and do not appear in the Security tab or alert APIs. The docs position the feature as a pre-commit safety check, not a system of record. Separately, push protection can block secrets in actions performed through the GitHub MCP server, subject to applicable configuration.

## Reconciliation of launch wording and current docs

The GA announcement says the tools honor existing repository or organization push-protection customization. The current setup guide is more specific: organization security configuration determines detection and enforcement, and repository-level push-protection settings are not used for MCP scans. The card follows the current detailed guide and avoids promising that repository settings or the historical bypass behavior are identical in every current flow.

## Card revision

Reframed the card from a broadly worded feature announcement into an operational boundary: remote-only configuration, explicit tool enablement, ephemeral results, and no automatic/durable scan. Added the distinction between scan findings and push protection, plus an interview prompt that tests those limits.

## Limitations

This review checked documentation, not a live repository with GitHub Secret Protection enabled. Exact tool availability and enforcement can vary by client and organization security policy.
