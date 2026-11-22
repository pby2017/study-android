# Agent Skills progressive disclosure card review

## Decision

Refined the older Agent Skills card. Kept the practical context-management concept, but scoped behavior to implementations that support the specification. Replaced the absolute “only metadata is loaded” framing with staged discovery, activation, and on-demand references; clarified that opened reference content and tool output still use context.

## First-party sources checked (2026-11-23 KST)

- Agent Skills specification: https://agentskills.io/specification
  - A skill is a directory with required `SKILL.md`; `scripts/`, `references/`, and `assets/` are optional.
  - Describes progressive disclosure as metadata (~100 tokens), instructions (<5,000 tokens recommended), then resources as needed.
  - Describes `description` as what-and-when metadata to help agent selection.
- Anthropic Agent Skills docs: https://platform.claude.com/docs/en/agents-and-tools/agent-skills/overview
  - Confirms three load levels in Anthropic's implementation, including metadata loaded at startup, instructions when triggered, and additional files when referenced.
  - Warns that skills can include executable code and that untrusted skills can cause data exposure or unauthorized actions; recommends auditing the complete bundle.

## Card changes

- Added intermediate difficulty and interview retrieval Q&A.
- Replaced overgeneralized universal loading claim with “supported agents” and explicitly said behavior/token use depends on implementation.
- Preserved the specification's approximate metadata estimate, qualified as an estimate per skill, not a measured universal guarantee.
- Clarified that resources are deferred until accessed, not permanently free of context cost.
- Kept installation security advice grounded in Anthropic's first-party warning.

## Confidence

High for the format and Anthropic implementation details; medium for cross-agent runtime behavior because the specification does not force every implementation to load metadata identically. No popularity claim is made; this is an active published format with first-party specification evidence.
