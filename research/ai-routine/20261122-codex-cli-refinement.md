# Codex CLI 카드 정제 — 2026-11-22

## 재확인한 공식 출처

- https://github.com/openai/codex — README, 설치·인증 개요, Apache-2.0 라이선스, 실시간 stars 표시.
- https://developers.openai.com/codex/cli — 로컬 저장소 작업, `codex exec` 자동화, 권한 관련 최신 CLI 안내.
- https://developers.openai.com/codex/auth — ChatGPT 로그인과 대체 인증 옵션 안내.

## 변경 근거

- 기존 카드의 2026-06 당시 stars, forks, Rust 비율, 구버전 릴리스 번호는 시간이 지나 현재 상태 설명으로 부적합해 삭제했다. GitHub page의 약 136.1k stars는 날짜가 있는 snapshot으로만 표기했다.
- README는 Codex CLI를 사용자 컴퓨터에서 실행되는 터미널 코딩 에이전트로 설명하고, 설치 옵션으로 standalone shell installer, npm, Homebrew, GitHub Release를 제시한다. 현재 카드에서는 학습 가치가 높은 동작 범위에 집중했다.
- “로컬”은 코드/도구 작업 환경을 설명하지만 그 자체가 로컬 모델/오프라인 추론을 뜻하지 않는다. README의 ChatGPT 로그인/API key 선택지를 함께 제시해 그 구분을 분명히 했다.
- 공식 CLI docs는 인터랙티브 `codex`와 반복 가능한 automation의 `codex exec`를 구분한다. 이 선택 기준을 카드의 중심으로 삼았다.
- IDE·Codex Web 비교표식은 카드에서 덜어내고, 권한/sandbox 설정과 diff·테스트 검토를 운영 교훈으로 남겼다.
- 난이도 중급과 “로컬 실행 ≠ 로컬 추론”을 회상하는 인터뷰 Q/A를 추가했다.

## 적격성 / 중복

OpenAI Codex CLI는 대표 AI 코딩 도구 주제로 적격하다. 기존 카드 정제이며 신규 카드 수는 늘리지 않았다.

## 신뢰도 / 한계

높음. 도구의 실행 장소·인증·자동화 command는 OpenAI 공식 README/docs에서 확인했다. Stars는 변동성이 큰 인기 신호이므로 확인 시각을 기록하고 기능 사실과 분리했다.
