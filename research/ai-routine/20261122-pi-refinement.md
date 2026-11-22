# Pi project card refinement — 2026-11-22

## Decision
Refine the existing card as one continuing project, not two products. GitHub currently redirects `badlogic/pi-mono` to `earendil-works/pi`; Mario Zechner's April 8, 2026 announcement describes Pi's move to Earendil and says Zechner remains responsible for technical direction with the other decision-makers. Current docs describe a TypeScript monorepo, CLI, SDK, extension mechanisms and MCP connectivity.

## Sources checked
- https://github.com/earendil-works/pi — primary repository; current project description, package list, MIT license and GitHub star count.
- https://github.com/badlogic/pi-mono — GitHub redirects this historical repository URL to `https://github.com/earendil-works/pi` (checked 2026-11-22).
- https://mariozechner.at/posts/2026-04-08-ive-sold-out/ — creator announcement: repository move, governance, MIT core and planned commercial tiers (not yet built at publication time).
- https://github.com/earendil-works/pi/security/policy — official security boundary: runs with the launching user's permissions; recommends operator containment when needed; extensions and repository instructions are trust inputs.
- https://docs.pi.dev/latest — current docs navigation and overview; includes MCP connection, SDK, extensions and safe-running/isolation guides.

## Fact checks and corrections
- Removed “two different Pi agents”; the old URL redirects to the same project. The historical owner/repository transition is the educational point.
- Removed the stale “four tools / intentionally no MCP” description. Current official docs include MCP connection setup, and the active README describes the project's current toolkit.
- Replaced the overbroad assertion that external VM/Docker is always required with the actual boundary: Pi does not itself restrict filesystem, process, network or credential access; the operator decides when to isolate it.
- Removed Armin Ronacher quote and third-party characterization because they were not necessary to explain the project.
- GitHub showed 123.2k stars (rounded to approximately 123k) on 2026-11-22. Star count is an attention signal, not a quality/safety guarantee.

## Card updates
- Title now states the project migration rather than presenting two competing projects.
- Added intermediate level, current repository/project facts, explicit OS trust boundary, three key points and interview-style retrieval Q/A.
- Sources link to current upstream repo, creator's announcement, and official security policy.

Confidence: high for repository identity/current safety boundary; star count is a same-day mutable snapshot.
