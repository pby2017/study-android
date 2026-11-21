# Firebase AI Logic: Imagen shutdown migration on Android

Reviewed: 2026-11-22 (KST)

## Current status and model mapping

Firebase's official migration guide, last updated 2026-11-18, says all Imagen models shut down on 2026-08-17 across both Gemini Developer API and Agent Platform Gemini API. This is no longer a future migration; deployed Firebase AI Logic apps must be checked now.

Official mapping:

- `imagen-4.0-fast-generate-001` → `gemini-nano-banana-2.1`, thinking level `MINIMAL`
- `imagen-4.0-generate-001` → `gemini-nano-banana-2.1`, thinking level `HIGH`
- `imagen-4.0-ultra-generate-001` → `gemini-3-pro-image`
- `imagen-3.0-capability-001` → `gemini-nano-banana-2.1`

## Android API migration

The Kotlin guide changes `ImagenModel.generateImages(prompt)` to `GenerativeModel.generateContent(prompt)`. Configure `responseModalities = listOf(ResponseModality.IMAGE)` using `generationConfig`; `ImageConfig` can specify aspect ratio. The response is no longer `ImagenGenerationResponse.images`: inspect the candidate content parts for the returned image and handle `FinishReason.NO_IMAGE`.

## Behavior differences to test

- Nano Banana returns one image per generation; Imagen's `numberOfImages` setting is unsupported. Do not use candidate count as a substitute.
- Output is PNG; `imageFormat` is unsupported.
- Outputs always include SynthID watermark; `addWatermark` is not configurable.
- Imagen-specific safety settings/configuration must be reviewed against Gemini `SafetySetting` and `GenerationConfig`; do not assume a drop-in equivalent.

## Sources

- Official migration guide and Kotlin examples: https://firebase.google.com/docs/ai-logic/imagen-models-migration
- Official image-generation guide (linked from migration): https://firebase.google.com/docs/ai-logic/generate-images

## Editorial decision

Kept the card focused on the stopped service, exact Fast/standard/Ultra model mapping (including thinking levels), Kotlin API/config changes, and output compatibility traps. Did not claim model behavior or image quality is equivalent after migration.
