# Task Master card refinement — 2026-11-22 20:27 KST

## Scope and sync
- Repository: `study-android` only.
- Started from a clean `master` at `3fc9559`; `git pull --ff-only origin master` completed before edits and reported up to date.
- No app-factory-android issues, branches, or PRs were touched. No GitHub Actions were added.

## Card refined
- `Task Master — PRD를 의존성 그래프로 바꾸고 다음 실행 가능 작업 찾기`
- Kept the AI-development task-planning topic. Reframed the card from an autonomous-agent/product inventory into a teachable workflow: PRD parsing produces task candidates; dependency edges constrain what can run next; a developer reviews the generated plan; MCP tool loading can be selected to reduce unnecessary context.
- Added intermediate level, source list, and one interview retrieval pair. Retained only three concise key points.
- Removed stale `27.7k★`, the unsupported implication that Task Master itself executes the implementation, and a broad list of old provider/editor/model features.

## Sources and checks
- GitHub repository: https://github.com/eyaltoledano/claude-task-master — current repository page displayed 28.5k stars and 2.6k forks (rounded display, checked this run); topic remains in active public use. The rounded metric is recorded here only, not embedded in the card.
- Official README: https://github.com/eyaltoledano/claude-task-master/blob/main/README.md — Task Master is an AI task-management system; documents PRD parsing, `task-master next`, MCP and CLI use, and advises detailed PRDs. README notes provider API keys or Claude Code/Codex CLI auth paths; those volatile setup claims were omitted from the card.
- Official workflow guidance: https://tryhamster.com/docs/taskmaster/best-practices/index — workflow recommends parsing, complexity analysis, review, expanding complex tasks, selecting the next task, and updating the plan as implementation changes.
- Official dependencies guidance: https://tryhamster.com/docs/taskmaster/task-workflow/dependencies — `next` selects tasks with satisfied dependencies; dependency validation detects missing/circular references; only create genuine ordering dependencies.
- Official MCP guide: https://tryhamster.com/docs/taskmaster/capabilities/mcp — `TASK_MASTER_TOOLS` selects core, standard, all, or custom MCP tool sets. Docs disagree on the default set across pages, so the card only teaches explicit selection and makes no default/count claim.
- Official CLI reference: https://tryhamster.com/docs/taskmaster/capabilities/cli-root-commands — documents PRD parsing, `task-master next`, dependency commands, and expansion. CLI examples in the card were limited to the README-supported `task-master next` command.
- License: https://github.com/eyaltoledano/claude-task-master/blob/main/LICENSE — repo includes MIT terms plus Commons Clause restrictions; dropped the old license parenthetical from the card title to avoid flattening the nuance.

## Selection and confidence
- The existing card is eligible (AI developer workflow), practically useful (explicit task ordering and review), and has a strong popularity signal. No duplicate card for this specific workflow was found in `_data/cards.yml`.
- Confidence: high for the workflow and MCP selection behavior based on first-party docs; medium for long-term popularity/maintenance inference. No exact star count is published in the card.
- Next oldest-first eligible card after this item: Claude Agent SDK; verify current product naming, execution model, and current API behavior before editing.

## Validation status
- `ruby -c scripts/auto_post.rb`: passed (`Syntax OK`).
- Ruby YAML load of `_data/cards.yml` and `_data/ai_queue.yml`: passed; target card has valid level, 2–4 points, source links, interview question, and answer.
- `ruby scripts/auto_post_test.rb`: passed (3 runs, 14 assertions, 0 failures/errors/skips).
- `git diff --check`: passed.
- Commit/push: pending.
