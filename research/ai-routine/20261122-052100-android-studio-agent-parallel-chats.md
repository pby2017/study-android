# Android Studio Agent Mode 병렬 대화 카드 점검

- Run date: 2026-11-22 (KST)
- Candidate: existing `Android Studio Agent Mode 병렬 대화` card; refined, not a new topic.
- Scope: AI+Android developer workflow. Distinct from the broad Agent Mode card: this card covers concurrency semantics and shared-file collision risk only.

## Evidence checked

1. Current [Android Studio Agent Mode docs](https://developer.android.com/studio/gemini/agent-mode?hl=en) say New Chat starts another thread, multiple tasks can run at the same time, and Recent Chats shows active conversations/progress.
2. Official [Android Studio Quail 2 stable announcement](https://developer.android.com/blog/posts/android-studio-quail-2-is-stable-multi-task-with-the-android-studio-ai-agent) says different models may be used per chat and explicitly states worktree support was unavailable at that release; concurrent modifications to the same project files can cause editor conflicts.
3. Official [Quail 4 recap](https://developer.android.com/blog/posts/leverage-android-skills-and-gemma-4-in-android-studio-quail-4) describes parallel chats in side-by-side tabs and progress indicators in Recent Chats.
4. Official [Rabbit 2 stable announcement](https://developer.android.com/blog/posts/ai-agents-android-studio-integration) establishes the then-current stable release context (2026-10-28). It does not announce parallel-chat worktree isolation. Do not infer from silence that the Quail 2 limitation is guaranteed unchanged in Rabbit 2; the card attributes the warning to the Quail 2 announcement and gives the conservative operational advice not to assume chat isolation means file isolation.

## Popularity / attention

- No GitHub star metric applies: this is an official IDE capability, not a repository/tool candidate.
- Attention signal: Google announced it in the Quail release cycle and documented it in current Agent Mode docs; Quail 2 stable and Quail 4 recap include it.

## Decision and changes

- Retain and refine. The existing card duplicated general Agent Mode UI-generation features and did not mention the key concurrency hazard.
- Removed unrelated Compose preview/image-to-UI claims. Reframed around independent chat context versus shared project files.
- Added practical split: parallelize read-only/disjoint-file tasks; serialize same-file edits; inspect diff and tests.
- Confidence: high for multiple conversations and the Quail 2 worktree warning; medium for applying that warning as a conservative workflow in later stable versions because reviewed Rabbit 2 material does not explicitly update worktree support.
