# ZCode GLM-5.3 ADE and Remote Control card refinement

## Decision

Refined the existing ZCode card. It qualified as an AI-native developer tool, but its model version, product version, quota, adapter lifecycle, and several feature claims were tied to an older product snapshot. Replaced them with the current product's stable educational distinctions: ADE task context and the boundary between mobile control and workspace execution.

## Sources checked (official)

- https://zcode.z.ai/en/docs/welcome
  - Current documentation identifies ZCode as an ADE built around GLM-5.3. It describes the ZCode Agent working with goals, files, terminal results, browser context, execution mode, and Git state in a task; it also says sensitive operations require confirmation.
- https://zcode.z.ai/en/docs/remote-control
  - Phone Remote Control accesses the current desktop window and existing workspaces/tasks. The phone is a control surface and does not create a runtime. Commands execute on the machine/environment already connected by desktop (local, SSH, WSL, or Docker). The link grants control; anyone holding it can operate the window. Refresh a possibly leaked QR/link and use Stop to end the session.
- https://zcode.z.ai/en/docs/remote-development
  - Confirms workspace execution location and that the desktop handles account/model settings. Remote workspace file, terminal, Git, and Agent operations happen on the target environment.

## Card edits

- Removed potentially stale assertions: June 2026 product version, GLM-5.2 optimization, quota multiplier, third-party adapter lifecycle, `/goal` scope, Zread, Git branch graph, and bot channels.
- Rewrote the card to avoid making product/version/plan claims not needed to explain the workflow.
- Added intermediate level and interview recall question/answer.
- Made the distinction actionable: phone sends instructions, desktop-connected workspace executes; protect the QR link as authorization and stop or refresh it as needed.

## Attention and confidence

- This is a refinement of an existing card, not a new candidate-selection decision. No live GitHub star count or adoption claim was used.
- Confidence: high for the documented execution and authorization boundaries; product feature/model details are subject to change and were intentionally kept brief.
