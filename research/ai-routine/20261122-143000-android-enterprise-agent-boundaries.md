# Android 17 AppFunctions and enterprise AI boundaries — 2026-11-22

## Decision

The next Android AI candidate was not present as a card. Add a card that teaches the enterprise/profile boundary between device-state context for LLM assistants and agentic app automation. Also refine the adjacent AppFunctions card because current official docs distinguish Jetpack artifact stability from the broader platform integration preview.

## Verified facts

- Android Enterprise Android 17 docs (last updated 2026-10-28): the Agentic Automation framework prevents automation inside work profiles. On fully managed devices and COPE personal profiles, administrators can disable AI automation using existing `setNearbyAppStreamingPolicy`.
- The same Android Enterprise page states that authorized assistants can use AppFunctions to consume device-level data for on-device agents, but it will not return data from work profiles.
- DevicePolicyManager API reference: `setAppFunctionsPolicy` is available from API 36 and can be called by a device owner, profile owner, or holder of `MANAGE_DEVICE_POLICY_APP_FUNCTIONS`. `APP_FUNCTIONS_DISABLED` means no apps in the current user may expose AppFunctions. `APP_FUNCTIONS_DISABLED_CROSS_PROFILE` only blocks cross-profile invocation; same-profile AppFunctions remain usable.
- The Android 17 Enterprise overview and DPM reference describe distinct controls: `setNearbyAppStreamingPolicy` for automation policy in the noted device/profile contexts, and `setAppFunctionsPolicy` for AppFunctions operations. Do not imply one automatically disables the other.
- Current AppFunctions overview calls the platform integration "Experimental"/preview and Android docs say devices running Android 16+. Jetpack release notes show `androidx.appfunctions` 1.0.0 became stable on 2026-11-18. These are separate lifecycle layers, not a contradiction: stable Jetpack artifact does not make all platform/provider integrations GA.
- Gemini integration/testing requires the Connected Apps developer preview per AppFunctions overview. Cross-app callers need `EXECUTE_APP_FUNCTIONS`; a caller must also be authorized as appropriate.
- Do not infer user consent UI details from these sources. The card limits itself to caller authorization, profile boundaries, and administrator policy.

## Sources

- https://developer.android.com/work/versions/android-17
- https://developer.android.com/reference/android/app/admin/DevicePolicyManager
- https://developer.android.com/ai/appfunctions
- https://developer.android.com/jetpack/androidx/releases/appfunctions

## Result

Added an advanced AI+Android card on the distinct enterprise controls and refined the AppFunctions card's release-stage wording. Confidence: high for documented policy/API behavior; do not conflate broad framework rollout with universally enabled assistant features.
