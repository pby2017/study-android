# Android CLI + Skills refinement — 2026-11-22

## Decision

Refine the existing AI+Android card rather than create a duplicate. The card had correct conceptual roles but did not show the current CLI surface and overstated “any skills-supporting agent” as uniform behavior. Remove the internal experiment figures from the short card; preserve the caveat in this audit note.

## Verified evidence

- Current Android CLI overview (updated 2026-10-27): describes CLI lifecycle scope including SDK setup, project scaffolding, build/install/run, device/emulator interaction, Compose preview, Journeys, profiling, APK analysis, Crashlytics signals, Android Skills, and Knowledge Base. `android init` sets up the CLI skill. https://developer.android.com/tools/agents/android-cli
- Current command reference (updated 2026-10-25): `android docs` searches/fetches from the official Android Knowledge Base; `android skills` manages skill discovery and installation; the CLI includes `init`, `build`, `create`, `emulator`, `install`, `preview`, `run`, `sdk`, `studio`, `update` and other commands. https://developer.android.com/tools/agents/android-cli/commands
- Skills command reference (updated 2026-10-16): `android skills` supports add/find/list/remove/update; `--agent` targets named agents, and `--project` scopes operations to a project root. https://developer.android.com/tools/agents/android-cli/commands/skills
- Android Skills overview (updated 2026-11-19): skills follow the open Agent Skills standard and are compatible with agents that support it, but skill structure/use can vary by agent/environment. Updating a customized skill with `skills add` overwrites it; rename customized copies to preserve local edits. https://developer.android.com/tools/agents/android-skills
- Android Knowledge Base docs: authoritative source collection includes Android docs, Firebase, Google Developers, and Kotlin docs; search/fetch tools are available through Android CLI. https://developer.android.com/studio/gemini/access-helpful-resources
- Stable/attention signal: Google announced Android CLI 1.0 stable on May 19, 2026 and continued adding capabilities and skills in official updates. Official October update highlights Device Streaming and broader skill catalog. This is an official maintenance/relevance signal, not independent adoption data.
  - https://android-developers.googleblog.com/2026/05/android-cli-stable-1-0-agent-development.html
  - https://android-developers.googleblog.com/2026/10/android-cli-device-streaming-and-skills.html
- The initial 70%+ token reduction and 3x faster result was an internal experiment specifically comparing project/environment setup against standard agent toolsets. It should not be generalized to all Android work, and it was removed from the concise card rather than promoted as a broad guarantee.
  - https://developer.android.com/blog/posts/android-cli-build-android-apps-3x-faster-using-any-agent

## Card changes

- Replaced vague “CLI executes, Knowledge Base fetches current docs” with examples of current supported workflow areas and specific `android docs` role.
- Corrected skill installation lifecycle to `android init` and `android skills` management commands.
- Added the operational scope flags `--agent` and `--project`, plus environment-dependent skill invocation caveat.
- Removed the benchmark statistic from the card to favor durable core learning; documented its precise experiment scope here.

## Confidence

High for documented commands, skill semantics, Knowledge Base sources, and current 1.0 stable status. The exact CLI command catalog may evolve; check the command reference before copying commands into automation.
