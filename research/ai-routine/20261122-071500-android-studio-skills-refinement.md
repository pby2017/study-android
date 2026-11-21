# Android Studio Agent Skills card refinement — 2026-11-22

## Decision

Refined the existing AI+Android card. Android Studio skills are no longer just a Canary feature: the official Oct 28 Android Studio Rabbit 2 announcement says the stable IDE includes a skill manager and bundled Android/Firebase skills. Kept the learning point focused on on-demand reusable agent expertise, not a directory-specific setup tutorial.

## Sources checked

- [Extend Agent Mode with skills](https://developer.android.com/studio/gemini/skills) — Android Studio documentation, last updated 2026-09-25. Skills are on-demand; the model can select them based on the request and load the instructions/resources when relevant; users can invoke with `@`. It documents `.agents/skills` and `.android-studio/skills` for importing skills and explicitly says older `.skills` and `agent/skills` directories are legacy.
- [Overview of Android skills](https://developer.android.com/tools/agents/android-skills) — official overview, last updated 2026-09-02. Confirms reusable `SKILL.md`, optional `scripts/`, `references/`, and `assets/`, automatic or manual selection, Android CLI distribution, and compatibility with agents that support the skills standard. This page has directory guidance that conflicts with the more recently updated Android Studio-specific page; the card therefore makes no path claim.
- [Your favorite agents are now integrated in Android Studio](https://developer.android.com/blog/posts/ai-agents-android-studio-integration) — official Android Developers announcement, 2026-10-28. Confirms Rabbit 2 stable, skill management in the IDE, and bundled Android and Firebase skills.

## Card changes

- Removed outdated `.skills` location and Canary-only status.
- Explained the difference between persistent project instructions and skills loaded on demand.
- Added compact structure/reuse guidance and the current stable IDE / Android CLI entry points.
- Added an interview answer that explains the token/context and repeatability benefit without promising automatic selection in every agent.

## Popularity / attention and confidence

- Attention signal: official Android Studio stable release and current Android Studio skills documentation; no GitHub star claim included.
- Confidence: high for on-demand behavior, resource packaging, and stable IDE management. Directory-specific instructions vary by Android Studio version and agent; consult the current environment's own documentation.
