# Google Agents CLI: scaffold, evaluate, and deploy AI agents

Reviewed: 2026-11-22 (KST)

## Sources checked

- Google Cloud current end-to-end quickstart (last updated 2026-11-20): https://docs.cloud.google.com/gemini-enterprise-agent-platform/agents/quickstart-adk
- Google Agents CLI getting started: https://github.com/google/agents-cli/blob/main/docs/src/guide/getting-started.md
- Official release notes: https://github.com/google/agents-cli/blob/main/RELEASE_NOTES.md
- Google Developers Blog launch announcement (2026-04-22): https://developers.googleblog.com/en/agents-cli-in-agent-platform-create-to-production-in-one-cli/

## Current state

Agents CLI is an open-source CLI plus coding-agent skills for the agent development lifecycle: scaffold projects, evaluate agents, deploy, and add observability. The current getting-started guide describes ADK as the default framework (Python and Go), with first-party LangChain and Claude Agent SDK templates. Current docs list Antigravity, Gemini CLI, Claude Code, Codex, and other development agents as callers; the CLI is not itself the agent runtime or the coding agent.

The current setup flow is `uvx google-agents-cli setup`; it installs the CLI and skills. A typical lifecycle is `agents-cli create` → edit/build agent and evaluation set → `agents-cli eval run` and iterate → `agents-cli deploy`. The Google Cloud quickstart shows Cloud Run; current CLI docs/release notes also cover Agent Runtime and GKE. Release notes show GA at v1.0.0 on 2026-06-30 and continued active releases through v1.15.0 on 2026-11-17; avoid treating the April launch as current version/status.

## Operational caveats

- `uv` is required for the documented `uvx` setup; optional Node.js supports skill installation/update flows.
- Local development can use a Gemini API key in supported templates; Cloud deployment requires Google Cloud project setup, billing enabled, and target-specific IAM permissions.
- Deployment can incur Google Cloud charges; the CLI is tooling, not a free hosted agent service. Check current pricing and `deploy --dry-run` before shipping.
- Agent evaluation is a repeatable check, not proof of safety or production correctness.

## Card revision

Replaced the launch-era feature list with the stable lifecycle and current framework choices. Kept current CLI release status without pinning a version number in the card, and added the distinction between local development and billable cloud deployment.
