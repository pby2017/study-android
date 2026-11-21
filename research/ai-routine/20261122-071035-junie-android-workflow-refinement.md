# Junie Android workflow card refinement

## Decision

Retained the AI+Android topic, but replaced the dated, overstuffed Junie product overview with a practical Android-agent verification workflow. The prior card mixed launch timing, ACP, debugger, provider, approval-mode, and remote-control claims; those claims were not needed to teach the Android workflow and would require separate volatile fact checks.

## Sources checked

- [Junie: Android development](https://junie.jetbrains.com/docs/android-development-with-junie.html) — current official setup and capability documentation. It specifies Android Studio 2026.1, the Junie IDE plugin, and Junie CLI; documents emulator/device actions, app build/install/launch, Compose Preview rendering, Logcat, crashes, and ANR traces. It separately describes the optional `android-engineer` extension and its skills, QA subagent, and Mobile MCP.
- [Junie IDE plugin](https://junie.jetbrains.com/docs/junie-ide-plugin.html) — official documentation for the IDE integration and approval controls.
- [JetBrains AI Assistant in JetBrains IDEs](https://www.jetbrains.com/help/idea/ai-assistant-in-jetbrains-ides.html) — official IDE documentation corroborating Junie as one of the coding-agent options in JetBrains IDE workflows.

## Popularity / attention signal

Junie is a proprietary JetBrains product, so a public Junie repository star count is not an applicable adoption measure. The card makes no star, market-share, or “most popular” claim. Selection is based on the explicit AI+Android scope and current official Android workflow documentation, not a fabricated popularity signal.

## Card changes

- Focus: connect an AI coding agent to Android build/run, emulator/device, Compose Preview, and diagnostics feedback.
- Distinguish the base IDE-plugin + CLI setup from the optional `android-engineer` extension.
- Add intermediate level and an interview question/answer to match the learning-card format.
- Remove unsupported or unnecessary GA-date, broad BYOK, CI/CD, EARS plan, ACP/debugger-MCP, and remote-control comparisons from this card; those are separate claims, not implied by the Android workflow source.

## Validation

- Source: official JetBrains documentation; checked 2026-11-22.
- Confidence: high for documented capabilities and prerequisites; no popularity conclusion.
- Duplicate check: kept separate from Android Studio BYOA. BYOA teaches the generic ACP-agent integration surface; this card focuses on Junie's Android actions and verification loop.
