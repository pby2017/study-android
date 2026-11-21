# Android CLI + Skills card refinement

- Date: 2026-11-22 (KST)
- Candidate: existing `Android CLI + Skills` card; valid AI+Android developer-tooling topic.
- Decision: retain and reframe as the three-part agent workflow: CLI for executable Android operations, Skills for repeatable task instructions, Knowledge Base for current official facts.
- Current status: official Android Developers documentation describes Android CLI 1.0 as stable. Current CLI docs cover SDK/project/device/app workflows and the `android docs` Knowledge Base path. Android skills follow the open Agent Skills standard; compatible agents can load task-specific `SKILL.md` instructions. `android init` installs the base CLI skill; `android skills add <name>` installs a specific skill.
- Freshness / attention snapshot (GitHub API, checked 2026-11-22): `android/skills` had 10,690 stars, 700 forks; latest push 2026-11-17 and latest commit 2026-11-15. High developer attention for an official workflow repo; metrics are volatile and intentionally omitted from the card. Android CLI release notes included October 2026 updates (e.g. UI interaction commands, reliability and skills updates).
- Benchmark audit: Google's 2026-04-16 launch post says internal experiments for project/environment setup used >70% fewer LLM tokens and completed tasks 3x faster than agents using only standard toolsets. This is a narrow internal setup comparison; public post does not state sample size, task distribution, model/hardware controls, or methodology. Kept the metric only with explicit scope and caveat; not a general Android development performance guarantee.
- Duplicate check: existing Android Studio Agent Mode card covers IDE-led planning, edits, connected-device execution, data/permission boundaries, and verification. This card covers cross-agent CLI operations, reusable standard skills, and live docs grounding; the surfaces are complementary, though related.
- Privacy note: official CLI docs disclose collection of command/subcommand invocations, option names and certain predefined values, plus anonymized exception messages/stack traces. Not included in the one-minute card because the core lesson is workflow composition; review the current data-collection page before team adoption.
- Sources:
  - https://developer.android.com/tools/agents/android-cli
  - https://developer.android.com/tools/agents/android-skills
  - https://developer.android.com/tools/agents/android-cli/release-notes
  - https://developer.android.com/blog/posts/android-cli-now-stable-1-accelerate-developing-for-android-using-any-agent
  - https://developer.android.com/blog/posts/android-cli-build-android-apps-3x-faster-using-any-agent
  - https://github.com/android/skills
- Confidence: high for current CLI/skill behavior, stable status, and repo attention snapshot; medium for the experimental speedup because no methodology/sample size was published.
- Not tested: no Android CLI install, SDK operation, or agent skill activation was run; this was a card/source refinement only.
