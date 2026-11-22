# Pydantic AI 카드 정리

- 확인일: 2026-11-22 (KST)
- 대상: `Pydantic AI — 'FastAPI 느낌'으로 타입 안전하게 짜는 모델-비종속 에이전트 프레임워크`
- 판정: 유지·수정. Python에서 타입을 활용해 에이전트의 입력·도구·출력을 구성하는 실용적 AI 개발 프레임워크이며, GitHub 페이지에서 약 21.3k stars를 확인했다(확인 시점 스냅샷, 품질 지표로 간주하지 않음).

## 확인 자료와 사실관계

- [Pydantic AI 공식 Output 문서](https://ai.pydantic.dev/output/) — 출력은 텍스트·구조화 데이터·이미지·함수 결과일 수 있다. 사용자 정의 `output_validator`에서 `ModelRetry`를 발생시키면 재요청할 수 있고, output retry budget 기본값은 1이며 agent/run/tool 단위로 조절 가능하다.
- [Pydantic AI 공식 개요](https://ai.pydantic.dev/) — 다수 모델·제공자, typed output/dependency injection/tools, OpenTelemetry 계측을 안내한다. “모델 비종속”은 지원 폭을 말하며, 모든 모델 기능이 완전히 동일하다는 뜻은 아니다.
- [GitHub 저장소](https://github.com/pydantic/pydantic-ai) — MIT 라이선스, 확인 시점 표시 약 21.3k stars.

## 변경 근거

- 기존 카드의 “스키마에 맞지 않으면 자동 재요청”은 일반 동작처럼 과장되어 있었다. validator에서 `ModelRetry`를 발생시키는 명시적 재시도 경로와 제한된 retry budget으로 정확히 표현했다.
- “컴파일 타임 가까이”라는 표현도 제거했다. 타입 힌트와 검증은 실제로 실행되는 코드 경계에서 유용하지만, 모델의 의미적 정답이나 컴파일 타임 안전성을 보증하지 않는다.
- `BaseModel` 기반 구조화 출력과 모델·제공자 선택의 효용을 남기고, 모든 제공자가 동일하게 동작한다는 인상을 피했다.
- 난이도 중급, 자동 재시도에 대한 오해를 점검하는 면접 질문·답을 추가했다.

## 신뢰도 / 한계

- output validator와 재시도 의미: 높음(공식 문서 직접 확인).
- 모델 지원 목록과 GitHub stars는 변동 가능하며 기능 동등성의 증거가 아님.
