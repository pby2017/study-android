# Flutter DocLayout card consolidation

- Reviewed: 2026-11-22 (Asia/Seoul)
- Card retired: `Flutter 문서 레이아웃 AI: 추론 오프라인과 앱 설치 오프라인은 다르다`
- Merged into: `On-Device AI Model Delivery — APK에서 모델 lifecycle 분리·incremental OTA`
- Decision: keep the transferable AI+Android deployment lesson; remove the low-adoption package-specific card to reduce overlap/card count.

## Evidence checked

- Current upstream repository README: https://github.com/robert008/flutter_doclayout_kit
  - Describes on-device document-layout inference as not requiring internet.
  - Separately asks users to download/register the ONNX model and says iOS/Android native libraries download automatically (Android on first build).
  - Lists 23 document element classes; this count was dropped from the merged card because it is product trivia, not the reusable deployment lesson.
- pub.dev package page: https://pub.dev/packages/flutter_doclayout_kit
  - Current package version shown: 1.0.1; platform metadata lists Android and iOS.
  - Package page showed 1 like and 47 downloads in the captured metadata. No claim is made that this means weekly downloads.
- GitHub repository: https://github.com/robert008/flutter_doclayout_kit
  - Current page showed 1 star and 3 forks; 13 commits were listed. This is a weak popularity signal for a card in a deck prioritizing current, broadly useful, notable topics.

## Consolidation rationale

The core learning (separate model provisioning, native runtime build/install dependencies, and offline inference) overlaps with the existing model-delivery card and other on-device deployment topics. Retained this concrete distinction as one example and a retrieval Q&A in the broader card, added `고급` level, and removed the duplicate standalone card. The published model-delivery card count decreases by one. No inference-time performance or package quality claim is carried over.

## Confidence and limits

- High confidence in package metadata and the upstream README's stated setup/inference claims.
- The package's first-build fetch behavior is recorded as upstream documentation, not reproduced with a clean/offline native build.
- Low popularity is evidence for consolidation under this project's curation bar, not proof that the implementation is technically poor.

## Next cursor

Continue oldest-first with `Locanara Android — minSdk만으로 Gemini Nano 지원을 판단하지 않기`; verify SDK/version/device gating and current API requirements against official Android/Google documentation.
