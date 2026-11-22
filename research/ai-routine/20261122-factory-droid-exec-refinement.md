# Factory Droid Exec card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Replace a stale benchmark/product roundup with current automation permission semantics.

## Decision

Keep the Factory AI developer-tool topic, but center the card on a reusable CI/automation lesson: understand autonomy tiers, command policy, and partial changes when a one-shot run fails.

## Evidence

- Official Droid CLI overview: <https://docs.factory.ai/cli/getting-started/overview>
  - Distinguishes interactive Droid CLI from `droid exec` for scripts and CI/CD.
- Official Droid Exec reference: <https://docs.factory.ai/docs/droid-exec/overview>
  - Default execution is read-only.
  - `--auto low|medium|high` expands allowed operations by tier.
  - `--skip-permissions-unsafe` skips permission prompts and is intended only for disposable isolated environments.
  - A one-shot run cannot collect an interactive approval; an effective `ask` permission is not cleared by `--auto high`.
  - On permission violations, the run exits non-zero, but edits made before the violation remain in the working tree.
  - Docs recommend previewing command policy and reviewing resulting changes.
- Official repository page: <https://github.com/Factory-AI/factory>
  - Confirms Factory describes Droid as a terminal agent, but its public source repository is small (101 stars at page retrieval) and not an appropriate signal to headline the commercial product's popularity or benchmark rank.
- Terminal-Bench's current official site shows a newer 4.1 leaderboard; therefore the former “Terminal-Bench 1st” heading and old benchmark score were removed rather than treated as current product proof: <https://www.tbench.ai/>.

## Card changes

- Removed stale Terminal-Bench #1 / 58.8% claim, vague model-agnostic product inventory, and old Custom Droid/Mission feature roundup.
- Added current default read-only behavior, autonomy levels, `ask` policy boundary, partial-change failure behavior, and unsafe bypass warning.
- Added interview retrieval about reviewing work after a failed run.
- Added level `중급`.

## Validation

Ruby syntax, YAML loads, targeted card assertions, routine tests, and `git diff --check` are run before commit.

Confidence: high for the current official CLI behavior; high that old benchmark ranking should not be presented as current after the official leaderboard advanced to version 4.1.
