# Aide card retirement — 2026-11-22

## Decision

Remove the Aide case card from the active deck. Keep its publication history intact; this note records why the card no longer meets the deck's verification and distinctiveness bar.

## Evidence checked

- The linked [DEV Community submission](https://dev.to/swaptr/your-ai-your-device-your-data-introducing-aide-59cc) remains reachable. It is a maker-authored Gemma 4 Challenge entry dated May 25 and describes an Android app with keyboard, chat, voice, tools, on-device Gemma 4, and optional Ollama.
- The submission links to [github.com/swaptr/aide](https://github.com/swaptr/aide). An unauthenticated GitHub API request to `https://api.github.com/repos/swaptr/aide` returned HTTP 404 on 2026-11-22. This establishes that the public repository endpoint was not available for verification at review time; it does **not** prove whether the owner deleted it, made it private, or changed the URL.
- Because the code/release page was unavailable, current implementation details, release status, license, and GitHub attention metrics could not be confirmed. No star count is claimed.
- Existing cards already teach Gemma 4's Android deployment choices, on-device inference, and model/tool boundaries. The Aide card's distinct value was a single showcase combining those surfaces, but the only remaining evidence is the author's promotional challenge narrative rather than inspectable implementation.

## Rationale

The article can support attribution that the author described this design, but not independent verification that the code currently implements it or that the project remains usable. Removing the card reduces a weakly verifiable showcase and overlapping content without implying that Gemma 4 or on-device Android AI is stale. The durable implementation lessons remain represented in other cards.

Confidence: medium-high. The 404 and article content were directly checked; the reason for the repository's unavailability is unknown.
