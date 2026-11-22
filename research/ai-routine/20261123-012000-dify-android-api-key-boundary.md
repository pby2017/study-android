# 2026-11-23 01:20 KST — Dify API key boundary for Android clients

## Sync and scope

- Synced `master` with `git pull --ff-only origin master` before edits; no incoming changes and worktree was clean.
- Checked this Dify entry's refinement history. Earlier work updated its product overview and license wording, but the card still lacked learning level, source links, and interview retrieval. No existing card teaches the Android-client-to-Dify API-key boundary.
- Selected an AI+Android practice topic rather than pure Android-only content.

## Sources checked

- https://github.com/langgenius/dify
- https://github.com/langgenius/dify/blob/main/LICENSE
- https://docs.dify.ai/en/api-reference/guides/get-started
- https://docs.dify.ai/en/api-reference/guides/end-user-identity
- https://docs.dify.ai/en/api-reference/guides/workflow
- https://docs.dify.ai/en/cloud/use-dify/knowledge/integrate-knowledge-within-application
- https://docs.dify.ai/en/cloud/use-dify/knowledge/test-retrieval

## Evidence and selection

- Dify's current API guide says published applications have REST APIs and explicitly requires calling them from the backend because a key in frontend or client code can be extracted and abused.
- The End User Identity guide states the `user` value scopes end-user data but Dify does not authenticate that value. Thus the application's backend must authenticate/authorize its user; forwarding an arbitrary client-supplied `user` value is not an authentication check. This latter design recommendation is an inference from the documented identity boundary.
- The official workflow API describes published workflow execution, streaming, independent runs, and logs. Official knowledge docs recommend testing representative queries and adjusting retrieval before publishing; RAG does not guarantee relevant evidence by itself.
- Dify's LICENSE calls its agreement a modified Apache 2.0 license and explicitly adds restrictions for multi-tenant service and Dify frontend logo/copyright changes. The card keeps this as a brief deployment/license reminder, not legal advice.
- GitHub snapshot showed about 161k stars and more than 15k commits, with the organization listing repository activity in November 2026. These are attention/activity signals only; they do not prove production adoption or quality.
- This entry is relevant to the project's allowed AI+Android scope: it teaches how an Android product safely consumes an AI workflow backend, not standalone Android APIs.

## Card changes

- Replaced broad, dated product-feature inventory with a focused mobile-to-AI-backend security pattern.
- Added intermediate level, five official references, concise design points, and interview retrieval.
- Explicitly distinguished Dify's `user` scoping value from authentication and put the secret app key on the backend.

## Verification

- `_data/cards.yml` and `_data/ai_queue.yml` parse; the Dify card has an allowed level, five sources, interview, and answer.
- `ruby -c scripts/auto_post.rb` — passed.
- `ruby scripts/auto_post_test.rb` — 3 tests, 14 assertions, all passed.
- `node --test scripts/card-navigation.test.js` — 6 tests passed.
- `git diff --check` — passed.
- `bundle check` — required Gemfile dependencies are unavailable; no dependencies were installed and the Jekyll build remains unverified.

## Confidence

- High for the API key and `user` behavior because current official docs state both directly; high for documented retrieval and license statements. Medium for point-in-time attention/activity signal.
