# GitHub Copilot 1M context and configurable reasoning: surface and credit limits

Reviewed: 2026-11-22 (KST)

## Sources checked

- Current GitHub Docs, supported AI models and extended capabilities: https://docs.github.com/en/copilot/reference/ai-models/supported-models
- Current GitHub Docs, Copilot CLI model usage: https://docs.github.com/en/copilot/concepts/copilot-surfaces/copilot-cli
- GitHub launch announcement (2026-06-04): https://github.blog/changelog/2026-06-04-larger-context-windows-and-configurable-reasoning-levels-for-github-copilot/
- GitHub cloud-agent reasoning announcement (2026-08-03): https://github.blog/changelog/2026-08-03-customize-the-reasoning-level-for-copilot-cloud-agent/
- GitHub AI Credit billing announcement (2026-06-01): https://github.blog/changelog/2026-06-01-updates-to-github-copilot-billing-and-plans/

## Verified current state

The June 4 launch announcement said both one-million-token context and configurable reasoning were available in VS Code, Copilot CLI, and the then-named GitHub Copilot app, with more surfaces planned. The current supported-model guide is more specific: the 1M context option is currently available in Visual Studio Code and Copilot CLI only; configurable reasoning is available in Visual Studio Code, Copilot CLI, and Copilot cloud agent. Each option is limited to models that support it; the supported-model table changes as models and clients roll out.

The extended-context option lets a user choose default or extended (one million token) context for a compatible model. Reasoning levels control the depth of model reasoning. GitHub recommends regular context and regular reasoning for everyday work, and larger context or higher reasoning only for more complex tasks. Larger context and higher reasoning increase token processing and AI-credit consumption; exact costs vary with selected model and usage, so avoid quoting a universal multiplier.

Cloud-agent reasoning has a separate August 3 announcement, which says the selector is available on paid plans that include Copilot cloud agent. The card avoids a frozen list of plan names or supported models because both are mutable and the current supported-model reference is the appropriate lookup.

## Card revision

Corrected the launch-era claim that 1M context was also available in the Copilot app; current docs limit 1M context to VS Code and CLI. Separated reasoning's broader surface support (including cloud agent), scoped both to compatible models, retained the credit warning, and added the default-first operational recommendation.

## Limitations

Availability is model-, client-, version-, plan-, and rollout-dependent. No live Copilot account was used to test the model picker. Consult the current model table before prescribing a specific model or client workflow.
