# Claude Code GitHub Action card refinement

## Scope

Reviewed the next oldest AI card after the MCP code-execution refinement. The existing card mixed interactive mentions and unattended automation, included an unsupported fixed cost estimate, and omitted the current actor and billing controls.

## Primary evidence

- Anthropic, [Claude Code GitHub Actions](https://code.claude.com/docs/en/github-actions), checked 2026-11-22.
- The action runs Claude Code in repository GitHub Actions workflows. No `prompt` means interactive mode, which waits for `@claude` by default. A `prompt` input means automation mode; output goes to workflow logs by default unless the prompt/tools post elsewhere.
- Issue/PR events check that the triggering user has write access. Bot actors are rejected by default to reduce automation loops. Schedules have no author check but still have the human-actor check.
- GitHub Actions minutes and model tokens are separate resources. API-key use is billed as API use; OAuth runs use a Claude subscription. Cost depends on prompt, response, complexity, and repository size. Removed the stale fixed “50 PRs under $5” statement.
- Quick setup via `/install-github-app` requires repository admin access and supports GitHub.com; direct Anthropic authentication is the quick setup path. Cloud providers need their provider setup. The official app requests broad permissions for several Claude features; a custom app can restrict the Action to Contents, Issues, and Pull requests.
- GitHub currently showed approximately 10k stars for the repository when checked. This is a dated interest signal, not a usage or quality guarantee; omitted from the learning card because it does not explain workflow behavior.

## Card changes

- Added intermediate level and clarified the key `prompt` mode distinction.
- Added actor checks, output behavior, setup prerequisites, and the split between runner minutes and model billing.
- Removed the unsupported fixed-cost estimate and stale star count.
- Added labeled official-doc and repository links, plus an interview retrieval prompt.

## Relationship to adjacent cards

This card explains how to configure Claude Code in GitHub Actions. The separate Claude Code PR-session retrieval card concerns locating/resuming sessions associated with PRs; different learning objectives, no merge needed.

## Remaining caveat

Billing routes can change. Keep the card conceptual and verify current authentication behavior before adding prices or plan limits.
