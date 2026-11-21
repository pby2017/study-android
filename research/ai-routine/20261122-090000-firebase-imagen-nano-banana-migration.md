# Firebase AI Logic Imagen shutdown and Nano Banana migration — 2026-11-22

## Evidence checked
- Firebase Imagen migration guide: https://firebase.google.com/docs/ai-logic/imagen-models-migration
  - Imagen models shut down Aug 17, 2026 across Google APIs; Android replaces `ImagenModel` with `GenerativeModel`, uses `generateContent()` and IMAGE response modality.
  - Mapping: Imagen Fast → `gemini-nano-banana-2.1` / `MINIMAL`; standard → same / `HIGH`; Ultra → `gemini-3-pro-image`.
  - Nano Banana does not support Imagen `numberOfImages`, `imageFormat`, or `addWatermark` controls; output is one image, PNG, and always SynthID-watermarked.
- Firebase Nano Banana generation guide: https://firebase.google.com/docs/ai-logic/generate-images-gemini
  - Firebase SDK integration for image generation/editing remains Preview.
  - Nano Banana image generation requires the Blaze pay-as-you-go plan regardless of Gemini API provider.
- Firebase supported models: https://firebase.google.com/docs/ai-logic/models
  - Replacement models are currently listed; Firebase documents shutdown models as inaccessible and returning 404.

## Refinement
Added the frequently missed Firebase feature lifecycle and billing gates, distinguished from the underlying model's availability. Kept migration mapping and output compatibility checks; shortened the card to ~360 chars. High confidence based on current Firebase primary documentation.
