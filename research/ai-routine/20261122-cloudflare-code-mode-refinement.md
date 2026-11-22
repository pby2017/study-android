# Cloudflare Code Mode card refinement

Date: 2026-11-22 (Asia/Seoul)
Scope: Refresh next oldest eligible AI card after OpenSpec.

## Decision

- Retain the card as a practical pattern: let an agent write a short program to compose tools, rather than making repeated isolated tool calls.
- Difficulty: Intermediate; requires understanding tool schemas, generated code execution, and capability/security boundaries.
- Preserve token reduction as a concrete example but label it as Cloudflare MCP's own benchmark, not a universal result.

## Evidence and caveats

1. Cloudflare MCP README: <https://github.com/cloudflare/mcp/blob/main/README.md>
   - Describes `search` and `execute` for its API catalog; the server also exposes `docs` and `whoami`. The previous card's “3 tools” count omitted `whoami` and inaccurately treated all operations as those three.
   - Current comparison table estimates 2,594 native endpoint tools with required parameters at ~244,047 tokens and Code Mode at ~1,100. These are project-published estimates and should not be presented as general MCP benchmarks.
2. Dynamic Workers Code Mode example: <https://developers.cloudflare.com/dynamic-workers/examples/codemode/>
   - Shows generated JavaScript executing in an isolated Dynamic Worker; `globalOutbound: null` blocks fetch, while tool proxy methods are exposed through explicit bindings.
3. Egress control: <https://developers.cloudflare.com/dynamic-workers/usage/egress-control/>
   - Network access, bindings, and credential proxying are configuration choices. “Sandbox” alone does not imply all network access is blocked or secrets are always inaccessible.
4. Check Point Research: <https://research.checkpoint.com/2026/when-agentic-glue-melts/>
   - Reported five workerd vulnerabilities and says managed Workers had been fixed; self-hosted workerd/Code Mode deployments should update to `v1.20260619.1` or later. This supports a runtime-update caveat, not a blanket claim that current managed execution is unsafe.

## Removed / corrected

- Corrected the tool count; clarified `search`/`execute` are central API tools and that the README's overall comparison is implementation-specific.
- Removed blanket statements that all Code Mode blocks general internet access and never exposes API keys.
- Added explicit least-privilege egress/binding and runtime update considerations, with the reported managed-vs-self-hosted vulnerability status.
- Added level and retrieval Q&A; avoided claiming a universal token savings ratio.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; both YAML files load; target card schema, level, four points and four sources passed; `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed.

Confidence: high for current README numbers as claims made by the project; security observations attributed to the dated Check Point report and Cloudflare configuration docs.
