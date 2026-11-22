# Bumblebee card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Re-check the older Perplexity Bumblebee card for current scope, claims, activity, and overlap.

## Decision

Retain the card. Its distinct lesson is incident-response coverage of developer endpoint state: lockfiles, install metadata, editor/browser extension manifests, and supported MCP configs. This complements rather than duplicates the deck's MCP security guidance because it inventories local installations and matches them against an operator-provided exposure catalog.

## Evidence

- Official README: <https://github.com/perplexityai/bumblebee/blob/main/README.md>
  - Read-only inventory collector for macOS and Linux; emits NDJSON records.
  - Matches exact entries from a supplied exposure catalog; it is not a general vulnerability detector.
  - Does not run package managers or read source files.
  - Codex `config.toml` and Continue YAML are outside current MCP configuration coverage; skills without lockfiles are not enumerated.
  - Profiles: `baseline`, `project`, and `deep`; one-shot invocation, with scheduling delegated to an external runner.
- GitHub repository page (checked 2026-11-22): <https://github.com/perplexityai/bumblebee>
  - 5.2k stars / 470 forks on the rendered page; live API snapshot: 5,167 stars, 470 forks.
  - Apache-2.0; repository is not archived; last push 2026-11-18.
- Releases: <https://github.com/perplexityai/bumblebee/releases>
  - Latest release remains v0.1.2, published 2026-06-18. Recent main-branch activity added catalog and inventory coverage, but release recency is modest.

## Card changes

- Reframed title and summary around the SBOM/EDR gap and developer endpoint incident response.
- Removed the broad scanner-surface inventory; added profile purposes and explicit scope limits.
- Clarified that no result means no exact match in the scanned/covered scope, not proof of a clean endpoint.
- Added interview retrieval question on interpreting negative scan results.
- Added level `고급`; kept dated popularity/release snapshot.

## Validation

Ruby syntax and YAML parse, targeted card fields, routine tests, and `git diff --check` are run before commit.

Confidence: high on README-stated boundaries and current repo/release snapshot; medium-high on the comparative claim that the card is non-duplicative, based on deck concept review.
