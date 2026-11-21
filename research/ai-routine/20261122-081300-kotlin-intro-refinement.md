# Kotlin beginner card fact-check

Date: 2026-11-22 08:13 KST

## Changes
- Corrected “JVM language” to a statically typed multiplatform language; the official FAQ lists JVM, Android, JavaScript, Wasm, and Native targets.
- Kept Java interoperability as a core adoption benefit.
- Replaced claims that static typing improves performance/reliability/maintainability with the narrower claim that most type-safety checks happen at compile time and type inference reduces annotations.
- Changed “functional language” to supports both OO and functional constructs; it does not require pure functional code.
- Qualified null safety: explicit nullable/non-nullable types help detect many null errors, but `!!` and Java platform types can still cause runtime NPEs.

## Sources
- [Kotlin FAQ](https://kotlinlang.org/docs/faq.html), language definition, targets, Java interoperability, and OO/functional support.
- [Kotlin language specification](https://kotlinlang.org/spec/introduction.html), static typing, supported compilation targets, and nullability.
- [Null safety](https://kotlinlang.org/docs/null-safety.html), nullable types and handling null.

## Confidence
High. The revised claims are directly supported by official Kotlin documentation and avoid broad benefits not guaranteed by the type system.
