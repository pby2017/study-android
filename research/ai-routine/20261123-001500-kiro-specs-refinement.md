# Kiro Specs — 최신 워크플로와 credit 비용 검증

검토일: 2026-11-23 (KST)

## 핵심 결론

기존 카드의 기본적인 spec → task 구조는 여전히 맞지만, `Quick Plan`은 현재 공식 문서 명칭과 일치하지 않는다. 현행 문서는 **Quick Spec**으로 부르며, requirements·design·tasks를 한 번에 만들고 단계별 approval gate를 거치지 않는다. 카드에 `중급` 및 retrieval Q&A를 추가하고, Quick Spec과 단계별 검토가 가능한 표준 workflow의 선택 기준을 강조했다.

## 현재 공식 문서

- [Specs](https://kiro.dev/docs/specs/) 페이지는 2026-11-12에 갱신됐다.
  - Feature Specs: Requirements-First 또는 Design-First. 공통 산출물은 `requirements.md`, `design.md`, `tasks.md`.
  - Bugfix Specs: `bugfix.md`에서 현 상태·기대 상태·유지할 동작을 기술하고, design/task 단계에서 원인·수정·회귀 방지를 다룬다.
  - Run all tasks는 dependency graph를 만들고 dependency가 없는 task를 같은 wave에서 동시 실행한다. Wave 자체는 순차 실행한다.
  - 공식 capability table에는 Feature Specs, Bugfix Specs, Quick Spec, parallel execution이 IDE·CLI·Web·Mobile에 제공된다고 표시된다. Mobile spec view에서는 `requirements.md`, `design.md`, `tasks.md`를 볼 수 있으며, Bugfix의 `bugfix.md`는 Web 또는 agent session에서 본다고 안내한다.
- [Quick Spec](https://kiro.dev/docs/specs/quick-spec/): 잘 이해된 기능과 빠른 프로토타입에 적합하다. 요구를 먼저 묻고 한 번의 pass에서 산출물과 실행 가능한 task list로 가며, 단계별 승인 없이 넘어간다. 미지의 요구/설계에 iteration이 필요하거나 검토 gate가 중요한 경우 표준 Feature Spec이 더 적합하다.
- [Bugfix Specs](https://kiro.dev/docs/specs/bugfix-specs/): root cause analysis, fix design, regression prevention을 구조화한다.
- [Pricing](https://kiro.dev/pricing/): 현 페이지는 Kiro Free가 월 50 credits라고 안내한다. Spec refinement/task execution을 포함한 모든 prompt 작업은 credit을 소비하며, 단순 요청은 1 credit 미만일 수 있고 복잡한 spec task는 더 들 수 있다. 유료 paid plan의 모델·크레딧·추가 요금은 수시 변동하므로 카드에는 Free 월 allowance만 기재하고, 가격 세부사항은 pricing source를 보도록 했다.

## 카드 수정

- 제목을 제품 기능 목록보다 학습 목표에 가까운 “요구사항·설계·작업을 검토 가능한 단계로 나누기”로 정리했다.
- `Quick Plan` 표현을 제거하고 현재 용어 `Quick Spec`을 사용한다.
- Quick Spec을 항상 빠른/좋은 기본값으로 제시하지 않고, 작고 분명한 작업과 요구 불명확·회귀 위험 작업을 나눠 선택하게 한다.
- 오해를 줄이기 위해 dependency wave는 wave 안에서만 병렬이며 wave 간 실행은 순차라는 점을 정확히 기록한다.
- 현재 platform reach와 pricing은 source links 및 audit에 넣었다. 카드에는 날짜 민감성이 높은 유료 요금 숫자를 복사하지 않는다.
- topic은 Kiro 공식 제품 문서와 기능에 해당하므로 의미 있는 GitHub star 지표가 없다. 독립 저장소의 star를 제품 인기도로 오용하지 않았다.

## 결정 / 한계

- Keep/refine — 명확한 요구사항·task decomposition·검토 경계라는 학습 포인트가 현재에도 유효하다.
- 공식 문서는 Kiro 제품 주체를 제공하지만, 이 카드는 상업 제품 이용자 수나 Android-specific adoption을 주장하지 않는다.
- 채택된 상용 계획, 실시간 credit 가격 및 각 모델별 credit multiplier는 바뀔 수 있으므로 링크된 pricing/model 문서를 확인해야 한다.

