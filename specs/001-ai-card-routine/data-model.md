# Data Model: Study-Android AI Card Routine

## Candidate Topic

Represents one possible AI or Android development subject evaluated during a routine cycle.

**Fields**:
- `title`: concise candidate name
- `category`: AI, Android development, tooling, benchmark, workflow, or adjacent developer topic
- `developer_value`: why the topic matters to developers
- `recency_signal`: release date, update date, changelog date, or current industry attention
- `popularity_signal`: stars, forks, adoption, benchmark mention, official coverage, or reputable external coverage
- `source_candidates`: evidence sources considered
- `duplicate_status`: new, duplicate, or distinct angle from existing card
- `decision`: selected, rejected, queued, or deferred
- `decision_reason`: concise rationale
- `confidence`: low, medium, or high

**Validation rules**:
- Selected candidates must have clear developer value.
- Selected candidates must have at least one reputable source supporting the central claim.
- Exact popularity metrics must be verified during the same run or omitted.
- Rejected candidates should include a reason when meaningful research time was spent.

## Evidence Source

Represents a source used to verify a candidate or card claim.

**Fields**:
- `url`: source location
- `source_type`: official docs, release notes, repository, benchmark, engineering post, news source, or other
- `claim_supported`: the specific claim the source supports
- `retrieved_at`: run-local retrieval timing when relevant
- `trust_level`: primary, reputable secondary, weak, or rejected

**Validation rules**:
- A published card's central claim must be supported by at least one primary or reputable source.
- Weak or promotional sources cannot be the sole basis for publication.
- If a source does not support the exact claim, the claim must be removed or revised.

## Knowledge Card

Represents one public-facing Korean card added to the site.

**Fields**:
- `category`: content category, normally AI for this routine
- `title`: Korean title with a clear topic angle
- `summary`: concise Korean explanation of the topic and why it matters
- `points`: key takeaways for developers
- `source`: primary source URL

**Validation rules**:
- Must be safe for public GitHub Pages visibility.
- Must avoid private project details and credentials.
- Must not duplicate an existing card title.
- Must explain practical relevance, not just announce existence.

## Research Run

Represents one scheduled or manual routine cycle.

**Fields**:
- `started_at`: cycle start time
- `completed_at`: cycle completion time when successful
- `candidates_considered`: list of Candidate Topics
- `published_cards`: list of Knowledge Cards
- `rejected_candidates`: list of rejected Candidate Topics
- `verification_result`: pass, fail, or skipped with reason
- `checkpoint_status`: none, resume written, disabled after failure
- `publication_result`: no changes, committed and pushed, or stopped before publish

**Validation rules**:
- Each completed run must have an audit note.
- A run with no published card must still explain why no candidate passed.
- A failed or unsafe run must leave a resume checkpoint with exact next actions.

## Resume Checkpoint

Represents durable state for a run that could not safely finish.

**Fields**:
- `paused_at`: stop time
- `blocking_reason`: quota, provider failure, dirty repository, validation failure, or other
- `completed_research`: candidates and sources already checked
- `pending_actions`: exact next steps
- `safety_state`: whether scheduled retry is paused or allowed

**Validation rules**:
- Must be written before stopping when a run cannot safely complete.
- Must be resolved before unrelated new research begins.
- Must not contain secrets or private data.

## Publication Batch

Represents a successful set of repository changes produced by one run.

**Fields**:
- `cards_changed`: cards added or updated
- `log_entries_changed`: publication log updates
- `research_notes_added`: audit files added
- `validation_summary`: checks performed and outcomes
- `commit_reference`: commit identifier after push

**Validation rules**:
- Must pass consistency validation before push.
- Must not include app-factory-android issue/PR side effects.
- Must be traceable back to its Research Run.
