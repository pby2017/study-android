# ML Kit GenAI Structured Output card review

- Date: 2026-11-22 KST
- Existing card refined; no new topic.
- Topic remains AI+Android: on-device typed output via Gemini Nano in ML Kit Prompt API.

## Official sources checked

1. [Structured Output guide](https://developers.google.com/ml-kit/genai/prompt/android/structured-output): explicitly labels Structured Output Alpha with no SLA/deprecation protection; Kotlin only; minSdk/API 26+, KSP 2.3.6+; annotated `@Generable` Kotlin classes and `@Guide` constraints; describes supported types, ProGuard keep rules, typed parsing, null/finish-reason behavior in the guide's candidate-based examples, and `GenAiException` for invalid class/values.
2. [Current Prompt API reference](https://developers.google.com/android/reference/kotlin/com/google/mlkit/genai/prompt/GenerativeModel): typed `generateContent(GenerateTypedContentRequest<T>)` is experimental; returns typed response and can throw for malformed input, quota/safety failures, missing annotation, or parse failure (including token truncation); `getAvailableFeatures()` returns model capabilities; older `isStructuredOutputFeatureAvailable()` is deprecated in favor of `getAvailableFeatures()`.
3. [Feature API reference](https://developers.google.com/android/reference/kotlin/com/google/mlkit/genai/prompt/Feature): exposes `Feature.STRUCTURED_OUTPUT` for structured JSON capability.
4. [Direct model access guide](https://developers.google.com/ml-kit/genai/prompt/android): current direct model access is Beta with no SLA/deprecation policy and may change incompatibly; it runs Gemini Nano on-device.
5. [ML Kit release notes](https://developers.google.com/ml-kit/release-notes): most recent release notes describe Structured Output as released in the Prompt API. This release note wording does not override the dedicated guide's explicit Alpha/no-SLA status.

## Correction / decision

- Retained and refined. Removed the stale Boolean capability check and replaced it with `getAvailableFeatures()` plus `Feature.STRUCTURED_OUTPUT` because the current API reference marks the Boolean method deprecated.
- Clarified stability layers: Prompt direct model access is Beta; Structured Output/typed generation itself remains explicitly Alpha/experimental, with no compatibility guarantee.
- Updated error guidance to current typed-response API: handle parse/config/input/quota/safety failures and token truncation; do not imply every failure arrives as a nullable response plus finish reason only (the guide contains older candidate-based sample semantics).
- Preserved minSdk 26, Kotlin-only, KSP 2.3.6+ and ProGuard keep requirement from dedicated docs. Exact dependency artifact versions omitted because they are release-sensitive.
- Core lesson: schema and type parsing constrain shape, not truth or domain validity; validate business-critical fields in app logic.
- Popularity: not a GitHub product; first-party ML Kit release notes and API docs are the relevant attention/adoption signals. No star count claimed.
- Confidence: high on stability, feature detection, platform floor and error-handling requirements; medium on cross-version sample details due to guide/reference response representation differences.
