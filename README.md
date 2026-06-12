# study — 1분 지식 카드

안드로이드·코틀린·AI 코딩 도구 학습 기록을 **1분에 읽는 카드뷰**로 정리한 블로그입니다.
GitHub Pages(Jekyll)로 운영됩니다.

## 구조

| 경로 | 설명 |
|------|------|
| `index.html` | 카드뷰 메인 (카테고리 필터) |
| `_data/cards.yml` | 카드 데이터 (제목·1분 요약·핵심 포인트·원본 링크) |
| `_layouts/`, `assets/` | 레이아웃 + 스타일 |
| `legacy/` | **기존 학습 원본 보존** (코틀린 인 액션, 레벨업, itbank, Q&A 등) |

## 카테고리
- **Kotlin** — 코틀린 인 액션 정리
- **Android** — 액티비티/레이아웃/머티리얼 디자인
- **설계·아키텍처** — MVP/MVVM/Gradle
- **AI 코딩 도구** — diagnose, Spec Kit, Karpathy CLAUDE.md, Ouroboros (하루 2회 자동 포스팅)

## 로컬 미리보기
```bash
bundle install
bundle exec jekyll serve
```

## 카드 추가
`_data/cards.yml`의 `cards:` 에 항목을 추가하면 됩니다. 원본 링크(`source`)는 가급적 채워
근거를 남깁니다. AI 카테고리는 `auto-post/` 루틴이 하루 2회 자동으로 검증된 카드를 추가합니다.

---
> 기존 안드로이드 학습 원본(루키 과제, daily 코드리뷰, itbank, kotlin_in_action, levelup, Q&A)은
> [`legacy/`](./legacy)에 그대로 보존되어 있습니다.
