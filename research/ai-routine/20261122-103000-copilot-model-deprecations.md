# Copilot model deprecation operations — 2026-11-22

## Decision

Refresh the existing card. Its June examples are obsolete and do not teach readers to check current exceptions and model-policy availability. Keep the durable operational lesson and use a fresh, completed November example.

## Verified current facts

- GitHub deprecated Claude Opus 4.8, Claude Opus 5, and GPT-5.6 Terra across most Copilot experiences on November 16, 2026.
- Exception: Opus 4.8 remains available to individual Copilot subscribers on annual plans. Opus 5 was removed from the model picker but remains available as a runtime refusal fallback under existing authorized access.
- Suggested alternatives: Opus 5.5 for Opus models; GPT-6.1 Sol or GPT-6 Luna for GPT-5.6 Terra.
- For Business/Enterprise, alternatives are automatically enabled under default model enablement unless the global default is off or a model was explicitly disabled. In other cases an administrator may need to enable the policy.
- Upcoming notices can have distinct dates and plan exceptions. For example, GitHub scheduled Claude Fable 5, Haiku 4.5, Gemini 3.8 Flash, Gemini 4 Argon, Grok 4.6, and Kimi K3 deprecations for December 14; Haiku 4.5 has an annual-individual-plan exception and the Kimi K3 replacement was still to be announced. The card avoids turning into an unstable calendar.

## Sources checked (official)

- GitHub Changelog, [Models deprecated November 16](https://github.blog/changelog/2026-11-16-github-copilot-models-deprecated-on-november-16-2026/)
- GitHub Changelog, [Upcoming mid-November deprecations](https://github.blog/changelog/2026-10-15-upcoming-deprecation-of-selected-github-copilot-models-in-mid-november/)
- GitHub Changelog, [Upcoming December deprecations](https://github.blog/changelog/2026-11-13-upcoming-deprecation-of-selected-github-copilot-models-in-december/)
- GitHub Changelog, [Upcoming MAI-Code-1.1-Flash deprecation](https://github.blog/changelog/2026-11-17-upcoming-deprecation-of-mai-code-1-1-flash-in-december/)
- GitHub Docs, [Supported AI models](https://docs.github.com/en/copilot/reference/ai-models/supported-models)

## Attention and practical value

The official changelog contains repeated model deprecation notices, including multiple releases in November and December. This is direct evidence that model selection is a changing operational dependency. It matters to teams with automated agent workflows, saved prompts, and model allowlists. No star metric is applicable.

## Card changes

Replace old June examples with a November example that includes the annual-plan exception and org policy nuance. Keep the workflow principle general: centralize pinned model identifiers, monitor vendor notices, verify replacement availability in the actual account/client, then run representative regression prompts and compare quality/cost.

Confidence: high for lifecycle details (official changelog); medium for the general operational advice, which is engineering guidance derived from repeated changes.
