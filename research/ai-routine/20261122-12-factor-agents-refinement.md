# 12-Factor Agents card refinement

## Scope

Reviewed the next oldest AI card. The prior version treated an author's guide like a proven production recipe, presented “70–80% quality” without its anecdotal context, and elevated the stateless-reducer point without the author's own caveat.

## Primary evidence reviewed (2026-11-22)

- HumanLayer's [12-Factor Agents guide](https://github.com/humanlayer/12-factor-agents) describes the factors as principles for LLM-powered software. It explicitly recommends incorporating modular concepts into existing products; it does not prescribe a single implementation framework.
- The README's 70–80% quality passage describes a pattern the author says he heard from SaaS builders. It is not a controlled benchmark or general performance measurement.
- [Factor 4](https://github.com/humanlayer/12-factor-agents/blob/main/content/factor-04-tools-are-structured-outputs.md) separates the model's structured action selection from deterministic application code that executes the action.
- [Factor 5](https://github.com/humanlayer/12-factor-agents/blob/main/content/factor-05-unify-execution-state.md) says unifying execution and business state can reduce complexity, but explicitly says whether that is appropriate depends on the application; sensitive/session data may remain outside model context.
- [Factor 6](https://github.com/humanlayer/12-factor-agents/blob/main/content/factor-06-launch-pause-resume.md) recommends simple launch/query/resume/stop APIs and external triggers for long-running tasks.
- [Factor 12](https://github.com/humanlayer/12-factor-agents/blob/main/content/factor-12-stateless-reducer.md) is explicitly described by the author as “mostly just for fun.” It should not be taught as a mandatory architecture rule.
- GitHub displayed about 27.4k stars when checked. This popularity signal is dated and does not establish correctness or production outcomes; omitted from the card.

## Card changes

- Reframed the guide as author-proposed principles, not an industry standard or required checklist.
- Centered the lesson on the model/app boundary: structured action proposal versus validation and deterministic side effects.
- Qualified state-unification and pause/resume advice rather than making it absolute.
- Removed the stale star count and generalized “70–80%” assertion; recorded that it is anecdotal and highlighted the author's caveat on Factor 12.
- Added advanced difficulty, primary links, and an interview retrieval question.

## Overlap check

The adjacent MCP code-execution card focuses on context-efficient tool composition and sandbox boundaries. This card covers ownership of orchestration, validation, and durable workflow state. The concepts relate but have different learning objectives; no merge is warranted.
