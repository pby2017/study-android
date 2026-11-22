# KotlinSyft card refinement — 2026-11-22

## Decision

Keep the card, but only as a historical architecture and privacy lesson—not as an Android library recommendation. The core model-centric federated-learning flow remains useful to understand, and the deck has no other Android federated-learning card. The specific KotlinSyft/PyGrid stack is stale: KotlinSyft has not had a source push since August 2021, and its README pins old PySyft/PyGrid commits. PyGrid says it was deprecated/moved into the PySyft monorepo. Current PySyft is active, but its current README does not document KotlinSyft or Android compatibility; do not imply the old worker still integrates with it.

## Sources checked

- KotlinSyft README: https://github.com/OpenMined/KotlinSyft — describes Android-local model training, model-diff reporting to PyGrid, old pinned PySyft/PyGrid commits, and marks secure aggregation/MPC as in progress. Current source tree remains on the `dev` branch.
- KotlinSyft GitHub API: https://api.github.com/repos/OpenMined/KotlinSyft and https://api.github.com/repos/OpenMined/KotlinSyft/releases?per_page=1 — checked 2026-11-22: repository is not marked archived; 89 stars/24 forks; last push `2021-08-20T19:03:21Z`; latest GitHub release `0.5.0-rc.1` dated 2021-04-01. Do not describe it as archived; describe its observed inactivity.
- OpenMined PyGrid README: https://github.com/OpenMined/PyGrid/blob/dev/README.md — explicitly says the repository is deprecated and moved into `OpenMined/PySyft/tree/dev/packages/grid`; PyGrid GitHub API reports archived.
- Current PySyft README/releases: https://github.com/OpenMined/PySyft and https://api.github.com/repos/OpenMined/PySyft/releases?per_page=1 — current repository is active (latest v0.10.2 release on Nov 21, 2026). The README checked in this run does not mention KotlinSyft/Android. This does not prove no third-party Android support exists; it means no current first-party integration was confirmed.
- OpenMined history: https://openmined.org/blog/announcing-new-libraries-for-fl-on-web-and-mobile/ — confirms KotlinSyft was part of the earlier PySyft/PyGrid model-centric mobile FL ecosystem.
- Privacy evidence: https://proceedings.neurips.cc/paper_files/paper/2019/hash/60a6c4002cc7b29142def8871531281a-Abstract.html and https://proceedings.mlr.press/v216/wu23a.html — research demonstrates gradient inversion can recover training examples under studied conditions. This establishes a real threat class, not that every FL update or every deployment is recoverable.

## Attention / freshness

KotlinSyft has 89 stars and 24 forks, but no source activity for over five years; this is legacy interest, not current momentum. PySyft's current project has over 10k stars and recent activity, but those signals apply to PySyft, not KotlinSyft. No exact volatile star count was added to the public card.

## Card change

- Added `중급` and a retrieval question on why sending model diffs does not guarantee privacy.
- Clarified the old Android worker's sequence: server model/plan → on-device training → model diff back to server.
- Kept the caveat that secure aggregation/MPC were marked in progress in the old README.
- Replaced a vague “old ecosystem” statement with observed activity/dependency status: no push since 2021, old pinned commits, PyGrid migration, and no current KotlinSyft integration documented in PySyft's README.
- Retained as a historical lesson rather than adding/removing a card, because the model-centric Android FL pattern and privacy boundary are useful and not duplicated elsewhere in the deck.

## Confidence

High for repository activity, release date, README claims, PyGrid deprecation notice, and the cited research risk. Medium for the absence of a current Android successor: only official current README/repository surfaces were checked, not every third-party implementation.
