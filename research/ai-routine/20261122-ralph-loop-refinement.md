# Ralph Wiggum 루프 카드 정리

- 확인일: 2026-11-22 (KST)
- 대상: `Ralph Wiggum 루프 — '멍청하지만 절대 안 멈추는' 에이전트 bash 패턴`
- 판정: 유지·수정. 반복적 AI 코딩 작업의 유용한 패턴이지만, 외부 Bash 루프와 Claude Code 플러그인을 같은 세션/컨텍스트 동작으로 설명하면 안 된다.

## 확인 자료

- [Geoffrey Huntley의 원형 설명](https://ghuntley.com/ralph/) — Ralph를 기법(technique)으로 설명하고 순수 형태 예시를 `while :; do cat PROMPT.md | claude-code; done`으로 제시한다. 한 루프에 하나의 작업을 맡기고 계획·명세 파일을 매번 입력에 포함하는 방식, 테스트·빌드·정적 분석 등 backpressure의 필요성을 설명한다.
- [Anthropic 공식 Claude Plugins Ralph Loop README](https://github.com/anthropics/claude-plugins-official/tree/main/plugins/ralph-loop) — Claude Code의 Stop hook으로 종료를 막고 같은 프롬프트를 현재 세션에서 반복하는 구현을 설명한다. `/ralph-loop`는 `--max-iterations`와 completion promise를 지원하며 README는 반복 상한 사용을 권장한다.
- Huntley의 글은 Claude Code 플러그인 구현을 자신이 설명한 원형과 동일시하지 않는다고 명시한다. 따라서 카드는 “공식 플러그인이 Ralph를 채택했다”는 단순 서술을 제거하고, 구현 차이를 가르치는 데 초점을 뒀다.

## 변경 근거

- 기존의 “매 반복 새 컨텍스트”와 `stateless` 단정은 원형 외부 프로세스형과 동일 세션 Stop hook 플러그인을 혼동할 수 있어 삭제·한정했다.
- Anthropic 플러그인의 Stop hook 동작을 별도 구현으로 설명했다. 현재 소스 확인으로 시점 주장을 증명할 필요가 없으므로 “2025-12 채택” 문구를 제거했다.
- 실패 피드백은 테스트·타입 검사 등의 backpressure에서 얻는다는 점, 반복 상한과 완료 조건의 안전 역할을 추가했다.
- “통과 시 커밋”은 핵심 특성으로 원저에 의해 일반화되지 않아 제거했다.
- 난이도 중급 및 세션 경계와 안전한 반복 조건을 묻는 면접 질문·답을 추가했다.

## 신뢰도 / 한계

- 원형에 대한 설명: 높음(기법 제안자의 직접 설명).
- Claude Code 플러그인 동작: 높음(Anthropic 공식 플러그인 README).
- 반복 실행의 성공률·비용 절감 효과: 정량 주장하지 않음. 결과는 프롬프트, 검증 신호, 작업 정의에 좌우된다.
