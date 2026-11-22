# Agent Skills — format portability and host behavior

Date: 2026-11-23 (Asia/Seoul)

## Decision

Keep the older Agent Skills concept card, but remove the “one skill works everywhere” implication and unsupported “dozens of adopters” wording. Make the learning objective the boundary between an open file format and each host's discovery, invocation, context, and permission behavior.

## Evidence checked

- Agent Skills specification: <https://agentskills.io/specification>
  - A skill is a directory with a required `SKILL.md`; `name` and `description` are required frontmatter. `scripts/`, `references/`, and `assets/` are optional.
  - The specification recommends staged loading of metadata, activated instructions, and on-demand resources. `allowed-tools` is experimental and implementation support may vary.
  - Scripts can contain executable code; the format alone does not make a bundle safe.
- Agent Skills overview: <https://agentskills.io/>
  - Identifies Anthropic as the format's original developer and describes it as open, with a growing set of compatible products.
- OpenAI Skills docs: <https://developers.openai.com/api/docs/guides/tools-skills>
  - Calls Skills compatible with the open standard, while documenting OpenAI's own discovery paths, context, bundle constraints, and security review guidance.
- Anthropic Agent Skills overview: <https://platform.claude.com/docs/en/agents-and-tools/agent-skills/overview>
  - Describes platform-specific support and that scripts execute in an environment with available capabilities; this supports checking permissions instead of assuming portability means equal runtime behavior.

## Card changes

- Added intermediate difficulty and interview retrieval pair.
- Replaced the long unverified client-adoption list and “use anywhere” claim with the verified portability boundary.
- Kept the useful folder/frontmatter and progressive-loading concepts, qualified by host implementation.
- Added a concrete supply-chain safety check for bundled scripts/tools.

## Selection signals

Current official specification + named adoption in first-party Codex and Claude documentation are relevance signals. No volatile stars or unsupported adoption count are included. Existing OpenSkills coverage is implementation/tool-specific; this card remains the format/host-boundary primer rather than repeating its installer workflow.

Confidence: high for format fields and current first-party support claims; medium for behavior across all compatible hosts because those implementations are not uniform.
