# Android SpeechRecognizer on-device boundary refinement

## Decision
Keep the card. It teaches a useful AI/privacy implementation boundary: the system-default recognizer is not an on-device guarantee, while the platform has an on-device-specific factory and runtime availability query.

## Official source checked (2026-11-22)
- Android `SpeechRecognizer` API reference: https://developer.android.com/reference/android/speech/SpeechRecognizer
  - The API reference warns that its implementation is likely to stream audio to remote servers. This warning applies to the general API/system service behavior; it does not mean every provider always sends every request remotely.
  - `isOnDeviceRecognitionAvailable(Context)` and `createOnDeviceSpeechRecognizer(Context)` were added in API 31. The availability method checks whether an on-device service exists; factory creation fails if it is unavailable.
  - `checkRecognitionSupport(Intent, Executor, RecognitionSupportCallback)` was added in API 33 and checks whether the requested recognition intent is supported.
  - `triggerModelDownload` is available from API 33; a requested language may be supported but not currently available (for example, if its model is not downloaded).

## Changes
- Added `중급` level.
- Distinguished the general system-default service from the explicit on-device factory.
- Clarified that on-device service availability does not prove requested-language/model support; added the API 33 support-query boundary.
- Kept network-blocked testing as a verification step for a concrete device, language, and service combination, not as a universal platform claim.

## Confidence
High; all platform/API claims are directly supported by the current Android API reference.
