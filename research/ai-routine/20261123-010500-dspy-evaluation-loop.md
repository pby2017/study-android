# 2026-11-23 01:05 KST — DSPy evaluation and optimization loop

## Sync and scope

- Ran `git pull --ff-only origin master` before editing; the working tree was clean and `master` was current.
- Refined one existing AI developer card; no new topic or dependency.

## Sources checked

- https://github.com/stanfordnlp/dspy
- https://dspy.ai/current/getting-started/metrics/
- https://dspy.ai/learn/optimization/optimizers/
- https://dspy.ai/current/diving-deeper/tools/

## Evidence and rationale

- The current project README describes DSPy as modular programs with algorithms to optimize prompts and weights; it currently shows approximately 39.2k stars / 3.5k forks and an MIT license. Stars are an attention signal only.
- Official metrics docs: the metric defines what counts as better; examples distinguish fields passed to the program from labels held for scoring. GEPA uses training examples for reflection and a validation set to track/select candidates. Keep a separate test set for an unbiased final check; this is now the card's core engineering lesson.
- Official GEPA guide: metric feedback can include natural-language explanation, and the optimizer iterates candidate instructions against examples and scores. The card does not promise that any optimizer guarantees generalization.
- Official Tools and MCP guide: MCP tools are wrapped with `dspy.Tool.from_mcp_tool(session, tool)`; the caller establishes the MCP client/session. Tool use is shared across modules, not unique to ReAct. The card stays concise and does not call out module-specific wiring.

## Changes

- Removed stale June release and star count, plus a slogan-heavy opening.
- Added intermediate level; focused on Signature/Module contracts, metric-driven GEPA optimization, validation/test separation, and the MCP session boundary.
- Added three current official links and an interview recall pair.

## Verification

- `ruby -c scripts/auto_post.rb` — passed.
- `_data/cards.yml` and `_data/ai_queue.yml` parsed; the card has intermediate level, four points, three source links, interview, and answer.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed after removing an extra terminal blank line in the log.
- Jekyll build remains unverified because bundled Gems are missing; no dependencies were installed.

## Confidence

- High for the documented DSPy flow and MCP boundary; medium for point-in-time GitHub popularity snapshot.
