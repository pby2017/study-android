# Robin / Open SWE card refinement — 2026-11-22

## Decision
Retain the popular LangChain coding-agent project, but update its current Robin identity and center the card on the security model that developers must understand before deployment: sandbox identity, installation-wide GitHub access, and the limited meaning of approvals.

## Sources checked
- https://github.com/langchain-ai/open-swe — repository README now presents Robin as an open-source software factory. It describes persistent per-thread Linux sandboxes, work from dashboard/GitHub/Slack/Linear, active development and breaking changes. GitHub API returned 11,247 stars, 1,325 forks, 0 open issues, MIT, and `pushed_at` 2026-11-22T08:21:35Z.
- https://github.com/langchain-ai/open-swe/blob/main/docs/INSTALLATION.md — deployment guide says the shared installation's sandbox GitHub App credentials can access installed repositories beyond the initiating user's personal access; separate trust groups need separate deployments/App installations and restricted images. It also warns approvals cover detected Git pushes, not every possible shell/API write.
- https://www.langchain.com/blog/introducing-open-swe-an-open-source-asynchronous-coding-agent — original launch article explains plan review, in-run user feedback, GitHub integration, isolated sandboxes, and asynchronous execution; used as historical design context, not as the sole source for current product behavior.

## Fact checks and corrections
- The current repository title and deployment guide call the product Robin; the repository retains Open SWE naming in paths, IDs, and legacy installers. The card labels it Robin (formerly Open SWE) to help readers connect old coverage to current docs.
- Removed the old `open-swe-auto` issue-label claim and old architecture inventory because the current README describes a broader product surface and no longer lists that label as the defining flow.
- Replaced stale stars with a live GitHub API snapshot. Last push was the same UTC date as this review, so the card is not presented as abandoned.
- The README says deploying Robin as-is requires LangChain Managed Deep Agents; the installation guide also documents a standalone Docker route with its own infrastructure and credentials. The card distinguishes the default managed path rather than suggesting a one-command self-host.
- The security distinction is explicit in the installation guide: installation-scoped credentials and detected-push approval are not equivalent to per-user authorization or a complete shell/API write gate.
- Official current docs say the project is under active development and breaking changes/rough edges are expected; note this deployment risk.

## Card updates
- Added advanced difficulty, current product identity, per-thread sandbox model, privilege-minimization advice, source links, and a retrieval Q/A about real authorization boundaries.
- Removed the stale issue-label trigger, implementation component inventory, and June star count.

Confidence: high for current identity, GitHub activity snapshot, and the documented access/approval model; medium for treating the product as a broadly reusable architecture lesson because the current project is explicitly under active development.
