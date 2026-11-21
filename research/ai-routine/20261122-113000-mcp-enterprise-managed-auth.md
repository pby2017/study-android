# MCP Enterprise-Managed Authorization (EMA) — 2026-11-22

## Decision

Refresh the existing card. EMA remains an important MCP enterprise authorization extension, but the launch-era card overgeneralized compatibility and suggested a universal “zero-touch” flow. Current documentation makes opt-in and compatibility boundaries explicit.

## Verified facts

- The MCP EMA extension (`io.modelcontextprotocol/enterprise-managed-authorization`) is stable and lets an enterprise IdP govern access to MCP servers. The stable specification is revisioned with the MCP protocol; the current ext-auth repository contains a stable spec dated July 28, 2026.
- It is optional and opt-in, not a mandatory replacement for standard MCP OAuth. The client and server must declare/support the extension; the client, enterprise IdP, and MCP server's authorization server all participate.
- Typical flow: user signs in to the client with the enterprise identity; client obtains an ID-JAG from the IdP by token exchange; client presents that grant to the MCP authorization server to get a server access token. This avoids an interactive per-server consent screen when compatible and configured.
- The MCP authorization server must validate the ID-JAG signature, issuer, audience, expiration, and map claims/scopes to permissions. The client must handle scope errors. Audience/resource restriction should be considered to prevent grant reuse across servers.
- MCP's support matrix is community-maintained and says extensions are opt-in; actual support is implementation/version/plan-dependent. The initial June announcement named Okta/XAA, Claude-family clients, VS Code, and several servers, but these lists are mutable; the card now points readers to check current compatibility rather than treating the launch roster as complete/current.
- Popularity snapshot: GitHub `modelcontextprotocol/ext-auth` reported 181 stars at review time (2026-11-22). This is a current snapshot only, not evidence of a growth rate. Primary adoption signal: the protocol maintainer marked EMA stable and published first-party/client/IdP/server integration documentation.

## Sources checked (official / upstream)

- MCP Blog, [Enterprise-Managed Authorization announcement](https://blog.modelcontextprotocol.io/posts/enterprise-managed-auth/)
- MCP Docs, [EMA extension overview](https://modelcontextprotocol.io/extensions/auth/enterprise-managed-authorization)
- MCP Docs, [Extension support matrix](https://modelcontextprotocol.io/extensions/client-matrix)
- MCP `ext-auth` upstream, [stable EMA specification revision](https://github.com/modelcontextprotocol/ext-auth/blob/main/specification/stable/enterprise-managed-authorization/2026-07-28/enterprise-managed-authorization.mdx)
- MCP `ext-auth` upstream repository, [README and star count](https://github.com/modelcontextprotocol/ext-auth)

## Card changes

Removed stale client/server product roster and unsupported implication of universal rollout. Added protocol flow, opt-in/compatibility requirement, authorization-server validation, and interview prompt. Confidence: high on specification mechanics; availability must be checked against current vendor support.
