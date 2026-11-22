# RunAnywhere Kotlin SDK card refinement

## Decision
Keep and refine the card. The repository is an actively maintained, high-attention project with a real Kotlin/Android SDK, but its README combines package examples and capability claims from different release points. Focus the card on the verified integration flow and capability discovery rather than copying a possibly stale dependency version or implying every device supports every engine.

## Sources checked (2026-11-22)
- Official SDK README: https://github.com/RunanywhereAI/runanywhere-sdks
  - Kotlin example registers `LlamaCPP`, initializes `RunAnywhere`, downloads and loads a model, then generates text.
  - README states Android API 24+ and recommends arm64; QHexRT is limited to Snapdragon Hexagon v75/v79/v81 on Android arm64.
  - The `capabilities()` (v4) guidance says to inspect what the installed package and device can execute; enum presence alone is not proof that the engine is integrated.
  - README describes Console as optional/offline operation without an API key; telemetry is scoped per modality when enabled. It separately lists a Cloud engine for hybrid STT. Therefore “offline” must be evaluated for the chosen modality/path, not inferred from the SDK name or Console optionality.
  - README's Gradle snippet says `0.20.27`, while current release records include later scoped desktop releases. Do not publish that snippet version as current Android guidance.
- GitHub REST API, `GET /repos/RunanywhereAI/runanywhere-sdks` (same-run snapshot): 10,354 stars; 422 forks; latest source push `2026-11-10T22:05:33Z`; repository updated `2026-11-21T07:13:33Z`. These are attention/activity signals, not evidence of production adoption.
- GitHub REST API, latest release endpoint: latest tag was `cpp-desktop-v0.20.43` (2026-10-28), a scoped desktop release; it does not establish the latest Android artifact version.
- Additional official Android SDK integration notes: https://github.com/RunanywhereAI/runanywhere-android/blob/main/AGENTS.md — identifies Kotlin backend artifacts (core, llama.cpp, ONNX, QHexRT) and says versions move together.

## Changes
- Added `중급` level.
- Expanded the flow with capability discovery and explicitly separated advertised enums from installed/runtime support.
- Constrained Android and Hexagon device support claims to the README's requirements.
- Clarified local-only verification: prefetch model, disable remote route where applicable, then test with network blocked.
- Avoided an exact Gradle version because the README sample is behind newer release tags and the latest release tag is not an Android release.

## Confidence
High for the integration and platform boundaries (official docs/source); medium for current release packaging because the public README snippet and latest release endpoint do not identify a current Android package version.
