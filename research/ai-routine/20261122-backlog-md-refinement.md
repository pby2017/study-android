# Backlog.md 카드 정리

- 확인일: 2026-11-22 (KST)
- 대상: `Backlog.md — 깃 레포를 사람·AI 공용 칸반 보드로 바꾸는 마크다운 태스크 매니저`
- 판정: 유지·수정. 로컬 Git 작업 기록과 AI 위임·검토 흐름을 연결하는 실용 주제다. GitHub 저장소 페이지에서 약 7.5k stars를 확인했다(확인 시점 스냅샷이며 품질 보증은 아님).

## 확인 자료

- [Backlog.md README](https://github.com/MrLesk/Backlog.md#readme) — Git 저장소의 Markdown 작업, CLI/터미널 Kanban/로컬 웹 UI, MIT 라이선스 및 macOS/Linux/Windows 지원을 안내한다. 원격 Git 연동은 선택 가능하다.
- 같은 README의 초기 설정 — AI 연결 방식은 CLI instructions(권장), MCP connector(선택), Skip(연결하지 않음) 중 선택한다. 이전 카드의 “MCP가 워크플로 지침을 자동 주입한다”는 요약은 정확하지 않아 교체했다.
- 같은 README의 AI 작업 흐름 — 태스크·수용 기준 검토, 구현 계획 검토, 코드/테스트 검토의 사람 확인 지점을 제시한다. 제품이 상태 정합성이나 결과 정확성을 대신 보장한다고 해석하지 않는다.
- [GitHub 저장소](https://github.com/MrLesk/Backlog.md) — MIT 라이선스 및 2026-11-22 확인 시 약 7.5k stars.

## 변경 근거

- “서버 없이”는 기본 구조를 설명하되, MCP 선택 설정과 로컬 웹 UI를 혼동하지 않게 로컬 우선 및 원격 Git 선택 가능으로 명확히 했다.
- CLI 지침이 권장이고 MCP는 선택이며, AI 기능을 전혀 설정하지 않는 선택지도 있음을 반영했다.
- 자동으로 에이전트가 To Do→In Progress→Done을 관리한다는 과장을 제거하고, AI 지원은 실제 사람의 task/plan/code 검토 체크포인트를 따라 사용해야 한다고 수정했다.
- 난이도 중급과 MCP 필수 여부·사람의 검토 책임에 관한 면접 회수 질문/답을 추가했다.

## 신뢰도 / 한계

- 제품의 데이터 저장·설정 선택지·권장 작업 흐름: 높음(프로젝트 공식 README 직접 확인).
- 별 수는 변동 가능한 관심도 스냅샷이며 도입 적합성·코드 품질을 입증하지 않는다.
