# Android `SpeechRecognizer` 기기 내 처리 경계 카드

- 검토 시각: 2026-11-22 03:40 KST
- 검토 대상: 기존 V8V 음성 오케스트레이션 카드의 AI/Android 주장
- 결정: V8V 홍보 카드의 unsupported offline/privacy claim을 제거하고, 재사용 가능한 Android 음성 AI 개인정보 경계 카드로 재구성.

## 검증한 출처와 신호

1. [Android Developers: `SpeechRecognizer` API reference](https://developer.android.com/reference/android/speech/SpeechRecognizer)
   - 기본 구현은 음성 인식을 위해 오디오를 원격 서버로 스트리밍할 가능성이 있다고 명시한다.
   - `isOnDeviceRecognitionAvailable()`와 `createOnDeviceSpeechRecognizer()`는 API 31에 추가됐다. 가용성 확인 없이 on-device factory를 사용하면 실패할 수 있다.
2. [V8V 공식 README](https://github.com/alimomin1998/v8v)
   - README는 Android 엔진을 `android.speech.SpeechRecognizer`로 표기하면서도 전 플랫폼에서 기본적으로 오디오를 업로드하지 않는다고 주장한다.
   - [Android 구현](https://github.com/alimomin1998/v8v/blob/main/core/src/androidMain/kotlin/io/v8v/core/AndroidSpeechEngine.kt)은 실제로 `SpeechRecognizer.createSpeechRecognizer(context)`를 호출하며 on-device factory 또는 가용성 검사를 호출하지 않는다.
   - GitHub API 검토 시점 신호: 1 star / 1 fork, 마지막 push 2026-07-16. 인기도가 낮아 V8V 제품 홍보는 교육 주제로 부적합하지만, 구현이 공식 Android API의 개인정보 주의사항과 어긋나는 사례라 경계 학습 카드로 전환할 가치가 있다.

## 수정 판단

- 기존 카드의 “온디바이스”, “오프라인 우선”, “프라이버시 보장” 표현은 V8V Android 코드가 사용하는 기본 factory로 보장되지 않아 제거했다.
- 특정 라이브러리를 추천하는 대신 API 선택 차이, API 31+ availability gate, 네트워크 차단 검증이라는 Android AI 개발 실무 교훈을 중심으로 작성했다.
- 오프라인 처리가 필수인 제품은 실제 recognizer, 언어 모델 준비 상태, 기기 설정, 네트워크를 포함해 대상 기기에서 확인해야 한다. API 선택만으로 전 조건을 자동 보증한다고 표현하지 않았다.
- 중복 검사: 기존 카드가 V8V 플랫폼/액션 구조 소개였으며, 이 카드는 Android 음성 API의 데이터 경계와 검증 절차를 다룬다. 범용 Android 음성 학습 카드 검색 결과와 직접 중복 없음.
- Confidence: high (API 동작과 V8V factory 호출은 공식 문서·소스 코드로 교차 확인). Star count는 시점별 공개 수치이며 카드 본문에는 넣지 않음.
