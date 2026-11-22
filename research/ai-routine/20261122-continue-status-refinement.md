# Continue project-status card refinement

Updated: 2026-11-22 (Asia/Seoul)

- Checked the official acquisition notice, repository README, release page, and current CLI docs:
  - https://continue.dev/
  - https://github.com/continuedev/continue
  - https://github.com/continuedev/continue/releases
  - https://docs.continue.dev/cli/quickstart
- The acquisition notice says Continue joined Cursor and the open-source code remains freely available. The repository README says it is no longer actively maintained/read-only and identifies a final 2.0.0 release. The release page marks VS Code 2.0.0 as Latest and 2.1.0 as Pre-release; both dates are June 19, 2026.
- The current CLI documentation still describes `cn` interactive/headless usage, so removed the claim that the CLI itself is unusable or undocumented. Clarified that accessible docs/install paths do not guarantee maintenance or security updates.
- Replaced the old “AI Checks pivot” pitch and unverified 33.7k stars / unsupported claim that CLI had the same retirement status. Current project state is mixed: old codebase availability, acquisition notice, and active-looking docs coexist with a repository maintenance warning. Keep that nuance visible rather than presenting the docs as proof of support.
- GitHub showed about 36.5k stars on 2026-11-22. Treated this only as a dated popularity snapshot; added the distinction between Apache-2.0 reuse rights and ongoing support.
- No nearby duplicate: this card teaches open-source lifecycle and adoption risk; adjacent AI coding cards compare product/tool architecture.
- Validation: YAML/card-field/source checks; Ruby syntax; auto-post tests; navigation/source tests; `git diff --check`. Jekyll build unavailable because the executable is not installed.
