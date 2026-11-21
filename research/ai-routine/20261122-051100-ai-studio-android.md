# Google AI Studio Android card refinement

- Date: 2026-11-22 (KST)
- Candidate: existing `Google AI Studio Android prototyping` AI+Android card
- Decision: retain and refocus on the important distinction between personal-library installation and public Play distribution/review.
- Current attention signal: Google's official Developers Blog published a major Android Build update on 2026-11-17 (five days before this check), describing Kotlin Android generation, Firebase backend integrations, a browser emulator, screenshot-to-agent iteration, Android CLI use, and publishing to a personal Google Play library. This first-party recent launch signal is more relevant than a star count for a hosted product; no unsupported popularity metrics added.
- Current capabilities: official Nov 17 article says the Build agent can scaffold Kotlin code, use Firebase Cloud Firestore / Authentication / Firebase AI Logic and App Check when the user confirms, test in an HD browser emulator, attach screenshots to prompts, and publish apps to a personal Play library. These are vendor-reported product capabilities, not independently tested here.
- Crucial distribution boundary (Google Play Help, current at check): AI-generated personal apps are private, for personal use, not available in the public Play catalog, and not reviewed by Play for public catalog distribution. The personal flow has no Play testing tracks. Public distribution and testing tracks are tied to the separate Play Console developer-account route.
- Eligibility for the personal-app route: current help says user must be in the United States, be at least 18 with an age-verified personal Google account, and use Play Store app 53.5+ on an Android device. Work/school and supervised accounts are unsupported. Therefore the personal-app route is not currently available to users in Korea.
- Policy caveat: personal apps have restrictions including no ads/ad SDKs and disallowed high-risk permissions (e.g. Accessibility, SMS, Call Log, Install Packages, Notification Listener). AI-generated code and Firebase Security Rules still require human review; Play's personal app route itself is not public catalog review.
- Historical claim correction: the May I/O announcement described direct upload to Play Console internal testing tracks. The November personal-app route is a different flow. Do not conflate the two; for this card, emphasize the just-announced personal library route and say public/test distribution uses the full developer-account route.
- Duplicate check: only this card covers AI Studio native Android generation; neighboring cards cover Android CLI and Android Studio Agent Mode separately. This card focuses on distribution/eligibility/review boundaries rather than generic prototyping capabilities.
- Sources:
  - https://developers.googleblog.com/en/build-full-stack-android-apps-with-gemini-in-google-ai-studio/ (2026-11-17)
  - https://support.google.com/googleplay/answer/18936837
  - https://developer.android.com/blog/posts/android-studio-i-o-edition-what-s-new-in-android-developer-tools (May 2026 internal-testing flow)
- Confidence: high for current personal-app privacy/eligibility and distribution distinctions; medium-high for the current product capability list because it is based on vendor announcement, not independent product testing.
- Not tested: did not create a Google AI Studio app, invoke Firebase provisioning, publish to Play, or inspect generated code/security rules.
