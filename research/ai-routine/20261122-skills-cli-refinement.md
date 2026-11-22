# skills.sh / npx skills 카드 정제 — 2026-11-22

## 확인한 1차 출처

- https://github.com/vercel-labs/skills — README, GitHub 저장소의 라이선스·스타 수, 지원 에이전트 및 Node 요구사항.
- https://github.com/vercel-labs/skills/blob/main/docs/commands.md — CLI 명령, 입력 소스, 설치 스코프, 심볼릭 링크/복사 동작.
- https://skills.sh/ — 공개 스킬 디렉터리 및 사용량 기반 목록.

## 검증된 사실과 선택

- GitHub UI는 이 확인 시점에 약 40.4k stars와 MIT 라이선스를 표시했다. 카드에는 변동 가능한 수치임을 명시해 인기도 신호로만 썼다.
- README는 OpenCode, Claude Code, Codex, Cursor 및 75개 이상의 에이전트 지원을 명시하며 Node.js 22.20 이상을 요구한다.
- `npx skills add`에서 프로젝트 범위가 기본이며 `-g`가 사용자 전역 범위다. 기본 설치는 심볼릭 링크이고 `--copy`를 선택할 수 있다. `find`, `list`, `check`, `update`, `remove`, `init`도 문서에 있다.
- 지원 소스는 GitHub·GitLab 등의 저장소 및 로컬 경로를 포함한다.
- 카드의 기존 제목/요약에 있던 약 22.6k stars와 70+는 갱신했고, “도구 비종속 공유”가 호스트별 스킬 발견/호출 방식까지 동일하다는 오해를 줄 수 있어 삭제했다. CLI는 파일 배치/관리를 지원하지만 각 agent의 runtime 동등성이나 스킬의 안전성은 보장하지 않는다.
- 실무 요점을 “인기 있는 스킬 설치 도구”에 그치지 않게 프로젝트/전역 범위, 링크/복사, 사전 지침·명령 검토로 재구성했다. 중급 난이도와 설치/호스트 차이를 묻는 회상형 질문을 추가했다.

## 중복/적격성 검토

AI 에이전트용 스킬 발견·설치 CLI이며 저장소 자체도 인기와 실제 개발 도구 활용 신호가 있어 AI 주제에 해당한다. 순수 Android 주제가 아니므로 범위에 적합하다.

## 신뢰도 / 한계

- CLI 동작과 요구사항: 높음(프로젝트 README/명령 문서).
- 별 수: 중간(매우 동적인 GitHub UI snapshot이며 품질이나 안전성 신호로 해석하지 않음).
- 기술 버전/에이전트 지원 목록은 바뀔 수 있으므로 재사용 시 공식 문서 재확인 필요.
