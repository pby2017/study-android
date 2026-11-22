# Cursor model-selection card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Rechecked official Cursor docs: https://cursor.com/docs/models-and-pricing and https://cursor.com/docs/agent/overview
- Replaced the old “Cursor + Claude Code dual stack” recommendation, whose claims about the two products being fixed layers and a single-model Claude Code strategy were no longer supportable/current.
- Focused the card on durable decision factors: task complexity, model availability by plan, and usage/billing route. Cursor docs describe Agent as instructions + tools + selected model; third-party models use prepaid credits at API list price on eligible plans, distinct from Cursor-model included usage.
- Avoided static prices and a fixed model catalog because these are mutable; noted Auto routing modes/plans vary.
- Added intermediate difficulty and an interview question about usage pools.
- Validation: YAML parse; Ruby syntax; auto-post tests; card navigation tests; `git diff --check`.
