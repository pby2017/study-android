# Coding-agent harness card refinement

Date: 2026-11-23 (Asia/Seoul)

## Decision

Keep the card as a practical AI-agent engineering concept, but remove the unsupported framing that harness importance is a 2026 consensus. Explain it as guides plus feedback sensors, with a repeated-failure improvement loop. Qualify the benchmark as one vendor-reported, fixed-model experiment.

## Evidence checked

- Martin Fowler, Birgitta Böckeler, “Harness engineering for coding agent users” (2026-04-02): <https://martinfowler.com/articles/harness-engineering.html>
  - Explicitly calls harness a broad term and narrows it to the coding-agent user harness.
  - Defines guides as feedforward controls and sensors as feedback controls; tests, linters, type checkers, and review are examples.
  - Repeated issues should lead to iteration on both controls; the article describes a mental model with open questions, not settled consensus.
  - Human input should be directed to important decisions, not assumed removable.
- LangChain, “Improving Deep Agents with harness engineering” (2026-02-17): <https://www.langchain.com/blog/improving-deep-agents-with-harness-engineering>
  - Reports GPT-5.2-Codex held fixed while its own system prompt, tools, and middleware were iteratively tuned; Terminal-Bench 2.0 score reported as 52.8% to 66.5%.
  - Setup used 89 benchmark tasks, Harbor orchestration, Daytona sandboxes, and LangSmith traces.
  - The result is vendor-reported for a particular system and benchmark; the article itself warns against task overfitting and regression.

## Changes

- Replaced universal/consensus wording with the bounded practical mental model.
- Kept exact benchmark numbers but attributed them and stated the evaluation scope.
- Added intermediate level, a concise interview question/answer, and source labels.
- Removed unnecessary “builder/user harness”, ambient-affordance, and topology jargon from this one-minute card.

## Verification plan

Validate YAML and required card fields, run routine tests and `git diff --check`. Full site build may be unavailable if Ruby dependencies remain absent.

Confidence: high for what the cited authors report; medium for generalizing the process beyond their setup.
