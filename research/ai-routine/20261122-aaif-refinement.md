# AAIF card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Verify AAIF governance and project membership claims against current first-party pages.

## Decision

Keep and refocus the card on a reusable engineering distinction: neutral open governance can support collaboration, but it does not itself guarantee interoperability, security, or compatibility between implementations.

## Evidence

- AAIF launch announcement, 2025-12-09: <https://aaif.io/news/linux-foundation-announces-formation-of-aaif>
  - Founding project contributions were Anthropic's MCP, Block's goose, and OpenAI's AGENTS.md.
  - The announcement describes AAIF as a neutral Linux Foundation home for open governance.
- Current project list: <https://aaif.io/projects>
  - Includes Agent Router, Agent Skills, A2A, AGENTS.md, agentgateway, Goose, MCP, Open Responses, OpenEnv, and OpenSandbox.
  - This is a current hosted-project list; it should not be confused with the initial three founding contributions.
- AAIF news, 2026-10-22: <https://aaif.io/news>
  - Reports four new projects (Agent Skills, Open Responses, OpenEnv, OpenSandbox) and 10 projects in the foundation's first year.
- AAIF about: <https://aaif.io/about>
  - Describes AAIF as a neutral open foundation under the Linux Foundation.

## Card changes

- Separated initial contributions from the expanded current project list; removed the stale six-project framing and unattributed `60k+` adoption claim.
- Added A2A as a later/current hosted project, not a founding contribution.
- Replaced broad platform inventory with the practical lesson that governance affiliation does not prove technical interoperability or security.
- Added difficulty and interview retrieval question.

## Validation

Run Ruby syntax, both YAML loads, targeted AAIF-card assertions, routine tests, and `git diff --check` before commit.

Confidence: high on first-party launch and current project-list claims; medium-high on the practical distinction, which is a derived engineering lesson rather than a quoted AAIF guarantee.
