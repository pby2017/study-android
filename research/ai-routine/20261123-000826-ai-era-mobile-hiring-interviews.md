# AI 시대 개발자 채용·면접 카드 조사

검토일: 2026-11-23 (KST)

## 질문

AI를 적극 사용하는 시대에 모바일·Android 개발자의 채용과 기술 면접은 어떻게 달라지는가? 확인 가능한 일반 개발자 채용 증거와 Android 면접에 적용할 조언을 구분한다.

## 검증한 근거

### 개발자 노동 수요: 같은 결론처럼 보이는 숫자도 측정 대상이 다르다

1. **MIT / Microsoft Research, working paper (2026-11-06)** — [AI-Assisted Programming and Labor Demand](https://economics.mit.edu/sites/default/files/2026-11/AILaborDemand_06Nov2026.pdf)
   - GitHub Enterprise 고객 5,414개 다국적 기업의 Copilot 도입 자료와 Revelio Labs 고용 기록을 연결했다. 사전 예정된 GitHub 계약 검토 시점을 이용한 자연실험 / staggered difference-in-differences 설계다.
   - 도입 유도 기업에서 1년 뒤 분기별 기술직 채용이 29% 감소했다. 퇴사, 전체 기술직 인원, 공석 기간에는 효과가 관찰되지 않았고, 채용 둔화는 코딩 비중이 높은 주니어 기술직에 집중됐다.
   - 한계: 이 수치는 특정 표본에서의 분기별 기술직 신규 채용 효과다. 전체 개발자 고용이 29% 감소했다는 뜻이 아니며, 분석 기간은 2021-01~2025-06이고 Copilot enterprise rollout 이전·초기 중심이다. Android 직군의 별도 효과는 측정하지 않았다.

2. **Stanford Digital Economy Lab, working paper (2026-11-05 개정)** — [How Does AI Change Labor Demand? Evidence from 41 Countries](https://digitaleconomy.stanford.edu/publication/how-does-ai-change-labor-demand/)
   - 41개국의 12.5억 job posting 및 1억5,400만 employment record를 사용한다. 기업의 AI 채택은 생성형 AI 관련 채용공고로 정의했고, 데이터는 2021-01~2026-03까지다.
   - AI 채택 다국적 기업의 주니어 인력 비중은 비교 기업보다 2026-03에 1.9%p 낮았다. 이는 주로 시니어 고용 증가(+6.7%)에서 비롯됐다. 주니어 고용 -2.5% 추정치는 통계적으로 유의하지 않았으며, 전체 고용 +3.3%는 marginally significant였다.
   - 한계: Copilot 도입 자체가 아니라 채용공고 기반 AI 채택 지표이고, 관측 단위는 다국적 기업의 외국 계열사다. 저자들도 디지털 노동시장에 연결된 기업에 대한 결과로 한정한다. 주니어 비중 감소를 주니어 절대 고용 감소와 동일시하지 않는다.

3. **Contemporary Economic Policy, peer-reviewed article (2026-04-22 first published)** — [Firms' GitHub Copilot adoption and labor market outcomes for software engineers](https://doi.org/10.1111/coep.70035)
   - LinkedIn/GitHub 독점 자료에서 Copilot 도입은 SWE의 월별 채용 확률 3~5% 증가와 연관됐고, entry-level 채용이 이를 이끌었다. 신규 채용자는 비프로그래밍 기술을 약 5% 더 보였으며 코딩 기술 감소는 관찰되지 않았다.
   - 한계: 초록이 보고하는 것은 “associated with”라는 연관성이다. 독점 자료는 공개 재현이 불가능하고 Android 채용만 분리하지 않는다. 인과 효과로 읽지 않는다.

**종합:** 연구는 Copilot 도입·AI 채택의 정의, 모집단, 기간, 지표(분기 채용·고용 구성·월별 채용 확률)와 식별 방법이 달라 방향이 일치하지 않는다. 그러므로 “AI가 개발자 일자리를 없앤다” 또는 “AI가 개발자 채용을 늘린다”라는 단일 결론은 과장이다. 다만 주니어 비중과 코딩 중심 역할이 압박받을 수 있다는 신호는 면접 준비에서 검증, 시스템 설계, 디버깅, 협업을 실제 사례로 설명할 이유가 된다. 이 근거만으로 한국 또는 Android 채용 추세를 정량화할 수는 없다.

### AI 지원 기술 면접: 정책은 통일되지 않았고 검증이 중요한 신호다

**CoderPad State of Tech Hiring 2026** — [설문 보고서](https://coderpad.io/survey-reports/coderpad-state-of-tech-hiring-2026/)

- 약 650명의 글로벌 개발자·기술직 종사자 및 채용 담당자/리더를 합친 설문이다. 기술 평가 플랫폼 회사가 수행한 업계 설문이며, 무작위 대표 표본이나 Android 전용 조사라고 보고하지 않는다.
- 채용 담당자/리더가 답한 면접 중 AI 정책: 전면 금지 34%, 제약 허용 29%, 광범위 허용 17%, 사례별 판단 20%. **정책이 통일되지 않았으므로 지원자는 먼저 허용 범위를 물어야 한다.**
- AI를 허용하는 조직이 기술 역량 신호로 꼽은 것: AI 실수 포착·수정 66%, trade-off와 정확성 설명 56%, 출력 반복 개선 28%, edge case·실패 처리 28%, 보안·개인정보 고려 25%.
- 평가 형태의 job relevance 응답에서 개발자의 56%, 채용 담당자의 60%가 기술 토론을 선택했고, 라이브 코딩은 각각 43%, 60%였다. 알고리즘 문제도 테스트에 여전히 포함된다고 답한 채용 담당자가 43%였으므로 “알고리즘 면접이 사라졌다”고 말할 근거는 없다.
- Android 면접 적용은 조사 결과 그 자체가 아니라 실무적 추론이다. AI 사용을 허용받았다면 생성된 Kotlin/Compose 코드에 대해 lifecycle, Coroutine 취소·동시성, 권한, API/기기 호환성, 오류·보안 경계를 검토하고 테스트한 결과와 대안을 말한다. 허용되지 않으면 사용하지 않는다.

## 채택한 카드

1. **AI 도입과 개발자 채용 — 채용 건수·주니어 비중·연구 설계를 구분하기** (`고급`, `ai`)
   - 세 연구의 수치를 구분하고, 통계적으로 유의하지 않은 결과와 관찰 연관성, 표본 한계를 같이 기록했다.
   - 인터뷰 복기 질문은 서로 다른 방향의 연구를 표본·측정·설계 차이로 비교하게 한다.
2. **AI 허용 기술 면접 — Android 개발자는 생성보다 검증 과정을 보여주기** (`중급`, `ai`)
   - AI 허용 비율과 평가 신호를 출처 및 표본 범위와 함께 제시했다.
   - Android 예시는 설문 데이터인 것처럼 제시하지 않고, 보편적인 적용 전략으로 명시했다.

## 범위 밖으로 남긴 것

- 이 조사에는 Android·모바일 직군만의 채용률, 한국 시장의 표본 대표성, 회사별 실제 면접 정책 데이터가 없다. 이 카드에서 그런 트렌드를 주장하지 않는다.
- 특정 회사 채용 공고 한 건은 추세 증거로 세지 않았다.
- 연구별 Github star 수는 노동시장 연구의 타당성·유용성을 대변하지 않으므로 주목도 검증 항목으로 사용하지 않았다. 2026년 발행 시점, peer-reviewed 저널 또는 MIT/Stanford working paper, CoderPad의 표본 설명을 관련성·근거 신호로 사용했다.

## 검증 결과

- MIT PDF abstract와 sample/method section, Stanford 연구 요약 및 PDF의 표본·효과 크기, Wiley 논문 초록 및 발행일, CoderPad 설문 원문을 상호 대조했다.
- 보고된 효과 단위(채용 흐름 대 고용 구성)를 카드에 분리했다. non-significant 결과와 관찰 연관성은 인과 효과로 서술하지 않았다.
- 두 카드 모두 기존 AI·Android·interview·employment 키워드 중복 검색에서 일치하는 주제를 찾지 못했다.
- 카드 데이터 검증 및 프로젝트 테스트는 커밋 전에 실행한다.

