# Research: Study-Android AI Card Routine

## Decision: Keep the routine scoped to study-android card publication only

**Rationale**: The project owner's clarified intent is knowledge-card production for AI and Android development topics. app-factory-android is a separate product-development repository with its own issue and PR workflows. Mixing those responsibilities caused confusion and would make validation ambiguous.

**Alternatives considered**:
- Combine card publication with app-factory issue creation — rejected because it violates the clarified session boundary and creates unrelated side effects.
- Add optional app-factory reporting — rejected for this feature because even read/write coupling could blur responsibility; status checks can be done manually outside the routine.

## Decision: Use an evidence-first candidate gate

**Rationale**: Published cards are public-facing. The routine must prioritize practical developer value, current relevance, source quality, adoption or popularity signals, and duplicate avoidance. Exact star counts or similar numbers must be verified during the same run to avoid stale claims.

**Alternatives considered**:
- Publish a fixed number of cards each cycle — rejected because it encourages filler and weak evidence.
- Publish based on popularity alone — rejected because popular topics may be promotional, irrelevant, duplicated, or weakly sourced.

## Decision: Treat no-card cycles as valid when documented

**Rationale**: The owner explicitly prefers quality over forced volume. A cycle that rejects all candidates should still be successful if it records candidates checked and why they failed the quality gate.

**Alternatives considered**:
- Force at least one card per run — rejected because it conflicts with the weak-evidence rejection rule.
- Skip audit notes when no card is published — rejected because it hides the work done and repeats future research.

## Decision: Maintain durable audit and resume artifacts

**Rationale**: The routine runs unattended and may stop due to quota, provider failure, dirty repository state, or external service instability. Durable research notes and checkpoints preserve context across headless sessions and prevent repeated work.

**Alternatives considered**:
- Rely only on runtime logs — rejected because logs are noisy, less structured, and may be ignored or rotated.
- Rely on agent memory — rejected because headless sessions start fresh and should not depend on conversation context.

## Decision: Disable repeated unattended runs after known-broken Codex failure

**Rationale**: If Codex or the environment is broken, repeating every four hours wastes local/API resources and creates noise. The routine should stop, write next actions, and require confirmed recovery before resuming scheduled work.

**Alternatives considered**:
- Keep retrying every interval — rejected as wasteful after a known failure.
- Fall back to other providers — rejected by owner request; the routine is Codex-only.

## Decision: Publish only after consistency validation

**Rationale**: The repository powers public cards. Broken card data, invalid logs, or malformed research notes would degrade the site and future routine runs.

**Alternatives considered**:
- Let GitHub Pages/build failures catch problems later — rejected because failures should be caught before push.
- Manual-only review — rejected because the routine is intended to run unattended.
