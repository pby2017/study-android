# Android UI state cards merge

Date: 2026-11-22 08:09 KST

## Decision
Merge the cards `화면 상태 복원 — ViewModel·SavedState·DB의 수명 구분` and `ViewModel은 프로세스 사망까지 기억하지 않는다`. Both teach the same state-lifetime ladder. The second card's useful emphasis (ViewModel does not survive process death and SavedStateHandle stores only small restoration state) is integrated into the first, reducing duplication without losing the interview learning objective.

## Verified lifecycle distinctions
- `ViewModel` is in-memory and survives configuration changes, but not system-initiated process death.
- `SavedStateHandle` and Compose saved-state APIs can restore small transient UI state after system process death while the task remains. They are not durable storage, and saved data is captured when the Activity stops.
- User dismissal, such as removing the app from Recents, removes the task and its saved state.
- Large or durable app data belongs in persistent local/network storage; saved state should carry only minimal values needed to rebuild UI, such as an identifier.

## Sources
- [Save UI states](https://developer.android.com/topic/libraries/architecture/saving-states), lifecycle/storage comparison and saved-state guidance.
- [Saved State module for ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel/viewmodel-savedstate), task stack behavior and SavedStateHandle limits.

## Confidence
High. Both sources are official Android documentation and directly support the retained distinctions.
