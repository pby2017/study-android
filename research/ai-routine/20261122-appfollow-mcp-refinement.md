# AppFollow MCP + AI Toolkit card refinement — 2026-11-22

## Sources checked

- [AppFollow official MCP and AI Toolkit guide](https://support.appfollow.io/hc/en-us/articles/49071302595601-AppFollow-MCP-and-AI-Toolkit), updated Nov 20, 2026. It distinguishes live MCP data access from the optional AI Toolkit workflows, documents supported clients, roles, setup, credits, and troubleshooting.
- [AppFollow official methods cost and availability](https://docs.api.appfollow.io/reference/methods-cost-and-availability). Each method has a credit cost; availability depends on the subscription. Reads can be charged per request and write/AI operations per item or batch.
- [AppFollow/appfollow-ai-toolkit public GitHub repository](https://github.com/AppFollow/appfollow-ai-toolkit). On Nov 22, 2026, GitHub showed 4 stars, 0 forks, and one commit. This is a low adoption signal, not evidence that the tool is widely used.

## Card changes

- Refocused the card on Android developer usefulness: turn Google Play/App Store feedback into an investigation queue, then corroborate reported bugs against the actual release, crashes, logs, and reproduction.
- Separated MCP (live account data access) from the optional toolkit (repeatable feedback, ASO, competitor, and app-search reports).
- Updated access policy: Owner/Admin can read/write; other roles are read-only. The toolkit describes preview/approve/confirm for writes.
- Removed the old OpenAI-specific data-processing claim because the current official guide supports multiple AI clients and does not substantiate that blanket claim. Kept only source-backed AppFollow API credit and plan caveats.
- Added level and retrieval Q&A. No popularity claim was added to the public card because repository attention is currently low.

Confidence: high for documented feature, permissions, and credit behavior; medium for practical developer value. The current docs are recent, but the repository's small star/fork count means this is a narrow workflow example, not a broadly adopted or proven-hot tool.
