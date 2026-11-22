# Mastra card refinement — 2026-11-22

## Decision
Replace the feature inventory with one reusable design choice: use a goal-driven Agent when next actions are open-ended, and a Workflow when the developer can define steps, data flow and branches. Preserve the enterprise-license boundary as a deployment check.

## Sources checked
- https://github.com/mastra-ai/mastra — current README describes a TypeScript framework for AI apps and agents; lists model routing across 40+ providers, Agents, graph-based Workflows, suspend/resume human-in-the-loop, context, MCP, evals and observability. README's license section says most core code is Apache-2.0 but any ee/ directory is under Mastra Enterprise License and requires a valid enterprise license for production. GitHub showed 29.7k stars on 2026-11-22.
- https://mastra.ai/docs/agents/overview — Agents handle open-ended goals, choose tools, and iterate until a final answer or stop condition.
- https://mastra.ai/docs/workflows/overview — Workflows define structured steps, control flow and data flow; support suspension, resumption, and streaming. Workflow steps may call code, APIs, agents or tools.
- https://mastra.ai/docs — current docs navigation lists Agents, Workflows, Memory, MCP connections, Storage, Evals and Observability.

## Fact checks and corrections
- Updated GitHub star snapshot from 25,394 (June 24) to ~29.7k (November 22, live repository page).
- Removed the Gatsby/Y Combinator origin anecdote; it did not help explain implementation choices and can distract from the product concept.
- Kept “40+ providers” out of the main learning point despite its current README support; provider counts are volatile. Kept model routing generically.
- Distinguished goal-driven Agent behavior from explicit Workflow control. A workflow can include calls to agents/tools, so this is a choice of control boundary, not a mutually exclusive product split.
- Verified the dual-license distinction and the production-use requirement for code under any ee/ path.

## Card updates
- Added intermediate level, concise design rule, three key points, current source links, and an interview retrieval pair.
- Replaced broad feature inventory with an actionable Agent-vs-Workflow decision.

Confidence: high; claims map directly to current upstream README and docs.
