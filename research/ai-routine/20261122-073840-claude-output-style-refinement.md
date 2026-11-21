# Claude Code output-style card refinement — 2026-11-22 07:38 KST

## Candidate and practical value

- Oldest-first candidate: `출력 스타일(Output Styles) — Claude의 역할·말투를 시스템 프롬프트째 바꾸기`.
- AI developer workflow topic. The existing card contained outdated built-in styles, activation timing, and a `/clear` requirement.

## Primary source checked

- Current official docs: https://code.claude.com/docs/en/output-styles

## Verified claims

- Output styles provide instructions for role, tone, and response format across a session; they do not guarantee behavior.
- Built-in options beyond Default are Proactive, Concise, Explanatory, and Learning (four, not three).
- `/output-style <style>` requires v2.1.269 or later; `/config` also opens the terminal selection menu. A selected style takes effect on the next message; before v2.1.251 a clear/new session was required.
- Custom style files are Markdown under `.claude/output-styles`. On the full system prompt, a custom style omits Claude Code's built-in software-engineering instructions unless `keep-coding-instructions: true` is set.
- Official docs distinguish styles (session-wide response instructions), CLAUDE.md (project knowledge), Skills (task-specific guidance), and Hooks (lifecycle actions that can enforce checks).
- Popularity metric not applicable: this is a built-in product feature, not a GitHub project.

## Change and decision

- Replaced stale 3-style list with current four styles and their learning/use distinctions.
- Removed claims that style changes only at session start or require `/clear`.
- Added the instruction-versus-enforcement boundary and an interview question; kept custom coding-instruction caveat.
- Confidence: high; claims are directly stated in current official documentation.
