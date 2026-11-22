# Claude Code prompt injection 카드 정제 — 2026-11-22

## 재확인한 공식 문서

- https://code.claude.com/docs/en/security
- https://code.claude.com/docs/en/permissions
- https://code.claude.com/docs/en/cli-reference

## 수정 근거

- 기존 카드는 예전 보안 문서의 기능 서술을 현재도 보장되는 보안 경계처럼 묶어 썼다. 최신 Security 문서에는 현재 인터랙티브 terminal/VS Code 세션의 기본 모드로 Auto mode가 소개되고, Manual 모드와 Auto mode의 동작이 구분되어 있다.
- curl/wget 승인, 미매칭 명령의 fail-closed, command injection detection 등의 주장은 **Manual mode에 한정**해 설명했다. 모든 모드의 공통 보장처럼 쓰지 않았다.
- 최신 페이지는 `WebFetch`에서 대부분 별도 모델 호출이 페이지를 읽고 결과를 전달한다고 설명하지만, 이를 인젝션 차단이나 안전 보증으로 확대하지 않았다.
- 공식 Security 문서는 인터랙티브 세션에서 workspace trust prompt를 설명하며 `-p` 세션에는 해당 prompt가 표시되지 않는다고 명시한다. 이를 headless 자동화의 중요한 차이로 남겼다.
- 기존 카드의 “컨텍스트 인식 분석·입력 새니타이즈가 핵심 보장”은 현재 문서 확인으로 그대로 뒷받침되지 않아 제거했다. 보안은 완전하지 않다는 공식 경고와 untrusted content를 직접 파이프하지 말라는 베스트 프랙티스를 실무 요점으로 유지했다.
- 중급 난이도와 권한 모드/headless 차이를 설명하는 회상형 질문·답을 추가했다.

## 적격성 / 중복

AI coding agent 보안 및 prompt injection 위험 완화에 관한 내용이므로 AI 주제 범위에 적합하다. 일반 Android 개발 주제가 아니다. 기존 제목/내용을 최신 문서에 맞게 대체했으며 신규 중복 카드를 추가하지 않았다.

## 신뢰도 / 한계

높음. 보안 경계와 CLI 실행 의미는 Anthropic Claude Code 공식 문서에서 교차 확인했다. 기능과 기본 모드는 버전·표면·정책에 따라 바뀔 수 있으므로, 운영 환경의 실제 모드 및 설정을 확인해야 한다.
