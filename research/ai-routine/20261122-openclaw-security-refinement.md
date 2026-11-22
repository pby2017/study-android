# OpenClaw security card refinement — 2026-11-22

## Decision
Reframe the card from a volatile channel/provider feature inventory to the security model developers need before deploying an always-on agent: one Gateway is one trust boundary. Keep only the practical architecture, isolation, and audit takeaways.

## Sources checked
- https://docs.openclaw.ai/gateway/security/trust-model — official trust model: one operator or mutually trusting team per Gateway; hostile multi-tenant use is unsupported; `sessionKey` selects/routs a session and is not authorization; session visibility defaults to Gateway-wide and agent-to-agent access defaults on; threat model includes shell, files, network, and messaging capabilities.
- https://docs.openclaw.ai/gateway/security/running-the-audit — official audit guidance: run `openclaw security audit` after configuration changes or before exposing network surfaces; it checks inbound access, cross-agent session access, tool damage, exec policy, network exposure, plugins, and configuration drift.
- https://github.com/openclaw/openclaw — repository page showed approximately 394.7k stars and 82.9k forks, MIT license (checked 2026-11-22). Star/fork counts are a dated attention signal, not evidence of security or quality.

## Fact checks and corrections
- OpenClaw's security docs explicitly scope one trust boundary per Gateway. Multiple users or agents on one Gateway do not imply adversarial tenant isolation.
- `sessionKey` is a routing selector, not an authorization token. The docs state that default session visibility can span the Gateway and agent-to-agent messaging is enabled by default; the card uses this as an example rather than implying every configuration is identical.
- For mutually untrusted users, official guidance is separate Gateways and credentials, ideally separate OS users or hosts. This is stronger than relying on prompt rules or different session names.
- `openclaw security audit` is a practical configuration check, not a proof that deployment is secure. It should follow configuration changes and precede network exposure.
- Removed the old channel inventory, installation command, OAuth/provider claims, and June star/fork snapshot because they distract from the core lesson and age quickly.

## Card updates
- Added intermediate difficulty, a concise trust-boundary explanation, 4 practical points, current official sources, a dated GitHub interest snapshot, and retrieval-style interview Q/A.
- Kept the card within AI-agent scope; no pure Android content applies.

Confidence: high for the official trust model and audit command; high for the dated GitHub repository snapshot.
