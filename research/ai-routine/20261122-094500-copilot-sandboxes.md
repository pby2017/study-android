# Copilot local and cloud sandboxes — 2026-11-22

## Decision

Keep and refresh the existing card. The topic remains useful for AI-assisted development because it distinguishes restricting agent-run commands on a developer machine from moving an entire session to a hosted environment. The earlier card was stale: both local and cloud sandboxes were described as public preview, while local sandboxing became generally available in October and the connected cloud experience became generally available on paid plans in October.

## Verified facts

- Local sandboxing is generally available in Copilot CLI, Copilot app, and VS Code Agent Host. It restricts agent-run operations' filesystem, network, credential, and system access according to policy. Local sandboxing has no extra charge under the Copilot seat.
- This should not be described as putting the CLI itself in a VM. GitHub's docs note that built-in CLI file tools run in-process and enforce policy themselves; local sandboxing primarily constrains sandboxed processes/operations. CLI and app local settings are configured independently.
- CLI commands `/sandbox status` and `/sandbox policy` expose whether sandboxing is active and the effective access rules.
- Cloud sandboxing runs the entire session in a GitHub-hosted environment. Stopped sessions can be resumed from snapshots. Organization/enterprise cloud access policies apply.
- Cloud sandbox charges have compute, allocated-memory, and stopped-session snapshot-storage meters. GitHub announced that billing starts November 23, 2026, and cloud sandbox compute draws on the shared included Actions compute entitlement; usage beyond included compute can be billed under account settings.

## Sources (official)

- GitHub Docs, [About cloud and local sandboxes](https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-and-local-sandboxes)
- GitHub Changelog, [Local sandboxing now generally available](https://github.blog/changelog/2026-10-07-local-sandboxing-for-github-copilot-now-generally-available/)
- GitHub Changelog, [Connected Copilot cloud experience](https://github.blog/changelog/2026-10-28-work-from-anywhere-with-a-new-connected-copilot-cloud-experience/)
- GitHub Docs, [Billing for cloud and local sandboxes](https://docs.github.com/en/billing/concepts/product-billing/cloud-and-local-sandboxes)

## Card implications

Clarify local-vs-cloud security boundaries, avoid overclaiming local isolation, and surface the scheduled billing date and shared compute allowance. Recommend checking effective local policy and cloud spending controls before enabling autonomous execution.
