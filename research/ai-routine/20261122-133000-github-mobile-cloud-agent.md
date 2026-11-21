# GitHub Mobile Copilot cloud sessions — 2026-11-22

## Decision

Refresh the existing GitHub Mobile card to focus on task entry points and boundaries. The prior card covered mobile session management but did not clearly separate cloud sessions started from mobile from the local CLI remote-control feature.

## Verified facts

- April 1 GitHub Changelog: Android/iOS GitHub Mobile Copilot tab supports session lists/logs; users can create a PR from a completed session, review a PR, and stop a running session.
- October 28 connected-cloud announcement: start cloud sessions from the Copilot tab or from an issue, PR, or repository in GitHub Mobile. The same session can continue on web, Copilot CLI, desktop app, or VS Code.
- Cloud sessions run in a GitHub-hosted sandbox, not the user's local computer. This differs from `/remote on`, which steers a local CLI session and requires the host to remain online.
- Cloud experience/sandboxes are available on paid Copilot plans; organization policy controls cloud access. If the user lacks repository write access, Copilot use for that repository is read-only.
- Official changelog says a session may be started from mobile with voice or image/file context. Omitted from the card to keep it focused.
- The practice recommendation to inspect diff/test evidence before reviewing a PR is guidance, not a GitHub guarantee.

## Sources

- https://github.blog/changelog/2026-04-01-github-mobile-stay-in-flow-with-a-refreshed-copilot-tab-and-native-session-logs/
- https://github.blog/changelog/2026-10-28-work-from-anywhere-with-a-new-connected-copilot-cloud-experience/
- https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-sandboxes
- https://docs.github.com/en/copilot/how-tos/copilot-cli/use-copilot-cli/steer-remotely

## Result

Updated the existing AI+Android card: mobile cloud task launch locations, same-session cross-client continuation, GitHub-hosted execution, plan/policy/read-only boundary, and distinction from local CLI remote control. Confidence: high for product behavior; human diff/test review is framed as practice advice.
