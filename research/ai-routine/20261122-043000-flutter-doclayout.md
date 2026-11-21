# flutter_doclayout_kit 카드 재검증

- 검토 시각: 2026-11-22 04:30 KST
- 결정: AI+Android 모바일 추론 사례로 유지하되, offline claim을 추론 단계로 한정하고 설치·빌드 다운로드 조건을 분리.

## 확인한 출처

1. [공식 저장소 README](https://github.com/robert008/flutter_doclayout_kit)
   - README는 PP-DocLayout ONNX로 23개 문서 요소를 검출한다고 설명한다.
   - 모델을 GitHub Release에서 직접 내려받아 앱의 `assets/`로 등록하라고 안내한다. 이는 플러그인이 모델을 자동 제공한다는 뜻이 아니다.
   - README 설명은 iOS 22MB/123MB 모델 선택 및 offline inference를 주장하지만, 이 카드는 모든 버전/기기에서의 메모리나 지연을 보증하지 않는다.
2. 현재 public source checkout의 `android/build.gradle`
   - `preBuild`에 `downloadNativeLibraries`를 연결하고 GitHub Release `v1.0.0/jniLibs.zip`에서 ABI별 native library를 받아온다.
   - 빌드 중 네트워크가 필요하며, 설정상 `arm64-v8a`, `armeabi-v7a`만 포함한다.
3. `ios/flutter_doclayout_kit.podspec` 및 `ios/download_library.sh`
   - CocoaPods prepare 단계에서 GitHub Release의 static library를 내려받는다. 실제 release asset은 약 216.9 MB다.
4. `src/CMakeLists.txt`, `src/detect/doc_detector.cpp`
   - C++ 구현은 ONNX Runtime API를 사용하며 Android는 OpenCV와 ONNX Runtime dynamic library를 link한다.
   - 확인한 public C++ source에는 Core ML Execution Provider 설정이 없다. iOS 배포는 큰 prebuilt static archive여서 backend 상세를 소스만으로 확정할 수 없으므로 Core ML acceleration claim은 근거가 약하다.
5. [GitHub Releases API](https://api.github.com/repos/robert008/flutter_doclayout_kit/releases)
   - 현재 공개 release `v1.0.0` assets: `jniLibs.zip` 31,896,789 bytes, iOS static archive 216,853,376 bytes, `pp_doclayout_m.onnx` 23,489,070 bytes, `pp_doclayout_l.onnx` 129,271,998 bytes.
   - README의 “22MB/123MB”는 대략 MiB 단위 설명과 근사하나 가변적인 용량이므로 카드에서 모델별 크기는 제거했다.
6. [pub.dev package metadata](https://pub.dev/api/packages/flutter_doclayout_kit)
   - 검토 당시 최신 pub package 1.0.1, 2025-12-01 publish. Android/iOS release download logic는 고정 v1.0.0을 참조한다. 현재 최신성/업데이트 신호는 약하며, 고정 버전 호환을 새 통합에서 확인해야 한다.
   - GitHub 당시 1 star / 3 forks, 마지막 push 2025-12-23. 낮은 adoption 및 낡은 활동 신호. card는 인기 추천이 아니라 deployment/network lesson으로 남김.

## 교정 및 검증 경계

- “완전 오프라인”을 앱 실행/추론 단계에 한정했다. 모델은 사용자가 준비하고, native binaries는 Android build 및 iOS CocoaPods prepare에서 원격 Release를 받는다.
- 오프라인 설치가 필요하면 버전 고정, release asset의 사전 확보/내부 배포, 모델 asset 포함이 필요하다. 이후 네트워크 차단 상태에서 plugin load와 inference를 직접 검사해야 한다.
- 원본 카드의 “iOS Core ML 가속”과 “메모리 약 1.5GB”는 public source로 확인되지 않아 삭제했다. Android의 ABI 지원은 build 설정에서 확인했다.
- “23종”은 README가 열거한 class count로 소개하고 실제 대상 문서·단말의 정확도/속도 보장은 하지 않는다.
- Confidence: high (README, Dart API, Gradle/CocoaPods source, release metadata cross-check); prebuilt iOS binary의 내부 execution provider는 불투명.
