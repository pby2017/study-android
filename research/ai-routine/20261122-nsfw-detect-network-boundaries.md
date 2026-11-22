# 2026-11-22 23:55 KST — nsfw_detect 카드 최신 API·네트워크 경계 갱신

## Refined card
- Renamed `온디바이스 AI 모더레이션 — 로컬 추론과 네트워크 경계는 다르다` to `Flutter 온디바이스 모더레이션 — 로컬 추론과 네트워크 경계 분리`.
- Rechecked `nsfw_detect` pub.dev listing and linked upstream repository. Current package listing is v2.8.3, published 10 days before this review; repo shows 149 commits. This indicates recent project activity, not broad adoption.
- Corrected permission scope: the package documents selected `pickMedia` / `pickAndScan` as requiring no Android media permission; asset and whole-library scanning require version-specific media permissions; camera scanning requires CAMERA.
- Clarified network boundary: file/bytes inference runs on device; `scanUrl` fetches remote media; optional model downloads are networked. The README lists a ~11 MB default classifier and alternative models around 46–152 MB.
- Preserved the core lesson that local inference does not make every acquisition/model-provisioning path offline, and that NSFW scores are probabilistic moderation signals, not definitive decisions.

## Evidence checked
- pub.dev package page: https://pub.dev/packages/nsfw_detect
  - v2.8.3, publish date 10 days before review, Android API 24 minimum, Flutter/Dart requirements, six pub.dev likes / 1.47k downloads displayed.
  - Native inference path: TFLite on Android; file/bytes local; `scanUrl` is networked; model downloads are explicit or opt-in.
  - Permission table distinguishes picker, library/asset, and camera workflows; moderation scores may produce false positives/negatives.
- Official source repository: https://github.com/nexas105/flutter_nsfw_scaner
  - 3 stars, 2 forks, 149 commits at review; MIT license. README lists 11 MB, 46 MB, and 152 MB model options and documents local inference/no telemetry.

## Decision
- Keep as an AI+Android educational example, not a production recommendation: the API boundaries teach an important mobile privacy/offline design lesson, but the project has low public adoption (3 stars, 2 forks; pub.dev 6 likes) and is maintained by an unverified publisher.
- Confidence: high for documented package behavior; no independent Android runtime/security test performed.

## Verification
- YAML parsed successfully; the card has a valid level, two labeled sources, interview, and answer.
- `ruby -c scripts/auto_post.rb`: passed.
- `ruby scripts/auto_post_test.rb`: 3 runs, 14 assertions, 0 failures/errors.
- `node --test scripts/card-navigation.test.js`: 6/6 passed.
- `git diff --check`: passed.
