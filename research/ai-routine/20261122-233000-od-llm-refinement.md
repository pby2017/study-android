# OD-LLM card refinement

## Decision
Keep the card as an advanced AI/edge-model-compression concept. Clarify the method and narrow experimental claims to the original paper's evidence.

## Sources checked (2026-11-22)
- Full paper, arXiv:2601.09306: https://arxiv.org/html/2601.09306
  - The work fine-tunes LC-Rec's LLaMA-7B for sequential next-item recommendation.
  - Method order: token covariance normalization, SVD low-rank factorization, then progressive layer-wise weight updates based on changed activations.
  - Evaluation uses Instruments, Games, and Arts benchmark datasets. The paper evaluates 50% compression ratios for weight matrices and reports performance similar to or sometimes above uncompressed LC-Rec on those benchmarks.
  - Experimental settings state the method was run on one NVIDIA A40 GPU. This describes the reported experiment compute environment, not a smartphone deployment test.
  - Inference comparison measures batches of ten prompts on generic GPU and CPU environments; device model is not specified. Avoid converting these numbers into Android latency claims.
- WSDM 2026 DOI: https://doi.org/10.1145/3773966.3777961 — confirms conference publication.

## Changes
- Added `고급` level.
- Made the compression pipeline explicit and explained the roles of normalization and layer-wise correction.
- Clarified that 50% compression results are benchmark-specific and not an Android phone result.
- Scoped the NVIDIA A40 claim to the experiment setup; did not imply that every result/device run was on an A40 phone or that production on-device deployment was demonstrated.
- Added labeled arXiv and WSDM DOI sources; revised interview retrieval question to ask why the method uses normalization plus progressive correction.

## Confidence
High for method and reported benchmark/setup details (primary paper); no evidence from this paper alone establishes Android handset deployment, power use, or phone latency.
