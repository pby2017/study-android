# Cursor Rules 카드 정리

- 확인일: 2026-11-22 (KST)
- 대상: `Cursor 규칙(.mdc) — 한 덩어리 지침을 '언제 켤지'로 쪼개 토큰 아끼기`
- 판정: 유지·수정. 프로젝트별 AI 지침을 범위와 조건에 따라 적용하는 실무 주제다.

## 확인 자료

- [Cursor Rules 공식 문서](https://cursor.com/docs/rules) — Project Rules는 `.cursor/rules`의 `.mdc` 파일이며, `alwaysApply`, `globs`, `description` 조합으로 Always / Specific Files / Intelligently / Manually 적용 방식을 구성한다. `alwaysApply: true`이면 glob과 description은 무시된다. Team → Project → User 순서로 병합하며 앞선 유형이 충돌 시 우선한다.
- [Cursor AGENTS.md 문서](https://cursor.com/docs/rules#agentsmd) — `AGENTS.md`는 간단한 지침을 위한 별도 대안이며 루트와 하위 디렉터리에서 지원한다.
- 같은 Rules 문서의 파일 참조 설명 — `@file`은 규칙 텍스트에 파일 내용을 인라인하지 않는다. 적용된 에이전트가 필요할 때 도구로 읽는다.

## 변경 근거

- 기존 카드의 `AGENTS.md·CLAUDE.md처럼 모든 세션에 통째로 들어가는` 비교를 제거했다. Cursor 문서는 AGENTS.md를 간단한 대안으로 설명하며, 이전 문구는 다른 도구의 로딩 동작까지 과도하게 일반화했다.
- frontmatter 필드 세 개가 어떻게 상호작용하는지, `@파일` 참조가 언제 내용을 읽는지 추가했다.
- Token 절약을 보장처럼 표현하지 않고, 필요 범위에 맞춘 규칙 스코프가 중복·불필요한 컨텍스트를 줄이는 데 도움이 된다고 한정했다.
- 안전상 중요한 정책은 규칙 텍스트만으로 강제하지 않는다는 실무 경계를 추가했다.
- 난이도 중급, 적용 조건을 말로 설명하는 면접 질문·답변을 추가했다.

## 신뢰도 / 한계

- 규칙 파일 형식과 활성화 조건: 높음(공식 문서 직접 확인).
- 토큰 절감량: 정량 근거가 없어 수치나 보장으로 제시하지 않음.
