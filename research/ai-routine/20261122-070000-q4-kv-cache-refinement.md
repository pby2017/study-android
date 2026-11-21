# Persistent Q4 KV cache for multi-agent inference — 2026-11-22

## Decision

Refined the existing Q4 KV-cache card into a carefully bounded AI inference case study. The paper's title refers to edge devices, but the linked implementation is explicitly Apple Silicon/macOS + MLX. No Android runtime implementation or Android-device result was found, so the card now states this limitation instead of implying Android applicability.

## Primary evidence checked

- Paper abstract and full text: https://arxiv.org/abs/2603.04428 and https://arxiv.org/html/2603.04428
  - Submitted 2026-02-17; proposes persisting per-agent KV caches in 4-bit form, with direct restoration instead of recomputing the full prompt prefill.
  - Paper reports 4K-context Gemma 3 12B restoration at 577ms warm versus 15.7s re-prefill. These are the paper's specified hardware/workload results, not general latency guarantees.
  - Evaluation covers Gemma 3 12B, DeepSeek-Coder-V2-Lite 16B, and Llama 3.1 8B; quality impact is measured as perplexity changes, not a universal model-quality metric.
- Implementation README: https://github.com/yshk-mxim/agent-memory
  - Requires Apple Silicon (M1/M2/M3/M4), macOS 13+, and MLX; repository says it is Apple Silicon only.
  - GitHub page displayed 18 stars and 0 forks at review time. This is a small, volatile attention signal and not independent validation.

## Changes and caveats

- Removed the old contradictory claim that paper results imply Android/mobile-device capability.
- Changed the title/summary to teach KV-cache persistence and its use in multi-agent inference.
- Scoped timing to one reported configuration; retained no broad speedup or agent-capacity guarantee.
- Added advanced level and an interview Q&A on compute saved, storage/quantization tradeoffs, and Android portability limits.

Confidence: high for the paper/repository scope and quoted setup-specific result; low for portability beyond the tested Apple Silicon/MLX implementation.
