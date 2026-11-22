# Zed ACP and parallel agents card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- Zed External Agents docs: https://zed.dev/docs/ai/external-agents
  - External agents connect through ACP. Zed hosts the thread in Agent Panel / Threads Sidebar; the agent usually owns its runtime, authentication, model selection, tools, and native configuration.
  - Zed states it does not charge for external agents; billing, legal terms, retention, and data handling are between the user and the agent provider.
  - Current common agents include Claude, Codex, OpenCode, Copilot, Cursor, and Pi; list is curated and not exhaustive.
- Zed 1.0 announcement: https://zed.dev/blog/zed-1-0
  - Published 2026-04-29. Describes Zed as Rust/GPUI-based and names ACP integrations including Claude Agent, Codex, and OpenCode. Corrected “GA” to the safer statement “announced version 1.0”; 1.0 is a milestone, not the latest binary release.
- Parallel Agents announcement: https://zed.dev/blog/parallel-agents
  - Published 2026-04-22. Threads Sidebar groups threads by project, supports agent switching and access to multiple repositories; worktree isolation is optional.
- Zed licensing overview: https://zed.dev/software-overview
  - Most Zed source is GPL-3.0; reusable components such as GPUI are Apache-2.0. The prior simple GPL-3.0 label was incomplete.
- GitHub latest release checked live: v1.29.3, published 2026-11-20. GitHub API snapshot 2026-11-22: 95,493 stars, 11,802 forks; latest push 2026-11-22T04:20:01Z. Stars are an attention signal, not a quality measure.

## Changes and rationale

- Reframed the card around the durable AI developer workflow: ACP connects agents while keeping provider-owned runtime and billing boundaries.
- Corrected thread/worktree semantics: agent/repository selection is flexible; worktree isolation is optional, not guaranteed per thread.
- Tightened cost statement: Zed does not bill external-agent usage, but the provider may charge and controls terms/data handling.
- Corrected Zed 1.0 from “GA” to an announcement/milestone; distinguished it from the current v1.29.3 release.
- Expanded license detail and refreshed popularity snapshot.
- Added intermediate difficulty and an interview retrieval pair about billing, authentication, and data ownership.

Confidence: high for product documentation, dates, provider boundary, release tag, license overview, and observed GitHub counts.
