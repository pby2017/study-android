# Baidu Stability Analysis Agent card refinement — 2026-11-22

## Decision

Keep and refine this advanced AI+Android card. The tool has a current Android logcat/tombstone pipeline, active upstream changes, and a recent PyPI package, so it remains a practical stability-engineering example. Its exact adoption signal is modest; do not call it broadly popular or trending. The key lesson is to separate evidence-based diagnosis, safe patch application, and proof that the modified Android app no longer crashes.

## Primary sources checked

- Repository README: https://github.com/baidu-maps/stability-analysis-agent — describes parsing, symbolization, evidence chains, source context, optional AI repair, and supported Android log formats.
- Runtime lifecycle: https://github.com/baidu-maps/stability-analysis-agent/blob/main/docs/architecture/AGENT_RUNTIME_LIFECYCLE.md — safety verification checks Git change, requested workspace boundaries, and synchronized file set; effectiveness verification is opt-in; `repair_applied` is not a claim that the crash is fixed; failed verification can roll back when backups exist.
- Verification providers: https://github.com/baidu-maps/stability-analysis-agent/blob/main/docs/tools/VERIFICATION_PROVIDERS.md — capability profiles define fixed executable checks; discovery only suggests checks and does not run them; missing profiles stop at static evidence; execution is scoped by command/root policy.
- CLI guide: https://github.com/baidu-maps/stability-analysis-agent/blob/main/docs/cli/CLI_GUIDE.md — runtime crash reproduction/regression scripts require both `--enable-runtime-verification` and a verification configuration; `repair_applied` is not a successful runtime fix.
- Android log formats: https://github.com/baidu-maps/stability-analysis-agent/blob/main/docs/tools/CRASH_LOG_FORMATS.md — lists `android_logcat` and tombstone formats, including native address stack frames.
- Package metadata: https://github.com/baidu-maps/stability-analysis-agent/blob/main/pyproject.toml — Python >=3.9, Apache-2.0, project version 1.7.4.
- PyPI: https://pypi.org/project/stability-analysis-agent/ — current API metadata showed v1.7.4 uploaded Nov 18, 2026.
- GitHub releases API: https://api.github.com/repos/baidu-maps/stability-analysis-agent/releases?per_page=1 — newest tagged release returned v1.2.4 (May 11, 2026), older than PyPI 1.7.4. The card does not claim the GitHub Release page is current; verify install source/version before adoption.

## Attention / freshness snapshot

GitHub API checked during this run (2026-11-22): 52 stars, 5 forks, 0 open issues, not archived; latest push `2026-11-18T02:21:10Z`, HEAD `49d4cb328882` (release 1.7.4 knowledge-retrieval update). GitHub page lists 37 commits. This shows recent maintenance but low-to-moderate public adoption, not a star leader. Avoid hard-coding these counts into the card. PyPI v1.7.4 upload date and repository `pyproject.toml` agree, but GitHub tagged releases lag substantially.

## Card change

- Added `고급` level and an interview question about why `repair_applied` is not equivalent to a fixed crash.
- Clarified that native address evidence depends on matching build symbols.
- Separated deterministic patch/workspace-integrity checks from opt-in runtime effectiveness checks.
- Corrected the verification guidance: candidate discovery does not execute commands; an explicit profile/provider is needed for configured build/reproduction/regression checks.
- Kept the Apache-2.0/recent package facts in the audit rather than filling the short card with volatile version and star counts.

## Confidence

High for source-tree features, version metadata, license, and documented verification semantics. Medium for practical reliability across arbitrary Android projects; no independent benchmark or broad user-adoption evidence was found in this pass.
