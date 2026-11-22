# MNN-AECS — result scope and upstream implementation check

Date: 2026-11-22 (KST)

## Decision
Keep as an advanced AI+Android card about decode-phase CPU affinity, hardware/OS dependence, and the difference between a paper prototype and an upstream feature. MNN is a highly popular inference engine (same-run GitHub API snapshot: 16,593 stars, 2,545 forks, `master` pushed 2026-11-20); those metrics describe MNN, not adoption of AECS. The specific MNN-AECS design is documented as arXiv v1 (2025-06-24); no separate upstream AECS package was found.

## Paper facts checked
- MNN-AECS targets the memory-bound autoregressive decode phase. It searches core-binding plans on Android and thread counts on iOS, then reuses the selected configuration. The paper describes a one-time tuning step before service and distinct prefill/decode selections. It claims this engine-level approach does not need root or OS modifications.
- The aggregate headline is 23% lower energy versus original MNN averaged across 5 Android + 2 iOS devices and 4 datasets, with no aggregate slowdown. Do not convert that aggregate into a per-device guarantee.
- Per-device results in the paper: approximately 10–42% lower energy; Meizu 21 is about 10% because its OS does not reduce CPU-cluster frequency while idle, limiting the expected benefit. In dataset experiments, Mate 40 Pro and V30 Pro decode speed is 1% and 7% slower respectively; the other five devices are 1–20% faster. A separate prompt/decode-length experiment reports 6% slowdown on V30 Pro, while the dataset result reaches 7%; card wording uses the dataset-specific result.
- MNN's public `master` at review commit `da16b74d958314eaa81419b177427811e3b3a145` has generic user-configurable CPU IDs and affinity binding (`CPUBackend.cpp`, `CPURuntime.cpp`), as well as existing power modes. A shallow sparse checkout covered all `source/` plus `transformers/` and the Android MnnLlmChat native/JVM source paths (8,614 tracked paths in selected tree); search found no AECS/autotuning implementation there. This supports the narrower claim that current checked upstream has affinity primitives but not the paper's per-device AECS search and phase-separated tuning. It does not prove no external fork exists.

## Card changes
- Reframed the title around the lesson that core selection alone cannot guarantee energy savings.
- Explained decode-only core affinity, one-time device tuning, and separate prefill/decode selections.
- Distinguished core affinity from frequency control and connected the Meizu result to the OS's idle-cluster governor behavior.
- Labeled the headline as author-reported aggregate; included Huawei slowdowns and per-device caveat.
- Clarified that MNN upstream does support manual CPU IDs/affinity, but the checked source does not include AECS's automatic search and split-phase tuning.
- Added pinned upstream source links so the runtime evidence can be reviewed at the commit checked.

## Sources
- arXiv paper HTML, v1: https://arxiv.org/html/2506.19884
- MNN `CPUBackend.cpp` at checked commit: https://github.com/alibaba/MNN/blob/da16b74d958314eaa81419b177427811e3b3a145/source/backend/cpu/CPUBackend.cpp
- MNN `CPURuntime.cpp` at checked commit: https://github.com/alibaba/MNN/blob/da16b74d958314eaa81419b177427811e3b3a145/source/backend/cpu/CPURuntime.cpp
- Same-run MNN GitHub metadata: https://api.github.com/repos/alibaba/MNN

## Confidence and limits
High confidence in the paper's stated aggregate/per-device results and the inspected MNN source behavior. These are author-reported measurements, not independently reproduced. Upstream search was bounded to CPU/runtime, transformer, and Android MnnLlmChat source paths; it cannot rule out a private or external fork. MNN's stars do not measure interest in AECS itself.
