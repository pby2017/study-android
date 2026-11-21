# GitHub Mobile Copilot — 2026-11-22

## Decision

Correct the existing card, which conflated the desktop GitHub Copilot app with Android/iOS GitHub Mobile and cited a non-matching launch URL/date. Focus the AI+Android lesson on mobile as an agent-session control/review surface, not a native Android coding IDE.

## Verified evidence

- April 1, 2026 GitHub Changelog: GitHub Mobile's Copilot tab and session list are available in the production Android/iOS app; includes native session logs, PR creation/review from completed sessions, and stopping a running session.
- July 8 and July 17 changelog posts confirm Android/iOS mobile entry points for Copilot cloud agent conflict resolution and code-review comment fixes.
- October 28, 2026 connected-cloud announcement: cloud experiences and cloud sandboxes are GA on paid Copilot plans. A session can start on mobile and continue on web, CLI, Copilot desktop app, or VS Code; local environment sessions can be steered from phone after registering the device. Organization policy and repository access govern use; users without write access are read-only.
- The October announcement says sandbox billing starts November 23, 2026. Cloud sandbox compute is chargeable against shared Actions compute entitlement, with published product rates; avoid describing it as free/unmetered.
- June 17 desktop-app GA announcement explicitly lists macOS, Windows, and Linux, not Android. Android product is GitHub Mobile, a separate app surface.

## Sources

- https://github.blog/changelog/2026-04-01-github-mobile-stay-in-flow-with-a-refreshed-copilot-tab-and-native-session-logs/
- https://github.blog/changelog/2026-07-08-github-mobile-fix-merge-conflicts-with-copilot-cloud-agent/
- https://github.blog/changelog/2026-07-17-github-mobile-fix-pull-request-comments-with-copilot-cloud-agent/
- https://github.blog/changelog/2026-10-28-work-from-anywhere-with-a-new-connected-copilot-cloud-experience/
- https://github.blog/changelog/2026-06-17-github-copilot-app-generally-available/

## Result

Reframed the card for Android, distinguished GitHub Mobile from the desktop Copilot app, described cross-surface continuation as the same cloud session, and stated plan/policy/compute constraints. Confidence: high; all claims are supported by official GitHub sources. No on-device code editing or local Android build capability inferred.
