# Card refinement: AI-assisted Android localization with Tolgee

- Reviewed: 2026-11-22 02:34 KST
- Card: `Tolgee — 화면 문맥을 활용해 Android 번역을 AI로 제안하고 검수하기`
- Decision: Replaced the inaccurate multi-project CLI roundup with a supported AI + Android workflow.

## Sources checked

- [Tolgee AI Translator](https://docs.tolgee.io/platform/translation_process/ai_translator) — LLM translation can use screenshots, Tolgee Context, key/project descriptions, language notes, and translation-memory results. Tolgee Context requires SDK 5.9.0 or later.
- [Android Resources XML format](https://docs.tolgee.io/platform/formats/android_xml) — supports Android XML arrays and placeholder conversion; placeholders can convert to Tolgee ICU form on import and back on export. Android SDK uses Sprintf by default and supports ICU formatting when configured.
- [Tolgee Android SDK usage](https://docs.tolgee.io/android-sdk/usage) — Android resource fallback, lookup by resource ID name, printf-style parameters, plural API, and the one-plural-per-string limitation.
- [Tolgee GitHub repository](https://github.com/tolgee/tolgee-platform) — 4.2k stars and 3,715 commits at review; active work was visible in the repository.
- [Tolgee latest releases](https://github.com/tolgee/tolgee-platform/releases) — v3.246.0 released November 19, 2026; latest notes included AI prompt customization access.
- [android-localisation project](https://github.com/BharathKmalviya/android-llm-localization) — Android-specific LLM CLI with `translate → fix → verify`, Java `String.format` checks, and 2 stars at review; technically useful but too low-adoption for the broad topic card's popularity claim.
- [LocalizeKit](https://github.com/Rahulnisanth/LocalizeKit) — Flutter ARB CLI and 2 stars at review; not an Android `strings.xml` tool.
- [Localization-CLI](https://github.com/enesutku/Localization-CLI) — 116 stars at review, but its README describes a Node.js iOS `.xcstrings` utility; Android XML support remains on its roadmap, so the previous Swift/Android grouping was inaccurate.

## Corrections and rationale

- Removed the unsupported collage of three small tools and one platform; it mixed Android XML, Flutter ARB, and iOS String Catalog tools as if they were a coherent set.
- Selected Tolgee because its current AI translator, Android XML format, native Android SDK, active releases, and meaningful adoption are all documented by primary sources.
- Explained why AI context helps with ambiguous strings, while avoiding a claim that context guarantees a correct translation.
- Added precise Android interoperability lessons: printf ↔ ICU conversion, matching the SDK formatter, resource-ID key mapping, plural resources, and safe fallback.
- Removed the adjacent LinkForty card from the active deck because its current content was generic deep-link infrastructure without a central AI/AI+Android lesson; preserved the historical publication log.

## Validation

- `_data/cards.yml` and `_data/ai_queue.yml` parse successfully; the Tolgee card has a complete interview question and answer; LinkForty is absent from the active deck.
- `ruby -c scripts/auto_post.rb` passed.
- `node --test scripts/card-navigation.test.js`: 5 passed.
- `git diff --check` passed.
- Jekyll build was not run: `bundle check` reports missing Gemfile dependencies.
