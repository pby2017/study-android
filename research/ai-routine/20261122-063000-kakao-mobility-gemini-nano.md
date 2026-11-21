# Kakao Mobility: separate Gemini Nano evaluations and reported outcomes

Reviewed: 2026-11-22 (KST)

## Primary source

Android Developers case study, published 2025-10-30: https://developer.android.com/blog/posts/kakao-mobility-uses-gemini-nano-on-device-to-reduce-costs-and-boost-call-conversion-by-45

This is a vendor/Google-published case study with named Kakao Mobility contributors, not an independent controlled evaluation. Its business metrics are reported claims; the page does not provide enough experimental design or denominator details to infer causal effects or generalize to other products.

## Keep the two workflows and evaluation sets separate

1. **Delivery-address entity extraction**: ML Kit GenAI Prompt API/Gemini Nano extracts recipient name, address, and phone number from natural-language delivery messages. The team used around 200 high-quality evaluation examples and iterated on the prompt; few-shot prompting was the approach they found most effective. A Gemini Flash cloud path was implemented as a fallback to maximize reach. This address-entry improvement had launched at publication.
2. **Bike/scooter parking-photo analysis**: a separate multimodal Gemini Nano workflow evaluated more than 200 labeled parking photos using accuracy, precision, recall, and F1. The source explicitly says the feature had not yet launched at publication. It is incorrect to attribute these labeled images to the address extraction evaluation.

## Outcomes and attribution

The case study attributes a 24% decrease in delivery-order completion time, a 45% increase in conversion for new users, and a 6% increase for existing users to the launched address-entry improvement. It also says AI-powered orders increase by over 200% during peak seasons; this was excluded from the short card because it adds no methodological context and is easy to overinterpret. The page does not establish a causal, independently replicated effect.

## Card revision

- Corrected the data-set conflation and named both task-specific evaluations.
- Scoped reported outcomes to the launched delivery address feature and attributed them to the case study.
- Added the Gemini Flash fallback and the not-yet-launched status of parking-photo analysis.
- Avoided presenting the success story as a general performance promise for on-device LLMs.
