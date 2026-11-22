# AI Research Skills card refinement — 2026-11-22

## Decision
Retain this high-interest AI developer resource, but describe it as a library of reusable research/engineering guidance rather than a tool that makes an agent a verified research expert. Emphasize selecting a project-appropriate subset and validating research outputs.

## Sources checked
- https://github.com/Orchestra-Research/AI-research-SKILLs — upstream README describes 98 skills across 23 categories and the autoresearch orchestration path; repository page showed about 14.7k stars and 1k forks on 2026-11-22 and identifies MIT licensing.
- https://github.com/Orchestra-Research/AI-Research-SKILLs/blob/main/packages/ai-research-skills/README.md — installer detects supported coding agents, offers whole-library/category/skill selection, and documents global symlinks versus project-local copies. Local mode tracks the selected set in `.orchestra-skills.json` and supports version control.
- https://github.com/Orchestra-Research/AI-research-SKILLs/blob/main/README.md — upstream positions `autoresearch` as the central research workflow that routes to specialized skills. This is the project's stated capability, not independent evidence that generated research is correct.

## Fact checks and corrections
- The previous title (“makes agents AI research experts”) repeated an upstream promotional claim as a guaranteed result. Reframed it as a skills library that provides instructions and routing.
- Kept the upstream count of 98 skills / 23 categories as listed in its README. The package README confirms AI research/engineering scope and describes ways to install a subset.
- Clarified the install distinction: global installation stores a canonical skill copy and links it to agent directories; `--local` copies files into project agent directories and tracks them with a lock file.
- GitHub popularity is a dated snapshot, not a stable property. Current page showed 14.7k stars / 1k forks on 2026-11-22.
- Practical recommendation to verify sources, experiments, and outputs is editorial guidance: a skill library provides procedural text, not independent validation of each research result.

## Card updates
- Added intermediate level, a concise scope summary, subset-selection and reproducibility advice, the research-output verification caveat, three upstream references, and an interview retrieval question/answer.
- Removed the stale 10k-star / 2026-06 metric and unnecessary Claude Code marketplace install detail.

Confidence: high for repository scope, installer behavior, and popularity snapshot; medium for the practical application advice, which is a reasoned implication rather than a vendor guarantee.
