# Claude Code fallback model card refinement — 2026-11-22 07:41 KST

## Candidate and practical value

- Oldest-first candidate: `fallbackModel — 기본 모델이 막힐 때 대체 모델로 자동 전환`.
- AI coding workflow topic. The card now teaches failure classification and config precedence, not only how to list backups.

## Official sources checked

- Fallback chains and error conditions: https://code.claude.com/docs/en/model-config#fallback-model-chains
- Setting key, cap, allowed models, and list merge exception: https://code.claude.com/docs/en/settings-reference#fallbackmodel
- General precedence explanation: https://code.claude.com/docs/en/settings#lists-merge-instead-of-overriding
- CLI override: https://code.claude.com/docs/en/cli-reference#cli-flags

## Verified claims

- Fallback can handle an overloaded or unavailable primary model and other non-retryable server errors. Authentication, billing, rate-limit, request-size, transport errors, and organization-policy denials do not trigger this chain.
- Candidates are tried in order; the switch applies to the current turn only, a notice is shown, and the next message starts with the primary model again.
- The chain is capped at three distinct allowed models after duplicate removal. Entries outside `availableModels` are dropped; auto mode can also skip unsupported candidates.
- Unlike most list-valued settings, `fallbackModel` is not merged across settings files. The highest-precedence file that defines it supplies the whole chain. `--fallback-model` overrides the setting for one session.
- The official model configuration page documents `"default"` as the default model alias. No popularity metric is relevant to this built-in feature.

## Change and decision

- Narrowed the trigger claim and explicitly excluded error classes that fallback cannot fix.
- Clarified one-turn scope, next-turn retry, cap semantics, and file precedence; added an interview question about rate limits and collisions between settings scopes.
- Confidence: high; each boundary is stated in current official Anthropic documentation.
