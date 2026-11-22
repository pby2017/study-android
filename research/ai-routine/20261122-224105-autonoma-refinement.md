# Autonoma card refinement — 2026-11-22

## Decision

Refine the existing card and keep it as an AI+Android code-reading lesson. Do not present Android Appium support as a shipped product capability. The repository has a substantial mobile engine implementation, but its own package README calls it a library and says no workflow currently builds or deploys the mobile worker. The product README frames the supported PR loop around a real browser and web preview environments. This gap is useful for developers to learn to distinguish code presence from a usable product path.

## Sources checked

- Project README: https://github.com/Autonoma-AI/autonoma — current page describes a web-app PR testing loop, real-browser execution, natural-language test cases, screenshots/video, suspected code, and the repository's web and mobile package layout.
- Mobile engine README: https://github.com/Autonoma-AI/autonoma/blob/main/packages/engine-mobile/README.md — says `@autonoma/engine-mobile` uses Appium/WebdriverIO for Android/iOS; requires an Appium server plus emulator or device; calls itself a library, not a deployable, and says no workflow currently builds or deploys `apps/workers/mobile`.
- Android emulator configurator: https://github.com/Autonoma-AI/autonoma/blob/main/packages/engine-mobile/src/platform/android-emulator-configurator.ts — source shows concrete Android install/activate and emulator/device operations. Code existence does not demonstrate a currently released or hosted product capability.
- License: https://github.com/Autonoma-AI/autonoma/blob/main/LICENSE.md — BSL 1.1; production use is permitted under the Additional Use Grant unless offering a commercial product/service charging for the work or derivative; change license is Apache 2.0 on March 23, 2028.
- Older documentation page: https://github.com/Autonoma-AI/docs/blob/main/what-is-autonoma.mdx — claims broad Android/mobile support, but does not establish that the current repository deploys the mobile worker. Treated as weaker than the current product README and implementation-specific package README.

## Attention / freshness snapshot

GitHub API checked during this run (2026-11-22): 253 stars, 65 forks, not archived, 1,887 commits, latest push 2026-09-04T20:17:01Z (latest commit `7abab17ce734`, “sync: update marker”). This is a meaningful but not exceptional attention signal; it does not prove current momentum. No exact star/fork count is added to the public card because the figures age quickly.

## Card change

- Added level `중급` and a retrieval question that tests the distinction between a code package and a deployed capability.
- Kept the useful PR/web AI-test workflow, but explicitly separated that flow from the Appium Android/iOS package.
- Replaced the ambiguous claim that Android mobile is documented with the package README's concrete deployment caveat.
- Preserved a short license warning without expanding the card into legal advice.

## Verification / confidence

Confidence: high for repository contents, architecture, license text, and the API snapshot; medium for whether the vendor offers separate mobile capability outside this public codebase. No claim is made about that unverified external product state.
