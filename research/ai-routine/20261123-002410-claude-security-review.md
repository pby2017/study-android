# Claude Code Security Review Action card review

## Decision

Keep the card as a practical AI-security integration case, but change its center from a feature list to the trust boundary required to run it safely. The old card stated an outdated 5,381-star count, overemphasized a confidence cutoff in the bundled command, and recommended the mutable `@main` reference without mentioning action pinning.

## Sources checked (2026-11-23 KST)

- Official repository README: https://github.com/anthropics/claude-code-security-review
  - Current GitHub page showed 7.1k stars and 809 forks (rounded UI values; attention signal only, not deployment adoption).
  - README says the GitHub Action analyzes PR diffs, can post comments/upload results, requires an API key, and is not hardened against prompt injection. It recommends using approval for external-contributor workflows.
  - README's example uses `@main`; this is an example, not immutable supply-chain pinning.
- Current Action metadata: https://github.com/anthropics/claude-code-security-review/blob/main/action.yml
  - Confirms `claude-api-key`, `comment-pr`, results upload, and other supported inputs.
- Bundled security-review command: https://github.com/anthropics/claude-code-security-review/blob/main/.claude/commands/security-review.md
  - Confirms a separate analysis/false-positive filtering process and confidence thresholding in the current repository file; omitted from the card because operational prompt details are less durable than the security boundary.
- GitHub Actions settings: https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-your-repository
  - Documents approval policies for fork workflows and the absence of secrets/read-only token boundary by default for public fork PRs.
- GitHub guidance on `pull_request_target`: https://docs.github.com/en/actions/reference/security/securely-using-pull_request_target
  - Reinforces that checking out and running fork-controlled code in a privileged workflow creates risk; don't use privileged events as a shortcut for secret access.

## Card changes

- Added intermediate difficulty and an interview question/answer.
- Removed the stale exact star count from June and updated the rounded popularity signal from the current GitHub page (~7.1k stars).
- Reframed as a candidate generator/complement, not a security guarantee or replacement for SAST/tests/human review.
- Added least-privilege PR comment scope, pinning the reviewed Action to a commit SHA, API-key isolation, and fork-PR approval boundaries.
- Removed the embedded `/security-review` command's brittle confidence threshold from the public card.

## Confidence

High for the current README warning, interface, and GitHub fork policy. GitHub's star value is rounded and time-sensitive. No claim of measured precision, recall, or production adoption is made.
