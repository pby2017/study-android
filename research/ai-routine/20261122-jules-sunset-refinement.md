# Google Jules sunset and data portability card refinement — 2026-11-22

## Decision
Keep the Jules topic, but replace the obsolete active-agent feature comparison with an urgent, current developer lesson about service wind-down and data portability. Google says Jules became read-only on Nov 11, 2026 and will shut down Dec 31, 2026. Existing code, branches, and pull requests remain in GitHub; Jules-hosted configuration and work history need a separate export.

## Sources checked
- https://jules.google/docs/changelog/ — official “Jules Turndown” entry, dated Oct 29, 2026: read-only after Nov 11; service winds down Dec 31; code, branches, and PRs stay in GitHub; local export includes settings, environment variables, scheduled tasks, connected repositories, memories, setup scripts, and every session (prompt, plan, activity log, code patches).
- https://jules.google/docs/cli/reference — official Jules Tools CLI installation and login instructions (`npm install -g @google/jules`, `jules login`) plus commands to list connected repos/sessions and pull completed code.
- https://developers.google.com/jules/api — the API reference continues to label the API alpha/experimental, but its task-creation examples do not override the newer read-only sunset notice; no active API creation claim is kept in the card.
- https://jules.google/docs/usage-limits — official limits page contains daily task counts and model descriptions that may be stale relative to the later wind-down notice. Those volatile claims were removed rather than repeated.
- https://jules.google/docs/changelog/2026-02-19/ — historical CI Fixer announcement says it fixes failed GitHub Actions on Jules-created PRs. Removed from current card because the service is read-only and near shutdown.

## Fact-check and limits
- The current official changelog unambiguously states dates: read-only began Nov 11, 2026; shutdown is Dec 31, 2026. This card is intentionally time-bound and should be reviewed after the shutdown date.
- GitHub-hosted source code, branches, and PRs remain available; Jules-local settings, env vars, schedules, repository connections, memories, setup scripts, and session history do not automatically become GitHub artifacts.
- Google's export instructions say to install Jules Tools and authenticate, then use a supplied export prompt/script. The page notes that some script requests use undocumented internal endpoints, so export completeness and successful files must be checked; it is not a stable documented public export API.
- Exports can contain environment-variable values and other sensitive data. The card advises inspecting and securing the export without suggesting credentials be copied into public repositories.
- Removed dated claims about Gemini defaults, daily quotas, API session creation, and automatic CI repair as active current behavior.

## Card changes
- Added beginner difficulty and an interview question distinguishing GitHub artifacts from Jules-hosted state.
- Replaced agent feature catalog with service lifecycle, data portability, export contents, and sensitive-data handling.

Confidence: high for Google's announced dates and listed export categories; medium for practical export completeness because the published export method partly uses undocumented endpoints.
