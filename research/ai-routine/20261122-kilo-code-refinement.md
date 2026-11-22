# Kilo Code card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh the Kilo Code card after retiring the preceding ByteRover CLI entry.

## Decision

Keep and refocus the card on a transferable operational lesson: non-interactive execution is not the same as permission-free execution. The old card incorrectly said `kilo run --auto` turns off all permission prompts and therefore requires a trusted environment. Current CLI documentation says autonomous mode resolves requests using configured permissions; operations not auto-approved are not allowed. The separate risk is overly broad `allow` rules.

## Evidence checked

- Official CLI and permission behavior: <https://kilo.ai/docs/code-with-ai/platforms/cli>
- Shared VS Code / JetBrains / CLI permission model: <https://kilo.ai/docs/getting-started/settings/auto-approving-actions>
- Official acquisition announcement: <https://www.anaconda.com/press/anaconda-acquires-kilo-code>
  - Anaconda announced the acquisition on 2026-07-15.
  - It says Kilo remains available with no changes to existing products, plans, or support at announcement time.
  - Planned deeper Anaconda platform integration was explicitly described as future direction, not currently available capability.
- Live GitHub repository API snapshot (2026-11-22): <https://api.github.com/repos/Kilo-Org/kilocode>
  - 28,081 stars; 3,386 forks; MIT; not archived; pushed 2026-11-22.
- Latest release: <https://github.com/Kilo-Org/kilocode/releases/tag/v7.8.32>
  - v7.8.32 published 2026-11-20.

## Card changes

- Removed stale marketing inventory (500+ models, old mode lineup, cloud/review feature list) and June popularity/release snapshot.
- Corrected `--auto`: it removes interactive waiting but follows configured `allow` / `ask` / `deny` policy.
- Added a retrieval question about CI use and least-privilege bash/edit/external-directory rules.
- Added acquisition context without presenting announced future integration as an existing feature.
- Retained GitHub popularity/release snapshot as dated context, not as the learning objective.

## Validation

Run Ruby syntax check, load both YAML files, assert the Kilo card's level and interview fields, run `ruby scripts/auto_post_test.rb`, and run `git diff --check` before commit.

Confidence: high for documented CLI permission semantics and acquisition announcement; high for repository popularity and release snapshot at the recorded retrieval time.
