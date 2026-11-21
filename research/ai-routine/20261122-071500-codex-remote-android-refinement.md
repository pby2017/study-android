# Codex Remote for Android — 2026-11-22

## Decision

Refined the existing Codex Remote card as an AI+Android workflow. The important learning is the control/execution boundary: Android is the mobile control surface; the connected computer or its remote development environment supplies the project and execution tools.

## Primary sources checked

- Official release entry: https://developers.openai.com/codex/changelog
  - The June 25, 2026 entry announces Codex Remote general availability and authenticated one-to-one QR pairing between each mobile device and host.
- Current remote-connections guide: https://learn.chatgpt.com/docs/remote-connections
  - Supports ChatGPT mobile on iOS/Android controlling a connected macOS/Windows desktop host; connected host contributes projects, files, credentials, permissions, plugins, browser and local tools.
  - Commands run on the connected host or remote environment; sandboxing, security controls, and action approvals still apply.
  - The host needs to be awake, online, and running the desktop app; sleep, network loss, or app closure stops access.
  - The guide recommends a dedicated always-on computer for longer availability and describes SSH-host projects as a separate remote environment path.

## Card changes

- Added intermediate level and interview question/answer.
- Replaced compressed version/date and unrelated DigitalOcean plugin details with durable architecture and operational boundaries.
- Clarified this is not native code execution on the phone or an always-on cloud VM.
- Set the card source to the current remote-connections guide.

Confidence: high; all capability and availability statements are from current first-party documentation.
