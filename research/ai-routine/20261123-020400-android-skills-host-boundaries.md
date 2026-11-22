# Android Skills: host discovery and skill execution boundaries

- Reviewed: 2026-11-23 02:04 KST
- Card: `Android Skills — Android 작업 지침을 에이전트가 필요할 때 불러오기`
- Scope: AI+Android; the lesson is how task-focused context reaches coding agents, not a standalone Android API tutorial.

## Sources checked

1. Android Skills repository, README and live repository page: https://github.com/android/skills
   - Defines the project as AI-optimized modular instructions/resources grounded in Android developer guidance and based on the Agent Skills open standard.
   - README documents `android skills add <skill-name>`, `--all`, host detection, update commands, and the Apache-2.0 license.
   - GitHub page showed 10.7k stars, 702 forks, and 99 commits during this review. These are dated attention/activity signals only, not adoption, quality, or correctness evidence.
2. Android Developers, Android skills overview: https://developer.android.com/tools/agents/android-skills
   - Describes use cases including XML-to-Compose migration, adaptive UI, AGP 9, Navigation 3, edge-to-edge, and R8.
   - Says skills follow Agent Skills, recommends Android CLI, documents `android skills list` and `android skills add`, and explicitly warns that structure/use can differ by agent and environment.
   - Says re-adding an installed skill updates it to the latest version.
   - Page updated 2026-11-19 UTC.
3. Android Studio, extend the agent with skills: https://developer.android.com/studio/gemini/skills
   - Skills are on-demand expertise and the agent loads instructions/resources when relevant.
   - Documents current Android Studio paths `.agents/skills` and `.android-studio/skills`, plus `@skill-name` manual invocation; previous non-standard paths changed in Quail 1+.
   - Page updated 2026-11-05 UTC.
4. Agent Skills specification: https://agentskills.io/specification
   - Requires a skill directory with `SKILL.md`, YAML frontmatter, and `name`/`description`; scripts and references are optional.
   - The format does not itself guarantee that a host discovers, invokes, or executes every skill in the same way.

## Decision and edits

- Kept the card because it teaches a practical AI+Android workflow: package specialized instructions, install them, and verify the host's discovery/invocation behavior.
- Replaced the stale ~5.8k-star headline, old release version, and broad claim that a CLI installs to every detected agent with current host-specific guidance.
- Added intermediate level and a retrieval question about why an installed skill may not be discovered. Added a code-review warning because the standard permits executable scripts.
- Current attention snapshot is recorded here, not embedded as a durable product claim in the card.
- Confidence: high for documented behavior; host support remains implementation-specific and can change by version.
