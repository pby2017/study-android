# OpenSkills card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- OpenSkills README: https://github.com/numman-ali/openskills
  - Install source skills with `npx openskills install <source>`, regenerate the `AGENTS.md` skill index with `npx openskills sync`, and have an agent load a selected skill with `npx openskills read <name>`.
  - Default project install is `.claude/skills`; `--universal` installs to `.agent/skills`. The project describes support as agents able to read `AGENTS.md` and execute the CLI, not as a native integration with identical invocation semantics everywhere.
  - README explicitly says OpenSkills is not affiliated with Anthropic.
- OpenAI Skills documentation: https://developers.openai.com/plugins/concepts/skills
  - Codex's native skill model uses `SKILL.md` with name, description, instructions, and optional resources. This is distinct from OpenSkills' AGENTS.md-plus-CLI bridge.
- Anthropic Agent Skills engineering article: https://www.anthropic.com/research/equipping-agents-for-the-real-world-with-agent-skills
  - Describes metadata-first progressive disclosure and full instruction loading only when a skill is selected.
- GitHub API live snapshot (2026-11-22): 10,830 stars, 668 forks; latest push 2026-01-18T13:09:50Z.
- GitHub releases API: latest v1.5.0, published 2026-01-17T19:04:07Z.
- npm registry: latest package v1.5.0, published 2026-01-17T19:04:14.965Z, Apache-2.0.

## Changes and rationale

- Narrowed “works across every agent” to its actual prerequisite: the host must read the generated AGENTS.md guidance and execute the OpenSkills CLI. Shared file format does not guarantee native discovery or identical invocation.
- Corrected default and universal install locations; documented install → sync → read command flow.
- Added a host permission boundary: the loader does not validate skill instructions/scripts or grant tool permissions; users must inspect untrusted content and rely on host permissions.
- Updated dated popularity and maintenance evidence; added a note that stars do not establish quality or current maintenance.
- Distinguished this loader from Codex native skills and added intermediate difficulty plus interview retrieval Q/A.

Confidence: high for command behavior, install paths, project disclaimer, official skill concepts, current package/release version, and observed GitHub counts.
