# Promptfoo card refinement

Date: 2026-11-22 (Asia/Seoul)

## Decision

Refined the existing promptfoo card as a practical LLM evaluation lesson. Kept it in the AI category and added intermediate difficulty plus an interview retrieval pair. The main teaching point is that evaluation only measures the test cases and assertions that were configured; a passing run is not proof of overall quality.

## Sources checked

- https://www.promptfoo.dev/docs/intro/ — open-source CLI/library for evaluating and red-teaming LLM applications; repeatable test workflow, provider support, CLI/library/CI use, and local eval runner. The page explicitly warns that red-team generation may use hosted services.
- https://www.promptfoo.dev/docs/configuration/guide/ — YAML config combines prompts, providers, input test cases and assertions; assertions are optional, output matrix supports comparison, and manual review remains useful.
- https://www.promptfoo.dev/docs/red-team/troubleshooting/data-handling/ — target evaluation runs locally but calls the configured provider; generation/grading data flow depends on credentials, provider and hosted-feature configuration. Remote-only plugins and hosted flows have distinct disclosures.
- https://github.com/promptfoo/promptfoo — GitHub page observed 27.5k stars and MIT license on 2026-11-22. The star count is a dated attention signal, not evidence of quality.
- https://www.promptfoo.dev/about/ — current project statement says Promptfoo is part of OpenAI and remains open source.
- https://openai.com/index/openai-to-acquire-promptfoo/ — OpenAI announced the planned acquisition on 2026-03-09. The older card's phrasing “after acquisition announcement it will remain open source” was outdated/awkward; current Promptfoo statement was used instead.

## Changes and fact checks

- Removed stale June 2026 star count and refreshed it from the live GitHub page, dated in the card.
- Explained the test matrix as input cases × prompts × providers; assertions/metrics validate declared conditions only.
- Added the limitation that test coverage and assertion quality bound what an eval pass can establish.
- Replaced the overbroad privacy implication with separate boundaries: local runner, configured provider requests, and configuration-dependent hosted red-team generation/grading.
- Kept the OpenAI affiliation as context, not as a quality claim; retained MIT/open-source status based on the live repository and current About page.

## Confidence

High for the documented evaluation workflow, local/provider data boundary, license, and dated stars snapshot. Hosted data routing can vary by configuration and feature; the card explicitly tells readers to verify their own configuration.
