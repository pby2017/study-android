# Copilot CLI cloud and local sandboxes — 2026-11-22

## Decision

Refine the existing Copilot Sandboxes card using current official docs. The previous summary grouped compute, allocated memory, and snapshot storage under shared Actions allowance, and omitted the important CLI default/mode constraint.

## Verified facts

- Copilot CLI runs locally by default. `copilot --cloud` launches an interactive session in a GitHub-hosted isolated Linux environment; commands run remotely, not on the local machine. This flag applies only to that session and cannot be combined with `-p` or `-i`.
- Cloud session state is snapshotted when stopped and can be resumed. It is separate from local sandboxing.
- Local sandboxing applies OS-level restrictions to commands/tools on the local machine; it does not create a separate VM/container. CLI built-in file tools execute in-process and enforce policy themselves on a best-effort basis. CLI and Copilot app local sandbox settings are separate.
- Compute runtime and allocated memory draw from shared monthly included compute usage along with eligible hosted runners; overage may be billed. Stopped snapshot storage is a separate metered item and should not be described as part of the shared compute allowance.
- Current published meters in official docs: compute per vCPU-second, memory per GiB-second while running, snapshot storage per GiB-month while stopped. Avoid putting exact rates in the card because they can change.
- Cloud sandbox access uses Copilot authentication. Organization/enterprise users are governed by the Copilot in the cloud policy. Cloud sessions are billed to the account that owns the sandbox; budget controls are available.
- Cross-client mobile steering of a running local CLI session is a distinct feature requiring remote control, an online active host, and `/remote on`; it is not the same as `copilot --cloud`.

## Sources

- https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-sandboxes
- https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-and-local-sandboxes
- https://docs.github.com/en/billing/concepts/product-billing/cloud-and-local-sandboxes
- https://docs.github.com/en/copilot/how-tos/copilot-cli/use-copilot-cli/steer-remotely
- https://github.blog/changelog/2026-10-28-work-from-anywhere-with-a-new-connected-copilot-cloud-experience/

## Result

Card now differentiates local OS sandbox from cloud session, captures CLI default and interactive-only `--cloud` constraints, and separates included compute/memory from snapshot storage billing. Confidence: high. No exact price included.
