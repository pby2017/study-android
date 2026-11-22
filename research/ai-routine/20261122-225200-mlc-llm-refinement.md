# MLC LLM Android card refinement — 2026-11-22

## Decision

Keep and refine the advanced AI+Android card. The project is actively changing and has substantial developer attention. The learning point is not simply “GPU support exists”: model compilation, native runtime assets, weights, memory, and driver behavior make actual Android devices part of validation.

## Primary sources checked

- Current Android deployment guide: https://github.com/mlc-ai/mlc-llm/blob/main/docs/deploy/android.rst — `mlc_llm package` compiles each configured model and builds runtime/tokenizer artifacts; weights can be downloaded or bundled; the guide says the demo cannot run in an emulator for meaningful mobile-GPU acceleration and requires a physical phone. It retains an Adreno `_1` weight-layout first-prefill system-UI freeze warning (~20–50 seconds) and recommends `_0` as a workaround.
- Android issue behind the warning: https://github.com/mlc-ai/mlc-llm/issues/3363 — closed after a workaround discussion. The current docs still retain the warning; card describes a documented issue/workaround, not an untriaged open bug.
- Current support matrix: https://github.com/mlc-ai/mlc-llm/blob/main/README.md — lists Android OpenCL on Adreno and Mali. The table is a platform claim; it does not prove every model/driver combination works equally.
- GitHub API, checked 2026-11-22: https://api.github.com/repos/mlc-ai/mlc-llm — 23,477 stars, 2,199 forks, Apache-2.0, not archived; latest push `2026-11-21T11:46:42Z`, HEAD `ca6274826acd` (“[Conversation] Match Gemma 4 large text chat templates (#3605)”). Latest source activity is recent, but no star-growth rate is claimed from this snapshot.
- Repository releases API: https://api.github.com/repos/mlc-ai/mlc-llm/releases?per_page=1 — newest GitHub release record returned `v0.1.dev0` from 2023, despite active source commits. Avoid treating main-branch support as a versioned stable release; validate the exact revision and build tooling used.
- Historical Android architecture overview: https://blog.mlc.ai/2023/05/08/bringing-hardware-accelerated-language-models-to-android-devices — explains OpenCL kernels for Adreno and Java/TVM4J integration; current deployment guide is used for build steps instead.

## Card change

- Added `고급` level and retrieval around physical-device and first-prefill validation.
- Replaced the general “compile each model and test” wording with documented package outputs: model binary, runtime/tokenizer, downloaded or bundled weights.
- Preserved Adreno/Mali OpenCL support but clarified that the support matrix does not guarantee uniform compatibility.
- Added the current guide's Adreno `_1` layout first-prefill freeze warning and documented `_0` workaround; recorded that upstream issue #3363 is closed.

## Attention / confidence

23,477 stars/2,199 forks plus a repository push the day before review is a strong attention and freshness signal. Confidence is high for docs, repo metadata, and the documented warning; actual performance and stability remain device/model-specific and were not benchmarked in this run.
