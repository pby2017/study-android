# Card refinement audit — GitHub Issues MCP fields

Time: 2026-11-22 04:57 KST

## Sources checked
- https://github.com/github/github-mcp-server (official MCP server README and repository metadata)
- https://github.blog/changelog/2026-06-18-duplicate-detection-and-issue-fields-mcp-support-for-github-issues/
- https://github.blog/changelog/2026-05-21-issue-fields-are-now-in-public-preview-for-all-organizations/
- https://github.blog/changelog/2026-11-11-issue-types-and-fields-are-available-for-personal-accounts/

## Evidence and corrections
- Official server README lists `list_issue_fields`, `issue_write.issue_fields` (set/clear), and `list_issues.field_filters`; field values follow configured metadata, not arbitrary labels. `list_issue_fields` requires repository/org access scopes; write operations require repository scope. Actual access also depends on the MCP host's granted tools and credentials.
- June 18 GitHub Changelog explicitly announced MCP read/write support for issue fields. It separately announced duplicate suggestions (up to three) in issue creation as a public preview; that is a GitHub UI capability, not proof that the MCP server automatically triages or detects duplicates. Removed this conflation from the card.
- May 21 announcement said issue fields were in public preview for all organizations and reported 1,000+ organizations had adopted the base issue-fields feature. This is adoption of the GitHub feature, not MCP-specific adoption. Nov 11 announcement says issue types and fields became generally available for repositories owned by personal accounts. Card distinguishes that scope rather than applying GA to all organizations.
- GitHub repository page showed 34.6k stars and 5.4k forks at review (2026-11-22). This is a volatile attention signal, not proof of adoption or feature quality; omitted from card.
- Duplicate check: no other card specifically covers GitHub MCP issue-field discovery/write/filter; nearby GitHub MCP cards address secret scanning and broader MCP/agent workflows, which are complementary.

## Decision
Retain and refocus as an AI workflow/integration lesson: inspect a known metadata schema, write only evidence-backed values, and filter through structured fields. Removed the stale 30.8k-star value, misattributed 1,000+ organization metric, and duplicate-preview claim from the card.

Confidence: high for the currently documented tool surface and dated availability announcements; medium for account/organization-level access in any specific MCP host because it depends on configuration and authorization.
