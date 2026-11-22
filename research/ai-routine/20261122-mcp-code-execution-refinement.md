# MCP code-execution card refinement

## Scope

Reviewed the existing card about Anthropic's “Code execution with MCP” article. Goal: explain the architecture pattern accurately, preserve its practical value, and avoid presenting company examples or security properties as universal guarantees.

## Primary evidence

- Anthropic, [Code execution with MCP: Building more efficient agents](https://www.anthropic.com/research/code-execution-with-mcp), published 2025-11-04 (reviewed 2026-11-22).
- The article describes two costs that can grow with connected tools: definitions loaded into context and intermediate results passed through the model (sections “Excessive token consumption…”).
- Anthropic presents code APIs as **a solution**, and a generated file tree as **one approach**. In that example, an agent discovers tool definitions in the filesystem and loads only the definitions it needs. One file per tool is an example, not an MCP requirement.
- The 150,000→2,000 token (98.7%) figure is Anthropic's Google Drive-to-Salesforce example. It is not an independent benchmark or a guaranteed reduction for other tasks.
- Filtering and transforming data in the execution environment can keep unneeded intermediate data out of model context. The article describes PII tokenization as behavior implemented by the MCP client/harness; MCP itself does not automatically tokenize sensitive data.
- The article warns that generated code needs a secure execution environment, sandboxing, resource limits, and monitoring. Any additional filesystem, network, and credential restrictions are implementation choices that should be assessed for the deployment.

## Card changes

- Reframed the card as an architecture pattern, not an MCP-standard feature.
- Qualified the reported token reduction as a single Anthropic example.
- Clarified that PII protection is not automatic and added an interview prompt about both context efficiency and privacy boundaries.
- Added advanced difficulty because safe code execution requires agent-harness and sandbox design knowledge.

## Overlap check

The nearby RAGFlow MCP card covers a product feature list. This card teaches the general pattern of exposing tools as code APIs and reducing tool-definition/intermediate-result context. The learning objectives are distinct; no merge is warranted.

## Remaining caveat

The article is vendor-authored. Its architectural mechanism is described concretely, but the numerical result should remain explicitly attributed to Anthropic.
