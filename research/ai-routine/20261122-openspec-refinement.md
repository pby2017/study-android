# OpenSpec card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh the next oldest eligible AI card after BMAD-METHOD.

## Decision

- Keep the card, but make its distinct lesson the reviewable change-level artifact flow rather than a broad SDD/Spec Kit comparison.
- Difficulty: Intermediate. The useful skill is deciding what must be agreed and reviewed before an AI coding agent implements a change.
- Avoid duplicate general explanations of spec-driven development; explain OpenSpec's proposal/apply boundary and ongoing spec lifecycle.

## Fact check and attention signal

1. Official Skills reference: <https://openspec.dev/docs/skills>
   - Core skills are `openspec-explore`, `openspec-propose`, `openspec-apply-change`, `openspec-update-change`, `openspec-sync-specs`, and `openspec-archive-change`.
   - `propose` creates the schema-defined planning artifacts in `openspec/changes/<name>/` and stops before code. `verify-change` is optional, not a default core skill.
2. Official setup: <https://openspec.dev/docs/setup>
   - `openspec init` installs skills globally by default; `--scope project` installs them in the repo. Inspect generated files and restart the IDE when needed.
3. Official releases: <https://github.com/Fission-AI/OpenSpec/releases>
   - Latest observed release is v2.1.1 (2026-11-19). v2.0 removed the old `/opsx:*` command files and moved to skills; do not repeat v1-era command syntax.
4. Official site: <https://openspec.dev/>
   - Displays v2.1.1 and 75.3k GitHub stars (checked 2026-11-22). Popularity is an attention signal, not proof of quality or adoption outcomes.
5. Install nuance: current release history says npm installation requires Node.js 22.12+; the standalone CLI avoids a Node runtime. The card uses this to correct the old Node 20.19 prerequisite.

## Removed / corrected

- Removed stale June star count, v1.4.1 release, Node 20.19 prerequisite and “25+ tools” inventory.
- Replaced removed `/opsx:*` syntax with current skill invocation names.
- Removed unsupported comparison framing (“Spec Kit is heavier/rigid”).
- Clarified that propose creates reviewable planning artifacts but does not itself guarantee correct implementation; verification remains separate and optional.
- Added difficulty, interview question/answer and linked official sources.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card schema, level, four points and four sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high for v2 skill workflow and setup from official docs; star count is a dated snapshot.
