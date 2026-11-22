# goose oi-kit card refinement — 2026-11-22

## Decision
Keep goose as an AI developer topic, but replace the stale feature inventory with a precise Kotlin SDK boundary that can inform Android teams evaluating in-app AI. Do not claim Android compatibility unless the target artifact and device matrix are independently verified.

## Sources checked
- https://github.com/aaif-goose/goose — old `block/goose` URL redirects to the current `aaif-goose/goose` repository. The repository identifies the project as part of AAIF, shows Apache-2.0, and displayed 56.9k stars / 6.6k forks on 2026-11-22.
- https://goose-docs.ai/docs/oi-kit/reference/ — official API reference says oi-kit is a set of Rust crates with Python/Kotlin bindings; those bindings expose providers, streaming completions, and conversation compaction, but not the full Rust agent state machine. It explicitly says oi-kit is alpha and APIs can change.
- https://goose-docs.ai/docs/oi-kit/sdk/api-reference/?language=kotlin — generated Kotlin reference exposes provider operations such as `stream`, `complete`, and `compact`.
- https://goose-docs.ai/docs/oi-kit/ — official overview distinguishes a complete goose agent from oi-kit components used to build an agent into an application.

## Fact checks and corrections
- Removed the previous combination of BYO-LLM/provider-count claims, Rust language percentage, platform support, MCP extension count, AAIF governance and subrecipe execution limits. Those claims were either volatile or no longer the clearest current lesson.
- Reframed the card around an Android-relevant integration question: Kotlin bindings exist, but they do not equal a full agent runtime. The app still needs to decide how it handles tools, approvals, state, and lifecycle.
- The sources confirm Kotlin bindings and alpha status but do not, by themselves, establish an Android-compatible Maven artifact, ABI coverage, minimum OS, or production readiness. The card explicitly treats those as verification tasks rather than asserting compatibility.
- GitHub popularity is a dated snapshot, not a durable product characteristic.

## Card updates
- Added intermediate level, a concise scope statement, explicit Kotlin API boundaries, Android integration checks, three primary-source links, and an interview question/answer.
- Updated the canonical repository URL and removed the obsolete star count and mixed feature inventory.

Confidence: high for the documented Kotlin API boundary, repository status, and alpha caveat; medium for Android integration usefulness, which is a fit-to-audience inference and not a compatibility claim.
