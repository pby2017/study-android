# Microsoft Copilot SDK v2: runtime embedding and process boundaries

Reviewed: 2026-11-22 (KST)

## Sources checked

- Microsoft Copilot SDK v2.0.0 release (2026-11-17): https://github.com/microsoft/copilot-sdk/releases/tag/v2.0.0
- Current Microsoft Copilot SDK README and language package list: https://github.com/microsoft/copilot-sdk/blob/main/README.md
- Current in-process runtime guide: https://github.com/microsoft/copilot-sdk/blob/main/docs/setup/in-process-runtime.md
- Current getting-started guide (CLI relationship, install/runtime setup, BYOK): https://github.com/microsoft/copilot-sdk/blob/main/docs/getting-started.md
- GitHub's staged rebrand announcement (2026-10-28): https://github.blog/changelog/2026-10-28-github-copilot-sdk-is-becoming-microsoft-copilot-sdk/
- Current releases: https://github.com/microsoft/copilot-sdk/releases

## Verified current state

The repository and SDK are now branded Microsoft Copilot SDK. The transition announcement says the move is phased and some old package names/docs can remain during migration; the v2.0.0 release explicitly says packages and namespaces were renamed. The current README lists six SDKs: TypeScript, Python, Go, .NET, Rust, and Java. The release list showed v2.0.1 (2026-11-18) as the latest stable release when checked; this card avoids a volatile latest-version claim.

The SDK embeds the Copilot agent runtime and exposes sessions, tools, MCP, events, hooks, and streaming. It is not the CLI/TUI. A separate CLI installation is not generally required; the CLI can be used for login, while SDK authentication can also use a GitHub token or supported BYOK provider credentials.

The v2.0.0 breaking change is its default runtime boundary: it loads a native Rust runtime in the host application process through a C ABI and in-memory JSON-RPC. This can simplify deployment, but it is not a sandbox and has no crash isolation; a native runtime crash can terminate the host process. For crash isolation or per-client process configuration, explicitly select a spawned stdio/TCP child process. Runtime assets must match deployment OS, CPU architecture, and Linux C library. Unsupported native assets fail; there is no automatic subprocess fallback.

## Card revision

Replaced the stale GA/v1.0.2 memory/defer feature list with the current v2 architecture boundary and deployment decision. Kept the six-language value, distinguished SDK from CLI, added explicit isolation guidance, and included the current authentication requirement without overloading the card with transient release details.

## Limitations

The SDK README and release notes are vendor-maintained sources. No runtime was installed or tested in this content-only review; platform and crash-isolation claims are sourced from the SDK's own documentation.
