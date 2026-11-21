# Claude Platform Workload Identity Federation — 2026-11-22

## Decision

Refine the existing WIF card. Its original “remove static keys” framing missed the most operationally important caveat: existing API-key environment variables take precedence over federation and can silently keep the workload on the old credential.

## Verified facts

- WIF is generally available on Claude Platform (announcement June 17, 2026). It supports OIDC-compliant identity providers, including AWS IAM, Google Cloud, Kubernetes, GitHub Actions, Microsoft Entra ID, SPIFFE, and Okta.
- The workload presents an IdP-signed JWT. Anthropic checks the configured issuer/JWKS and federation rule, then issues a short-lived Claude access token for a named service account. The SDK can refresh tokens automatically.
- Federation setup comprises an issuer, service account, and federation rule. Rules constrain claim matches, target service account, workspace, scope, and token lifetime. Scope determines available endpoints and should follow least privilege.
- Authentication is not made secure by federation alone: the upstream IdP's trust and workload-identity configuration remain security-critical.
- Credential precedence: explicit constructor credentials first; then `ANTHROPIC_API_KEY` or `ANTHROPIC_AUTH_TOKEN`; then profile/federation sources. Therefore a leftover API key can shadow the federation configuration. Anthropic recommends a staged migration: configure and test WIF while the key remains, inspect the selected credential (`ant auth status` for CLI or SDK debug logs), unset the key in all runtime surfaces, confirm federation wins, and then revoke the old key.
- WIF covers Claude API endpoints through the first-party SDKs and Claude Code, according to the GA announcement. Actual permissions are limited by the configured federation rule and workspace.

## Sources checked (official)

- Anthropic Docs, [Workload Identity Federation](https://platform.claude.com/docs/en/manage-claude/workload-identity-federation)
- Anthropic Docs, [Authentication](https://platform.claude.com/docs/en/manage-claude/authentication)
- Anthropic Docs, [WIF reference: precedence, scopes, and validation](https://platform.claude.com/docs/en/manage-claude/wif-reference)
- Anthropic, [WIF generally available announcement](https://claude.com/blog/workload-identity-federation)

## Relevance

Directly useful for CI, production agents, and Claude Code automation that otherwise stores long-lived API keys. Primary signal is production availability in the Claude Platform and first-party tooling; a GitHub star count is not applicable.

## Card changes

Explained the token exchange and service-account boundary in brief. Added scope/workspace and upstream-IdP constraints. Added the silent API-key-shadowing migration risk and ordered key removal only after WIF verification. Confidence: high; these points are explicitly documented by Anthropic.
