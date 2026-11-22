# OpenHands Agent Canvas — execution boundary and duplicate merge

Date: 2026-11-23 (Asia/Seoul)

## Decision

Merge the older OpenHands overview card and the later Agent Canvas automation card into one updated product card. This removes one redundant card while preserving the Agent Canvas event-automation lesson and the older Docker-sandbox learning angle. Reframe around the critical boundary: Docker is an execution provider, not proof that every component or mounted file is isolated.

## Primary sources checked

- Current OpenHands repository / README: <https://github.com/OpenHands/OpenHands>
  - Agent Canvas is a self-hosted control center for OpenHands and third-party ACP agents, and connects local, Docker, VM, or cloud backends.
  - Scheduled/event automation, including integrations such as Slack/GitHub/Linear, is a separate capability.
  - Running without a sandbox executes the agent server directly on the host with full filesystem access.
  - Docker setup mounts the selected projects directory; the agent can access projects under it. Multiple Docker sandboxes can still share files when they use the same host workspace.
  - Repository snapshot on 2026-11-23: 94,043 stars, 12,586 forks, 9,189 commits, pushed 2026-11-22; MIT metadata. Stars are an attention signal only, not adoption or security evidence.
- OpenHands V1 sandbox overview: <https://docs.openhands.dev/openhands/usage/sandboxes/overview>
  - Docker is recommended; Process runs as an ordinary host process with no container isolation; Remote runs elsewhere.
- OpenHands Docker sandbox guide: <https://docs.openhands.dev/openhands/usage/sandboxes/docker>
  - Docker reduces command-execution risk and provides reproducibility. A read-write mounted repository can be modified by the agent.
  - The legacy CLI launcher is no longer actively maintained; current local installation is Agent Canvas.

## Card changes

- Combined two product-level cards, reducing card count by one.
- Replaced the old “all actions run in Docker” assertion with current V1 provider choices and explicit host/workspace boundaries.
- Preserved the distinct automation value (scheduled/event-driven integration and ACP backends).
- Added intermediate difficulty and a retrieval question/answer focused on backend and mount-scope checks.
- Removed the old dated ~77k star figure. Recorded a verified 94,043-star snapshot in this audit only.

## Confidence

High for documented provider, mount, and product boundaries. Medium for future product direction because Agent Canvas and V1 sandbox docs are actively evolving.
