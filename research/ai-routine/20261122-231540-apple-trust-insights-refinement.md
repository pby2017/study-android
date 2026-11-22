# Apple Trust Insights card refinement

- Reviewed: 2026-11-22 (Asia/Seoul)
- Card: `Apple Trust Insights: 기기 신호와 클라우드 모델을 결합한 사기 위험 평가`
- Decision: retain as a mobile-AI/privacy engineering lesson; not an Android SDK recommendation.

## Primary evidence checked

- Apple WWDC26 session, Meet Trust Insights: https://developer.apple.com/videos/play/wwdc2026/379/
  - Framework introduced for iOS 27; Swift client integration requires a declared capability/entitlement and checks user authorization.
  - `requestEvaluation` requires internet reachability and can take a few seconds. Development requests use sandbox; App Store-distributed requests use production models/servers.
  - Device-derived signals (interaction patterns, timing, basic sensor data) are processed locally and not shared, according to Apple's session. Apple says the final result may also include Apple Account signals and velocity checks.
  - `unknown` means no evidence of scam risk, not low risk. The result should complement existing risk logic, not act as the sole decision/blocking factor.
  - `reportConsumption` is required for each evaluation. Missing it may lead to rate limiting. Offline confirmed-fraud labels through Apple Business Register are optional.
- iOS & iPadOS 27 Release Notes: https://developer.apple.com/documentation/ios-ipados-release-notes/ios-ipados-27-release-notes
  - Confirms TrustInsights framework availability through declaring the TrustInsights capability on the app target, plus entitlement and internet connectivity requirements.
- Apple `reportConsumption` API documentation: https://developer.apple.com/documentation/trustinsights/insightevaluation/reportconsumption(_:insightsused:)
  - Search-indexed API text warns failure to report before releasing the evaluation may result in rate limiting or revocation of access.

## Changes and rationale

Added `중급` difficulty, explicitly surfaced capability/entitlement, authorization, network latency, and the device-vs-service processing boundary. Strengthened the distinction between `unknown` and low risk, and stated the mandatory per-evaluation consumption report versus optional offline fraud labels. Added the iOS 27 release-notes source alongside the WWDC session. Kept the card focused on behavioral risk scoring and privacy boundaries rather than treating the API as Android-relevant tooling.

## Confidence and limits

- High confidence: supported by Apple's WWDC session and iOS 27 release notes.
- Privacy details are Apple's description of its own system; they are not an independent security audit.
- No third-party adoption or star claim is made because this is a first-party Apple framework.

## Next cursor

Continue oldest-first with `Flutter 문서 레이아웃 AI: 추론 오프라인과 앱 설치 오프라인은 다르다`; verify supported Flutter/Android platforms and offline model/download boundaries against official docs and the source repository.
