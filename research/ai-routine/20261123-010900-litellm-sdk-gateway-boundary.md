# 2026-11-23 01:09 KST — LiteLLM SDK/Gateway boundary

## Sync and scope

- Ran `git pull --ff-only origin master` before edits; no incoming changes and no local modifications were present.
- Refined one AI developer card. No app-factory work or dependency changes.

## Sources checked

- https://github.com/BerriAI/litellm
- https://docs.litellm.ai/docs/python_sdk
- https://docs.litellm.ai/docs/simple_proxy
- https://docs.litellm.ai/docs/proxy/virtual_keys
- https://docs.litellm.ai/docs/supported_endpoints

## Evidence and rationale

- Current official docs distinguish the Python SDK (imported into one application; no server operated) from the self-hosted Gateway (a separate service in front of multiple clients/providers).
- Gateway controls include virtual keys with model access, budgets and rate limits, spend records, guardrails and centralized logs. Production deployment uses a database; key and DB security are therefore part of operating the gateway, not automatic properties of the SDK.
- SDK docs describe shared call/response interfaces and SDK-side retries/fallbacks/router. Gateway docs describe load balancing, retries and fallbacks. A normalized interface does not guarantee identical provider capabilities; the official supported-endpoint matrix remains the check for each model/endpoint pair.
- A fallback may change the serving model/provider. Cost, data path and output behavior can therefore change too; the card treats this as an engineering risk, not a claim that fallback always changes providers.
- Current GitHub page snapshot: ~63.7k stars/~13.5k forks; the repository page identifies MIT license. These are attention signals, not proof of suitability/adoption. No dated star count remains on the public card.

## Card changes

- Replaced stale count/feature-list framing with the practical SDK vs self-hosted control-plane choice.
- Added an intermediate level, three current official documentation links, and interview retrieval.
- Clarified operational requirements, virtual-key limits, provider endpoint compatibility, and fallback side effects.

## Verification

- `ruby -c scripts/auto_post.rb` — passed.
- `_data/cards.yml` and `_data/ai_queue.yml` parsed; the card has intermediate level, four points, four official docs, interview, and answer.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed.
- `bundle check` — required Gemfile dependencies are not installed; no dependencies were installed and Jekyll build remains unverified.

## Confidence

- High for product boundaries as stated in current official docs; medium for point-in-time popularity figures.
