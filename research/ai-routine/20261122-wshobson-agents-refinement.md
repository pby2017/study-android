# wshobson/agents card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- Project README: https://github.com/wshobson/agents
  - README lists 93 plugins (91 local plus 2 external entries), 199 local source agents, 185 skills, and 103 commands.
  - Current supported tools: Claude Code, Codex CLI, Cursor, OpenCode, Antigravity CLI, GitHub Copilot, and Pi.
  - Shared Markdown source is adapted per harness; model aliases, tool permissions, command forms, and capabilities vary. The capability matrix says Codex's native marketplace route exposes source skills, while generated TOML agents and command-derived skills need a separate route. Codex also applies an 8 KB skill-body cap.
  - MIT license.
- Capability matrix: https://github.com/wshobson/agents/blob/main/docs/harnesses.md
- Android design skill: https://github.com/wshobson/agents/blob/main/plugins/ui-design/skills/mobile-android-design/SKILL.md
  - Explicitly targets Material Design 3 and Jetpack Compose; describes adaptive layouts and accessibility as use cases.
- GitHub API snapshot checked live 2026-11-22: 42,781 stars, 4,521 forks; latest push 2026-11-21T18:59:37Z. Stars indicate attention only, not reliability or quality.

## Changes and rationale

- Updated stale inventory counts (84/192/156) and the six-harness list; current README lists seven tools and newer catalog counts.
- Removed the unsupported claim of difficulty-based model routing. The repo describes per-harness mapping of model aliases, not task complexity routing.
- Corrected “same setup everywhere”: adapters translate component formats and permissions, and the capability matrix documents losses/limits. Codex's native marketplace and generated-agent setup are distinct.
- Made the Android connection concrete with the repository's Compose-focused `mobile-android-design` skill, while cautioning that third-party guidance still needs official-doc and test review.
- Added an intermediate label, dated popularity evidence, and an interview question about cross-harness portability boundaries.

Confidence: high for README counts, supported-harness list, install distinctions, and the existence/scope of the Android skill; medium for quality and ecosystem adoption beyond the observed GitHub attention metric.
