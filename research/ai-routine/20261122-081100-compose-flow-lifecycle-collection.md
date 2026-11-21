# Compose lifecycle-aware Flow collection card

Date: 2026-11-22 08:11 KST

## Decision
Refine the existing Compose Flow collection card instead of adding a new one. Its lifecycle topic is distinct from the adjacent Compose side-effect API card.

## Verified claims
- `collectAsStateWithLifecycle` collects at or above `minActiveState`, whose default is `Lifecycle.State.STARTED`; collection stops below that state and restarts when the lifecycle becomes active again.
- For `StateFlow`, its current `.value` is used as the initial Compose State value.
- A regular cold Flow is collected again after restart, so its upstream work may run again. UI collection lifetime should not accidentally own work that needs another lifetime.

## Source
- [collectAsStateWithLifecycle API reference](https://developer.android.com/reference/kotlin/androidx/lifecycle/compose/collectAsStateWithLifecycle.composable)

## Confidence
High. The exact threshold and StateFlow initialization are stated by the API reference. Cold Flow recollection follows from the documented stop/restart collection semantics and Flow coldness.
