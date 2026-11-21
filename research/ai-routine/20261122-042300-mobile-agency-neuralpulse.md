# Card refinement audit — Mobile AI Agents and NeuralPulse

Time: 2026-11-22 04:23 KST

## Mobile AI Agents (formerly Mobile Agency)

Sources checked:
- https://github.com/salmanashraf/mobile-agency (redirects to https://github.com/salmanashraf/mobile-ai-agents)
- https://github.com/salmanashraf/mobile-ai-agents/blob/main/README.md

Signals and fact check:
- Current GitHub page: 37 stars, 12 forks, 127 commits (checked 2026-11-22).
- Current README advertises 19 agents, 58 skills, and 17 workflows; old card had 16 agents, 13 workflows, and six tools. These counts are volatile and not valuable learning objectives.
- README documents `npx mobile-ai-agents install --tool codex` and a plan/build/code-security-review/test-device-UI/evidence-report loop. It states missing evidence should be resolved and important decisions/release approval remain with the developer.

Decision:
- Keep, but reframe from a mutable product-stat catalog into an actionable AI engineering lesson: completion claims require test/device evidence; missing checks are unverified; human retains approval.
- Confidence: high for repository's documented workflow; not an independent evaluation of the tool's real-world efficacy.

## NeuralPulse

Sources checked:
- https://github.com/Ashutosh0x/neuralpulse-wear
- https://github.com/Ashutosh0x/neuralpulse-wear/blob/master/README.md

Signals and fact check:
- GitHub page: 3 stars, 1 fork, 29 commits (checked 2026-11-22).
- README calls the project “clinical-grade” and makes extensive biometric, FHIR, on-device AI, and FDA-wellness claims, but the inspected public materials provide no clinical-validation evidence.
- README build steps ask users to supply proprietary Samsung Health SDK AARs and a retrained TFLite model locally. This does not establish that the advertised full system is reproducibly built or clinically validated.

Decision:
- Remove the card instead of presenting high-stakes health claims from a low-adoption project as established capability. Keep no product recommendation; reconsider only if independent validation and reproducible implementation evidence become available.
- Confidence: medium-high; based on the repository's own readme and visible popularity metrics, not a source-code audit or medical assessment.
