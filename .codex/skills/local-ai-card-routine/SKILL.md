---
name: local-ai-card-routine
description: Research, validate, and publish Korean AI developer-tool cards for this GitHub Pages repo.
---

# Local AI Card Routine

Use for the recurring local 4-hour pipeline in this repo.

## Mission

Research current AI developer tooling topics and publish only evidence-backed Korean 1-minute cards.

## Sync rule

Before any local edit, the wrapper must sync with GitHub using `git pull --ff-only`.
If the working tree is dirty before sync, stop and write `research/ai-routine/resume.md` instead of editing.
Other sessions may push to the same repo.

## Time box

- Total cadence target: 4 hours.
- Research target: ~3h30m.
- Implementation/publish target: final ~20m.
- Do not fill quota by force. Weak evidence means no card.
- If model usage/quota becomes risky, stop with a durable checkpoint instead of losing work.

## Candidate selection gate

Each published card must pass:

1. Practical developer value is clear.
2. Topic is currently relevant or recently active.
3. Popularity/attention signal exists:
   - GitHub stars or fast growth
   - benchmark mention
   - official/reputable coverage
   - adoption by known teams/tools
4. Fact-check uses at least two signals when possible.
5. At least one signal is primary or highly reputable:
   - official docs/blog/release notes
   - GitHub repo
   - benchmark page
   - reputable engineering post/news source
6. Source URL supports the exact card claim.

Reject:
- stale topics
- pure marketing with no developer utility
- unsupported claims
- duplicate titles already in `_data/cards.yml`
- exact star counts not verified live during the run

## Repo outputs

Update only as needed:

- `_data/cards.yml` — Korean 1-minute cards
- `_data/ai_queue.yml` — future validated candidates
- `auto-post-log.md` — timestamp, title, source
- `research/ai-routine/YYYYMMDD-HHMMSS.md` — research audit trail

Research note must include:
- candidates considered
- source URLs checked
- popularity/star/adoption signals
- fact-check signals
- selected/rejected reason
- confidence

## Resume / quota checkpoint

If a run cannot finish because usage/quota/tool access is near exhaustion:

1. Write `research/ai-routine/resume.md`.
2. Include:
   - current phase
   - candidates already checked
   - selected candidates not yet written as cards
   - rejected candidates and reasons
   - exact next actions
   - source URLs already opened
3. Leave `_data/cards.yml` valid YAML.
4. Stop cleanly so the next 4-hour launchd run can resume from `resume.md`.

At the start of each run, check `research/ai-routine/resume.md`. If present, resume that plan before starting unrelated research.

## Verification

Before finishing:

```bash
ruby -c scripts/auto_post.rb
ruby -e 'require "yaml"; YAML.load_file("_data/cards.yml"); YAML.load_file("_data/ai_queue.yml"); puts "yaml_ok"'
git diff --check
```

Do not commit or push when called from `scripts/local_ai_research_pipeline.sh`; wrapper owns commit/push.
