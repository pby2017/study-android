# Android CLI + Skills 카드 검토

- 실행 시각: 2026-11-22 07:29 KST
- 대상: `Android CLI + Skills — 에이전트에 실행 도구·절차·최신 문서를 결합`
- 범위: 기존 AI+Android 카드의 CLI·Skills·Knowledge Base 역할 구분과 업데이트 안전성 검토.

## 확인한 근거

- [Android CLI 개요](https://developer.android.com/tools/agents/android-cli): CLI는 Android SDK 설정, 프로젝트 생성, 빌드·테스트·기기 실행, UI 검사, 프로파일링 등을 위한 도구이며 에이전트와 스크립트 모두에서 사용할 수 있다. `android init`은 `android-cli` Skill을 탐지된 agent skill 디렉터리에 설치한다.
- [Android CLI 명령 참조](https://developer.android.com/tools/agents/android-cli/commands): `android docs`는 Android Knowledge Base 문서를 검색하고, `android skills`는 skill을 설치·제거·목록·검색한다.
- [android skills 상세](https://developer.android.com/tools/agents/android-cli/commands/skills): `--agent`는 적용할 agent를 제한하고 `--project`는 사용자 전역 대신 특정 프로젝트에 적용한다. `skills add`는 이미 설치된 Skill을 최신 버전으로 갱신한다.
- [Android Skills 개요](https://developer.android.com/tools/agents/android-skills): Skills는 Agent Skills 오픈 표준을 따르는 AI 최적화 지침이며, 프로젝트별로 탐지·호출되는 방식은 에이전트와 개발 환경마다 다를 수 있다.
- [Android Studio Skills 사용 안내](https://developer.android.com/studio/gemini/skills): 사용자가 Skill을 수정했다면 이름을 바꾸지 않으면 CLI 업데이트 시 덮어써질 수 있다고 안내한다.
- [android docs 상세](https://developer.android.com/tools/agents/android-cli/commands/docs): `search`가 Android 문서의 `kb://` 주소를 반환하고, `fetch`가 해당 Markdown 본문을 가져오는 2단계 흐름이다.
- 관심 신호(카드에 미표기): GitHub API `repos/android/skills`에서 10,690 stars, 700 forks, 마지막 push `2026-11-17T04:05:08Z`. 측정 시점 스냅샷이며 품질 보증으로 보지 않는다.

## 수정 이유

- 구 버전 카드의 "사용자 수정을 보존" 문구는 공식 안내와 반대였다. 갱신이 사용자 수정 내용을 덮어쓸 수 있으므로 맞춤 Skill은 고유 이름을 사용하도록 바로잡았다.
- 기본 `android-cli` Skill 초기화(`android init`), 추가 Skill 관리(`android skills`), 공식 문서 탐색(`android docs search`/`fetch`)의 책임을 분리했다.
- CLI를 agent-first라 부르더라도 실제로 에이전트 전용은 아니며 스크립트 자동화에도 쓰인다는 점이 개요 문서에 있어, 요약에서 적용 주체를 에이전트·스크립트로 함께 표현했다.
- `--agent`·`--project` 옵션의 범위 제한은 공식 skills 문서로 검증했다.

## 결정

- 기존 카드 업데이트: 승인 (공식 Android 문서 교차 확인)
- 새 카드 발행: 없음
- 신뢰도: 높음
