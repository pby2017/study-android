```
1. RecyclerView에 대해서 조사하고, RecyclerView의 주요 클래스를 모두 구현한 코드를 작성하시오. (주요 클래스 Adapter, ViewHolder, LayoutManager, ItemDecoration, ItemAnimator)
`https://developer.android.com/guide/topics/ui/layout/recyclerview`

2. REST API에 대해서 조사하시오.
`https://en.wikipedia.org/wiki/Representational_state_transfer`
`https://spoqa.github.io/2012/02/27/rest-introduction.html`
`https://meetup.toast.com/posts/92`

3. 다음과 같은 디자인을 갖는 나만의 Custom Notification Class를 작성하시오.
(Activity의 어떠한 상태가 변경되면 해당 알림에도 상태가 변경되게 할 것 ex) 테스트 환경 'DEV' -> 테스트 환경 'Staging', 해당 알림을 클릭하거나 드래그했을 때 알림이 사라지지 않게 할 것, 해당 알림을 강제로 사라지게 만드는 버튼이 있을 것, Notification channel이 있을 것)
`https://developer.android.com/training/notify-user/custom-notification`
```
## REST
* Representational state transfer의 약자입니다.
* 웹 서비스들을 만들 때 사용되는 제한 사항들을 정의한 소프트웨어 아키텍처 스타일입니다.
* REST 스타일을 만족하는 웹 서비스들을 RESTful 웹 서비스라고 합니다.
# 참고
* [REST - wikipedia](https://en.wikipedia.org/wiki/Representational_state_transfer)

POST restaurant - 새로운 레스토랑 (레스토랑 <- 리소스)
100번째 50번째정보 
GET restaurant/50

CRUD
create - POST
read - GET
update - PUT
delete - DELETE

// 이해. 조사 부족.
// API 정리