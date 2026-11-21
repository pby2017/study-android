# Firebase AI Logic Hybrid: mode semantics, privacy, and observability

Reviewed: 2026-11-22 (KST)

## Sources

- Android hybrid inference overview: https://developer.android.com/ai/hybrid (last updated 2026-10-08)
- Firebase AI Logic Android hybrid setup: https://firebase.google.com/docs/ai-logic/hybrid/android/get-started (last updated 2026-11-18)
- Firebase Android inference-mode configuration: https://firebase.google.com/docs/ai-logic/hybrid/android/configuration-options (last updated 2026-11-18)

## Exact routing semantics

- `PREFER_ON_DEVICE`: attempts local inference; if the model is unavailable or does not support the request, logs a device error and automatically falls back to cloud.
- `ONLY_ON_DEVICE`: attempts local inference; throws if local is unavailable or unsupported. It does not send that request to cloud.
- `PREFER_IN_CLOUD`: attempts cloud if online and model available; falls back to on-device only when offline. Other failure cases throw.
- `ONLY_IN_CLOUD`: attempts cloud if online and model available; otherwise throws.

For `PREFER_ON_DEVICE`, `PREFER_IN_CLOUD`, and `ONLY_IN_CLOUD`, the cloud-hosted model must be explicitly specified; there is no default cloud model. For preference modes, response `inferenceSource` reports whether the actual execution was `ON_DEVICE` or `IN_CLOUD`.

On-device requests have narrower supported capabilities and device availability than cloud calls. The getting-started page describes single-turn text, text plus one Bitmap, and structured output; the ML Kit Prompt API is beta and works only on supported devices. Therefore “local preferred” is not a privacy or offline guarantee. For a strict no-cloud policy, select `ONLY_ON_DEVICE`, check supported devices/capabilities, and handle exceptions with a safe UX. Do not silently resend sensitive prompts through a manual fallback.

The Firebase AI Logic SDK hybrid integration is explicitly Experimental: no SLA or deprecation policy, and backwards-incompatible changes are possible. The Android overview also notes Firebase App Check as a control to help protect cloud routing against abuse; it does not change the inference mode's privacy semantics.

## Card revision

Recentered the card on the critical privacy distinction between preference and exclusivity, captured all four documented routing modes, and added path observability plus the experimental contract. Removed the generic recommendation to use local-preference for sensitive data without acknowledging cloud fallback.
