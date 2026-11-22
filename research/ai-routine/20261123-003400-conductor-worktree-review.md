# Conductor workspace isolation and review workflow

## Card decision
Refined the older Conductor card rather than adding a competing card. Its distinctive lesson is how a local agent workspace layer turns multiple coding sessions into separate Git workspaces and a review/merge workflow.

## Primary sources checked
- https://www.conductor.build/docs/first-workspace — workspace isolation, agent options, checks, diff and PR flow.
- https://www.conductor.build/docs/reference/harnesses — current harness support, bundled tools, Cursor API, and pricing boundary.
- https://www.conductor.build/docs/guides/review-and-merge — review changed files, run checks, clear blockers, merge and archive.
- https://www.conductor.build/docs/installation — macOS availability and setup requirements.

## Verified claims
- A Conductor workspace is an isolated project copy backed by Git; independent workspaces can have their own branches and worktrees.
- Current docs list Claude Code, Codex, Cursor, and OpenCode. Claude Code, Codex, and OpenCode are bundled; Cursor uses Conductor's Cursor integration and Cursor API key.
- Conductor says the app is free and does not bill/resell model usage; harness usage is charged by the provider account or API key.
- The documented workflow uses Diff Viewer and Checks to inspect changes and readiness before creating/merging a PR. The person remains responsible for review and merge decisions.
- A Git worktree separates working files and branch state. The caution that it is not itself a security sandbox is an explicit engineering inference from this scope; the card states the distinction rather than claiming Conductor isolation is a security feature.
- No exact popularity/star count is claimed: Conductor is a proprietary product and the card's learning value does not depend on a star metric.

## Changes and rationale
- Removed the Orca comparison because Orca already has its own card and the cross-product detail obscured Conductor's core lesson.
- Replaced the outdated agent list and broad "human merge gate" slogan with current workspace, harness, provider billing, and review/checks behavior.
- Added intermediate difficulty and an interview retrieval pair about the boundary between Git isolation and security isolation.

## Confidence
High for the product workflow and billing wording because each is stated in current first-party docs. Medium-high for security caveat, which is a general inference about Git worktrees and must not be presented as a vendor-specific sandbox guarantee.
