# 2026-11-22 23:50 KST — Android Studio Agent Mode 데이터 경계 보강

## Refined card
- `Android Studio Agent Mode — IDE·빌드·실기기를 잇는 개발 루프`
- Rechecked the official Agent Mode guide and data/privacy guidance (Agent Mode page last updated 2026-11-05 UTC).
- Kept its multi-step plan, multi-file edits, build iteration, connected-device deployment, screenshot/Logcat inspection, and `adb shell input` interaction.
- Clarified the important privacy default: source-code context sharing is off by default; enabling context awareness can send relevant project content to Gemini. Added `.aiexclude` and account-tier data-use differences (free edition vs personal API key/Google One/Enterprise).
- Removed the broader phrasing that implied every Agent Mode task automatically sends project source. Retained that prompts and tool results are sent through the Gemini API when used in the agent interaction.

## Evidence checked
- Official Agent Mode guide: https://developer.android.com/studio/gemini/agent-mode
  - High-level goal planning, multi-file edits, iterative build fixes, permissioned tools, connected-device deployment, screenshot/Logcat inspection, and `adb shell input` are documented.
  - Prompt/tool availability and action results flow back to the Gemini API; some tools require user permission.
- Official data and privacy guide: https://developer.android.com/studio/gemini/data-and-privacy
  - Code sharing for context is opt-in, context awareness has global/project controls, `.aiexclude` can restrict eligible files, and data-use rules depend on account/product tier.
- Popularity signal: official Android Studio product documentation and shipped developer workflow; no third-party star count claimed because this is an IDE feature, not a standalone repository.

## Decision
- Keep as an AI+Android workflow card. The distinctive learning point is the IDE-to-device verification loop plus explicit data-sharing and permission boundaries.
- Confidence: high for documented capabilities and stated data/privacy controls. Actual tool availability may vary by Android Studio version, account, and configured model/provider.

## Verification
- YAML parsed successfully; Android Studio Agent Mode has valid level, two labeled sources, interview, and answer.
- `ruby -c scripts/auto_post.rb`: passed.
- `ruby scripts/auto_post_test.rb`: 3 runs, 14 assertions, 0 failures/errors.
- `node --test scripts/card-navigation.test.js`: 6/6 passed.
- `git diff --check`: passed.
