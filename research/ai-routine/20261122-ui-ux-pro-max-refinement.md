# UI UX Pro Max card refinement

Date: 2026-11-22 (Asia/Seoul)

## Evidence checked

- Project README: https://github.com/nextlevelbuilder/ui-ux-pro-max-skill
  - Current repository describes a multi-assistant design skill and lists Android / Jetpack Compose among 22 supported stacks.
  - Current catalog statements: 80 searchable styles (51 active), 194 product types/palettes, 74 font pairings, and 141 UX guidelines. These are project-maintained catalog counts, not independent quality evaluations.
  - Current Claude Code install instructions are ` /plugin marketplace add nextlevelbuilder/ui-ux-pro-max-skill` then `/plugin install ui-ux-pro-max@ui-ux-pro-max-skill`; README also documents Codex and other harnesses.
  - License is MIT.
- GitHub API snapshot checked live on 2026-11-22: 152,591 stars, 16,090 forks; pushed 2026-11-22T04:08:27Z. The card labels this as a dated attention signal, not proof of quality.
- Android primary sources checked for the card's validation advice:
  - https://developer.android.com/develop/ui/compose/testing
  - https://developer.android.com/develop/ui/compose/accessibility

## Changes and rationale

- Replaced stale catalog counts (67 styles, 161 palettes, 57 fonts, 15 stacks, 99 guidelines, 161 reasoning rules) with current README counts, clearly attributed to the project.
- Corrected the Claude plugin install command and clarified the skill is available beyond Claude Code.
- Made the Android link concrete: Jetpack Compose is explicitly listed in the project's supported stacks.
- Added a caveat that catalog size and generated suggestions do not prove UX/accessibility quality; recommend validating existing design constraints, Compose behavior, accessibility, and device configurations.
- Added intermediate difficulty, updated popularity snapshot, and an interview question/answer.

Confidence: high for current README claims, install instructions, license, and observed GitHub counts; medium for practical design quality because catalog self-description and repository popularity do not independently validate user outcomes.
