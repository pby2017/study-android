# Card refinement: React Native ExecuTorch + RAG

- Reviewed: 2026-11-22 02:10 KST
- Card: `React Native ExecuTorch + RAG — 모바일 앱에 로컬 임베딩·검색·생성을 연결하기`
- Decision: Refined; AI+mobile developer workflow, modular RAG plus on-device model inference.

## Sources checked

- [React Native RAG + ExecuTorch integration README](https://github.com/software-mansion-labs/react-native-rag/blob/main/packages/executorch/README.md) — current documented model APIs, first-load downloads/cache, platform backend selection, runtime requirements, and hook example.
- [React Native RAG repository](https://github.com/software-mansion-labs/react-native-rag) — components, hook/class/direct integration options, SQLite persistence plugin, and current project activity. Repository page displayed 351 stars at review; this is a volatile snapshot and not a quality claim.
- [React Native ExecuTorch repository](https://github.com/software-mansion/react-native-executorch) — runtime scope and available models/backends.
- [Expo: How to run AI models with React Native ExecuTorch](https://expo.dev/blog/how-to-run-ai-models-with-react-native-executorch) — original card's practical demo context; retained as historical background, not as proof of current models or requirements.

## Corrections

- Removed stale Llama 3.2 1B / ALL_MPNET_BASE_V2 model names. Current integration examples document LFM2_5_1_2B and ALL_MINILM_L6_V2.
- Corrected platform mapping: Android Vulkan; iOS Core ML or MLX; XNNPACK as universal fallback (and iOS simulator option). Core ML is not an Android backend.
- Replaced absolute "fully offline / data never leaves device / cloud cost $0" claims. Models download on first load and are cached; app networking and telemetry/data paths must be separately checked.
- Added integration prerequisites: RN 0.83+ or Expo SDK 55+ development build, New Architecture, iOS 17+ and Android 13+ for documented integration; Expo Go unsupported.
- Clarified the sample MemoryVectorStore is in-memory and persistence needs an appropriate persistent store such as the documented SQLite plugin.
- Added an interview question about validating the real data/network boundary instead of assuming local inference guarantees privacy.

## Validation

- Primary integration documentation and repository checked on review date.
- Card YAML parsing, project card tests, and site build are recorded after execution in the run result; no popularity value is used in the card.
