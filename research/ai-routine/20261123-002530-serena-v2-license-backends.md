# Serena MCP card review: v2 backends, setup, and licensing

## Decision

Keep Serena as an AI coding-tool card because symbol-aware code intelligence is directly useful for navigating/refactoring Android and other large codebases. Correct its license, split LSP versus JetBrains capabilities, and refresh setup and attention evidence.

## Sources checked (2026-11-23 KST)

- Official repository README: https://github.com/oraios/serena
  - GitHub page showed 31.6k stars / ~2.1k forks at review time (rounded UI snapshots; popularity is not adoption).
  - README describes Serena as an MCP server, compatible with MCP clients such as Claude Code, Codex, Gemini CLI, OpenCode, IDE integrations, and desktop clients.
  - LSP backend lists 40+ language support; JetBrains backend relies on the installed IDE and expands functionality. Specific language-server requirements can vary.
  - Current Quick Start warns against outdated marketplace installation steps and gives `uv tool install -p 3.13 serena-agent`, then `serena init`.
  - README states the application is GPL-3.0-or-later; only SolidLSP is MIT, and combined distribution is GPL.
- Official license page: https://oraios.github.io/serena/01-about/060_license.html
  - Confirms v2 application code is GPL-3.0-or-later and SolidLSP is MIT; combined package follows GPL. Earlier historical releases before the cutoff remain MIT, so the change is not retroactive.
- Official JetBrains plugin guide: https://oraios.github.io/serena/02-usage/025_jetbrains_plugin.html
  - Confirms the plugin is a language-intelligence backend for the Serena MCP server, not a direct UI assistant; it adds dependency indexing, enhanced refactoring, and interactive debugging. Some capabilities may be beta.

## Card changes

- Added intermediate difficulty and retrieval Q&A.
- Replaced the false general MIT license statement with the component-level v2 license distinction.
- Separated free/open LSP and paid JetBrains plugin capability sets; added Android Studio as a possible JetBrains host via the official repository matrix, not as an Android-specific AI model/tool.
- Updated the install command and removed deprecated marketplace advice.
- Refreshed the rounded star figure from ~25.8k to ~31.6k, explicitly treating it as attention, not production adoption.

## Confidence

High for current v2 setup, backend capability distinction, and license; high for the displayed star snapshot but inherently time-sensitive. This is an AI developer tool card, with Android Studio relevant only as one JetBrains integration target.
