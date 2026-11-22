# Claude agent-team C compiler card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh the next oldest AI card after Cloudflare Code Mode.

## Decision

- Retain the case study, but center the learning on verifier quality and task decomposition rather than the headline result or agent count.
- Difficulty: Advanced; requires reasoning about test oracles, regression coverage, concurrency, and partitioning work.
- Keep measured cost and implementation limitations as guardrails against treating the experiment as a cheap or production-ready recipe.

## Fact check

1. Anthropic primary source: <https://www.anthropic.com/research/building-c-compiler>
   - Published Feb 5, 2026 by Nicholas Carlini. Claude Opus 4.6 used 16 parallel agents, nearly 2,000 sessions over two weeks, and just under $20,000.
   - The project generated a 100,000-line Rust compiler that can build Linux 6.9 on x86, ARM and RISC-V; it also passes many tests but is not a drop-in compiler replacement.
   - The x86 16-bit phase calls GCC; generated code is less efficient than GCC even without optimization.
   - The article stresses near-perfect task verifiers and regressions. The project used GCC as a known-good oracle to divide kernel compilation work after agents repeatedly hit the same failure.
   - The `--fast` subset sampling and output hygiene exist, but are secondary to the card's single lesson and omitted for brevity.
2. Source repository: <https://github.com/anthropics/claudes-c-compiler>
   - Linked as implementation evidence; not used to overstate project maturity.

## Removed / corrected

- Specified Opus 4.6 and duration to contextualize results.
- Replaced vague “verifier is the goal” language with why poor verification steers work incorrectly and why GCC oracle supports task decomposition.
- Removed the confusing description of deterministic/random sampling; it's not central to the teaching objective.
- Explicitly state cost and incomplete GCC replacement status, including GCC dependency in a phase.
- Added level, sources and interview retrieval pair.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card schema, level, three points and two sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high; claims checked against Anthropic's primary account. Cost and scale are author's reported experiment figures, not independent audit results.
