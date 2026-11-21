# Gemini Nano hybrid inference card refinement

Date: 2026-11-22 08:02 KST

## Decision
Keep the Android AI card, but teach execution-path control instead of implying a hybrid fallback is always local. This is a practical privacy, availability, and reliability distinction.

## Verified details
- Gemini Nano runs in Android's AICore system service. ML Kit GenAI exposes task-specific on-device APIs.
- Firebase AI Logic supports inference modes including `PREFER_ON_DEVICE` and `ONLY_ON_DEVICE`. Under `PREFER_ON_DEVICE`, unsupported device/request availability can automatically fall back to a cloud-hosted model.
- The on-device model is not automatically downloaded when an inference request is made. Apps that need local inference should make the model available before the request and handle unavailable states.
- The response exposes `inferenceSource` as `ON_DEVICE` or `IN_CLOUD`.
- Current Firebase AI Logic hybrid inference is Experimental and ML Kit Prompt API is Beta.

## Sources
- [Gemini Nano on Android](https://developer.android.com/ai/gemini-nano)
- [Firebase AI Logic hybrid Android configuration](https://firebase.google.com/docs/ai-logic/hybrid/android/configuration-options)
- [Firebase AI Logic hybrid Android getting started](https://firebase.google.com/docs/ai-logic/hybrid/android/get-started)

## Confidence
High. All behavioral claims and maturity labels are present in current official documentation. No unsupported device list or performance claim included.
