# Card refinement: Firebase Remote Config for AI settings

- Reviewed: 2026-11-22 02:31 KST
- Card: `Firebase Remote Config — Android AI 설정 실험과 서버 모델 라우팅`
- Decision: Refined and retained as an AI + Android configuration and experimentation lesson.

## Sources checked

- [Remote Config parameters and conditions](https://firebase.google.com/docs/remote-config/parameters) — client templates cover app configuration, A/B Testing, and Personalization; server templates specifically cover server-side AI prompt/model selection; templates have different SDKs and targeting. Any client-delivered value is accessible to the end user.
- [Get started with Remote Config on Android](https://firebase.google.com/docs/remote-config/android/get-started) — Android SDK stores in-app defaults, fetches backend values, and activates fetched values; activation timing affects app behavior.
- [Create Remote Config experiments with A/B Testing](https://firebase.google.com/docs/ab-testing/abtest-config) — Remote Config experiments compare parameter variants for Android, iOS, and Web and use Google Analytics objectives/events.
- [Remote Config personalization](https://firebase.google.com/docs/remote-config/personalization/get-started) — requires Analytics instrumentation and optimizes a chosen objective; learning quality and timelines depend on outcome volume.
- [Firebase pricing](https://firebase.google.com/pricing) — A/B Testing is listed as no-cost; Remote Config has 100,000 no-cost fetches per project per day, with overage billing on Blaze effective September 1, 2026.

## Corrections and rationale

- Removed the broad claim that Remote Config is unconditionally free. The current pricing page states the daily no-cost quota and billable overage.
- Separated client templates (Android client values, A/B Testing, Personalization) from server templates (backend model/prompt selection). The docs describe different SDKs and targeting; the card no longer suggests that client A/B experiments are the same as server-side template routing.
- Reframed Personalization as optimizing a selected Analytics objective, not selecting an abstract universally “best” setting.
- Added the security boundary: values delivered to the client can be inspected; do not store API keys or private prompts in client parameters.
- Added Android fetch/activate timing and an interview question that reinforces client/server secret placement.

## Validation

- `_data/cards.yml` and `_data/ai_queue.yml` parse successfully; the revised card has an interview question and answer.
- `ruby -c scripts/auto_post.rb` passed.
- `node --test scripts/card-navigation.test.js`: 5 passed.
- `git diff --check` passed.
- Jekyll build was not run: `bundle check` reports missing Gemfile dependencies.
