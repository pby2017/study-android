# Ruler card refinement

Date: 2026-11-22 (Asia/Seoul)

## Decision

Retained Ruler as a practical AI developer tool card and reframed it around source-of-truth generation, host boundaries, and safe updates. Added intermediate difficulty and an interview question on enforcement and change review.

## Sources checked

- https://github.com/intellectronica/ruler — current GitHub page lists MIT and showed about 3.0k stars in this run (2026-11-22). The repository has ongoing releases; latest release page lists v0.3.46 (Oct 22, 2026).
- https://github.com/intellectronica/ruler#readme — current README documents root `AGENTS.md` precedence, `.ruler/AGENTS.md`, recursively discovered Markdown files and source markers; `ruler.toml` controls selected agents and outputs. README FAQ says agents receive the same concatenated rules by default.
- https://github.com/intellectronica/ruler#usage-the-apply-command — README describes `--agents`, `--dry-run`, and applying rules to native files; README FAQ says pre-existing non-Ruler-generated files are backed up before replacement.
- https://github.com/intellectronica/ruler#nested-rule-loading — nested rule loading is explicitly experimental and disabled by default unless enabled through CLI/config.
- https://github.com/intellectronica/ruler/releases — current release page identifies v0.3.46 as latest at check time; details include continued compatibility/config changes. Version is not copied into the card because it is volatile.

## Changes and fact checks

- Replaced the stale 2,773★ / 150-fork June snapshot with a dated ~3.0k★ GitHub page snapshot; kept the metric as attention only.
- Corrected “same rules for every agent” to the current README semantics: the same concatenated rules are delivered by default. Users may add agent-specific headings, but Ruler does not enforce those instructions as OS/tool permissions.
- Explained the operational workflow: `.ruler/` sources are transformed by `ruler apply`; team members must run the tool or deliberately version generated outputs.
- Highlighted `--dry-run`, target selection, potential backup/file replacement and `.gitignore` effects. Kept nested loading out of the core promise and labeled it experimental.
- Added a retrieval Q/A about instruction distribution versus hard enforcement and safe change review.

## Confidence

High for documented file order, apply/dry-run behavior, backup behavior, and experimental nested mode. Exact stars and release are time-sensitive; stars are dated and release version omitted from the card.
