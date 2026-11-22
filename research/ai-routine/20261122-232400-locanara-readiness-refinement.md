# Locanara Android readiness card refinement (2026-11-22)

## Decision
Keep and refine the existing AI+Android card as a compatibility-gating case study, not as a claim that Locanara is a trending or widely adopted library. It teaches a reusable distinction between a dependency's install floor, an API's integration floor, and the runtime's actual model/device availability. Keep it separate from the Gemini Nano hybrid-inference card: that card focuses on local/cloud routing; this card focuses on compatibility and readiness.

## Verified facts
- Locanara Android's current `packages/android/locanara/build.gradle.kts` declares `minSdk = 31`. Its comments distinguish ML Kit task APIs at API 26+, Prompt API/Gemini Nano at API 34+ on supported devices, and its implementation includes ExecuTorch. The publication metadata declares AGPL-3.0.
- Current Google Prompt API getting-started documentation says API level 26+ is required to integrate the API. It presents runtime states `AVAILABLE`, `DOWNLOADABLE`, `DOWNLOADING`, and `UNAVAILABLE`; `UNAVAILABLE` can mean unsupported device or that the device has not fetched the latest configuration. Download progress, completion, and failure are distinct outcomes. This API floor does not guarantee Gemini Nano availability on a particular device.
- Current Locanara `MLKitPromptClient.checkStatus()` returns a cached `_status` when present. `clearStatusCache()` clears that cache. A successful model download sets cached status to `Available`; the implementation does not automatically call `checkStatus()` again at download completion.
- GitHub API snapshot during this review: 9 stars, 3 forks; repository updated 2026-10-13 and last pushed 2026-08-08. This is modest adoption evidence, not proof of current popularity/trending. The card avoids presenting it as a hot dependency.

## Card changes
- Clarified `minSdk 31` as the Locanara artifact's consuming-app install floor, not Gemini Nano support.
- Distinguished the Google Prompt API integration floor (API 26+) from Locanara's Gemini Nano engine condition (API 34+ plus a supported device) and ExecuTorch route (API 31+).
- Documented the exact status-cache behavior, including explicit invalidation before rechecking; retained practical download/fallback handling and AGPL review.
- Updated the interview answer to test the three-level distinction.

## Sources
- Google Prompt API guide (last updated 2026-09-02): https://developer.android.com/agents/skills/device-ai/ml-kit-genai-prompt-api/references/get-started
- Locanara Android Gradle module: https://github.com/hyodotdev/locanara/blob/main/packages/android/locanara/build.gradle.kts
- Locanara Prompt API status client: https://github.com/hyodotdev/locanara/blob/main/packages/android/locanara/src/main/kotlin/com/locanara/mlkit/MLKitPromptClient.kt
- Locanara README and platform requirements: https://github.com/hyodotdev/locanara
- Same-run GitHub API snapshot: https://api.github.com/repos/hyodotdev/locanara

## Confidence and limits
High confidence in the cited source statements at review time. This is a moving `main` branch and live repository metadata; recheck before future updates. The repository is niche by stars/forks and has not been characterized as an adoption trend. No claim is made that every API 34+ device supports Gemini Nano; consult the live supported-device list and test runtime status on target devices.
