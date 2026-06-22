# Older-card refinement cursor

Purpose: let the local AI card routine revisit existing published cards in oldest-first order and improve detail/readability without losing the main research cadence.

Current position: start at the oldest routine-published AI / AI+Android cards in `_data/cards.yml` and `auto-post-log.md`.

Per successful refinement run, update this file with:
- timestamp
- titles reviewed
- titles refined
- titles skipped and why
- next oldest title or approximate file position to continue from

Rules:
- Only refine when the card's source can be re-verified from public sources.
- Keep cards scoped to AI or AI+Android developer education.
- Prefer clearer summaries and practical bullets over longer prose.
- Do not update this cursor if verification fails or changes are not committed.
