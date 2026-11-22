# Claude Code large-codebase instructions card refinement

## Scope

Reviewed the next oldest AI card. The previous version's main takeaway (“put CLAUDE.md in subdirectories, not the root”) was misleading, and its load description implied every nested file is loaded at once.

## Evidence checked (2026-11-22)

- Anthropic, [How Claude Code works in large codebases](https://claude.com/blog/how-claude-code-works-in-large-codebases-best-practices-and-where-to-start), 2026-05-14. It recommends lean, layered guidance: root for broad context, descendants for local conventions; when starting in a subdirectory, ancestors are still loaded. It also recommends scoped test/lint commands, maps when structure is unclear, and reviewing instructions as models change.
- Current [Claude Code memory documentation](https://code.claude.com/docs/en/memory) is more precise about loading: the current working directory and ancestor `CLAUDE.md`/`CLAUDE.local.md` files load at startup; files in descendants load on demand when Claude reads, writes, or edits files in those directories. Discovered files are concatenated; they do not override one another.
- The same docs recommend keeping each `CLAUDE.md` under 200 lines, using `.claude/rules/` path patterns for file-specific rules, and auditing stale/contradictory guidance. They explicitly state that CLAUDE.md is context, not enforced configuration; use permissions/hooks for hard enforcement.
- For an Android monorepo, root-level common Gradle/build and architecture guidance can coexist with per-feature or module rules. Starting in a module retains ancestor guidance but narrows the default working area.

## Card changes

- Replaced the “root or subdirectory” false choice with a layered common-versus-local strategy.
- Corrected launch-time versus on-demand loading semantics.
- Added Android multi-module examples, path-scoped rules, scoped build/test commands, a concise-file target, and the boundary between behavioral guidance and enforceable permissions.
- Added difficulty, interview question/answer, and current official sources.

## Overlap check

This card is about repository-level context organization and loading. The Claude Code `@` file-reference card explains explicit file/directory insertion and its security boundary; they are complementary, not duplicates.
