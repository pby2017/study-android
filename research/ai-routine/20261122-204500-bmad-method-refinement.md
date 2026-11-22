# BMad Method card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh the oldest eligible card after merging the duplicate Tons of Skills marketplace card.

## Decision

- Retain and reframe the `BMAD-METHOD` card as a practical pattern: choose the amount of planning by the size and ambiguity of the requested change.
- Learning objective: avoid both extremes—forcing a heavyweight process on a one-session edit and starting a multi-stage initiative without carrying its decisions into implementation.
- Difficulty: Intermediate; applies to developers coordinating AI-assisted implementation, review, and planning.
- No duplicate BMad card exists in `_data/cards.yml`.

## Fact check and signals

1. Current BMad official docs: <https://docs.bmad-method.org/>
   - Small changes can start with `bmad-build`; larger or uncertain work can start with clarification, initiative/epic planning, or architecture. BMad describes carrying decisions forward in artifacts. Users can also use thinking/planning skills without asking BMad to implement.
2. Current upstream README: <https://github.com/bmad-code-org/BMAD-METHOD>
   - Stable line is v6.12; v7 on `main` is preview alpha and may change/break. v6 stable install is `npx bmad-method install`; docs require Node.js 20.12+, Python 3.10+, and uv for setup/Python scripts.
   - GitHub snapshot 2026-11-22: 55.6k stars, 6.2k forks, MIT license. This is a strong attention signal, not an efficacy guarantee.
3. Upstream releases: <https://github.com/bmad-code-org/BMAD-METHOD/releases>
   - Latest listed stable v6 release is v6.12.4 (Oct 14, 2026). The repo continues to distinguish stable v6.12 from preview-alpha v7. Do not assume v7 has stabilized just because its estimated timing has passed.

## Removed / corrected

- Removed stale v6.9.0 release and June star/fork numbers.
- Removed the overbroad “12+ agents / 34+ workflows” inventory and “mimics a whole agile team” pitch; it did not teach the core operational decision.
- Removed older web bundles, Gemini/ChatGPT product inventory and module listings that are not needed for this one-minute lesson.
- Replaced a fixed process prescription with official current guidance: direct build for small changes, deeper clarification/planning when scale or ambiguity calls for it.
- Public card includes current release/tool prerequisites but omits volatile star counts.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card fields, level, points, and sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed. Commit/push pending.

Confidence: high for workflow routing and version/install boundaries from upstream sources; the claim that artifacts reduce repeated explanation is framed as the documented intent, not a quantified outcome.
