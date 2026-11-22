# Agent Client Protocol (ACP) card review

## Decision

Keep ACP as an AI developer interoperability topic. Rewrite the card around the useful implementation lesson: negotiate capabilities and check actual transport/version support rather than assuming all compatible agents expose the same functions.

## First-party sources checked (2026-11-23 KST)

- Protocol overview: https://agentclientprotocol.com/protocol
  - Current documentation marks v1 as latest and v2 as preview.
  - Typical flow: `initialize` version/capability negotiation, optional authentication, `session/new` or supported `session/load`, `session/prompt`, then progress updates and any permission interaction.
  - Optional methods and resource/terminal access are capability-gated.
- Transports: https://agentclientprotocol.com/protocol/transports
  - Core transport is UTF-8 JSON-RPC over stdio, normally with the client launching the agent subprocess; messages are newline-delimited and stdout must remain valid protocol messages.
  - The official v1 docs say Streamable HTTP is being specified in a separate RFD; custom transports must preserve protocol behavior. Do not describe HTTP/WebSocket as established core support.
- Registry: https://agentclientprotocol.com/registry
  - The ACP Registry is curated and includes agents supporting user authentication; the available agent list includes major coding agents, but listing is not a guarantee that every client/agent feature matches.
- Registry repository: https://github.com/agentclientprotocol/registry
  - The project describes registry verification of authentication handshake methods and distribution metadata; registry source is actively maintained.
- Protocol repository: https://github.com/agentclientprotocol/agent-client-protocol
  - GitHub showed 4.7k stars (rounded) on the review date; this is an attention signal only.
- v2 migration notes: https://github.com/agentclientprotocol/agent-client-protocol/blob/main/docs/protocol/v2/migration.mdx
  - Confirms stdio remains primary and HTTP/WS transport is being specified separately, not part of core v2.

## Card changes

- Added intermediate level and interview retrieval.
- Replaced stale generic lifecycle spelling with current v1 message sequence and qualified `session/load` as capability-dependent.
- Corrected remote transport from “HTTP/WebSocket expanding” to stdio as the core transport and remote transport as separate/proposed.
- Added version status (v1 latest, v2 preview) and capability negotiation as the practical integration check.
- Scoped registry claims as curated/authentication-supporting, not universal interoperability or quality assurance.
- Refreshed the main protocol repository's rounded star signal (~4.7k) with a dated audit; did not imply adoption.

## Confidence

High for current v1 flow, transport, registry scope, and displayed rounded GitHub snapshot. Protocol and registry evolve quickly; keep links as live sources for future rechecks.
