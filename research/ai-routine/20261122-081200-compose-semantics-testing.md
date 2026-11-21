# Compose UI Semantics testing card refinement

Date: 2026-11-22 08:12 KST

## Decision
Refine the existing Compose UI testing card; keep it separate from Compose Test v2, which addresses coroutine scheduler synchronization rather than UI node semantics.

## Verified details
- Semantics describe meaning and role of Compose elements and provide context to accessibility services, autofill, and testing.
- The Compose testing framework uses the merged Semantics tree by default. Accessibility services use the unmerged tree and apply their own merge rules.
- Clickable/toggleable components commonly merge descendant semantics. `onRoot(useUnmergedTree = true).printToLog()` shows the unmerged tree for diagnosis.
- Custom low-level UI may need explicit semantics so accessibility services and tests can understand its role and actions.

## Sources
- [Semantics in Compose](https://developer.android.com/develop/ui/compose/accessibility/semantics)
- [Compose UI testing](https://developer.android.com/develop/ui/compose/testing)

## Confidence
High. Claims follow the current official Compose reference. No version-sensitive numeric claims included.
