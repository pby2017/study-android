# RecGPT-Mobile card refinement: V2 quality-gated inference

## Decision
Keep this AI+mobile topic, but replace the older card's single trigger-score focus with the newer RecGPT-Mobile-V2 report's more transferable engineering lesson: optimize reasoning cost only after a candidate meets task-quality requirements. Do not imply the report is an Android SDK, a generally deployed mobile product, fully offline, or independently reproduced.

## Sources checked (2026-11-22)
- RecGPT-Mobile-V2 technical report, arXiv:2608.24295 (posted 2026-08-25): https://arxiv.org/html/2608.24295
  - Serving estimates complexity/confidence; strong single-intent requests use direct generation, medium requests get more internal computation, and low-confidence/multi-intent/over-budget requests may be escalated to a stronger service (Sections 4.3 and 7).
  - It describes evidence-preserving behavior compression and a quality-gated adaptive reasoning objective.
  - Controlled common-horizon RL table: quality-only A1 = 73.2% Query quality / 3.6% hard failure / 62-token median CoT; A6 (multiplicative reward + rank protection) = 78.6% / 1.6% / 14 tokens. The report calls these percentages/values from its own experimental comparison; these are not external replications or universal Android results.
  - Ungated additive length-penalty A2 has 0 median CoT but only 64.8% Query quality, 10.5% hard failures, and 0.2% explicit-CoT coverage. This is evidence that a short response can be an optimization failure, not a successful reasoning compression.
  - The report separately cautions that end-to-end latency change combines the shorter output policy with model/runtime optimization; the card does not attribute speedups to RL alone.
  - The report includes device-cloud routing; therefore this is not a promise of always-local processing.
- RecGPT-Mobile original SIGIR 2026 paper / DOI: https://doi.org/10.1145/3805712.3808410
  - Confirms the original system was presented as on-device next-query prediction based on Taobao behavior. It reported a one-month online A/B across four scenarios; those older business metrics were removed from the short card to center the newer V2 mechanism.

## Changes
- Updated title and concept to V2 quality-gated adaptive reasoning.
- Added `고급` level.
- Replaced the old entropy/Jaccard trigger-focused narrative with evidence compression, complexity/confidence routing, and quality-before-cost optimization.
- Added controlled A1/A6 figures with their metric names and explicit authors' experiment caveat.
- Preserved the key failure case: a zero-token median from ungated length pressure coincided with worse Query quality and more hard failures.
- Added both the V2 report and original SIGIR paper as labeled sources; clarified that cloud escalation means no offline guarantee.

## Confidence
High on the stated report contents and numerical comparisons; medium on production generalizability because the headline V2 evidence is the authors' controlled report rather than an independent replication.
