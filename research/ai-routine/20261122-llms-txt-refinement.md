# llms.txt card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked the proposal's current v2 and Google's current official generative-AI search guide:
  - https://llmstxt.org/
  - https://llmstxt.org/changes.html
  - https://developers.google.com/search/docs/fundamentals/ai-optimization-guide
- Corrected the categorical “standard” framing. The project author calls llms.txt an open proposal. The file can provide a concise site/path overview and links, but no universal client behavior is guaranteed by that proposal.
- Corrected the card's v1-era `Optional` assertion. In v2 it is a convention for secondary links, not a mechanically special section. Added subpath coverage and the current H1/summary/links shape.
- Added Google's explicit boundary: Search, including its generative-AI features, does not use llms.txt; the file neither helps nor harms Google Search visibility. Do not imply that publishing it boosts rankings.
- Added labeled multiple source links to the card template while keeping every existing `source` string compatible. Added a navigation test for both the labeled multi-source path and legacy single-source fallback.
- No card overlap found: this is a web-doc navigation proposal and Google Search discoverability boundary, unlike the nearby docs-platform comparison card.
- Validation: YAML parse and source fields; Ruby syntax; auto-post tests; card navigation/source-template tests; `git diff --check`. Jekyll rendering could not be run because the `jekyll` executable is not installed.
