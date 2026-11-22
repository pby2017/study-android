# koog-compose card retirement — 2026-11-22

## Decision

Remove the separate `koog-compose` card from the active deck. Keep the established first-party Koog card; do not merge claims from this third-party wrapper into it.

## Evidence checked

- [koog-compose GitHub repository](https://github.com/BrianMwas/koog-compose), reviewed Nov 22, 2026: public, 15 stars, 0 forks, 192 commits; README lists v2.1.0 (released June 14, 2026), with Koog 1.0.0 and Kotlin 2.3.20. The GitHub API reports latest commit `d8edab44c9e365adaa29785312b7c73a17eaafc6` on July 25 and last push Aug 24.
- The README describes an opt-in Android module for device tools/WorkManager and a LiteRT-LM Gemma 4 provider. It also documents that a configured `onUnavailable` cloud fallback sends conversation history, tool results, arguments, and application context to that provider.
- [JetBrains Koog official docs](https://docs.koog.ai/) state the first-party Koog framework supports Kotlin Android targets. The neighboring existing Koog card already teaches developers to verify Android artifacts per version and distinguish an agent framework from an on-device model runtime.

## Rationale and caveats

The third-party wrapper is an interesting implementation example, but its attention signal is low and its release/commit activity is several months old at review time. The core lesson overlaps with the nearby Koog card and other AI+Android agent/runtime cards. The README's production-security and privacy statements are project claims, not independent security verification; the card is removed rather than preserving those as recommendations. This does not mean the repository is archived or broken.

Confidence: high on the GitHub metadata snapshot and documented claims; medium on the retirement choice, which applies the project's preference for distinct, currently attended topics.
