# ML Kit Structured Output API refresh — 2026-11-22

## Evidence checked
- Official Structured Output guide: https://developers.google.com/ml-kit/genai/prompt/android/structured-output
  - Still Alpha; Kotlin-only; minSdk 26; KSP 2.3.6+; recommends `isStructuredOutputFeatureAvailable()` for device support.
  - Documents null/parse/constraint outcomes, `MAX_TOKENS`, and ProGuard keep requirements.
- ML Kit release notes: https://developers.google.com/ml-kit/release-notes
  - Current GenAI libraries require Kotlin 2.3 or higher; Prompt API has graduated to Beta while schema/compiler remain Alpha.
- Direct model access guide: https://developers.google.com/ml-kit/genai/prompt/android
  - Prompt API itself is Beta, distinct from Structured Output's Alpha lifecycle.

## Refinement
Corrected the stale feature-detection API claim (`getAvailableFeatures()` / `Feature.STRUCTURED_OUTPUT`) to the current dedicated `isStructuredOutputFeatureAvailable()` check. Kept the card concise and clarified that structured/schema-conforming output does not establish truth. Preserved Kotlin, minSdk, KSP, parse/constraint and token-limit caveats. The Prompt API Beta and Structured Output Alpha lifecycles are distinct. Confidence: high.
