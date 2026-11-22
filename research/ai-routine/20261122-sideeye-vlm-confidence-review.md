# 2026-11-22 23:48 KST — SideEye VLM confidence and parser-failure review

## Refined card
- `VLM 분류의 확신도 — 생성된 라벨을 확률처럼 쓰지 않기`
- Rechecked the current `main` branch of `baseweight/SideEye`, especially `ImageAnalyzer.kt` and the repository README.
- Confirmed that the prompt requests `Category: [number]`, `parseResponse` maps recognized categories to a boolean/category pair, and `analyze` writes `1.0f` for a flag or `0.0f` otherwise. This value is the application's binary decision, not a model probability.
- Added a more important failure mode: missing category text and unsupported category numbers return `(false, null)`, which the app treats as not flagged. This is a fail-open parser policy for a moderation feature.
- Reframed as a code-review lesson, not a library endorsement. The current public repository has 1 star, 0 forks, 18 commits, last pushed 2026-02-27, and GitHub API reports no declared SPDX license. README says Android 9+/API 28, Qualcomm NPU required for Smart Scan, and OmniNeural-4B download is about 2.4 GB.

## Evidence checked
- Current source: https://github.com/baseweight/SideEye/blob/main/app/src/main/java/ai/baseweight/sideeye/data/ai/ImageAnalyzer.kt
  - The prompt requests a single `Category: [number]` output.
  - Lines around the parsing and result construction show categories 1–4 become flags, unrecognized or unparsable responses become `Pair(false, null)`, and `primaryConfidence` is set to `1.0f`/`0f` from that boolean.
- Current README: https://github.com/baseweight/SideEye
  - Requires a Qualcomm NPU for Smart Scan, Android 9+/API 28, and downloads OmniNeural-4B (~2.4 GB).
- Same-run GitHub API response: `stargazers_count=1`, `forks_count=0`, `pushed_at=2026-02-27T04:25:32Z`, `archived=false`, `license=null`.

## Decision
- Keep as an AI+Android source-code review case because it demonstrates two reusable engineering lessons: hard labels are not calibrated confidence, and parser errors must not silently become safe outcomes.
- Do not recommend SideEye as a dependency; current adoption/activity is low and its hardware/model requirements are restrictive.
- Confidence: high for the code-path observation. This is a static source review; runtime classification quality and real-device failure behavior were not tested.

## Verification
- YAML parsed successfully; the VLM card has an advanced level, two labeled sources, interview, and answer.
- `ruby -c scripts/auto_post.rb`: passed.
- `ruby scripts/auto_post_test.rb`: 3 runs, 14 assertions, 0 failures/errors.
- `node --test scripts/card-navigation.test.js`: 6/6 passed.
- `git diff --check`: passed.
