# Android Computer Control: assistant privilege and target-app boundary

Reviewed: 2026-11-22 (KST)

## Card decision

Rewrote the card around the current official guide's exact framework boundaries instead of treating the feature as a general UI automation capability. The guide still labels Computer Control as Preview and says only a limited set of target apps is supported.

## Evidence checked

- Official Computer Control guide (last updated 2026-05-13): https://developer.android.com/ai/computer-control
- Official target-app guidance: https://developer.android.com/ai/computer-control (Target apps section)
- Official AppFunctions overview: https://developer.android.com/ai/appfunctions

The Computer Control guide says an OEM-preloaded assistant needs the privileged `ACCESS_COMPUTER_CONTROL` permission, can request one active session for up to six target apps to run sequentially, and triggers a system permission dialog before automation. After permission, the assistant can use a secure background virtual display, capture screen content, and simulate taps, swipes, and text input. The assistant may hand control back to the user for intervention. Target apps do not need additional integration, but should follow adaptive-design and lifecycle best practices.

The separate AppFunctions guide describes explicit, discoverable app functions (tools) for authorized callers; its API availability and access restrictions are distinct. The Computer Control docs do not promise that UI automation is an automatic fallback when an AppFunction is unavailable, so the card no longer states that relationship.

## Caveats

- Do not describe this Preview as generally available or supported across all apps/devices.
- The system permission dialog and privileged assistant permission are distinct requirements; user approval does not grant arbitrary apps the privileged permission.
- Do not equate simulated UI actions with explicit app APIs or infer a fallback policy not documented by Android.
