# MobileRisk-Live and OS-Sentinel card refinement — 2026-11-22

## Decision

Refined the existing Android GUI-agent safety card. The prior compressed summary blurred two artifacts and stated a broad improvement percentage without the experiment context.

## Evidence checked

- Current arXiv v3 paper (revised 2026-07-26): https://arxiv.org/abs/2510.24411 and https://arxiv.org/html/2510.24411
  - Comments identify ACL 2026 Oral and Best Paper at AIWILD@ICLR 2026.
  - MobileRisk-Live is a dynamic Android-emulator testbed. It records screenshots/accessibility observations, agent actions, and system-state traces such as file operations and permission changes.
  - MobileRisk is the corresponding frozen, reproducible trajectory benchmark: 204 trajectories, evenly split into 102 safe and 102 unsafe examples, with step- and trajectory-level annotations across ten safety categories.
  - OS-Sentinel combines a deterministic Formal Verifier for explicit system-level violations with a VLM-based Contextual Judge for semantic/contextual risks.
  - The abstract reports 10–30% improvements over existing approaches across multiple metrics. This is experiment-specific and should not be presented as a universal deployment or production-safety guarantee.
  - The method depends on access to system-state traces; the paper notes that this is currently accessible on open platforms such as Android and is less directly applicable to closed systems such as iOS.
- Research team project page: https://qiushisun.github.io/OS-Sentinel-Home/
  - Confirms the dynamic/frozen distinction and the 204-case safe/unsafe split.
- Official code repository: https://github.com/OS-Copilot/OS-Sentinel
  - Identifies the code, benchmark, and environment; README setup uses AndroidWorld, Appium, and an external VLM API key for model-backed evaluation.
  - GitHub displayed 51 stars and 4 forks at review time; this is a volatile snapshot, not evidence of effectiveness.

## Card changes

- Added advanced level and an interview question/answer.
- Taught the distinction between live environment and frozen benchmark, then explained why deterministic and contextual detectors complement each other.
- Qualified the 10–30% finding and stated that research results are not a safety guarantee for production apps.

Confidence: high for the paper's description and study scope; deployment performance and safety remain unverified outside the published evaluation.
