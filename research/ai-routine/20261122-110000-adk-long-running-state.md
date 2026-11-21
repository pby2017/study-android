# ADK durable long-running agent state — 2026-11-22

## Decision

Refine the existing card. The durable-workflow idea remains useful, but it previously implied that changing `ToolContext.state` alone guarantees restart-safe progress. Clarify that workflow state and session-storage durability are distinct requirements.

## Verified facts

- Google's ADK long-running workflow tutorial recommends explicit checkpoints/state-machine stages instead of inferring workflow progress from an unbounded conversation transcript. It demonstrates persistent session storage and an event/webhook that resumes a workflow after a wait.
- ADK tool state updates are represented in session events, but restart safety depends on the configured SessionService and storage backend. A local or in-memory session is not made durable merely by defining `current_step`.
- Current Google Agents CLI documentation states its default `in_memory` sessions live on an instance and do not survive instance restart or moving to another instance. Cloud Run scaffolds can use a Cloud SQL session type; Agent Runtime's managed sessions are ADK-specific, and Cloud SQL is not automatically configured there.
- Event-driven resume should be designed as a real workflow boundary: authenticate external callbacks, validate permitted transitions, make duplicate delivery/retry safe (idempotency), and test crash/restart paths. These are engineering implications for reliable webhooks; the tutorial's demo should not be read as providing those properties automatically.
- State schema should contain the minimum durable business facts needed for the next decision (stage, pending signal, approval/result), not secrets or a replay of all conversation data.

## Sources checked (official)

- Google Developers Blog, [Build long-running AI agents with ADK](https://developers.googleblog.com/build-long-running-ai-agents-that-pause-resume-and-never-lose-context-with-adk/)
- Google Agents CLI, [First-party frameworks and session persistence](https://google.github.io/agents-cli/guide/extensions/first-party/) (updated 2026-11-17)
- Google ADK Docs, [Session and state concepts](https://google.github.io/adk-docs/sessions/)
- Google ADK Docs, [Tool context](https://google.github.io/adk-docs/tools-custom/) (state access via ToolContext)

## Relevance and practical value

Long-running agents are useful for AI workflows that wait for human approval or external events. The lesson applies across ADK deployments and prevents a common reliability bug: assuming the process memory or conversation transcript is the durable source of truth. This is an official framework feature and operational design topic; GitHub-star counts are not applicable.

## Card changes

Added a high-level skill tag and interview prompt. Distinguished explicit state modeling from persistent session storage. Reframed webhook recovery guidance to include authentication, validated transitions, duplicate-safe processing, and restart/retry tests. Confidence: high on documented storage behavior; engineering safeguards are recommendations derived from event-driven workflow design.
