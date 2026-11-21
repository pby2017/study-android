# Claude Code `/cd` card refinement — 2026-11-22 07:36 KST

## Candidate and value

- Oldest-first candidate: `Claude Code /cd — 프롬프트 캐시 깨지 않고 작업 디렉터리 옮기기`.
- AI workflow topic; teaches when to move the session's primary workspace versus merely adding directory access.

## Official sources checked

- Current working-directory and `/cd` behavior: https://code.claude.com/docs/en/permissions#move-the-session-to-another-directory
- Command availability: https://code.claude.com/docs/en/commands
- Version history: https://code.claude.com/docs/en/changelog

## Verified claims

- `/cd` moves the primary working directory and keeps the conversation; Claude Code loads the new directory's `CLAUDE.md` and prompts for workspace trust when needed.
- On moving, project settings, permission rules/hooks, MCP servers, enabled plugins, skills, agents, and environment values from the new directory apply. The old project's MCP/plugin services can be disconnected.
- `--resume` can find the moved session from the new directory.
- `/add-dir` adds file access but is not a full project-configuration root; it is not a substitute for `/cd`.
- Changelog says `/cd` was added in v2.1.169 without breaking the prompt cache mid-session. Applying the destination project's settings immediately came later, in v2.1.246. The card keeps these version boundaries separate and removes the unsupported explanation that `CLAUDE.md` is appended as a user message.

## Attention and decision

- Official product documentation and changelog were the primary evidence; this is a built-in workflow, so GitHub stars are not a meaningful signal.
- Refined the title, current behavior, trust boundary, `/add-dir` contrast, and version timeline. No exact popularity metric added.
- Confidence: high; version claims are explicitly dated in Anthropic's changelog.
