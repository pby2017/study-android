# 2026-11-22 23:40 KST — AgentStop 카드 근거 정정 및 상세화

## Refined card
- `AgentStop — 로그확률·반복 신호로 로컬 에이전트를 조기 종료하기`
- 기존 카드는 Brave 블로그의 수치(FRAMES 22%, SimpleQA 23%, utility <2%)와 논문 본문이 보고한 trade-off를 섞었고, Jetson AGX Orin에서도 평가 수치를 측정한 것처럼 읽힐 여지가 있었다.
- 논문 수치에 맞춰 FRAMES 22% 절감·1.6% utility 하락, SimpleQA 최대 25%·utility 하락 <5%, SWE-Bench 18~19%·utility 하락 <5%로 정리했다. 결과는 Qwen3-30B-A3B 계열에서 특정 단계/임계값으로 얻은 연구 결과다.
- 기능 설명을 정확히 조정했다: 각 단계의 최저 logprob 10개, 출력 토큰 수, 인접 단계 간 겹침률을 사용하며 에이전트·작업·단계별로 XGBoost 분류기를 학습한다.
- Qwen3-1.7B에서는 성능이 무작위 추측 수준이고 baseline보다 나아지지 않았다는 반례와, 과도한 조기 종료가 성공 실행을 실패로 바꾸어 에너지 낭비를 키울 수 있다는 점을 추가했다.
- 장치 경계를 분명히 했다: 측정은 Apple M1 Max(64 GiB)에서 수행되었고 Jetson AGX Orin은 공개 코드의 테스트 대상이다. Android 휴대전화 측정은 확인되지 않았다. QA는 Brave Search API를 사용한다.

## Evidence checked
- Paper, ACM CAIS '26, arXiv:2605.15206: https://arxiv.org/html/2605.15206
  - §§4.2–4.3: features, XGBoost classifier, per-agent/task/step training.
  - §5.1.1: QA uses Brave Search API; §5.3: experiment measurements on M1 Max with 64 GiB.
  - §7: FRAMES >20% energy-wastage reduction with <5% utility drop; SimpleQA 25% with <5%; SWE-Bench 18–19% with <5%; Qwen3-1.7B does not improve over baselines.
  - §8: threshold calibration is necessary; false-positive early stops can worsen both utility and energy wastage.
  - Artifact appendix: Apple Silicon/Jetson supported; tested most extensively on M1 Max and Jetson AGX Orin; recommends at least 24 GB memory for the 30B models.
- Brave official research post, May 28, 2026: https://brave.com/blog/agentstop/
  - Confirms ACM CAIS 2026 acceptance, method outline, and selected trade-off numbers (including FRAMES 22% / <2% and SWE-Bench ~19% / ~3%). The card uses the paper's conservative summary where the blog and paper state different selected thresholds/trade-offs.
- Official source repository: https://github.com/brave-experiments/AgentStop
  - Live page at review: 18 stars, 0 forks; MIT license; ACM CAIS '26 paper and dataset linked. Requirements include at least 24 GB unified memory for the 30B models; M1 Max and Jetson AGX Orin are tested devices.

## Decision
- Keep as an AI-native research lesson relevant to local-agent developers, not as a high-adoption dependency or Android-ready implementation recommendation.
- Attention signal: ACM CAIS '26 acceptance and official artifact reproducibility badges (Artifact Available, Artifact Functional, Results Reproduced). Popularity is modest (18 stars / 0 forks at review), so no broad-adoption claim.
- Confidence: high for the card's described method, paper claims, and hardware boundary. Generalization to other models/tasks/devices remains unproven.

## Verification
- YAML parsed successfully (980 cards); AgentStop has valid level, interview, and answer fields.
- `ruby -c scripts/auto_post.rb`: passed.
- `ruby scripts/auto_post_test.rb`: 3 runs, 14 assertions, 0 failures/errors.
- `node --test scripts/card-navigation.test.js`: 6/6 passed.
- `git diff --check`: passed.
