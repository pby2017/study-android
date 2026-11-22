# 2026-11-23 01:00 KST — Axolotl method-selection refinement

## Sync and scope

- Ran `git pull --ff-only origin master` before edits; `master` was already current and the tree was clean.
- Refined one AI developer card. No Android-only topic or new dependency.

## Sources checked

- https://github.com/axolotl-ai-cloud/axolotl
- https://docs.axolotl.ai/docs/getting-started.html
- https://docs.axolotl.ai/docs/choosing_method.html
- https://docs.axolotl.ai/docs/support-matrix.html

## Evidence and rationale

- Axolotl's Quickstart describes YAML-controlled model, dataset, training and adapter settings. The same YAML is used for training, inference, and LoRA merge. The card phrases this as configuration reuse, not a guarantee of deterministic/reproducible outcomes.
- The current method guide maps input-output examples to SFT; paired chosen/rejected responses to DPO; unpaired binary preference labels to KTO; and prompts plus a reward function to GRPO. The guide identifies GRPO as higher compute and says it requires a vLLM server.
- The guide separates learning method from adapter choice. QLoRA loads a quantized base and trains low-rank adapters; exact compatibility and memory constraints remain hardware/model-specific, so the card points readers to the support matrix instead of promising a universal footprint.
- Docs' latest updates show activity through 2026/10, including current model support and distributed-training improvements. GitHub snapshot: ~12.7k stars / ~1.5k forks; Apache-2.0. Popularity is an attention signal, not proof of adoption or suitability.

## Changes

- Replaced the acronym-heavy kitchen-sink card and stale June release/star claims with a short method-selection lesson.
- Added advanced level, primary documentation links, and an interview retrieval pair.
- The topic remains AI infrastructure/training rather than an Android deployment claim.

## Verification

- `ruby -c scripts/auto_post.rb` — passed.
- `_data/cards.yml` and `_data/ai_queue.yml` parsed; the card has the required advanced level, four points, three sources, interview, and answer.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed after normalizing the log's final newline.
- `bundle check` — failed because Gemfile dependencies are not installed; no dependencies were installed and Jekyll build remains unverified.

## Confidence

- High on method/data mapping and config reuse; medium on point-in-time GitHub attention figures.
