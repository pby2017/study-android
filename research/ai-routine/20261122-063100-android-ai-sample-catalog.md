# Android AI Sample Catalog refinement — 2026-11-22

## Decision

Refine the existing card: retain its useful demo-versus-production boundary and add the current Firebase AI Logic request prerequisite that materially affects anyone running the cloud examples: App Check is automatically enforced in Firebase projects. Clarify the hybrid inference configuration from the actual sample README.

## Verified evidence

- Official Android AI Sample Catalog README: samples are standalone, simplified demonstrations and are not production-ready. Cloud examples require a Firebase project, `google-services.json`, Firebase AI Logic API enabled and included in Android API key restrictions. Image generation may require Blaze depending on the model. The catalog includes hybrid inference and on-device samples.
  - https://raw.githubusercontent.com/android/ai-samples/main/ai-sample-catalog/README.md
- Current Hybrid sample README: uses Firebase Hybrid SDK, Gemini Nano via ML Kit Prompt API and Firebase AI Logic; code configures `InferenceMode.PREFER_ON_DEVICE` with `gemini-3.5-flash-lite`.
  - https://raw.githubusercontent.com/android/ai-samples/main/ai-sample-catalog/samples/gemini-hybrid/README.md
- Firebase FAQ (updated 2026-11-20): Firebase automatically enforced App Check for Firebase AI Logic on 2026-11-02; requests without a valid App Check token are blocked. Android production providers include Play Integrity and reCAPTCHA Enterprise; local development can use the App Check debug provider. The 2027-01-21 re-enforcement date applies to projects that had delayed or temporarily disabled enforcement; avoid implying a universal grace period.
  - https://firebase.google.com/docs/ai-logic/faq-and-troubleshooting
- Firebase AI Logic production checklist: recommends App Check, stable model versions, Remote Config/server prompt templates, monitoring, rate limits/quotas, and spend controls.
  - https://firebase.google.com/docs/ai-logic/production-checklist
- ML Kit GenAI Summarization reference: the API is beta and documents feature availability states plus optional model download; availability is device/feature-dependent. Kept this detail out of the short card because its core is catalog setup and request readiness.
  - https://developers.google.com/ml-kit/genai/summarization/android
- Attention signal: GitHub `android/ai-samples` showed 724 stars and 181 forks when inspected 2026-11-22. Counts are volatile and indicate interest only, not quality or trend; no count added to the card.
  - https://github.com/android/ai-samples

## Card changes

- Updated Hybrid Inference description to match its actual `PREFER_ON_DEVICE` configuration.
- Added mandatory App Check token behavior and a concise distinction between debug and production attestation providers.
- Preserved the official repository's demo-only and Firebase setup caveats; retained the 1-minute format.

## Confidence

High for sample code, Firebase setup, and App Check enforcement based on primary sources. Model/device availability varies, so the card avoids promising that Gemini Nano works on every Android device.
