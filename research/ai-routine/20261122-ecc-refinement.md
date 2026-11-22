# Everything Claude Code card refinement — 2026-11-22

## Decision
Retain ECC as a high-attention AI coding-agent project, but replace its outdated component-count tour with the practical cross-harness installation lesson: choose one supported install method per harness and do not assume feature parity.

## Sources checked
- https://github.com/affaan-m/ECC — current README calls ECC an agent-harness performance system; MIT license; Claude Code is its primary reference, Codex and Qoder have native plugin paths, and other harnesses have capability-limited adapters. README warns to install only from official sources and not to stack full manual and plugin installs in the same harness because skills, commands, hooks, or configuration can duplicate. It states Codex native hooks require explicit trust and do not use Claude's hook profiles.
- https://github.com/affaan-m/ECC#install-ecc — per-harness installation choices, guided setup, supported plugin paths, and explicit duplicate-install warning.
- https://github.com/affaan-m/ECC#platform-support — feature matrix says Codex parity with Claude Code is partial and distinguishes native hooks and trust behavior.
- https://api.github.com/repos/affaan-m/ECC — queried live on 2026-11-22: 308,557 stars, 45,398 forks, 168 open issues, MIT, `archived=false`, `pushed_at=2026-11-20T01:13:45Z`.
- https://github.com/affaan-m/ECC/releases/latest — latest release API returned v2.2.3, published 2026-10-01. Current README's guided installation examples pin the same 2.2.3 package version.

## Fact-check and limits
- The GitHub API values are a time-stamped popularity/activity snapshot, not a statement that users actively run every feature.
- ECC is genuinely multi-harness, but its own support matrix identifies Claude Code as the primary reference and describes Codex parity as partial. The card avoids a flat claim that all listed agents receive equivalent behavior.
- The install duplication warning is specific: plugin + full manual install in one harness, or Codex sync + native plugin, can duplicate managed assets. ECC says using it in multiple harnesses is valid when each harness uses its own supported path.
- Removed stale June 25 figures (221,207 stars / 33,877 forks), old v2.0 inventory numbers, and an AgentShield summary because it distracted from the card's central idea and had become version-sensitive.
- Duplicate scan found no separate card already teaching ECC install-path collision; this entry was the only ECC card.

## Card changes
- Added intermediate level and an interview Q&A about installing in Codex and Claude Code without assuming identical hook semantics.
- Kept the card short: project identity, current attention signal, one concrete installation rule, and one compatibility caveat.

Confidence: high for current README/API claims; medium for general adoption interpretation beyond the public star/fork snapshot.
