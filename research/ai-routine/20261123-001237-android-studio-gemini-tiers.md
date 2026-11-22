# Android Studio Gemini 요금제·데이터 경계 카드 갱신

검토 시각: 2026-11-23 00:12 KST

## 발견한 문제와 결정

기존 `Gemini in Android Studio — Compose·Gradle·크래시 분석까지 읽는 Android 전용 AI 코딩 동료` 카드는 기능 목록을 길게 나열했지만, 시간이 지나면 바뀌는 티어·모델·데이터 정책은 대략적인 “무료 + .aiexclude”로만 요약했다. 현재 Agent Mode와 Android Studio BYOA 카드가 Android IDE의 작업·도구 흐름을 상세히 설명하므로, 기존 카드를 새 기능 목록으로 키우면 중복된다.

카드를 **`Android Studio Gemini — 무료·API 키·Enterprise의 비용과 데이터 경계`**로 재구성했다. 핵심 학습 목표는 사용 전 계정 tier에 맞는 비용, context 크기, 입력 코드의 학습 사용, opt-in context sharing을 구분하는 것이다. Agent Mode의 구현·기기 검증 자체는 관련 카드에 남긴다.

## 공식 문서 확인

- [About AI in Android Studio](https://developer.android.com/studio/gemini/overview), last updated 2026-11-20 UTC: Android Studio는 선택한 AI coding agent를 IDE 안에서 쓸 수 있다고 설명한다. Gemini-based agent는 개인/Business tier로 제공된다. AI 사용은 최신 stable channel 및 그 이전 10개월 내 major version으로 한정한다.
- [Choose a tier](https://developer.android.com/studio/gemini/feature-comparison), last updated 2026-11-05 UTC:
  - 개인 Free tier는 제한된 한도와 context, 개인 Gemini API key는 더 높은 한도와 token당 과금, Google One AI Pro/Ultra는 확장 context와 높은 한도를 제시한다.
  - 이 표는 Agent Mode, Android UI 생성/변환, Gradle 오류 및 Logcat/App Quality Insights 연동 등을 individual tier 전반에 제공한다고 한다.
  - Business tier는 Gemini Enterprise 구독 또는 Google Developer Program membership 경로가 있고, 중앙 관리·data residency/security·consolidated billing 기능이 더해진다.
- [Data and privacy](https://developer.android.com/studio/gemini/data-and-privacy), last updated 2026-11-20 UTC:
  - code context 공유는 기본 꺼져 있다. 활성화하면 선택한 설정과 `.aiexclude` 경계에 따라 프로젝트 코드 일부가 전송될 수 있다.
  - Free edition에서 chat에 명시적으로 입력한 코드와 opt-in context는 조건에 따라 제품 개선/학습에 사용될 수 있다.
  - 개인 API key, Google One, Enterprise에서는 코드 입력과 opt-in context가 Gemini 학습/제품 개선에 사용되지 않는다고 안내한다. 제품 이용 조건에 따라 적용되는 개인정보 고지가 다를 수 있다.
- [Add your own Gemini API key](https://developer.android.com/studio/gemini/add-api-key), last updated 2026-11-05 UTC: personal key는 Free tier의 설정이며, 더 큰 context·후속 모델 선택을 제공하고 Google AI Studio의 token usage/limit에서 사용량을 확인한다. 사용량은 별도 비용이 생긴다.

## 카드 결정과 표현 경계

- 이전의 Android 기능 목록은 요금제별 상호 비교, 유료 API key 과금, 학습 정책의 범위를 전달하지 못해 제거했다.
- 카드에 입력 코드 학습 정책과 code-context sharing을 각각 남겼다. 직접 프롬프트에 넣는 코드와 IDE가 context로 전달하는 코드가 동일한 설정이라는 오해를 피한다.
- API key는 무료 tier에서 선택 가능하지만, 호출은 토큰별 유료다. “API key가 있으면 무료”라고 쓰지 않는다.
- Google One의 구체 가격·개별 quota 수치는 지역/상품 업데이트에 따라 바뀔 수 있으므로 숫자를 복사하지 않았다.
- `Android Studio Agent Mode` 카드와 중복되지 않도록 기기 조작, diff 검토, 빌드 검증 절차는 이 카드에 다시 싣지 않았다.
- Android Studio의 AI는 선택한 agent를 받을 수 있지만 이 카드의 policy facts는 공식 Gemini tier에 한정한다. 제3자 모델·BYOA가 같은 data terms를 공유한다고 일반화하지 않는다.

## 채택 신호와 검증 범위

공식 Android Developers 문서의 현재 내용과 업데이트 날짜를 제품 채택/기능 근거로 사용했다. 이 주제는 Android Studio 제품 기능이므로 관련 GitHub 저장소 star 수를 사용자 채택의 지표로 삼을 수 없다. Android Studio 자체의 사용률이나 실제 developer uptake는 이 문서로 증명되지 않는다.

카드는 `중급`으로 두고 무료 tier와 API key의 비용·데이터 차이를 묻는 retrieval interview를 추가했다. 기존 AI category의 같은 Gemini 개요 카드 하나를 갱신했으며, 별도 카드를 더해 수를 늘리지는 않았다.

