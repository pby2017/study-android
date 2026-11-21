# Android Computer Control target-app permission boundary — 2026-11-22

## Evidence checked
- Official Android Computer Control guide: https://developer.android.com/ai/computer-control (last updated 2026-05-13)
  - Preview only; OEM-preloaded assistant requires privileged `ACCESS_COMPUTER_CONTROL`.
  - One active session; up to six target apps are run sequentially.
  - System permission dialog is triggered when the framework first interacts with each target app.
  - Assistant operates a secure background virtual display, captures content, and simulates input. It can hand control back for confirmation/intervention.
  - Target apps need no dedicated integration; support remains limited.
- Official AppFunctions overview: https://developer.android.com/ai/appfunctions
  - AppFunctions exposes explicit OS-indexed functions for authorized callers, distinct from Computer Control UI automation.

## Refinement
Made the authorization nuance precise: privileged assistant permission, one active session, and target-app first-interaction consent are distinct. Kept the no-integration requirement and AppFunctions-vs-UI-automation distinction. Did not claim automatic fallback. Confidence: high.
