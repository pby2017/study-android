# 2026-11-23 01:03 KST — Qwen3-Coder-Next serving boundaries

## Sync and scope

- Synced `master` with `git pull --ff-only origin master` before edits; no remote changes.
- Refined one existing AI model card. No new topic, app-factory work, or dependency.

## Sources checked

- https://huggingface.co/Qwen/Qwen3-Coder-Next
- https://github.com/QwenLM/Qwen3-Coder

## Fact check

- Model card: 80B total parameters, 3B activated parameters, 262,144 native context, Apache-2.0 license. It states the model supports non-thinking mode only.
- Model card's SGLang serving instructions call for `sglang>=0.5.8` and `qwen3_coder` tool parser; vLLM instructions call for `vllm>=0.15.0`, auto tool choice, and the same parser. The Qwen README additionally warns about updated special tokens/token IDs and using the current tokenizer.
- Model card says reduce context (example 32,768) if server startup has OOM. Qwen README documents YaRN as an extension path to 1M; the card now identifies this as an extension setting rather than native/default context.
- Engineering inference: 3B activated per token does not imply that only 3B total weights must be stored. Actual memory depends on weight representation, placement/offload, context and KV cache. No precise GPU-memory minimum was added.
- Attention snapshot from the source pages: Qwen3-Coder GitHub repository ~16.9k stars/~1.3k forks; the specific Hugging Face model page ~1.75k likes. The broader repo stars are not treated as proof of model adoption.

## Card change

- Replaced tool-adoption/benchmark-oriented prose with the practical distinction between active parameters and serving memory.
- Added advanced level, model-card and README sources, and retrieval Q&A on memory/context/parser compatibility.
- Removed any implication that long context or low active parameter count alone guarantees practical local deployment.

## Verification

- `ruby -c scripts/auto_post.rb` — passed.
- `_data/cards.yml` and `_data/ai_queue.yml` parsed; the card has advanced level, four points, two primary source links, interview, and answer.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed.
- Jekyll build not run. `bundle check` is known to fail because required Gemfile dependencies are not installed; no dependencies were installed.

## Confidence

- High for architecture, context, license, and model-card serving requirements; medium for point-in-time popularity figures and the memory implication, which is explicitly labeled inference.
