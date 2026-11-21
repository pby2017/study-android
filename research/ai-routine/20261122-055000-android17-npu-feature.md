# Android 17 NPU feature declaration card review

- Date: 2026-11-22 KST
- Existing Android 17 AI card refined; no new topic added.

## Official sources checked

1. [Android 17 is Here](https://developer.android.com/blog/posts/android-17-is-here): apps targeting Android 17 and needing direct NPU access must declare `FEATURE_NEURAL_PROCESSING_UNIT`; otherwise direct access can be blocked. The release announcement explicitly includes LiteRT NPU delegate, vendor-specific SDKs, and deprecated NNAPI.
2. [PackageManager API reference](https://developer.android.com/reference/android/content/pm/PackageManager#FEATURE_NEURAL_PROCESSING_UNIT): constant was added at API 37; its actual hardware feature value is `android.hardware.npu`.
3. [AOSP NPU Manager docs](https://source.android.com/docs/core/perf/npu-manager): Android 17+ NPU Manager coordinates NPU allocation/scheduling; application feature declaration is relevant to scheduling prioritization. The example uses `<uses-feature android:name="android.hardware.npu" android:required="false" />`.
4. [Android 17 SDK setup](https://developer.android.com/about/versions/17/setup-sdk): Android 17 is SDK/API 37; distinguishes compileSdk access to APIs from targetSdk opting into behavior changes.
5. [NNAPI migration guide](https://developer.android.com/ndk/guides/neuralnetworks/migration-guide): NNAPI has been deprecated since Android 15; the Android 17 announcement still lists deprecated NNAPI paths among direct NPU users affected by the declaration.

## Corrections and rationale

- Kept the precise gate: target Android 17/API 37 and directly access the NPU; did not imply all AI or all on-device inference apps are affected.
- Corrected manifest spelling: use the feature value `android.hardware.npu`, not the Java constant identifier `FEATURE_NEURAL_PROCESSING_UNIT`.
- Added `required=false` for optional acceleration so Play does not filter devices without an NPU. Clarified this does not implement CPU/GPU fallback by itself.
- Kept LiteRT NPU delegate/vendor SDK/deprecated NNAPI examples per Android 17 release announcement.
- Removed broad generic checklist language and added a specific interview prompt and implementation consequence.
- Popularity: this is a platform behavior change; no stars metric applies. Attention signal is the Android 17 release announcement and API 37 reference.
- Confidence: high on target gate, feature value, and named affected paths; medium on direct effect details across all device vendor implementations because feature rollout may depend on platform/device support.
