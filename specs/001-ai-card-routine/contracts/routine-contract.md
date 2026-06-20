# Contract: Study-Android AI Card Routine

## Purpose

Define externally observable behavior for the unattended study-android card routine.

## Inputs

- Existing study-android card data and publication log
- Existing research audit notes and optional resume checkpoint
- Current public/reputable web sources for AI topics and AI+Android development topics
- Current repository state and remote state
- Owner constraints: local routine, Codex-only execution, no GitHub Actions, no app-factory-android automation

## Allowed Outputs

The routine may create or modify only study-android card-publication artifacts:

- Card data
- AI topic queue data when useful
- Publication log
- Research audit notes
- Resume checkpoint
- Local disabled marker for known-broken unattended execution
- Local runtime logs
- Spec/planning documentation when explicitly requested

## Forbidden Outputs

The routine must not:

- Create or update app-factory-android GitHub issues
- Create or update app-factory-android pull requests
- Create app-factory-android feature branches
- Comment on app-factory-android issues or PRs
- Add GitHub Actions for this routine
- Publish private or sensitive information in card content
- Force cards from weakly supported candidates

## Successful Run Contract

A successful run must satisfy all of the following:

1. Repository state is safe to edit or the run stops before editing.
2. Candidate topics are evaluated against usefulness, recency, evidence, popularity/adoption, and duplication criteria.
3. Published cards have source-backed central claims.
4. Exact popularity metrics, if present, are verified during the run.
5. Research notes record selected and meaningful rejected candidates.
6. Repository consistency validation passes before publication.
7. Changes are committed and pushed to study-android when content changes exist.
8. No app-factory-android issue/PR side effects occur.

## No-Card Run Contract

A run that publishes no cards is successful when:

1. It evaluated candidates or resumed a checkpoint.
2. It records why no candidate passed or why no content change was needed.
3. It leaves repository state valid and safe.
4. It does not create unrelated side effects.

## Failure/Checkpoint Contract

A run must stop and checkpoint when:

- Repository state is dirty before safe synchronization.
- Provider or quota state prevents reliable completion.
- Validation fails and cannot be safely repaired in the current run.
- Continuing would cause repeated waste after a known-broken condition.

The checkpoint must include blocking reason, completed research, pending actions, and whether scheduled execution is paused.
