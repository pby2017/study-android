# Android XR Geospatial + Gemini card review

- Date: 2026-11-22 KST
- Existing card refined (not a new topic); AI+Android scope is Gemini-backed XR location experience.

## Sources and fact checks

1. Current [Geospatial API setup documentation](https://developer.android.com/develop/xr/jetpack-xr-sdk/arcore/geospatial/setup), last updated 2026-11-10 UTC:
   - API uses VPS, GPS, and motion sensors in SPATIAL mode; it is not enabled by default.
   - Queries are valid only when `GeospatialTrackingState.RUNNING`.
   - `horizontalAccuracy`, `verticalAccuracy`, and `orientationYawAccuracy` are 68% confidence estimates; larger values mean lower accuracy.
   - API requires `ACCESS_FINE_LOCATION`; XR Geospatial apps must prompt users to acknowledge/allow device data use. Mobile additionally requires camera and internet.
2. Official [XR Geospatial tour implementation post](https://developer.android.com/blog/posts/building-a-mixed-reality-tour-guide-with-android-xr-the-geospatial-api-and-gemini): identifies the API as Preview in its announcement; monitors horizontal/yaw accuracy; sends coordinates to Gemini through Firebase AI Logic; uses Google Maps grounding to reduce invented coordinates; requests structured JSON.
3. Official [Android XR Gemini guidance](https://developer.android.com/develop/xr/gemini), last updated 2026-11-10 UTC, confirms Firebase AI Logic provides cloud-based Gemini APIs for native Kotlin Android XR apps.

## Attention and candidate decision

- Candidate is an official Android XR sample/implementation pattern, not a GitHub repo; no star count applies.
- Attention signal: first-party Android Developers deep-dive and current XR developer docs (primary sources). No independent usage/adoption metric claimed.
- Retain: useful system-design pattern for sensor confidence gating, grounded retrieval, structured output, cloud data flow, and graceful failure.

## Edits and rationale

- Corrected the accuracy description: these are 68% confidence error estimates, not guaranteed true coordinates; lower is better.
- Added the `RUNNING` precondition and explicitly modeled tracking/VPS readiness as a failure path.
- Kept the Preview label sourced to the demo announcement, not asserted as a confirmed current API lifecycle beyond the currently reviewed documentation.
- Clarified that Maps grounding improves evidence for nearby places and JSON schema constrains response shape; neither proves route safety or all factual claims.
- Added device-data acknowledgement/consent to the answer, based on current setup guidance.
- The blog passes user coordinates to cloud Gemini and Maps grounding, so the card states this cloud data path; no claim that all data is retained was made.
- Confidence: high on API behavior/accuracy/consent; medium on current Preview status because the current setup page reviewed here did not state a lifecycle label and the demo article labels its announcement Preview.
