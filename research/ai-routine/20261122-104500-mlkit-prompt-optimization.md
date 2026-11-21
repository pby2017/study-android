# ML Kit prompt optimization — 2026-11-22

## Decision

Refine the card to preserve the useful Android AI pattern while removing launch-era phrasing that makes APO sound like the only prompt optimizer flow. Current Google Cloud docs describe several optimization methods, including a Gemini Nano-specific target.

## Verified facts

- ML Kit GenAI APIs use Android AICore for on-device Gemini Nano inference. Current Android docs describe local processing and supported-device constraints; device performance and model availability still matter.
- Google Cloud Prompt Optimizer currently documents three strategies: zero-shot (refine a prompt/instruction without examples), few-shot (use examples with model responses and feedback), and data-driven (batch evaluation on labeled examples and selected metrics).
- Zero-shot optimizer docs include `OPTIMIZATION_TARGET_GEMINI_NANO` / `gemini_nano` mode for prompts intended for smaller models such as Gemini Nano and Gemma 3n E4B.
- The optimizer operates through Google Cloud/Agent Platform SDK. The current docs say the Prompt Optimizer service is generally available, while the SDK library is experimental and can change.
- Android runtime inference and cloud prompt optimization are separate phases. Sending examples to the optimizer is cloud-side processing; do not imply those supplied examples remain on-device. The card directs readers to review their data handling policy.
- Google's January 2026 Android blog reported specific internal evaluation results: topic classification +5%, intent classification +8%, webpage translation BLEU +8.57%. These are task-specific reported outcomes, not guaranteed results or independent evaluations; omitted from the compact card to avoid unrepresentative numbers.

## Sources checked (official)

- Android Developers, [Gemini Nano and ML Kit GenAI](https://developer.android.com/ai/gemini-nano)
- Google Cloud Docs, [Prompt Optimizer overview](https://docs.cloud.google.com/gemini-enterprise-agent-platform/models/prompts/prompt-optimizer) (updated 2026-11-20)
- Google Cloud Docs, [Zero-shot optimizer and Gemini Nano mode](https://docs.cloud.google.com/gemini-enterprise-agent-platform/models/prompts/zero-shot-optimizer) (updated 2026-11-20)
- Google Cloud Docs, [Few-shot optimizer](https://docs.cloud.google.com/gemini-enterprise-agent-platform/models/prompts/few-shot-optimizer)
- Android Developers Blog, [APO for ML Kit Prompt API](https://developer.android.com/blog/posts/how-automated-prompt-optimization-unlocks-quality-gains-for-ml-kit-s-gen-ai-prompt-api)

## Relevance and practical value

The topic is directly about tuning an Android on-device GenAI integration and maps to current official APIs. It is not a GitHub-star topic; primary-source adoption/availability is the relevant signal. Main practical lesson: optimize prompts in cloud during development, validate them against held-out examples, then run the selected instructions with on-device inference on supported devices.

## Card changes

Replaced the narrow three-step launch description with current optimizer modes; explicitly separated cloud optimization and local inference; added data governance, holdout validation, and SDK maturity caveat. Confidence: high for API behavior and documentation status; medium for the usefulness of any resulting prompt, which requires task-specific evaluation.
