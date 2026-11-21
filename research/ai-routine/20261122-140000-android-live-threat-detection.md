# Android Live Threat Detection and dynamic signal monitoring — 2026-11-22

## Decision

Refine the existing AI+Android security card. The original terse roadmap-style wording mixed Google Play Protect's platform security behavior with Android 17 Advanced Protection changes and could imply an app-facing API or guaranteed current availability.

## Verified facts

- Google's May 12, 2026 Android security roadmap describes Live Threat Detection as on-device AI analyzing app behavior and alerting when an app acts suspiciously.
- The roadmap names SMS forwarding and accessibility overlays as suspicious behaviors, and describes dynamic signal monitoring of app/system interactions, including icon hiding followed by background launch and accessibility abuse. It says rules can be pushed dynamically.
- The same source says dynamic signal monitoring will be enabled on Android 17 devices, with protections rolling out in H2 2026. As of this review, this is a dated roadmap statement; do not claim universal release or availability on every Android 17 device.
- Google's 2024 launch material places Live Threat Detection in Google Play Protect and Private Compute Core as on-device privacy-preserving protection. Current reviewed docs do not describe a public app API for consuming this detection or its verdict. The card identifies it as a platform feature and avoids claiming developers can invoke it.
- App-development takeaway (explicitly advice, not Google product guarantee): minimize sensitive permissions, make accessibility behavior transparent, and test legitimate app flows that may resemble suspicious behavior.

## Sources

- https://blog.google/security/whats-new-in-android-security-privacy-2026/
- https://security.googleblog.com/2024/11/new-real-time-protections-on-Android.html
- https://developer.android.com/about/versions/17/features

## Result

Added intermediate level, a concise mechanism/use limitation, roadmap rollout qualification, and an interview question. Removed conflated Android Advanced Protection items from this card's central explanation. Confidence: high for Google-announced behavior; actual rollout remains device-dependent and was not asserted as universally live.
