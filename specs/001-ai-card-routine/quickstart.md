# Quickstart: Validate Study-Android AI Card Routine

## Prerequisites

- Work from the study-android repository root.
- Ensure no unrelated local changes are present before running end-to-end validation.
- Confirm the target is study-android card publication, not app-factory-android issue/PR automation.

## Scenario 1: Validate current scheduled routine health

1. Inspect the scheduler state.
2. Confirm the interval is four hours.
3. Confirm the last exit code is successful.
4. Confirm no disabled marker or resume checkpoint exists unless intentionally paused.

**Expected outcome**: The routine is either waiting for the next interval after a successful run, actively running one cycle, or intentionally paused with a clear checkpoint.

## Scenario 2: Validate a successful publication batch

1. Inspect the latest routine log.
2. Confirm a research note was created for the cycle.
3. Confirm card data and publication log changes correspond to the selected topic.
4. Confirm validation passed before push.
5. Confirm the commit was pushed to study-android.

**Expected outcome**: A project owner can identify the selected topic, source URLs, evidence signals, verification result, commit reference, and publication time.

## Scenario 3: Validate evidence quality

1. Pick the latest published card from the routine.
2. Open the corresponding research note.
3. Check that the central card claim is supported by a reputable source.
4. Check any exact star count or metric was verified in the same run.
5. Check rejected candidates have decision reasons when researched.

**Expected outcome**: The card is source-backed, current, non-duplicative, and practically relevant to AI or Android developers.

## Scenario 4: Validate no app-factory side effects

1. Review the routine's changed files for the cycle.
2. Check the app-factory-android issue list and PR list only as external observation if needed.
3. Confirm the routine did not create, update, close, comment on, or branch for app-factory-android.

**Expected outcome**: All routine-produced changes remain within study-android card/research publication scope.

## Scenario 5: Validate no forced card behavior

1. Run or simulate a cycle where candidates do not meet the evidence gate.
2. Confirm no low-quality card is published.
3. Confirm the research note or checkpoint documents candidates considered and rejection reasons.

**Expected outcome**: The run is considered valid without a card when the quality bar is not met.

## Scenario 6: Validate failure loop protection

1. Simulate or observe a known-broken provider/environment failure.
2. Confirm a resume checkpoint is written.
3. Confirm unattended repeated execution is paused or disabled until recovery is confirmed.
4. Confirm recovery requires a successful smoke test or equivalent owner-verified signal before resuming.

**Expected outcome**: The routine does not waste resources retrying a known-broken setup every four hours.

## Completion checklist

- Latest run has either a publication record or checkpoint.
- Published cards have source-backed central claims.
- Exact metrics are same-run verified or omitted.
- No app-factory-android issues or PRs were touched.
- Repository consistency validation passed before push.
