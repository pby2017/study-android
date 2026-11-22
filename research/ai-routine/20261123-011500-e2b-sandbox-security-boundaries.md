# 2026-11-23 01:15 KST — E2B sandbox, egress, credential, and deployment boundaries

## Sync and scope

- Ran `git pull --ff-only origin master` before editing; `master` was already current and the worktree was clean.
- Refined one AI developer card. No app-factory work or dependencies.

## Sources checked

- https://github.com/e2b-dev/runtime
- https://docs.e2b.dev/sandbox
- https://docs.e2b.dev/network/internet-access
- https://docs.e2b.dev/secrets
- https://e2b.dev/resources/introducing-e2b-embed
- https://docs.e2b.dev/llms.txt

## Evidence and rationale

- The current official documentation index distinguishes command execution, Code Interpreter, network controls, Secrets, workload identity, and Embed. The card's old claim that self-hosting is in a separate `e2b-dev/infra` Terraform repository is stale: `e2b-dev/runtime` now describes the runtime behind Cloud, Enterprise, and own-machine deployments.
- E2B's security page describes one Firecracker microVM and kernel per sandbox. This is a vendor-stated isolation property, not a guarantee that arbitrary generated code is safe or that every deployment has identical controls.
- The official network guide says outbound internet is enabled by default and documents disable/allow/deny controls. That is a concrete reason not to equate VM isolation with network isolation.
- The Secrets guide describes credential storage outside the sandbox and injection into matching outbound HTTPS requests by the egress proxy. It warns to inject only to trusted destinations because the destination can expose the value in its response.
- The Embed announcement says it runs the runtime and dashboard on one machine with Linux+KVM and explicitly excludes Secrets, volumes, workload identity, and BYO proxy. Cloud, BYOC, and Embed must not be treated as feature-identical.
- GitHub's current runtime page showed about 1.9k stars and recent activity (latest repository activity dated Nov 21, 2026 in the page snapshot). This is a dated attention signal only, not adoption or security evidence.

## Card changes

- Replaced stale stars and the obsolete infra-repository claim.
- Added an intermediate-level lesson: separately design VM execution, outbound egress, credential injection, and deployment feature boundaries.
- Added current official references and an interview retrieval Q&A.

## Verification

- `ruby -c scripts/auto_post.rb` — passed.
- `_data/cards.yml` and `_data/ai_queue.yml` parse; the E2B card has level, sources, interview, and answer.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed after correcting the log's final blank line.
- `bundle check` — required Gemfile dependencies are not installed; no dependencies were installed and Jekyll build remains unverified.

## Confidence

- High for the documented API/defaults and Embed exclusions; medium for vendor-described isolation and point-in-time popularity.
