# Feature Specification: Study-Android AI Card Routine

**Feature Branch**: `[001-ai-card-routine]`

**Created**: 2026-06-19

**Status**: Draft

**Input**: User description: "Design the study-android routine, not app-factory-android. This session discovers, explores, researches, verifies, organizes, summarizes, and uploads AI topics and AI+Android development topics as cards to the study-android repository."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Publish verified topic cards (Priority: P1)

As the project owner, I want the routine to regularly find worthwhile AI topics and AI+Android development topics, validate them with evidence, and publish concise Korean cards to the study-android page so the site stays current without manual daily curation.

**Why this priority**: This is the core value of the project: turning current, useful developer knowledge into public-facing cards.

**Independent Test**: Can be tested by running one routine cycle with at least one qualified topic and confirming that a new card, source reference, and research note are produced without unrelated project changes.

**Acceptance Scenarios**:

1. **Given** the routine starts with no pending checkpoint, **When** it evaluates current AI or AI+Android development topics, **Then** it publishes only topics that pass evidence, usefulness, recency, and non-duplication checks.
2. **Given** a selected topic has multiple claims, **When** the card is written, **Then** each material claim is traceable to a reputable source recorded in the research note.
3. **Given** no topic meets the quality bar, **When** the routine finishes, **Then** it publishes no forced filler card and records that no qualified topic was selected.

---

### User Story 2 - Preserve auditability and resume safely (Priority: P2)

As the project owner, I want every routine cycle to leave a clear audit trail and safe resume state so I can understand what was researched, why topics were accepted or rejected, and what to do if a run is interrupted.

**Why this priority**: The routine runs unattended. Auditability and durable checkpoints prevent wasted research, repeated mistakes, and untraceable claims.

**Independent Test**: Can be tested by inspecting a completed or interrupted cycle and verifying that considered candidates, source URLs, signals, rejection reasons, selected card, and next actions are documented.

**Acceptance Scenarios**:

1. **Given** a routine cycle completes, **When** the research note is reviewed, **Then** it lists selected and rejected candidates with source URLs, evidence signals, decision reasons, and confidence.
2. **Given** a routine cycle cannot continue due to quota, provider failure, dirty local state, or another blocking condition, **When** it stops, **Then** it leaves a resume checkpoint with exact next actions rather than continuing blindly.
3. **Given** a previous checkpoint exists, **When** the next routine cycle starts, **Then** it resumes or resolves that checkpoint before starting unrelated research.

---

### User Story 3 - Keep scope limited to study-android cards (Priority: P3)

As the project owner, I want the routine to stay focused on study-android card publication and not create app-factory-android issues, feature branches, or PRs so project responsibilities remain separate.

**Why this priority**: Recent confusion came from mixing the study-android knowledge-card workflow with app-factory-android product-development automation.

**Independent Test**: Can be tested by running the routine and confirming that it changes only study-android card/research outputs and does not create or modify issue/PR workflows in app-factory-android.

**Acceptance Scenarios**:

1. **Given** the routine runs in the study-android context, **When** it completes, **Then** it publishes card-related changes only to study-android.
2. **Given** app-factory-android has open issues or PRs, **When** the study-android routine runs, **Then** it does not create, update, close, or comment on those issues or PRs.
3. **Given** a candidate topic is about Android app development, **When** it is selected, **Then** it is treated as educational card content, not as a request to implement an app-factory-android feature.

---

### Edge Cases

- If several high-quality topics are found, the routine prioritizes the most current, practical, and least duplicative topics rather than maximizing card count.
- If a topic is popular but weakly sourced, promotional, or not practically useful to developers, the routine rejects it.
- If a topic is useful but already covered by an existing card, the routine rejects or reframes it only when a clearly distinct angle exists.
- If source data such as star counts or release dates cannot be verified during the run, exact numeric claims are omitted or the candidate is rejected.
- If the publication target is private but intended for Pages visibility, the routine treats all card content as public-facing and excludes private or sensitive information.
- If another session has changed the repository, the routine synchronizes before editing or stops with a safe checkpoint when local changes would make synchronization unsafe.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The routine MUST focus exclusively on discovering, researching, validating, summarizing, and publishing study-android knowledge cards about AI topics and AI+Android development topics.
- **FR-002**: The routine MUST NOT create, update, close, comment on, or otherwise manage app-factory-android issues, branches, or pull requests.
- **FR-003**: The routine MUST evaluate candidate topics for practical developer value, current relevance, popularity or adoption signal, source quality, and duplication risk before publication.
- **FR-004**: The routine MUST record source URLs and evidence signals for each selected topic and for meaningful rejected candidates.
- **FR-005**: The routine MUST prefer primary or highly reputable sources for material claims, including official documentation, official release notes, benchmark pages, project repositories, or reputable engineering sources.
- **FR-006**: The routine MUST verify exact popularity metrics, such as star counts, during the same run before including those numbers in a card.
- **FR-007**: The routine MUST produce concise Korean card content that explains why the topic matters to AI developers or AI+Android developers.
- **FR-008**: The routine MUST publish no card when no candidate satisfies the quality gate.
- **FR-009**: The routine MUST maintain a research audit trail for every completed publication cycle.
- **FR-010**: The routine MUST leave a durable resume checkpoint when it cannot finish safely or when continuing would waste resources.
- **FR-011**: The routine MUST avoid repeated scheduled retries after a known-broken provider or environment failure until the failure is confirmed fixed.
- **FR-012**: The routine MUST validate that publication outputs are internally consistent before pushing them to the study-android repository.
- **FR-013**: The routine MUST synchronize with the latest study-android repository state before making edits when the local working state is clean.
- **FR-014**: The routine MUST stop and checkpoint instead of overwriting or mixing unrelated local changes.
- **FR-015**: The routine MUST treat all published card content as public-facing, even if the repository visibility is private at the time of publication.

### Key Entities *(include if feature involves data)*

- **Candidate Topic**: A potential AI or AI+Android development subject; includes title, category, source candidates, usefulness rationale, recency signal, popularity or adoption signal, and duplication status.
- **Evidence Source**: A source used to verify a claim; includes URL, source type, claim supported, retrieval timing, and trust level.
- **Knowledge Card**: A public-facing Korean summary card; includes category, title, summary, key points, and source reference.
- **Research Run**: One scheduled or manual cycle; includes start time, candidates considered, selected topics, rejected topics, verification result, checkpoint status, and publication result.
- **Resume Checkpoint**: A durable record created when a run cannot finish; includes blocking reason, already completed research, unresolved candidate decisions, and exact next actions.
- **Publication Batch**: A set of card and log updates produced by one successful run; includes changed content, validation outcome, commit reference, and push status.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: At least 95% of completed routine cycles either publish one or more evidence-backed cards or explicitly document why no topic met the quality bar.
- **SC-002**: 100% of published cards include a source reference that supports the card's central claim.
- **SC-003**: 100% of exact popularity metrics included in cards are verified during the same routine cycle and recorded in the audit trail.
- **SC-004**: 100% of routine cycles leave either a completed publication record or a resume checkpoint with next actions.
- **SC-005**: 0 routine cycles create or modify app-factory-android issues, branches, or pull requests.
- **SC-006**: 100% of successful publication batches pass repository consistency validation before being pushed.
- **SC-007**: The routine avoids resource-wasting failure loops by disabling or pausing repeated unattended runs after a known environment or provider failure until recovery is confirmed.
- **SC-008**: A project owner can determine what was published, what was rejected, and why within 5 minutes by reading the run audit trail.

## Assumptions

- The target audience is developers interested in practical AI tooling, LLMs, AI agents, AI infrastructure, and AI+Android development trends.
- The routine is for study-android only; app-factory-android product issue/PR automation is out of scope.
- The routine may run unattended on the project owner's local environment, but the specification defines expected behavior rather than a required scheduling technology.
- Published cards are intended for eventual GitHub Pages visibility and must be safe for public reading.
- Quality is more important than volume; a run that publishes nothing can still be successful if it documents that no candidate passed the gate.
- Existing card data and research notes are the source of truth for duplicate detection and audit continuity.
