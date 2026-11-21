# Google AI Studio Android 배포 카드 검토

- 실행 시각: 2026-11-22 07:30 KST
- 대상: `Google AI Studio Android — 개인 라이브러리·내부 테스트·정식 출시 구분`
- 범위: 개인 라이브러리 자격/검수, 내부 테스트 한도, 프로덕션 배포 경로, Firebase 보안 설정을 공식 정책으로 재검증.

## 확인한 근거

- [Build Android apps in Google AI Studio](https://aistudio.google.com/docs/aistudio-android)
  - 프롬프트에서 Kotlin·Jetpack Compose 앱을 만들고 브라우저 기반 Android emulator로 미리 볼 수 있다.
  - Android 앱은 client-side only이며 서버 런타임은 제공하지 않는다.
  - Firebase 통합은 Firebase AI Logic/App Check, Firestore와 생성된 Security Rules를 지원한다.
  - App Check는 browser preview/USB 설치/테스터 공유 때 debug token을 사용하며, Google Play용 release 빌드에서는 reCAPTCHA Enterprise로 전환한다.
  - AI Studio의 Play 배포 기능은 internal testing track 전용이며 최대 100명; production release는 Play Console에서 처리한다.
- [Create & manage AI-generated personal apps on Google Play](https://support.google.com/googleplay/answer/18936837?hl=en)
  - 개인 라이브러리는 미국 내 위치, 18세 이상 인증된 개인 Google Account, Play Store 53.5+ Android 기기가 필요하다. Workspace·감독 계정은 제외된다.
  - 앱은 개인용·비공개이며 public Play 카탈로그에 표시되지 않고 public Play Store release review를 받지 않는다.
  - 금지 카테고리, 광고 SDK, 고위험 권한 제한 등이 별도 적용된다.
- [Play Console testing tracks](https://support.google.com/googleplay/android-developer/answer/9845334)
  - internal test track의 상한은 앱당 최대 100명이다.
  - internal testing은 빠른 QA 경로이며 production release가 아니다. 공식 지원 문서는 internal test가 표준 Play 정책/보안 검수의 적용 대상이 아닐 수도 있다고 경고한다.
- 기존 카드의 세 갈래 구분은 유효했지만, Firebase 설정을 검토하라는 추상 문장보다 AI Studio가 테스트/출시 빌드에 연결하는 서로 다른 App Check provider 및 생성 Firestore rules 검토를 구체적으로 안내하도록 갱신했다.
- 인기 수치: 본 카드는 변동성 있는 신제품 관심도/성능 주장이 아니라 플랫폼 배포 경계를 설명하므로 GitHub star 수는 카드에 사용하지 않았다.

## 결정

- 기존 카드 업데이트: 승인
- 새 카드 발행: 없음
- 신뢰도: 높음. 핵심 동작은 Google AI Studio와 Google Play 공식 지원 문서에서 상호 확인.
