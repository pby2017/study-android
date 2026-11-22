# Continuous Claude card refinement — 2026-11-22

## Decision
Keep the tool as a useful agent-loop example, but replace promotional “unmanned pipeline” wording with a precise description of its explicit PR/check/review lifecycle and execution bounds.

## Sources checked
- https://github.com/AnandChowdhary/continuous-claude — current primary README and repository page; shows Claude Code and Codex providers, shared notes, branch/PR/check/review/merge flow, GitHub-only full PR automation, available limits, MIT license, and ~1.4k stars (2026-11-22).
- https://github.com/AnandChowdhary/continuous-claude#flags — current flag definitions and note that Codex reports token usage rather than USD cost; explicit token rates are needed for `--max-cost` enforcement.

## Fact checks and corrections
- Preserved the core lifecycle: looped Claude/Codex execution, shared markdown handoff, GitHub PR, required checks/reviews, merge, repeat.
- Clarified that green checks mean configured gates passed, not that code is correct or safe. Branch-protection/review policy still needs to be configured and checked.
- Kept the GitHub-specific automation boundary; local-only run modes exist, but self-hosted forge PR automation is not supported.
- Retained the ~1.4k GitHub star snapshot; it is a same-day interest signal only.
- Added a material billing nuance: the README says Codex usage is measured in tokens, so the user must supply input/output rates for `--max-cost` to enforce an estimated budget. Included bounded runs/time/cost and failure-stall threshold as safety controls.
- Avoided claiming every failure discards all work or that the tool guarantees a human review; behavior follows configured CI/review requirements.

## Card updates
- Added intermediate level, concise workflow, actionable execution gates, labeled sources, and an interview retrieval Q/A.
- Reframed the title to remove the implication that autonomous merging is inherently safe.

Confidence: high; facts checked against the current upstream README and repository page.
