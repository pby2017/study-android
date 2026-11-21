# Android AI Sample Catalog 카드 보강

- 실행 시각: 2026-11-22 07:27 KST
- 대상: `Android AI Sample Catalog — 클라우드·온디바이스 예제로 배포 경계 읽기`
- 범위: 기존 AI+Android 카드의 설명 정확도·가독성 개선. 새 후보 추가는 하지 않음.

## 확인한 근거

- Android AI 샘플 카탈로그: https://github.com/android/ai-samples/blob/main/ai-sample-catalog/README.md
  - 개별 생성형 AI 예제를 모은 독립형 학습 앱이다.
  - README는 예제가 단순화된 데모이며 프로덕션용이 아니라고 명시한다.
  - Hybrid Inference 예제는 온디바이스 Gemini Nano/ML Kit와 Firebase AI Logic 클라우드를 함께 보여준다.
- Android 공식 하이브리드 추론 문서: https://developer.android.com/ai/hybrid
  - `PREFER_ON_DEVICE`는 온디바이스 추론을 먼저 시도하고, 모델을 사용할 수 없거나 요청이 지원되지 않으면 클라우드 추론으로 전환한다.
  - 클라우드 호출은 네트워크·비용·데이터 처리 경계를 바꾸므로 명시적인 제품 검토가 필요하다.
- Firebase 공식 App Check 문서: https://firebase.google.com/docs/ai-logic/app-check
  - Firebase AI Logic의 App Check는 실제 앱/변조되지 않은 기기에서 온 요청을 검증한다.
  - Firebase가 2026-11-02부터 모든 프로젝트에 자동 적용했다고 현재 문서에서 확인했다.
  - 로컬 개발은 등록된 debug provider, 출시 앱은 Play Integrity 등 프로덕션 attestation을 설정한다.
- 인기 신호(카드에는 기재하지 않음): GitHub API `repos/android/ai-samples` 응답에서 724 stars, 181 forks, 마지막 push `2026-11-03T11:38:33Z` 확인. 측정 시점의 변동 수치이며 제품 품질 보증으로 해석하지 않음.

## 수정 이유

- 예제 앱의 목적을 “클라우드·온디바이스 예제를 비교”에서 “예제를 직접 실행하며 구현 경계를 학습”으로 더 정확히 표현했다.
- `PREFER_ON_DEVICE` 동작을 클라우드 fallback 조건까지 간결하게 설명했다.
- Firebase App Check 자동 적용과 증명 공급자 선택을 현재 공식 문서에 맞췄다.
- 제품 적용 시 샘플의 데모 성격, 데이터 전송, 비용, 실패 정책을 점검하도록 초점을 좁혔다.
- 오래된 Firebase 프로젝트/API key 제한 및 일부 모델의 Blaze 요금제 세부사항은 해당 예제/백엔드별 조건으로 별도 검증 없이 일반화하지 않도록 카드에서 제외했다.

## 결정

- 기존 카드 업데이트: 승인 (공식 Android/Firebase 문서로 주장을 교차 검증)
- 새 카드 발행: 없음
- 신뢰도: 높음
