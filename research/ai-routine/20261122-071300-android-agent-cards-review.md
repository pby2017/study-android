# Android agent cards review — 2026-11-22

## Android Studio BYOA overlap check

Checked the BYOA card against the newly refined Junie Android card. They are related but teach different concepts, so they remain separate:

- BYOA: Android Studio's agent-agnostic ACP entry point, access to Android Studio tools/skills, and Change Review.
- Junie Android: one agent's IDE-plugin + CLI workflow, including Compose Preview, app lifecycle, and scoped diagnostics; distinguishes base actions from its optional extension.

The current official Android Developers announcement says Rabbit 2 is stable and documents 40+ ACP agents, Android Emulator/Build Systems/Logcat, Android skills, and Change Review. No duplicate content merge was needed.

Source: [Android Studio agent integration (official)](https://developer.android.com/blog/posts/ai-agents-android-studio-integration), published 2026-10-28.

## Copilot CLI Remote Control refinement

Re-checked the existing Android/GitHub Mobile card against current GitHub Docs. The central distinctions remain accurate: session sync is not control; remote control is opt-in; commands run on the host; and the host must stay online with the interactive CLI running. Added a concise limitation that remote control is for interactive sessions and is unavailable to programmatic `--prompt` sessions. This is a useful boundary for readers deciding between mobile steering and headless automation.

Sources:

- [GitHub Docs: steer a session remotely](https://docs.github.com/en/copilot/how-tos/copilot-cli/use-copilot-cli/steer-remotely)
- [GitHub Docs: remote control concepts, policy, and security](https://docs.github.com/en/copilot/concepts/agent-capabilities/agent-powered-workflows-and-operations/about-remote-control)
- [GitHub Docs: cloud sandboxes](https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-sandboxes)

## Attention and confidence

- The Android Studio card is supported by a current first-party stable-release announcement; no star count is applicable to this IDE feature.
- The Copilot claim is supported by current first-party usage and concept docs. No unstable feature count or popularity metric is needed in the card.
- Confidence: high for the stated workflow and boundaries.
