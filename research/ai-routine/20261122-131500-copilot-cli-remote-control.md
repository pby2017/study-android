# Copilot CLI remote control from GitHub Mobile — 2026-11-22

## Decision

Add a distinct AI+Android card. Existing GitHub Mobile and Copilot sandbox cards covered mobile session review and cloud execution, but no card explained steering a live local Copilot CLI session from Android. The critical distinction is local-host remote control versus cloud sandbox execution.

## Verified facts

- GitHub Docs: `/remote on` enables remote control for an interactive CLI session; `/remote off` ends the connection. Remote control is disabled by default unless `remoteSessions` is configured true.
- GitHub Mobile lists the remotely accessible CLI session under Agent sessions. A user must sign in with the same GitHub account that started it; remote access is user-specific.
- Default session sync is view-only and is not remote control. A running session can show output, accept input, and respond to permission requests when remote control is enabled.
- Host machine must be online, and the CLI session must remain actively running in a terminal. `/keep-alive` can prevent the machine from sleeping; `busy` keeps it awake while Copilot is working.
- For organization seats, the "Store local sessions in the Cloud" policy must be set to "View and control"; "View from cloud" is view-only. Enterprise-managed settings can further disable remote control or limit which SSO-authorized clients can access it.
- Session events (messages, tool events, permission requests) are sent from the local machine to GitHub; shell commands, file operations, and tools continue to execute on the host.
- This feature connects to the local host; it does not move execution to GitHub's cloud. Cloud sandbox is a separate environment. Do not describe remote control as an always-on cloud job.

## Sources

- https://docs.github.com/en/copilot/how-tos/copilot-cli/use-copilot-cli/steer-remotely
- https://docs.github.com/en/copilot/concepts/agent-capabilities/agent-powered-workflows-and-operations/about-remote-control
- https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-sandboxes

## Result

Added a 1-minute intermediate card with setup flow, view-only versus control distinction, host lifecycle requirement, and cloud alternative. This connects GitHub Mobile/Android knowledge to developer-agent workflows. Confidence: high; claims checked against current official GitHub documentation.
