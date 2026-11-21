# GitHub security validation for third-party coding agents

Reviewed: 2026-11-22 (KST)

## Primary sources

- GitHub Changelog GA announcement (2026-06-09): https://github.blog/changelog/2026-06-09-security-validation-for-third-party-coding-agents/
- GitHub Docs: configure validation tools for Copilot cloud agent: https://docs.github.com/en/copilot/how-tos/use-copilot-agents/cloud-agent/configuring-agent-settings
- GitHub Docs: risks and mitigations for Copilot cloud agent: https://docs.github.com/en/copilot/concepts/security-governance-and-network-settings/risks-and-mitigations

## Verified scope

GitHub says this GA applies when third-party coding agents (including Claude and OpenAI Codex) work directly within repositories to implement features, fix bugs, or improve tests. Generated code receives the same automatic security validation previously available for Copilot cloud agent:

- CodeQL analyzes potential code vulnerabilities.
- Newly introduced dependencies are checked against the GitHub Advisory Database.
- Secret scanning looks for sensitive data such as API keys and tokens.
- If issues are found, the agent attempts to resolve them before finalizing the pull request.

The announcement says validation is on by default and follows repository Copilot settings for which tools to use. Repository administrators can configure tools. GitHub says no GitHub Advanced Security license is required. The cloud-agent documentation says dependency checks cover malware advisories and High/Critical CVSS vulnerabilities; the third-party-agent announcement itself does not provide that additional detail, so the card does not overstate the scan criteria.

## Limitations and guidance

This is a safety net, not a security guarantee or human approval. Automated tools can miss issues or produce incorrect fixes; review the diff, findings, and agent changes. The announcement specifically describes third-party agents working directly in the repository; do not generalize it to every locally run AI tool or arbitrary code merely pushed by a human.

## Card revision

- Preserved the examples (Claude, OpenAI Codex) but scoped them to supported third-party coding-agent repository workflows.
- Clarified default-on behavior, repository Copilot-settings control, and the agent's attempted remediation.
- Kept GHAS-license statement and added a clear no-guarantee/human-review boundary.
