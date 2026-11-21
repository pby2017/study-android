# Google AI Studio Android card refinement — 2026-11-22

## Decision

Refine the existing card because its “personal library versus public release” framing had become incomplete. Current first-party documentation describes two different Play paths: a personal-library path without a Play Console developer account, and an internal-testing track through a Play Console developer account. Neither should be conflated with a production rollout.

## Verified evidence

- Google AI Studio Android guide (current page, accessed 2026-11-22): prompt-generated Kotlin/Compose project, browser-hosted Android emulator, USB install, Firebase AI Logic/App Check integration, and publishing to Google Play internal testing for up to 100 testers. AI Studio Android apps are client-side only; server-side runtime features are not available. Production releases must be managed directly in Play Console. Android ZIP export is supported; GitHub export is not yet supported by this page.
  - https://aistudio.google.com/docs/aistudio-android
- The same AI Studio guide: debug builds use an App Check debug token during preview/install/sharing; Google Play release builds configure reCAPTCHA Enterprise. Do not represent generated Firebase configuration as finished production security; inspect Firestore rules and app-specific authorization.
  - https://aistudio.google.com/docs/aistudio-android#firebase-integration
- Google Play Help: personal-library apps are private to the creator, not listed in the public Play catalog, and not reviewed for public Play distribution. Creation still includes automated safety review. Eligibility listed: United States, age-verified personal account age 18+, Play Store app 53.5+ on Android. This route has no testing tracks.
  - https://support.google.com/googleplay/answer/18936837
- Play Console account guide: a developer account has a one-time US$25 registration fee; personal developer accounts have additional testing and device-verification requirements before Play distribution.
  - https://support.google.com/googleplay/android-developer/answer/6112435
- Attention / relevance: the current Google AI Studio Android guide documents an actively evolving first-party prompt-to-Compose workflow and current Play testing integration. This is a primary-source usefulness signal; no third-party adoption or star metric is claimed.

## Card changes

- Distinguished personal-library apps from Play Console internal testing and production tracks.
- Added current internal-testing limit (100 testers) and emphasized that production release remains a Play Console task.
- Corrected the “not reviewed” shorthand: personal apps are not reviewed for public Play distribution, but Google Play's automated safety review still applies.
- Added AI Studio's client-side-only limitation and concise Firebase App Check / Firestore review guidance.
- Changed the card source to the AI Studio Android guide; this source directly supports the key Android development and release workflow. Supplemental Play Help sources are listed above.

## Confidence

High; all central claims are supported by current Google AI Studio or Google Play first-party documentation.
