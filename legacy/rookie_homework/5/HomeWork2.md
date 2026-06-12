```
* Custom View 피드백 반영

* NestedScrollView 피드백 반영

* 앱을 죽이는 방법 피드백 반영
* 현재 보여지고 있는 프래그먼트 찾을 수 있는 방법 피드백 반영
* Activity와 Fragment 통신 방법 피드백 반영

* REST Api 조사 및 실습 피드백 반영

* notification 구현 피드백 반영
```
# NestedScrollView 피드백 반영
* 프로젝트 : CustomScrollViewApplication
## ScrollView
* 자식 스크롤뷰를 여러 개 가질 때 어떤 스크롤뷰를 먼저 스크롤링 처리할지 조작할 수 없습니다.
* 스크롤링을 시작할 때 터치 이벤트를 받은 뷰가 먼저 작동합니다.
## NestedScrollView
* 자식 스크롤뷰를 여러 개 가질 때 어떤 스크롤뷰를 먼저 스크롤링 처리할지 조작할 수 있습니다.
* 기본적으로 자식 스크롤뷰가 스크롤링을 시작할 때 부모 스크롤뷰가 먼저 작동하고 자식 스크롤뷰가 작동합니다.
* 즉, 부모 스크롤뷰와 자식 스크롤뷰 사이에서 상호작용을 할 수 있습니다.
