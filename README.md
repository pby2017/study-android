# study — 1분 지식 카드

안드로이드·코틀린·AI 코딩 도구 학습 기록을 **1분에 읽는 카드뷰**로 정리한 블로그입니다.
GitHub Pages(Jekyll)로 운영됩니다.

🔗 **라이브 페이지: https://pby2017.github.io/study-android/**
📊 **7주차 발표 자료: https://pby2017.github.io/study-android/week7/** (diagnose · Spec Kit · Understand-Anything)

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
- **AI 코딩 도구** — diagnose, Spec Kit, Karpathy CLAUDE.md, Ouroboros, 최신 AI 개발 도구

## 로컬 미리보기
```bash
bundle install
bundle exec jekyll serve
```
> 참고: 현재 저장소의 GitHub Pages 의존성은 Ruby 3.x 환경을 전제로 합니다.
> 로컬 Ruby가 2.7이면 bundle install/build가 실패할 수 있습니다.

## 카드 추가
`_data/cards.yml`의 `cards:` 에 항목을 추가하면 됩니다. 원본 링크(`source`)는 가급적 채워
근거를 남깁니다. AI 카테고리는 `auto-post/` 루틴이 4시간 주기로 자동 반영됩니다.

## 자동 포스팅
- GitHub Actions는 쓰지 않습니다. 유료 workflow 사용을 피하기 위해 로컬 macOS `launchd`가 실행합니다.
- `scripts/install_local_ai_cron.sh`를 실행하면 4시간마다 local AI research pipeline이 돕니다.
- 각 실행은 대략 3시간 30분 동안 web 조사, 마지막 20분 동안 카드 구현·검증·commit·push를 목표로 합니다.
- 카드는 억지로 채우지 않습니다. 실용성·최근성·주목도(star/채택/벤치마크/공식 언급)·팩트체크 근거를 통과한 주제만 반영합니다.
- 조사 근거는 `research/ai-routine/`에 실행별 노트로 남깁니다.
- 사용량/쿼터가 위험해지거나 도구 접근이 불안정하면 `research/ai-routine/resume.md`에 이어 할 일을 남기고, 다음 4시간 루틴에서 이어받습니다.
- 즉시 1회 실행은 설치 스크립트의 `RunAtLoad`/`kickstart`로 시작됩니다.
- 실행 로그는 `logs/`에 남고, 중복 실행은 `.local-ai-research.lock`으로 막습니다.

```bash
./scripts/install_local_ai_cron.sh
```

수동 1회 실행:

```bash
./scripts/local_ai_research_pipeline.sh
```

---
> 기존 안드로이드 학습 원본(루키 과제, daily 코드리뷰, itbank, kotlin_in_action, levelup, Q&A)은
> [`legacy/`](./legacy)에 그대로 보존되어 있습니다.
