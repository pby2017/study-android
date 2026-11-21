# AppFunctions Agent Skill card review

- Date: 2026-11-22 KST
- Candidate: existing Android 17 AppFunctions Agent Skill card; refined and retitled to avoid implying Android-17-only availability.
- Scope: AI+Android system integration and AI-assisted implementation workflow.

## Official evidence checked

1. Current [AppFunctions overview](https://developer.android.com/ai/appfunctions?hl=en), last updated 2026-11-16 UTC:
   - AppFunctions is a platform API plus Jetpack library; available on Android 16+ devices.
   - It exposes app-selected functions to the OS registry for authorized callers. Other apps need privileged `EXECUTE_APP_FUNCTIONS`; Android grants it only to authorized system assistants.
   - API is explicitly marked Experimental preview.
   - AppFunctions skill helps discovery, Kotlin implementation, KDoc refinement, ADB testing/debugging.
   - Gemini requires registration/submission through the Connected Apps Platform developer preview; unpublished versions are limited to listed testers and submitted bundle version.
2. Current [AppFunctions skill page](https://developer.android.com/agents/skills/device-ai/appfunctions/skill), last updated 2026-11-16 UTC:
   - Four-step lifecycle: discovery, implementation/configuration, KDoc refinement, testing/debugging.
   - Current listed prerequisites: targetSdk 36+, compileSdk 37+, and the Jetpack library/processor.
   - Security constraint: expose only safe, non-destructive actions already offered by the app UI; avoid broad access to user data/resources.
   - The current API migration guidance says `@AppFunction` is no longer an annotation in the newer service-entry-point architecture. Removed the old annotation shorthand from the card.
3. [Connected Apps guide](https://developer.android.com/ai/appfunctions/create-manage-connected-apps?hl=en): separate developer-preview access, app linking, metadata, AAB submission, tester lists, and Play production workflow required for Gemini integration.

## Attention / value

- Official Google AI/Android developer skill and current Android developer documentation provide the adoption signal. No GitHub stars cited; exact repo stars were unnecessary and not checked.
- High practical value: it connects app capability design, structured function metadata, agent invocation and on-device testing. Kept as a focused card; distinct from Android NPU access and generic Android Agent Mode content.

## Corrections

- Replaced “Android 17” exclusivity with Android 16+ API availability; retained the Android intelligence-system framing only as context.
- Separated AppFunctions API Experimental preview from the separate Connected Apps Platform developer preview for Gemini integration.
- Corrected overly broad implication that any agent/app can call functions: external app callers require privileged permission.
- Reframed skill as development aid, not a one-click auto-publisher; included four workflow stages.
- Removed stale `@AppFunction` annotation claim; current migration docs say newer API architecture uses `@AppFunctionServiceEntryPoint`.
- Added least-privilege recommendation from skill's explicit security constraints.
- Confidence: high on availability/access boundaries and the two distinct preview gates; medium on exact dependency versions because they change and were deliberately omitted from this evergreen card.
