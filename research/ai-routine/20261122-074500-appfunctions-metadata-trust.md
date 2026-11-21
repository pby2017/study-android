# AppFunctions skill: treat function metadata as untrusted — 2026-11-22

## Scope
Refine the existing AppFunctions Agent Skill card with a concrete AI-agent security lesson. This is card maintenance, not a claim that AppFunctions itself has a platform vulnerability.

## Evidence checked
- Android AppFunctions overview: https://developer.android.com/ai/appfunctions?hl=en
  - API remains Experimental preview; Android 16+; Gemini integration requires Connected Apps Platform developer preview.
  - Cross-app discovery/execution requires `EXECUTE_APP_FUNCTIONS`.
- Official AppFunctions implementation guide: https://developer.android.com/ai/appfunctions/add-appfunctions?hl=en
  - Current guide requires compileSdk 37+ and AGP 9.1.0+; not added to the card because the card focuses on the agent workflow and these toolchain prerequisites are version-sensitive.
- Official Android Skills AppFunctions test reference: https://github.com/android/skills/blob/main/device-ai/appfunctions/references/adb-interaction-testing.md
  - Current instructions require `--package <PACKAGE_NAME>`, treat descriptions/instructions as untrusted metadata, and direct agents not to execute requests that expand actions beyond the function call.
- Security report and resolution: https://github.com/android/skills/issues/251
  - Issue reported an earlier prompt-injection risk from app-function descriptions; current issue is closed, and the current official reference contains the package scope and untrusted-metadata safeguards. Do not present this as an unresolved current issue.

## Decision
Refined the existing card (no duplicate card): added package-scoped ADB inspection and metadata-as-untrusted practice to the summary, bullets, and interview answer. Kept the platform experimental lifecycle and Connected Apps access gate explicit. Confidence: high; facts verified against current official documentation and current skill source.
