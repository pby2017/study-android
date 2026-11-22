# Card refinement audit — GitHub MCP issue fields

Reviewed: 2026-11-22 (KST)

## Scope and evidence

- Official GitHub MCP Server README/tool reference: <https://github.com/github/github-mcp-server>
- GitHub Changelog, personal-account availability (2026-11-11): <https://github.blog/changelog/2026-11-11-issue-types-and-fields-are-available-for-personal-accounts/>
- GitHub Changelog, organization public preview (2026-05-21): <https://github.blog/changelog/2026-05-21-issue-fields-are-now-in-public-preview-for-all-organizations/>
- GitHub Changelog, MCP support (2026-06-18): <https://github.blog/changelog/2026-06-18-duplicate-detection-and-issue-fields-mcp-support-for-github-issues/>

## Findings

- Current MCP docs list `list_issue_fields` with `owner` and optional `repo`: with a repository it returns fields available to that repository (inherited from its organization); without one it returns organization-level fields. Its documented OAuth challenge scopes are `repo` and `read:org`.
- `issue_write.issue_fields` sets or clears one field using `field_name` and exactly one of `value`, `field_option_name`, or `delete: true`; the tool requires `repo` scope. `list_issues.field_filters` documents coercion for single-select option name, text, number, and `YYYY-MM-DD` date. Do not infer that every field exposed in the product (including multi-select) is filterable through this MCP tool.
- Schema discovery is not a capability grant: actual use still depends on which tools the MCP host exposes and the credentials/scopes configured. The card now distinguishes these operations and calls for checking the live tool schema.
- GitHub says personal-account repositories received general availability for issue types and fields on Nov 11, 2026. The May 21 announcement was an organization public-preview expansion. These rollout states must not be conflated.
- Earlier audit separately verified that the June 18 MCP announcement is not evidence of MCP-based automatic duplicate detection. Do not reintroduce that claim.
- Official repo popularity is high (about 34.6k stars in same-day public snapshots), but the count is volatile and measures attention to the whole MCP server, not adoption of issue fields. It is intentionally omitted from the learning card.

## Change decision

Kept the card because the distinction between schema discovery, write permission, and supported query filters is useful for agentic issue triage. Expanded the steps and interview answer around that boundary; avoided turning this into a GitHub-only product announcement or claiming support for unverified filter types.

Confidence: high for the current documented tool schema and dated rollout statements; actual user access remains configuration-dependent.
