# Driftx card retirement — 2026-11-22

## Decision

Remove Driftx from the active card deck. The project has a useful stated AI+Android emulator-testing use case, but it does not currently meet the deck's attention/currentness threshold and overlaps nearby AI-assisted testing and visual-verification topics.

## Evidence checked

- [Driftx GitHub repository](https://github.com/nomanr/driftx) README: an AI CLI for interacting with React Native apps in Android emulators and iOS simulators; its setup requires Metro, ADB plus a booted Android emulator, or `xcrun simctl` plus a booted iOS simulator. The README says physical devices are not yet supported and lists an MIT license.
- GitHub REST API snapshot on 2026-11-22: 7 stars, 1 fork, 125 commits, not archived; last push was 2026-03-17. Its not-archived status is not evidence of ongoing maintenance.
- npm registry snapshot: latest version `0.1.5`; package metadata says it was published 2026-03-15.
- Existing nearby content already covers an AI mobile PR-test platform (Autonoma) and visual-bug evaluation/testing (SWE-bench Multimodal), so Driftx's practical surface is not sufficiently distinct for a low-attention, stale package.

## Rationale and caveat

The README describes a practical interaction-and-visual-check workflow, but current support/activity is not independently validated by recent releases or commits. Retiring this card does not claim Driftx is broken, archived, or unusable. If development resumes and attention rises, reassess it against the AI mobile-testing cards before restoring it.

Confidence: high on the dated stars, repository activity, and npm publication snapshot; medium on the keep/remove choice, which uses project-specific curation thresholds.
