# Memory Bank 카드 정리

- 확인일: 2026-11-22 (KST)
- 대상: `Memory Bank — 세션이 바뀌어도 프로젝트 맥락을 잃지 않게 하는 마크다운 메모리 패턴`
- 판정: 유지·수정. AI 코딩 에이전트의 세션 간 맥락 유지에 직접 적용되는 주제이며, Roo Code용 저장소가 GitHub에서 약 1.7k stars로 주목 신호도 확인된다(표시값은 확인 시점 스냅샷).

## 확인한 자료

- [Roo Code Memory Bank README](https://github.com/GreatScottyMac/roo-code-memory-bank#readme) — Roo 모드별 사용자 지침을 설정한 뒤 Architect/Code mode에서 저장소를 초기화한다. 핵심 파일은 `activeContext.md`, `decisionLog.md`, `productContext.md`, `progress.md` 네 가지다. `projectBrief.md`와 `systemPatterns.md`는 선택 항목으로 설명한다. 저장소의 `memory-bank/` 파일이 모든 에이전트에서 자동 로딩된다는 뜻은 아니다.
- [GitHub repository page](https://github.com/GreatScottyMac/roo-code-memory-bank) — 2026-11-22 확인 시 약 1.7k stars, Apache-2.0 표시. 별 수는 변동하는 관심도 지표이며 품질 보증으로 쓰지 않았다.
- [Context Portal MCP](https://github.com/GreatScottyMac/context-portal) — README는 별도 프로젝트인 MCP 서버와 DB 기반 프로젝트 지식 그래프/RAG로 설명한다. 마크다운 파일 패턴과 혼동하지 않도록 카드의 보조 비교 근거로만 참고했다.

## 변경 근거

- 기존의 “다섯 개 코어 파일”은 README의 구조 설명과 달랐다. 네 파일을 핵심으로 고치고 `projectBrief.md`, `systemPatterns.md`를 선택 파일로 분리했다.
- 기존의 “매 세션 먼저 읽는다”, “여러 에이전트 제품이 같은 방식으로 쓴다”는 일반화는 Roo 구현 README만으로 뒷받침되지 않아 제거했다.
- 중심 학습 포인트를 **저장과 로딩은 다른 문제**로 명확히 했다. 메모리 파일은 지속 저장소일 뿐이며, 각 호스트의 지침·도구가 읽기와 갱신을 수행해야 한다.
- 수준은 중급으로 분류하고, 인터뷰 회수 질문은 자동 로딩의 조건을 설명하도록 구성했다.

## 신뢰도 / 한계

- 파일 구성과 Roo 설정 방식: 높음(프로젝트 README 직접 확인).
- 다른 에이전트 제품과의 공통 지원 여부: 이 자료만으로 주장하지 않음.
- 관심도: GitHub 화면의 반올림된 약 1.7k 표시값이며 고정 수치가 아님.
