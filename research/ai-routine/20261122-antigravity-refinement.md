# Google Antigravity card refinement — 2026-11-22

## Decision
Replace the launch-news / benchmark inventory with a reusable tool-surface and execution-boundary lesson. The useful distinction is where agents are orchestrated or executed, especially local developer surfaces versus Google-hosted managed agents, plus the separate AI Studio → Android → Antigravity workflow.

## Sources checked
- https://blog.google/innovation-and-ai/technology/developers-tools/google-io-2026-developer-highlights/ — primary I/O announcement (May 19, 2026): desktop Antigravity 2.0, CLI, SDK, Gemini API Managed Agents, Android support in AI Studio, and AI Studio export to Antigravity.
- https://aistudio.google.com/docs/agents — current Managed Agents documentation: Linux sandbox provisioned through API, default unrestricted outbound network, allowlist controls, credential scoping, human review, preview status.
- https://antigravity.google/product/antigravity-2 — current desktop product page: parallel agent orchestration, scheduled tasks, customization, supported desktop platforms.
- https://developers.googleblog.com/an-important-update-transitioning-gemini-cli-to-antigravity-cli/ — primary transition notice, checked to clarify the old card's June 18, 2026 discontinuation claim. The date applies to serving requests for consumer Google AI Pro/Ultra and free Gemini Code Assist for individuals; Gemini CLI access remains unchanged for Code Assist Standard/Enterprise and paid Gemini / Gemini Enterprise Agent Platform API keys.

## Fact checks and corrections
- Removed volatile Gemini 3.5 Flash benchmark scores and cross-product speed comparisons. The current Managed Agents docs now name Gemini 4 Hydrogen for the general-purpose managed agent, so hard-coded model/benchmark claims would age quickly.
- Removed the ambiguous “Gemini CLI consumer access ends” headline. The actual transition is scoped by subscription/authentication path; enterprise licenses and paid API-key usage remain unchanged per the official notice.
- Clarified that Antigravity 2.0 desktop, Antigravity CLI, SDK, and Gemini API Managed Agents are distinct interaction/execution surfaces, not one IDE/API feature.
- Qualified sandbox security: OS-isolated Linux execution does not mean network egress is restricted. The current API docs say outbound network is unrestricted by default and advise allowlists, least-privilege credentials, and reviewing results.
- Confirmed AI Studio native Android app generation and project export to Antigravity from Google's I/O announcement. Keep it as a workflow distinction, not a claim that generated Android apps are production-ready.
- No GitHub star count included because the product itself is not represented by an upstream project repository; official launch and current product documentation are the relevance signals.

## Card updates
- Added intermediate level, concise tool-surface map, Android connection, security guidance, three official sources, and an interview retrieval pair.
- Changed title from model/benchmark keyword inventory to a practical ecosystem-boundary lesson.

Confidence: high; claims anchored in current official Google product, API and developer documentation.
