# Official MCP Registry card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- Live official API and docs: https://registry.modelcontextprotocol.io/docs
  - `GET /v0/servers?limit=5` responds with `servers` and pagination metadata; entries contain `server.json` metadata and registry status fields.
- Project repository: https://github.com/modelcontextprotocol/registry
  - README still describes the hosted registry as preview; its 2025-10-24 status update says API v0.1 entered a freeze. This API freeze is not proof of a GA service or a durability guarantee.
  - Latest GitHub release endpoint returned `v1.8.11` published 2026-11-21. This is the registry implementation release, not the API spec version; the card avoids conflating the numbers.
- Official announcement: https://blog.modelcontextprotocol.io/posts/2025-09-08-mcp-registry-preview/
  - Registry is the public upstream metadata source; community/client marketplaces and private enterprise subregistries can curate its data.
  - Server metadata is self-reported. The preview has no data durability guarantees; breaking changes may occur. Moderation can denylist malicious/spam/impersonating entries, but that is not a per-server safety certification.
- Ecosystem design: https://github.com/modelcontextprotocol/registry/blob/main/docs/design/ecosystem-vision.md
  - Registry is a metaregistry: it hosts metadata and links to package registries rather than hosting server code or binaries.
- GitHub API snapshot checked live 2026-11-22: 7,489 stars, 1,061 forks; latest push 2026-11-22T02:02:03Z. Attention signal only.

## Changes and rationale

- Corrected the core definition: discovery metadata, not a server host, execution service, or security certification.
- Preserved the client/subregistry ecosystem model while clarifying that downstream consumers curate upstream metadata.
- Updated the preview/API stability nuance: v0.1 API freeze coexists with a repository status that continues to label the service preview and warns against durability assumptions. Kept the app release version separate from the API version.
- Added a security boundary: an entry's presence does not establish that its code, permissions, or data handling are safe.
- Retained a tested public list API example, added intermediate difficulty, and added an interview retrieval pair.

Confidence: high for the currently reachable endpoint, stated API freeze and preview caveat, self-reported metadata, and metaregistry role; medium for future release guarantees because those are explicitly not promised.
