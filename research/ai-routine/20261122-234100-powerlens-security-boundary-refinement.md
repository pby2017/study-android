# PowerLens — security boundary and evidence review

Date: 2026-11-22 (KST)

## Decision
Retain as an AI+Android research case study about the gap between an agent's proposed policy and privileged system execution. Do not present it as a production SDK, popular project, or validated general-purpose battery optimization. No public source repository was found by GitHub repository search (`PowerLens Android LLM`: 0 results). The author project page currently says “Under Submission” / “Under Double-Blind Review.”

## Primary-source findings
- The current arXiv record is version 1, submitted 2026-03-20. It describes a Kotlin Android application, API 24+ target, root (`su`) requirement for system parameter control, and 4 sequential Gemini-2.5-Flash API calls per decision cycle.
- The paper says an AccessibilityService serializes the active UI widget hierarchy and state; sensitive text fields are filtered before the accessibility tree is sent to the cloud LLM. The paper itself acknowledges contextual data still leaves the device and that PII filtering only mitigates risk. Therefore, neither “on-device AI” nor “no data leaves the device” is accurate.
- The paper's implementation section says the Executor invokes shell through `Runtime.exec()` and the fourth LLM call generates shell commands. The author project page instead says the Execution Agent checks PDL/device constraints and compiles approved actions to root shell commands by deterministic table lookup, with no LLM at execution. No public code was found to resolve this material privileged-execution discrepancy; report it rather than selecting one account.
- Main benchmark: 48 tasks × 5 profiles = 240 evaluation instances across 7 app categories, but all hardware experiments use one rooted OnePlus ACE 5 (Snapdragon 8 Gen 3, 12 GB) on Android 15 with KernelSU. Author-reported mean results: 38.8% energy saving, 81.7% action accuracy, 0.6% violation rate, 4.3/5 UX. These are not general device/product guarantees.
- The separate in-the-wild user study is 10 participants over 14 days using 8 rooted devices. Do not conflate that study with the single-device main benchmark.
- The author project page lists demo videos and app overview, but no public implementation link was found. The API repository search returned zero matching repositories at review time; this is only a bounded search result, not proof that no code exists anywhere.

## Card changes
- Put the actual data/privilege path in the summary: accessibility tree/device context → cloud Gemini API → PDL check → root system-setting changes.
- Explicitly distinguish PII filtering from offline or no-transfer processing.
- Preserve and clarify the paper/project-page command execution conflict and absence of public code.
- Qualify reported metrics to the single rooted OnePlus ACE 5/Android 15 main benchmark, and label the work as a research prototype/preprint under submission.
- Updated the interview prompt to require verification of data path, root scope, deterministic authorization, rollback, and target-device reproduction before adoption.

## Sources checked
- arXiv HTML preprint (v1): https://arxiv.org/html/2603.19584
- arXiv abstract: https://arxiv.org/abs/2603.19584
- Author project page (status and deterministic execution description): https://anonymous-powerlens.github.io/
- GitHub repository search API query (0 results at review time): https://api.github.com/search/repositories?q=PowerLens%20Android%20LLM

## Confidence and limits
High confidence in what the two primary sources currently state and in the experiment setup reported by the paper. Low confidence in implementation reproducibility and external validity: no source code was found, the primary sources conflict on command generation, and the main benchmark hardware is one rooted model. The author-reported metrics have not been independently reproduced.
