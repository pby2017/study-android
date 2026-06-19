# Tasks: Study-Android AI Card Routine

**Input**: Design documents from `/specs/001-ai-card-routine/`

**Prerequisites**: plan.md, spec.md, research.md, data-model.md, contracts/routine-contract.md, quickstart.md

**Tests**: No formal test suite was requested. Tasks include runnable validation checks and scenario verification from quickstart.md.

**Organization**: Tasks are grouped by user story to enable independent implementation and testing of each story.

## Format: `[ID] [P?] [Story] Description`

- **[P]**: Can run in parallel (different files, no dependencies)
- **[Story]**: Which user story this task belongs to (US1, US2, US3)
- Include exact file paths in descriptions

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Confirm current study-android routine files, generated planning artifacts, and public-scope boundaries are present before changing behavior.

- [X] T001 Inspect current routine implementation and document existing behavior in `research/ai-routine/README.md`
- [X] T002 Confirm Spec Kit feature artifacts exist in `specs/001-ai-card-routine/`
- [X] T003 [P] Review current card data shape in `_data/cards.yml` and `_data/ai_queue.yml`
- [X] T004 [P] Review current routine launcher behavior in `scripts/local_ai_research_pipeline.sh`
- [X] T005 [P] Review current publication history expectations in `auto-post-log.md`

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Establish shared guardrails that every user story depends on.

**⚠️ CRITICAL**: No user story work can begin until this phase is complete.

- [X] T006 Add or update routine scope statement in `.codex/skills/local-ai-card-routine/SKILL.md` to state study-android card publication only
- [X] T007 Add explicit forbidden-output rules from `specs/001-ai-card-routine/contracts/routine-contract.md` to `.codex/skills/local-ai-card-routine/SKILL.md`
- [X] T008 Update `scripts/local_ai_research_pipeline.sh` prompt text to forbid app-factory-android issue, branch, and PR side effects
- [X] T009 Update `research/ai-routine/README.md` with the evidence gate and no-forced-card rule from `specs/001-ai-card-routine/research.md`
- [X] T010 Update `research/ai-routine/README.md` with failure-loop protection expectations from `specs/001-ai-card-routine/contracts/routine-contract.md`
- [X] T011 Run baseline repository consistency checks for `scripts/auto_post.rb`, `_data/cards.yml`, and `_data/ai_queue.yml`

**Checkpoint**: Foundation ready — all user stories can now be implemented and validated independently.

---

## Phase 3: User Story 1 - Publish verified topic cards (Priority: P1) 🎯 MVP

**Goal**: The routine regularly finds worthwhile AI and Android development topics, validates them with evidence, and publishes concise Korean cards to study-android.

**Independent Test**: Run one routine cycle or dry-run equivalent and confirm that a selected topic creates a card, source reference, and research note without unrelated project changes.

### Implementation for User Story 1

- [X] T012 [P] [US1] Define the candidate topic checklist in `.codex/skills/local-ai-card-routine/SKILL.md`
- [X] T013 [P] [US1] Define the evidence source requirements in `.codex/skills/local-ai-card-routine/SKILL.md`
- [X] T014 [US1] Update the card-writing instructions in `.codex/skills/local-ai-card-routine/SKILL.md` to require concise Korean developer value
- [X] T015 [US1] Update the routine prompt in `scripts/local_ai_research_pipeline.sh` to require AI and Android development topic coverage
- [X] T016 [US1] Ensure the routine writes selected cards to `_data/cards.yml`
- [X] T017 [US1] Ensure the routine writes publication entries to `auto-post-log.md`
- [X] T018 [US1] Ensure the routine writes per-run research notes under `research/ai-routine/`
- [X] T019 [US1] Validate User Story 1 with quickstart Scenario 2 in `specs/001-ai-card-routine/quickstart.md`

**Checkpoint**: User Story 1 is complete when a qualified topic can become a source-backed Korean card with an audit note and publication log entry.

---

## Phase 4: User Story 2 - Preserve auditability and resume safely (Priority: P2)

**Goal**: Every routine cycle leaves a clear audit trail or a safe resume checkpoint when interrupted.

**Independent Test**: Inspect a completed or interrupted cycle and verify that considered candidates, source URLs, evidence signals, rejection reasons, selected card, and next actions are documented.

### Implementation for User Story 2

- [X] T020 [P] [US2] Define required research note fields in `research/ai-routine/README.md`
- [X] T021 [P] [US2] Define resume checkpoint required fields in `research/ai-routine/README.md`
- [X] T022 [US2] Update `.codex/skills/local-ai-card-routine/SKILL.md` to require selected and rejected candidate decision reasons
- [X] T023 [US2] Update `.codex/skills/local-ai-card-routine/SKILL.md` to require same-run verification notes for exact metrics
- [X] T024 [US2] Ensure `scripts/local_ai_research_pipeline.sh` writes `research/ai-routine/resume.md` when unsafe dirty state blocks synchronization
- [X] T025 [US2] Ensure `scripts/local_ai_research_pipeline.sh` writes `research/ai-routine/resume.md` when Codex fails or cannot complete safely
- [X] T026 [US2] Ensure `scripts/local_ai_research_pipeline.sh` pauses repeated unattended retries after known-broken Codex failure with `.local-ai-research.disabled`
- [X] T027 [US2] Validate User Story 2 with quickstart Scenarios 3, 5, and 6 in `specs/001-ai-card-routine/quickstart.md`

**Checkpoint**: User Story 2 is complete when every completed run has an audit note and every unsafe/incomplete run has an actionable checkpoint.

---

## Phase 5: User Story 3 - Keep scope limited to study-android cards (Priority: P3)

**Goal**: The routine remains focused on study-android card publication and does not create app-factory-android issues, feature branches, or PRs.

**Independent Test**: Run the routine and confirm that it changes only study-android card/research outputs and does not create or modify app-factory-android issue/PR workflows.

### Implementation for User Story 3

- [X] T028 [P] [US3] Add app-factory-android non-goals to `research/ai-routine/README.md`
- [X] T029 [P] [US3] Add app-factory-android forbidden side effects to `.codex/skills/local-ai-card-routine/SKILL.md`
- [X] T030 [US3] Update `scripts/local_ai_research_pipeline.sh` prompt text to say Android topics are educational card content, not app feature requests
- [X] T031 [US3] Add a manual verification command snippet for app-factory issue/PR non-mutation to `research/ai-routine/README.md`
- [X] T032 [US3] Validate User Story 3 with quickstart Scenario 4 in `specs/001-ai-card-routine/quickstart.md`

**Checkpoint**: User Story 3 is complete when routine instructions, logs, and validation all show no app-factory-android issue/PR side effects.

---

## Phase 6: Polish & Cross-Cutting Concerns

**Purpose**: Final verification and documentation consistency across the whole routine.

- [X] T033 [P] Update `README.md` to summarize the study-android routine scope and link to `research/ai-routine/README.md`
- [X] T034 [P] Check generated Spec Kit docs for consistency in `specs/001-ai-card-routine/`
- [X] T035 Run quickstart Scenario 1 in `specs/001-ai-card-routine/quickstart.md` against the currently installed scheduler
- [X] T036 Run repository consistency validation for `scripts/auto_post.rb`, `_data/cards.yml`, `_data/ai_queue.yml`, and whitespace checks
- [X] T037 Confirm `.local-ai-research.disabled` and `research/ai-routine/resume.md` state matches the latest routine health
- [X] T038 Confirm `git status --short` contains only intentional changes before commit
- [X] T039 Commit the routine-spec and instruction updates from `specs/001-ai-card-routine/`, `.codex/skills/local-ai-card-routine/SKILL.md`, `research/ai-routine/README.md`, `scripts/local_ai_research_pipeline.sh`, and `README.md` with a Lore-format commit message
- [X] T040 Push the final study-android routine planning/update commit to `origin/master`

---

## Dependencies & Execution Order

### Phase Dependencies

- **Setup (Phase 1)**: No dependencies — can start immediately.
- **Foundational (Phase 2)**: Depends on Setup completion — blocks all user stories.
- **User Story 1 (Phase 3)**: Depends on Foundational completion — MVP.
- **User Story 2 (Phase 4)**: Depends on Foundational completion; can run after or alongside US1 if file edits are coordinated.
- **User Story 3 (Phase 5)**: Depends on Foundational completion; can run after or alongside US1/US2 if file edits are coordinated.
- **Polish (Phase 6)**: Depends on all desired user stories being complete.

### User Story Dependencies

- **User Story 1 (P1)**: No dependency on US2 or US3 after foundational guardrails.
- **User Story 2 (P2)**: No dependency on US1 output, but shares routine documentation and skill files.
- **User Story 3 (P3)**: No dependency on US1/US2 output, but shares routine documentation, skill files, and prompt text.

### Within Each User Story

- Update stable instructions before changing prompt text.
- Keep shared-file edits coordinated because `.codex/skills/local-ai-card-routine/SKILL.md`, `research/ai-routine/README.md`, and `scripts/local_ai_research_pipeline.sh` are touched by multiple stories.
- Validate each story independently using the matching quickstart scenario before moving to polish.

### Parallel Opportunities

- T003, T004, T005 can run in parallel during setup.
- T012 and T013 can run in parallel if edits are merged carefully.
- T020 and T021 can run in parallel in `research/ai-routine/README.md` only if coordinated; otherwise run sequentially.
- T028 and T029 can run in parallel because they target different files.
- T033 and T034 can run in parallel during polish.

---

## Parallel Example: User Story 1

```text
Task: "Define the candidate topic checklist in .codex/skills/local-ai-card-routine/SKILL.md"
Task: "Define the evidence source requirements in .codex/skills/local-ai-card-routine/SKILL.md"
```

## Parallel Example: User Story 2

```text
Task: "Define required research note fields in research/ai-routine/README.md"
Task: "Define resume checkpoint required fields in research/ai-routine/README.md"
```

## Parallel Example: User Story 3

```text
Task: "Add app-factory-android non-goals to research/ai-routine/README.md"
Task: "Add app-factory-android forbidden side effects to .codex/skills/local-ai-card-routine/SKILL.md"
```

---

## Implementation Strategy

### MVP First (User Story 1 Only)

1. Complete Phase 1: Setup.
2. Complete Phase 2: Foundational guardrails.
3. Complete Phase 3: User Story 1.
4. Stop and validate that a qualified topic can produce a source-backed card, audit note, and publication log entry.

### Incremental Delivery

1. Deliver US1 for verified card publication.
2. Deliver US2 for auditability, resume, and failure-loop safety.
3. Deliver US3 for explicit study-android-only scope boundaries.
4. Finish with scheduler health and repository consistency checks.

### Safe Automation Strategy

1. Keep the routine Codex-only unless owner explicitly changes direction.
2. Stop and checkpoint on unsafe state rather than guessing.
3. Disable repeated unattended retries after known-broken Codex failure.
4. Treat all card content as public-facing.
5. Never mutate app-factory-android issue/PR state from this routine.
