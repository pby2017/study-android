# GNAP card review — 2026-11-22

## Decision
Remove the GNAP card from the public deck rather than refreshing it. GNAP is a Git-native agent-coordination RFC draft, but it does not currently meet the deck's popularity/recency bar for a broadly useful developer topic.

## Sources checked
- https://github.com/farol-team/gnap — upstream README identifies GNAP as an RFC draft and describes its proposed `.gnap/` files, pull/work/push heartbeat, and Git-history audit trail. GitHub showed 87 stars and 7 forks when checked.
- https://api.github.com/repos/farol-team/gnap — GitHub API returned 87 stars, 7 forks, 2 open issues, MIT license, and `pushed_at` 2026-03-17T21:12:21Z (queried 2026-11-22).
- https://github.com/farol-team/gnap/issues — the two open issues concern formal JSON Schema definitions and a field-name mismatch between the README and an example.

## Selection rationale
- The concept is relevant to AI agent orchestration, but the repository explicitly labels the specification a draft.
- At review time it had 87 stars and 7 forks, with its last push in March 2026 and only two open issues; this is weak evidence of current adoption compared with the project's stated focus on hot, useful topics.
- The existing card already admitted low popularity, but still spent a slot on a niche proposal without a demonstrated broad implementation. Removing it reduces deck noise and avoids presenting its README claims as a mature protocol.
- This is a curation choice, not a claim that Git-native coordination is technically invalid. Reconsider only if the spec gains adoption, implementation, or maintenance activity.

Confidence: high for the repository's draft status, current popularity snapshot, and last-push timestamp; medium for the editorial relevance threshold.
