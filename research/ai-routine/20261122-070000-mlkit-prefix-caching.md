# ML Kit Gemini Nano Direct Model Access: prefix caching

Reviewed: 2026-11-22 (KST)

## Sources

- Prefix caching guide (last updated 2026-10-27): https://developers.google.com/ml-kit/genai/prompt/android/prefix-caching
- Direct model access guide: https://developers.google.com/ml-kit/genai/prompt/android
- Direct model access overview and device support: https://developers.google.com/ml-kit/genai/

## API and capability boundary

Prefix caching belongs to Gemini Nano **Direct Model Access**, using `com.google.mlkit:genai-prompt` and `GenerativeModel`; it is not a capability of the task-specific Summarization/Proofreading/etc. APIs. Direct model access itself is Beta and has no SLA/deprecation policy. Prefix caching is additionally marked Experimental, is available only on a subset of supported Direct Model Access devices, and currently accepts text-only prompts. Do not use it for image prompts.

Separate the shared static prefix into `promptPrefix` and pass each varying request as the dynamic suffix. The SDK can reuse intermediate model state. The guide also documents explicit cache creation/list/get/delete operations, distinct from implicit caching.

## Performance claim scope

The official guide labels these as estimated gains, with cache-hit timing (a first use can be a miss):

- Pixel 9, 300-token fixed prefix + 50-token suffix: 0.82s → 0.45s
- Pixel 9, 1,000-token fixed prefix + 100-token suffix: 2.11s → 0.5s

These are example conditions, not an app-independent guarantee. Validate end-to-end latency, cold/cache-miss behavior, and device coverage on the target workload.

## Storage and privacy

Implicit cache files are stored in the client app's private storage and increase storage use. Cache files are encrypted, and the associated metadata includes the original prefix text. The docs do not specify whether that metadata is separately encrypted. The implicit cache uses LRU eviction; the app can clear implicit caches through the documented API. Treat prompts that contain secrets, personal data, or sensitive policy as data requiring retention/deletion review; encryption at rest does not remove the need to review the stored metadata.

## Card revision

- Corrected API attribution from generic ML Kit Prompt API to Gemini Nano Direct Model Access / `GenerativeModel`.
- Scoped the Pixel 9 latency number to the guide's estimate and cache-hit case; called out first-use miss.
- Retained device/text-only/experimental constraints and clarified encrypted cache plus stored plaintext prefix metadata.
