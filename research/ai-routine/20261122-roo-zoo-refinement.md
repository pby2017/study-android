# Roo Code → Zoo Code card refinement

Date: 2026-11-22 (Asia/Seoul)

## Decision

Kept the card as a practical AI coding-tool lifecycle lesson: upstream archive, community fork, configuration transfer, and sensitive settings. Added intermediate level and an interview Q/A that asks readers to think beyond a successful file import.

## Sources checked

- https://github.com/RooCodeInc/Roo-Code — upstream repository marks itself public archive/read-only as of May 15, 2026, states the extension shut down, and lists Zoo Code and Cline as alternatives. The page showed 24.3k stars during this check.
- https://github.com/Zoo-Code-Org/Zoo-Code — Zoo Code describes itself as continuing development from the Roo foundation; lists Apache-2.0 and showed 2.1k stars during this check. It describes additions and invites issues/PRs, evidence of an active separate project rather than a guaranteed long-term commitment.
- https://docs.zoocode.dev/roo-to-zoo-migration — official export/import steps; imported settings are merged. The exported file can contain sensitive data including API keys and must be protected.
- https://www.zoocode.dev/ — current project page describes Zoo as a community fork and migration option. Product statements about same features/settings are treated as project claims, not independently verified equivalence guarantees.

## Changes and fact checks

- Refreshed Roo's star snapshot from the prior stale “24k” to the currently displayed 24.3k and explicitly dated it.
- Added a current Zoo Code snapshot (2.1k★) and Apache-2.0 license, dated; popularity is not treated as maintenance or security proof.
- Retained the archive date and corrected the claim to upstream repository/extension being read-only/shut down, not the code becoming unavailable.
- Clarified migration is settings export/import; the destination merges settings and the export may contain API credentials. The user must protect the file and re-check resulting provider configuration.
- Removed the claim that a fork “survival is guaranteed” by portability; replaced it with a lifecycle lesson to assess release activity, security support, and migration cost.

## Confidence

High for archive status/date, current repository star snapshots, license, and documented migration steps. The extent of behavioral/configuration compatibility can change across versions; it is intentionally not promised in the card.
