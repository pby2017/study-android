# Subagent patterns card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh the next oldest eligible AI card after Anthropic's compiler case study.

## Decision

- Keep the article's four-pattern framework, but describe it as Philipp Schmid's personal explainer, not Google DeepMind guidance.
- Difficulty: Intermediate; the core skill is matching orchestration complexity to coordination needs.
- Teach escalation criteria and tradeoffs instead of suggesting maximum parallelism is optimal.

## Evidence

1. Primary article: <https://www.philschmid.de/subagent-patterns-2026>
   - Published May 5, 2026. The four patterns are ordered by control over subagent lifecycle: inline tool, fan-out, persistent agent pool, and agents that communicate directly as a team.
   - Inline suits self-contained work; fan-out suits independent parallel work; a pool handles multi-step coordination; direct team messaging is for coordination too complex for one agent to manage.
   - The article recommends starting with Pattern 1. Later patterns add model requirements and orchestration/state/debugging challenges.
2. Author bio: <https://www.philschmid.de/philipp-schmid>
   - Establishes the author’s Google DeepMind role; the post itself remains a personal technical explainer rather than an official product or organizational recommendation.

## Removed / corrected

- Replaced “control level” as the sole axis with the practical choice: independent work versus follow-up coordination versus direct agent messaging.
- Clarified that patterns 3 and 4 increase state, routing, and failure-handling burden.
- Avoided stating that higher patterns always require a more powerful model; framed it as a possible model/tool requirement documented by the author.
- Added difficulty and retrieval Q&A.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card schema, level, four points and two sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high for the article's stated pattern distinctions and tradeoffs; it is one practitioner's framework, not a universal taxonomy.
