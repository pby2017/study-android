# Cursor Agent search card refinement — 2026-11-22

## Decision
Revisit the previously refined Cursor search card because product behavior has since changed. The prior card described semantic embedding search, 80% readiness, server-side vector indexing and periodic incremental sync. Those details no longer describe the current Agent search path. Reframe the card around local Instant Grep and the distinct model-request privacy boundary.

## Sources checked
- https://cursor.com/docs/agent/tools/search — current official docs: exact symbol/string lookup with Instant Grep, local index, no code/path upload for index construction and no stored code embeddings, opened file content may still be part of model request, and Explore subagent can run broad parallel searches.
- https://forum.cursor.com/t/what-do-you-think-about-cursor-removing-the-codebase-indexing-settings/165899 — Cursor staff replies July 21–22, 2026: the dedicated semantic/embedding index is being turned down in favor of grep-based retrieval; .gitignore/.cursorignore rules apply; grep-based agent search can try multiple candidate terms and refine by reading files.
- https://cursor.com/blog/secure-codebase-indexing — official January 2026 description of the former semantic indexing pipeline. Used only to establish historical context; deliberately not repeated as current behavior.

## Fact checks and corrections
- Removed old 80%-indexing availability and 5-minute sync claims; current official Search docs don't describe them as current Agent search behavior.
- Removed old claims that current search creates remote semantic embeddings / stores vectors. Official current docs state Instant Grep builds and queries its index on the machine and doesn't upload code/paths for search-index construction.
- Kept the important limitation: when Agent opens a match, file contents may still enter a model request. Search-index privacy is not equivalent to local inference or no model data transfer.
- Clarified practical search: exact names/strings suit grep; broad concepts may require multiple candidate terms, directory listing, iterative file reads or Explore subagent. Did not claim grep is equivalent to embeddings for every vague concept.
- The forum contains staff responses; official current documentation remains the primary source for the current behavior.

## Card updates
- Renamed to describe current Agent search rather than deprecated codebase embeddings.
- Added intermediate level, concise workflow/privacy summary, three key points, three sources, and a privacy-boundary interview Q/A.

Confidence: high for current search and indexing privacy statements; behavior can change with product updates.
