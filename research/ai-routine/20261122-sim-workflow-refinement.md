# Sim workflow-builder card refinement — 2026-11-22

## Decision
Retain Sim as a current AI developer tool. Replace the old feature inventory and obsolete self-host command with a reusable deployment lesson: workflow drafts and live snapshots are separate, so successful draft tests do not deploy changes to API/chat/MCP callers.

## Sources checked
- https://github.com/simstudioai/sim — current README describes Sim as a collaborative workspace to build, deploy, and monitor AI agents/workflows; lists 280+ integrations, 5,800+ actions, and 530+ triggers; documents Chat, visual/code workflow building, MCP, and self-hosting. Repository API returned 30,174 stars, 3,917 forks, Apache-2.0, `archived=false`, `pushed_at=2026-11-22T00:07:53Z`.
- https://docs.sim.ai/introduction — official docs describe workflows as executable logic, Agent blocks/tools, Tables, files, knowledge bases, logs, and deployment to API, chat, or MCP. Self-hosted Chat depends on configuration and may be disabled.
- https://docs.sim.ai/workflows — workflows are built from triggers, blocks, and connections; draft runs can be inspected in logs; event/timer triggers use deployed configuration.
- https://docs.sim.ai/workflows/deployment — deployment captures a versioned snapshot; draft edits do not change the live version until updated. Deploy/update requires workspace Admin access.
- https://github.com/simstudioai/sim/blob/main/packages/sim-setup/README.md — current self-host installer is `npx sim-setup`, requires Node.js 20+ and Docker Compose, and generates deployment files/secrets and starts the service. Its small-installation guidance also asks for at least 12 GB system memory and 20 GB free disk; those resource estimates were omitted from the compact card.
- https://api.github.com/repos/simstudioai/sim — same-run popularity/activity snapshot above.
- https://api.github.com/repos/simstudioai/sim/releases/latest — latest release was v0.9.63, published 2026-11-19.

## Fact-check and limits
- The card's central release lifecycle claim is explicit in Sim's deployment docs: live callers use the deployed snapshot, not the editable draft. This is a product fact, not a general claim that Sim guarantees reliability.
- Chat/API/MCP are documented caller surfaces; the card does not imply that an Android app has a native Sim SDK.
- Star/fork counts are time-stamped GitHub API values. The same API showed active maintenance (push on Nov 22); latest release was Nov 19.
- Corrected stale setup detail: current documented command is `npx sim-setup`, not `npx simstudio`. Current package docs specify Node 20+ and Docker; old claims about directly cloning a Bun/Next.js/PostgreSQL stack were removed from the reader-facing card.
- Duplicate scan found no other Sim/simstudioai/sim card.

## Card changes
- Added intermediate difficulty and interview Q&A testing whether a successful draft run automatically updates live API callers.
- Centered the short summary and points on workflow build/test/deploy and versioned snapshots; updated the self-host command and linked current docs.

Confidence: high for documented behavior, requirements, license, and API snapshot; medium for interpreting stars/recent pushes as broad developer adoption.
