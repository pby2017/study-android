# GitHub Copilot 클라우드 에이전트 카드 정리

- 확인일: 2026-11-22 (KST)
- 대상: `GitHub Copilot 코딩 에이전트 — 이슈를 던지면 알아서 PR을 올리는 비동기 에이전트`
- 판정: 주제 유지, 제목·설명 수정. 저장소 작업을 위임하고 결과를 검토하는 학습 주제는 유용하지만 기존 카드는 실행환경과 PR 생성 동작을 단정했다.

## 확인 자료

- [GitHub Copilot on GitHub.com and GitHub Mobile](https://docs.github.com/en/copilot/concepts/copilot-surfaces/copilot-on-github) — 현재 Copilot in the cloud 경험은 대화·에이전트 위임·코드 리뷰를 연결한다. 세션은 웹·모바일·앱·IDE·CLI 등 지원 표면에서 시작할 수 있고, 에이전트는 요청한 저장소/브랜치에 대해 별도 개발환경에서 수정 및 테스트·린트를 수행한다. 검토 후 PR을 만들거나 요청에 PR 생성을 포함할 수 있다. 코드가 틀리거나 취약할 수 있으며 세션 로그도 자체 검토·테스트를 대체하지 않는다.
- [About cloud sandboxes for GitHub Copilot](https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/about-cloud-sandboxes) — 실행환경은 Cloud 샌드박스, GitHub Actions 기반 세션, 원격 환경, 또는 별도인 로컬 Copilot 세션으로 구분된다. 지원되는 환경 선택지는 시작 클라이언트와 기능에 따라 다르다.
- 기존 카드가 인용한 옛 “about coding agent” URL은 현재 위 Copilot surfaces 문서로 리다이렉트된다. 따라서 예전의 단일 cloud agent/Actions 설명을 현행 전체 동작인 것처럼 유지하지 않았다.

## 변경 근거

- 제목을 “이슈를 던지면 알아서 PR”에서 “클라우드 에이전트 — 백그라운드 작업을 맡기고 변경을 검토”로 변경했다. PR 생성은 항상 자동이 아니라 요청·진입 흐름에 따라 다르다.
- 기존의 “실행은 GitHub Actions 위에서” 주장을 수정했다. 현행 Copilot in the cloud는 Cloud sandbox와 Actions 기반 환경이 있으며, 클라이언트/기능에 따라 선택이 다르다. 로컬 CLI·앱 세션은 구분했다.
- “사람은 PR만 리뷰하면 된다”를 삭제하고 diff, 테스트, 보안 위험 확인 후 병합하도록 했다. 공식 문서는 생성 결과가 부정확하거나 취약할 수 있다고 경고한다.
- 난이도 중급 및 실행환경·자동 PR 가정을 검증하는 면접 질문/답을 추가했다.

## 신뢰도 / 한계

- 환경 구분과 검토 주의: 높음(현재 GitHub 공식 문서 직접 확인).
- 기능 가용성은 Copilot 플랜, 조직 정책, 저장소 설정, 클라이언트 및 새/기존 Copilot cloud 경험에 따라 달라질 수 있어 카드에서 단일 기본값으로 일반화하지 않았다.
