# Claude Agent SDK card refinement — 2026-11-22 20:31 KST

## Scope and sync
- Repository: `study-android` only. Previous Task Master work is published in `24977f9`.
- Ran `git pull --ff-only origin master` before this edit; it reported up to date.
- No app-factory-android issues, branches, or PRs were touched. No GitHub Actions were added.

## Card refined
- `Claude Agent SDK — 무상태 API 래퍼가 아닌 CLI 프로세스 런타임`
- Reframed the card around a durable architecture insight: the SDK's `query()` runs Claude Code in a subprocess, and each session has a process, working directory, and local transcript state. Self-hosted deployment therefore needs process/resource planning, persistence, and tenant isolation.
- Distinguished Agent SDK from the interactive CLI, the Messages API Client SDK, and hosted Managed Agents. Removed volatile package/runtime version details and the simplistic claim that CLI is only for development while SDK is for production.
- Added advanced level, three key points, source links, and an interview retrieval pair.

## Sources and fact-check
- Official overview: https://code.claude.com/docs/en/agent-sdk/overview — Agent SDK uses Claude Code capabilities in a process the developer operates; Client SDK calls the API; Managed Agents hosts the agent loop. The SDK supports Python and TypeScript.
- Official hosting guide: https://code.claude.com/docs/en/agent-sdk/hosting — `query()` starts a separate CLI process over stdio; one session maps to one process; transcripts and working artifacts live on local disk by default and do not automatically survive container restarts.
- Official secure deployment guide: https://code.claude.com/docs/en/agent-sdk/secure-deployment — calls out prompt injection, isolation boundaries, least privilege, and the distinct security needs of multi-tenant environments.
- Official quickstart: https://code.claude.com/docs/en/agent-sdk/quickstart — verifies Python/TypeScript package setup and credentials; specific minimum versions were omitted as volatile details.

## Selection and confidence
- This is an AI-native developer SDK topic, practical for teams embedding Claude Code capabilities in products or internal tools. Official product documentation is the primary relevance signal; no unverified popularity metric is included.
- Confidence: high for the subprocess/session architecture and product distinctions, directly supported by current first-party docs.
- Next eligible card in sequence: `AI 랩이 개발 툴체인을 사들이는 중`; verify current acquisition status and all dates before changing it.

## Validation status
- `ruby -c scripts/auto_post.rb`: passed (`Syntax OK`).
- Ruby YAML load of `_data/cards.yml` and `_data/ai_queue.yml`: passed; target card has valid level, 2–4 points, source links, interview question, and answer.
- `ruby scripts/auto_post_test.rb`: passed (3 runs, 14 assertions, 0 failures/errors/skips).
- `git diff --check`: passed.
- Commit/push: pending.
