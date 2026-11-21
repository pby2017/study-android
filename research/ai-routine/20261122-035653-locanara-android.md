# Locanara Android card refinement

Date: 2026-11-22 03:56 KST

## Candidate and decision

- Candidate: existing Locanara card, reframed as an Android implementation lesson.
- Decision: retain and refine. The product's current popularity/activity evidence is weak, so the card does not recommend adopting the framework. Its implementation demonstrates an enduring mobile-AI integration distinction: artifact install floor is not model/feature readiness.
- Duplicate check: no other current card was found that uses Locanara's Android Prompt API status/download flow as its central lesson. Existing Gemini Nano cards cover other API and product integration topics.

## Sources checked

- Locanara Android module Gradle config: https://github.com/hyodotdev/locanara/blob/main/packages/android/locanara/build.gradle.kts
- Locanara Prompt API status and download implementation: https://github.com/hyodotdev/locanara/blob/main/packages/android/locanara/src/main/kotlin/com/locanara/mlkit/MLKitPromptClient.kt
- Locanara SDK status refresh/download orchestration: https://github.com/hyodotdev/locanara/blob/main/packages/android/locanara/src/main/kotlin/com/locanara/Locanara.kt
- Google ML Kit Prompt API Android setup: https://developers.google.com/ml-kit/genai/prompt/android/get-started
- Google ML Kit Prompt API overview/device support: https://developers.google.com/ml-kit/genai
- GitHub repository metadata: https://api.github.com/repos/hyodotdev/locanara

## Fact-check and activity signals

- The Android library Gradle config sets `minSdk = 31`; it separately comments that Prompt API/Gemini Nano requires API 34+ and supported devices. The README likewise describes Android 12+ for ExecuTorch and Android 14+ for Gemini Nano. Do not treat the library's minimum SDK as proof that every included feature is available.
- Android source maps Prompt API checks to `AVAILABLE`, `DOWNLOADABLE`, `DOWNLOADING`, and `UNAVAILABLE`. The download coordinator clears cached state, downloads only when appropriate, checks the state again, and refreshes capabilities.
- Google documents direct Prompt API at API 26+ but makes availability depend on supported device/model state. Its setup guide explicitly requires checking availability and preparing a downloadable feature. This supports the broader lesson that API level and runtime readiness are different checks; it does not establish that every API-26+ device supports Gemini Nano.
- Locanara Android artifact declares AGPL-3.0 in its publishing metadata. License review is retained as a practical dependency-adoption boundary.
- Current GitHub API metadata: 9 stars, 3 forks, `pushed_at` 2026-08-08T17:29:07Z. These are volatile, low/stale interest signals, not evidence of quality or current support.
- README claims automatic best-engine routing across platforms. This was removed from the Android card because a cross-platform overview claim does not establish the Android runtime's exact route-selection behavior. The previous iOS engine list and Swift-only wording were also removed as irrelevant or inaccurate for an Android card.

## Final card lesson

Separate three checks: (1) can the app install the library (`minSdk`), (2) does the target device support the AI feature, and (3) is the model ready now or does it need download/initialization? Gate UI and fallback behavior on the runtime status. Review the artifact license before distribution.

Confidence: high for the source-backed Android build/status/license facts; medium for product-interest signal because repository metrics change and remain low.
