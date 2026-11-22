# Claude Code auto memory refinement

Updated: 2026-11-22 08:58 KST

- Rechecked the current official memory guide. Distinguished user-authored CLAUDE.md instructions from Claude-authored auto-memory learnings, and noted that both are context rather than enforced configuration.
- Clarified current behavior: auto memory defaults on in local sessions (with documented environment exceptions), stores per repository on the local machine, and is shared by worktrees of the same Git repo; it does not sync across machines/cloud.
- Corrected load semantics: only the first 200 lines or 25KB of MEMORY.md load at start; topic files load on demand. `/memory` can inspect and edit them.
- Source: https://code.claude.com/docs/en/memory
- Difficulty: intermediate; learners need to distinguish instructions, learnings, scope, and load behavior.
- Validation: YAML/card-field checks, Ruby syntax, auto-post tests, navigation tests, and `git diff --check` passed.
