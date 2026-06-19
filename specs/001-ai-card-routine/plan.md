# Implementation Plan: Study-Android AI Card Routine

**Branch**: `[001-ai-card-routine]` | **Date**: 2026-06-20 | **Spec**: [spec.md](./spec.md)

**Input**: Feature specification from `/specs/001-ai-card-routine/spec.md`

**Note**: This template is filled in by the `/speckit-plan` command. See `.specify/templates/plan-template.md` for the execution workflow.

## Summary

Create a bounded, auditable local routine for study-android that discovers current AI and Android development topics, validates them with reputable evidence, writes concise Korean cards, records a research trail, and publishes only repository-card changes. The plan keeps app-factory-android issue/PR automation explicitly out of scope and treats all published content as public-facing.

## Technical Context

**Language/Version**: Repository content is primarily structured text and static-site data; routine behavior is driven by local shell automation and headless agent execution already present in the repo.

**Primary Dependencies**: Existing study-android card data files, research notes, local scheduler, Git, GitHub remote, and headless Codex with web-search capability.

**Storage**: Repository files: card data, auto-post log, research audit notes, resume checkpoint, disabled marker, and generated spec artifacts.

**Testing**: Repository consistency validation plus scenario-based checks that cards have sources, audit notes exist, no app-factory issue/PR actions occur, and failure states leave checkpoints.

**Target Platform**: Project owner's local development machine publishing to the study-android GitHub repository.

**Project Type**: Static knowledge-card repository with local automation routine.

**Performance Goals**: One unattended routine cycle should finish inside the scheduled cadence; completed cycles should either publish qualified cards or document why no qualified topic was published.

**Constraints**: Public-facing content only; no GitHub Actions for this routine; no app-factory-android issue/PR management; avoid repeated resource-wasting retries after known provider/environment failure; sync before edits when safe.

**Scale/Scope**: Recurring study-android AI/Android topic curation; one or more card candidates per cycle; durable audit trail for each completed or interrupted cycle.

## Constitution Check

*GATE: Must pass before Phase 0 research. Re-check after Phase 1 design.*

The constitution file still contains template placeholders and does not define enforceable project-specific gates. Interim gates derived from the active user and repository instructions:

- **Scope Gate**: PASS — plan covers study-android cards only and excludes app-factory-android issue/PR workflows.
- **Evidence Gate**: PASS — plan requires reputable sources, same-run metric verification, and audit notes.
- **Safety Gate**: PASS — plan requires sync-before-edit, public-facing content, failure checkpoints, and disabled marker behavior for known-broken unattended runs.
- **Verification Gate**: PASS — plan requires repository consistency checks and scenario validation before push.

No gate violations identified.

## Project Structure

### Documentation (this feature)

```text
specs/001-ai-card-routine/
├── plan.md              # This file (/speckit-plan command output)
├── research.md          # Phase 0 decisions
├── data-model.md        # Phase 1 entities and validation rules
├── quickstart.md        # Phase 1 validation guide
├── contracts/           # Phase 1 behavioral contracts
│   └── routine-contract.md
└── tasks.md             # Phase 2 output (/speckit-tasks command - NOT created by /speckit-plan)
```

### Source Code (repository root)

```text
_data/
├── cards.yml            # Published Korean knowledge cards
└── ai_queue.yml         # Future/queued AI topic candidates when needed

auto-post-log.md         # Human-readable publication history
research/ai-routine/     # Per-run research audit notes and resume checkpoint
scripts/                 # Existing local routine launcher and helper scripts
logs/                    # Local runtime logs ignored by git except keepers
specs/001-ai-card-routine/ # Spec Kit planning artifacts for this routine
```

**Structure Decision**: Use the existing study-android content and routine structure. Do not introduce app-factory-android directories, issue templates, PR automation, or product-development workflow artifacts for this feature.

## Complexity Tracking

No constitution violations. No additional complexity exceptions required.

## Phase 0: Research Summary

See [research.md](./research.md). Decisions resolve all planning unknowns: routine scope, evidence quality gate, audit trail, failure behavior, and non-integration with app-factory-android.

## Phase 1: Design Summary

See [data-model.md](./data-model.md), [contracts/routine-contract.md](./contracts/routine-contract.md), and [quickstart.md](./quickstart.md). The design models candidate topics, evidence sources, knowledge cards, research runs, resume checkpoints, and publication batches with validation scenarios that prove the routine remains scoped and auditable.

## Post-Design Constitution Check

- **Scope Gate**: PASS — contract explicitly forbids app-factory-android issue, branch, and PR changes.
- **Evidence Gate**: PASS — data model requires source support and same-run exact metric verification.
- **Safety Gate**: PASS — quickstart covers dirty-tree, resume, and disabled-marker behavior.
- **Verification Gate**: PASS — quickstart defines end-to-end validation and no-forced-card scenario checks.

No post-design gate violations identified.
