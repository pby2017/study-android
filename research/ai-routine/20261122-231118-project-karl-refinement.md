# Project KARL Android readiness refinement

- Reviewed on: 2026-11-22 (Asia/Seoul)
- Existing card: `Kotlin AI 라이브러리 도입 전 확인할 것: README의 Android 약속과 실제 Gradle 타깃`
- Decision: retain and refine as an intermediate AI+Android library-evaluation lesson. Do not recommend KARL as a production/Android dependency.

## Evidence checked

- Repository README: https://github.com/theaniketraj/project-karl/blob/main/README.md
  - Describes privacy-first adaptive on-device AI and Kotlin Multiplatform core.
  - Explicit runnable example is `:karl-example-desktop:run`.
  - README badge identifies JVM / Multiplatform Core; README privacy claims remain project claims, not independent audit evidence.
- Getting started guide: https://github.com/theaniketraj/project-karl/blob/main/GETTING_STARTED.md
  - Mentions Android apps among possible Kotlin/JVM consumers, but uses placeholder Maven group/version coordinates.
  - Lists core as Multiplatform, karl-kldl as JVM, karl-room as JVM/potentially Multiplatform, and desktop as JVM.
- Build files checked at current `main`:
  - https://github.com/theaniketraj/project-karl/blob/main/karl-core/build.gradle.kts
  - https://github.com/theaniketraj/project-karl/blob/main/karl-kldl/build.gradle.kts
  - https://github.com/theaniketraj/project-karl/blob/main/karl-room/build.gradle.kts
  - https://github.com/theaniketraj/project-karl/blob/main/karl-compose-ui/build.gradle.kts
  - All four declare a `jvm {}` target; no Android target declaration was found. `karl-room` includes Room common dependency but its target remains JVM.
- Activity/adoption snapshot: https://github.com/theaniketraj/project-karl
  - GitHub page showed 11 stars and 1 fork when checked.
  - Latest release page: https://github.com/theaniketraj/project-karl/releases showed v1.0.4 (released Aug 13; page did not display a year in extracted text).

## Change rationale

The former card accurately warned that KMP/Android wording is not proof of Android-ready artifacts, but omitted the guide's Android mention and Room common dependency. Updated it to expose the documentation/build mismatch precisely, avoid asserting Android impossibility, and require an actual artifact + Android build/run check. Added a moderate/intermediate level, concise practical gate, and interview retrieval question. Recorded the low star count to avoid implying this is a hot or broadly adopted library.

## Confidence and limitations

- High confidence in current checked Gradle target declarations and the README's Desktop example.
- Medium confidence in consumer readiness: no independent Android integration build was run, and a JVM artifact may still be consumed in some Android setups depending on bytecode/API constraints. The card therefore states “not established by inspected evidence,” not “cannot run on Android.”
- Repository claims about zero data egress/encryption were not independently audited.

## Next cursor

Continue oldest-first with `Apple Trust Insights: 기기 신호와 클라우드 모델을 결합한 사기 위험 평가`; re-check official API availability, supported OS/API requirements, on-device versus server processing, and distinguish current Apple developer documentation from secondary interpretation.
