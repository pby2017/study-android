# SuperClaude card refinement

Date: 2026-11-22 (Asia/Seoul)

## Scope and evidence

Revised the existing AI-tool card to distinguish a community configuration framework from Claude Code's model/runtime and to avoid treating prompt guidance as enforcement.

- Project README: https://github.com/SuperClaude-Org/SuperClaude_Framework
  - Describes SuperClaude as behavioral instruction injection and component orchestration; lists 30 commands, 20 agents, 7 modes, and 8 MCP integrations.
  - Current stable line is v4.3.0. README installation is pipx/PyPI (`pipx install superclaude`, then `superclaude install`) or Git clone/install script. MCP installation is optional.
  - The README explicitly says the TypeScript plugin system in older documents is not available yet and is planned for v5.0. It also says the project is not affiliated with or endorsed by Anthropic.
  - MIT license.
- GitHub repository API, checked live 2026-11-22: 23,951 stars, 1,983 forks; latest push timestamp 2026-09-27T12:50:32Z. Stars indicate attention, not adoption, quality, or security.
- Latest release page: https://github.com/SuperClaude-Org/SuperClaude_Framework/releases — v4.3.0 is displayed as latest.

## Changes and rationale

- Removed the old npm install claim; current README documents Python/PyPI and Git installation.
- Removed the unsupported Superpowers comparison; the old claim was not backed by a careful like-for-like source.
- Replaced approximate star count with the exact snapshot and date, with an explicit caveat.
- Added an intermediate difficulty and interview retrieval pair centered on the boundary between prompt guidance, actual enforcement, and MCP permissions.
- Added operational advice to verify current install documentation, treat MCP as optional, and independently review tool permissions and generated code.

Confidence: high for repository-stated features, release version, license, and observed star/fork counts; medium for practical quality or adoption, which the repository metrics do not establish.

## Sources checked

- https://github.com/SuperClaude-Org/SuperClaude_Framework
- https://github.com/SuperClaude-Org/SuperClaude_Framework/releases
- https://api.github.com/repos/SuperClaude-Org/SuperClaude_Framework
