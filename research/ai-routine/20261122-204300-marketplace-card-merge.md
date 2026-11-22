# Marketplace card merge — ccpi / Tons of Skills

Date: 2026-11-22 (Asia/Seoul)
Scope: Evaluate the next older marketplace-tool card and merge it into the existing marketplace learning card to reduce duplicate inventory.

## Candidate and decision

- Candidate removed: `ccpi + tonsofskills.com — 플러그인·스킬·에이전트를 키워드로 검색·설치하는 오픈소스 마켓플레이스 CLI`.
- Destination refined: `Claude Code 플러그인 마켓플레이스 — 목록 등록과 설치·검증은 별개` (previously `Claude Community Marketplace`).
- Reason: The candidate duplicated existing cards about Claude plugin marketplaces, skills catalogs, and cross-agent skill installers. Its meaningful unique contribution was a live example of the difference between catalog registration, native install, and a companion CLI. That lesson fits the existing marketplace workflow card; retaining a separate vendor card inflated inventory without adding a distinct concept.

## Current evidence checked

1. Anthropic Claude Code docs, install/manage: <https://code.claude.com/docs/en/discover-plugins>
   - Marketplaces expose plugin catalogs. Installation is a separate, scoped operation. Plugin details can include skills, agents, hooks, and MCP/LSP servers; inspect them before install. The page explicitly warns that local/custom marketplaces may only expose component details at install time.
2. Anthropic Claude Code docs, create/host marketplace: <https://code.claude.com/docs/en/plugin-marketplaces>
   - Marketplace is a repository/directory with `.claude-plugin/marketplace.json`; each entry identifies the plugin name and source. The native CLI validates marketplace structure and entries.
3. Tons of Skills current repo: <https://github.com/jeremylongshore/tons-of-skills-marketplace>
   - Repository renamed/moved from the old `claude-code-plugins-plus-skills` URL (old URL redirects). README describes a harness-free canonical content layer, but says Claude Code is currently the verified-native harness; other adapters are still engineering candidates. GitHub snapshot on 2026-11-22: 2.9k stars, 3,140 commits. Star count is an attention signal only, not a quality or safety assessment.
   - README page snapshot labels 428 plugin catalog entries and 2,716 distinct marketplace-visible skills; these are distinct count cohorts, not an interchangeable total. Omitted from public card because counts change and do not teach the workflow.
4. Tons of Skills current installation docs: <https://tonsofskills.com/docs/getting-started/installation/> and <https://tonsofskills.com/docs/getting-started/first-plugin/>
   - Current documented marketplace: `jeremylongshore/tons-of-skills-marketplace`; install slug: `claude-code-plugins-plus`.
   - `ccpi install <name>` currently prints guided native installation instructions; it is not a full installer transaction. `ccpi search` is a coming-soon placeholder. Official guidance is to browse the web catalog and use the native Claude plugin manager.
   - Current workflow: `claude plugin marketplace add jeremylongshore/tons-of-skills-marketplace`, then review/install one item with `claude plugin install api-test-automation@claude-code-plugins-plus --scope project`.
5. Popularity evidence: current GitHub repository showed 2.9k stars. This is meaningful but modest relative to broad skills catalogs; the card is retained only as an example supporting a practical native-install/trust-boundary lesson, not as a recommendation that it is the best marketplace.

## Corrections and merge result

- Removed stale counts (432 plugins, 2,769 skills, 297 agents, 30 contributors), old repository path, and claim that ccpi can search/install/manage all catalog items.
- Replaced the unsupported “model-agnostic means broadly portable” implication with the repository's explicit current verified-harness boundary.
- Replaced unsupported marketplace-level safety assurance with a review-before-install rule; registration does not install every plugin or certify behavior.
- Updated existing marketplace card with intermediate level, concise summary, current commands, sources, and interview Q&A; deleted the duplicate catalog card. YAML card count decreases by one.
- Next oldest-first item after merge: `BMAD-METHOD`.

## Validation

Validation: `ruby -c scripts/auto_post.rb` passed; cards/queue YAML loaded; merged card schema, level, points, sources, interview and answer passed; duplicate title is absent; card count is 985 (down one); `ruby scripts/auto_post_test.rb` passed (3 runs, 14 assertions); `git diff --check` passed. Commit/push pending.

Confidence: high for the native installation and CLI behavior based on current first-party docs; medium for the marketplace's broader quality, as popularity and self-described catalog metrics do not establish plugin safety or usefulness.
