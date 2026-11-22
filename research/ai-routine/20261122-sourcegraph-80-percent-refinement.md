# Sourcegraph “80% problem” card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh the next oldest eligible AI card after subagent patterns.

## Decision

- Retain the concept as a concise completeness-check habit: inspect affected call sites and repository-wide constraints, then validate through tests and review.
- Difficulty: Intermediate; applies to AI-assisted changes across packages or repositories.
- Do not present “80%” as a measured rate. The article explicitly says it is shorthand, not a measured ratio.

## Evidence and framing

1. Sourcegraph article (Matt Tanner, Sep 19, 2026): <https://sourcegraph.com/blog/agentic-coding>
   - Defines the “80% problem” as locally visible changes that miss repository-wide constraints beyond the agent context: callers, DTOs, auth, audit logs, sibling-repository integration tests, and frontend checks.
   - Recommends making the blast radius visible and checking completeness after the agent reports completion.
   - The article also cites Sourcegraph's CodeScaleBench and promotes its code-intelligence tools. Those vendor-owned benchmark and product claims are omitted from the public card.
2. Sourcegraph search query docs: <https://sourcegraph.com/docs/code-search/queries/language>
   - Search may stop when a full page is found; `count:all` asks it to wait for all results (within query/time constraints). The card frames this as a query option, not proof of globally complete coverage.

## Removed / corrected

- Corrected the publication date from May 21 to Sep 19, 2026.
- Explicitly clarified that 80% is a metaphor, not a success metric.
- Removed the unsupported absolute claim that agents reliably complete exactly 80% and miss the other 20%.
- Removed the oversimplified “embeddings versus exact search” prescription and Sourcegraph-specific benchmark results.
- Added a practical call-site search habit while clarifying that search alone does not establish correctness; tests and review remain necessary.
- Added level, sources and interview retrieval pair.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card schema, level, three points and two sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high for the article's own definition and query semantics; generalized advice is presented as a workflow heuristic, not a guarantee.
