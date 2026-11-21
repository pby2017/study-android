# Android Studio parallel Agent Mode chats — refinement — 2026-11-22

## Decision

Keep the practical concurrency card, but correct its version scope. The existing card stated “chats do not isolate files” as a present invariant based on the Quail 2 launch note. Quail 2 explicitly lacked worktree support, but the newer Quail 4 announcement adds parallel-task status and change-review UX without saying whether worktree isolation has since changed. Therefore, describe the Quail 2 limitation as version-specific and instruct readers to verify the installed version instead of asserting a current universal condition.

## Verified evidence

- Android Studio Agent Mode current documentation: multiple conversations run concurrently; users can switch between active tasks and monitor them in Recent Chats. Agent Mode can make multi-file edits; users review/approve changes. Last updated 2026-07-14.
  - https://developer.android.com/studio/gemini/agent-mode
- Android Studio Quail 2 stable announcement (2026-07-16): parallel chats; choose models chat by chat; at that release worktree support was unavailable and Google warned simultaneous edits to the same files could cause editor conflicts.
  - https://developer.android.com/blog/posts/android-studio-quail-2-is-stable-multi-task-with-the-android-studio-ai-agent
- Android Studio Quail 4 stable announcement (2026-09-01): Quail 4 added Recent Chats indicators for running/paused/error/completed tasks and a consolidated Summary of Changes tab for reviewing diffs before applying modifications. Its announcement does not state whether worktree support changed after Quail 2.
  - https://developer.android.com/blog/posts/leverage-android-skills-and-gemma-4-in-android-studio-quail-4
- Quail 4 release notes (2026-10-01): confirm Quail 4 feature set and stable release; no worktree statement found in those notes.
  - https://developer.android.com/studio/releases/past-releases/as-quail-4-release-notes
- Popularity/relevance: current stable Quail 4 documentation continues to describe parallel chats as a supported Agent Mode capability and adds status/review features. No star count or adoption metric is claimed.

## Card changes

- Reframed worktree absence as a Quail 2-specific fact.
- Added Quail 4's newer task status and diff-review UX context while explicitly noting that those sources do not resolve current worktree availability.
- Replaced categorical “the files are shared” assertion with a safe implementation rule: verify isolation for the installed release; until then avoid overlapping file writes and inspect diffs/tests.
- Added intermediate level and interview answer.

## Confidence

High for each release-specific claim. Current worktree status is deliberately left unclaimed because the reviewed current docs do not specify whether it changed after Quail 2.
