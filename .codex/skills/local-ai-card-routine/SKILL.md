---
name: local-ai-card-routine
description: Research, validate, and publish Korean AI/Android developer-topic cards for the study-android GitHub Pages repo.
---

# Local AI Card Routine

Use for the recurring local 4-hour pipeline in this repo.

## Mission

Research current AI and Android development topics and publish only evidence-backed Korean 1-minute cards to study-android.

## Scope boundary

This skill is for the `study-android` knowledge-card repository only. Android topics are educational card content, not app feature requests.

Allowed outputs:
- `_data/cards.yml` — Korean public-facing knowledge cards
- `_data/ai_queue.yml` — future validated candidates when useful
- `auto-post-log.md` — publication history
- `research/ai-routine/YYYYMMDD-HHMMSS.md` — research audit trail
- `research/ai-routine/resume.md` — durable checkpoint when a run cannot safely finish

Forbidden outputs:
- Do not create, update, close, comment on, or triage GitHub issues in `app-factory-android`.
- Do not create app-factory branches or pull requests.
- Do not interpret Android topic research as an app implementation request.
- Do not add GitHub Actions for this routine.
- Do not publish private, sensitive, credential-like, or app-factory operational details in cards.


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

Candidate checklist for every run:
- practical developer value
- current/recent relevance
- popularity, adoption, benchmark, official, or reputable coverage signal
- exact claim support from source URLs
- duplicate check against existing cards
- public-facing safety check

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

## Evidence source requirements

Use at least one primary or highly reputable source for the central claim. Prefer official docs, official blogs/release notes, GitHub repositories, benchmark pages, or reputable engineering posts. Exact numbers such as GitHub stars must be verified during the same run and recorded in the research note; otherwise omit the exact number or reject the candidate.

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
- exact metrics verified during the run, if used
- fact-check signals
- selected/rejected reason
- confidence

## Resume / quota checkpoint

If a run cannot finish because usage/quota/tool access is near exhaustion, unsafe dirty state, validation failure, Codex/provider failure, or any other condition that would make unattended continuation wasteful:

1. Write `research/ai-routine/resume.md`.
2. Include:
   - current phase
   - candidates already checked
   - selected candidates not yet written as cards
   - rejected candidates and reasons
   - exact next actions
   - source URLs already opened
3. Leave `_data/cards.yml` valid YAML.
4. Stop cleanly so the next safe run can resume from `resume.md`.
5. If Codex or the local environment is known-broken, create `.local-ai-research.disabled` so the 4-hour launchd loop does not waste resources until recovery is confirmed.

At the start of each run, check `research/ai-routine/resume.md`. If present, resume that plan before starting unrelated research.

## Verification

Before finishing:

```bash
ruby -c scripts/auto_post.rb
ruby -e 'require "yaml"; YAML.load_file("_data/cards.yml"); YAML.load_file("_data/ai_queue.yml"); puts "yaml_ok"'
git diff --check
```

Do not commit or push when called from `scripts/local_ai_research_pipeline.sh`; wrapper owns commit/push.
