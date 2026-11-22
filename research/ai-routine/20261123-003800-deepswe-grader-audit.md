# DeepSWE v1.1: verifier design and independent audit

## Sources checked
- https://github.com/datacurve-ai/deep-swe — primary task corpus/readme, task format, v1.1 patch collection, clean verifier environment, CTRF output, common mini-swe-agent leaderboard harness.
- https://deepswe.datacurve.ai/ — official leaderboard; at review it showed 113 tasks and an update date of 2026-09-22. Scores were intentionally not copied into the card because they are stale relative to this review date and the benchmark has known grading defects.
- https://epoch.ai/benchmarks/deepswe/review — independent Epoch AI review, dated 2026-09-07, verdict “Flawed”. It found false negatives in at least 23/113 tasks and states 18/23 involved a general error pattern related to models editing tests that are later replaced/removed during grader setup. The review explicitly says it stopped once it met the flawed threshold; this is a lower bound, not a full audit.

## Attention signal
The public repository page showed approximately 1.9k stars and 134 forks at this review. This is a snapshot only, not evidence of benchmark validity or adoption.

## Card decision
Keep the subject because long-horizon benchmark design, patch-based clean verification, and the independent critique offer a useful evaluation-literacy lesson. Recenter the card from “reliable grading resists shortcuts” to “grader quality must itself be audited”. Do not present current model scores as universal rankings.

## Fact boundaries
- The official corpus has 113 tasks, across 91 repositories and five languages.
- For v1.1, the agent commits work; a hook collects the patch and applies it in a pristine verifier container. The verifier emits structured outputs including reward and CTRF report.
- Epoch AI's 23 findings are task-level false-negative instances, not a claim that exactly 23/113 results are always invalid. 18/23 relate to the grader behavior around agent edits to tests; this can penalize a correct patch.
- Epoch describes a partial review and says other error classes were not reviewed after the threshold was reached. Avoid implying that all benchmark results are invalid.
- Score results are tied to model, harness, effort settings, and run setup. No numerical leaderboard result is retained in this card.

## Confidence
High for corpus and verifier workflow (primary repository) and for the stated review verdict/findings (independent review). High confidence in the card's caveat because it is explicitly bounded as a partial review and does not dismiss the benchmark wholesale.
