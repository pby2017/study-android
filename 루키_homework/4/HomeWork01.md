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
# RecyclerView
## 설명
* View를 포함할 수 있는 ViewGroup입니다.
* ScrollingView를 구현하여 Scroll 기능을 제공합니다.
  *  화면에 보이지 않는 View를 볼 수 있습니다.
* NestedScrollingChild를 구현하여 부모 ViewGroup에 포함될 수 있습니다.
  * 부모 뷰와 자식 뷰 사이 어떤 뷰가 먼저 반응할지 조절할 수 있습니다.
* 큰 규모의 데이터를 처리할 때 유용합니다.
## 
* Adapter : 데이터들을 보여주는 View를 제공하는 클래스입니다.
* Position : Adapter 내 전체 아이템의 위치를 제공합니다.
* Index : Adapter 내 화면에 보여지는 view 중 index를 제공합니다.
  * ```recyclerView.getChildCount()``` = 화면에 보여지는 뷰 개수
  * ```recyclerView.getChild(아이템 마지막 index)``` = null
* Binding : 인자로 제공된 position에 해당하는 item을 화면에 보여줄 View에 연결합니다.
* Recycle (view) : 사용되었던 view를 나중에 같은 type의 데이터를 보여줄 때 다시 사용합니다.
* Scrap (view) : 화면에서 사라졌을 때 View가 완전히 detach 되지 않고 재사용되는 View 입니다.
* Dirty (view) : 화면에 보여지기 전 adapter에 의해 재결합 되어야 하는 자식 뷰입니다.
## 구현 요소
* RecyclerView.Adapter
  * ViewHolder를 생성하고 ViewHolder에 item을 연결합니다.
  * ```onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)``` : ViewHolder를 생성합니다.
  * ```onBindViewHolder(@NonNull MyIconViewHolder myIconViewHolder, int position)``` : ViewHolder에 item을 연결합니다.
  * ```getItemCount()``` : item의 개수를 반환합니다.
* RecyclerView.ViewHolder
  * RecyclerView의 여러 View 중 1개의 View를 관리합니다.
  * ```Constructor(@NonNull View itemView)``` : item layout 내 View를 관리합니다.
* RecyclerView.LayoutManager
  * item View가 어떻게, 언제 재사용될지 결정합니다.
  * ParentStart/End, ChildStart/End, isRecyclable 등의 메서드를 정의하고 있습니다.
* RecyclerView.ItemDecoration
  * RecyclerView 내 item을 보여주는 View의 모양을 정의합니다.
* RecyclerView.ItemAnimator
  * Adapter가 notify를 받았을 때 ViewGroup을 어떻게 animate할지 결정합니다.
  * RecyclerView 내 item을 보여주는 View의 추가/삭제/변경 등 이벤트 발생시 나타낼 효과를 정의합니다.
  * 구현해야하는 메서드는 아래와 같습니다.
    * 화면에 보여지는 View의 상태 변화에 대해서만 호출되는 메서드입니다.
    * ```animateAdd(RecyclerView.ViewHolder holder)``` : View에 추가된 item이 있을 때 호출됩니다.
    * ```animateRemove(RecyclerView.ViewHolder holder)``` : 삭제된 item이 있을 때 호출됩니다.
    * ```animateMove(RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY)``` : 이동한 item이 있을 때 호출됩니다.
    * ```animateChange(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder newHolder, int fromX, int fromY, int toX, int toY)``` : 변경된 item이 있을 때 호출됩니다.
    * ```endAnimation(RecyclerView.ViewHolder item)``` : 애니메이션이 끝나면 호출됩니다.
    * ```isRunning()``` : 애니메이션이 동작하고 있을 때 호출됩니다.

# 참고
* [developer.android.com/reference - recyclerView](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.html)
* [developer.android.com/reference - recyclerView position과 index의 차이](https://developer.android.com/reference/android/view/ViewGroup.html#getChildAt(int))
* [developer.android.com/guide - recyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview)
* [recyclerView recycler, scrap](http://blog.naver.com/PostView.nhn?blogId=mail1001&logNo=220682221473)
* [recyclerView ItemDecoration](https://liveonthekeyboard.tistory.com/entry/안드로이드-RecyclerView-3-Divider-구분선-넣기)
* [recyclerView ItemDecoration](http://blog.naver.com/mail1001/220682427077)
* [recyclerView Animator](https://proandroiddev.com/enter-animation-using-recyclerview-and-layoutanimation-part-1-list-75a874a5d213)
* [recyclerView Animator](https://aroundck.tistory.com/2974)
* [recyclerView scrollTo](https://stackoverflow.com/questions/36568168/how-to-save-scroll-position-of-recyclerview-in-android)
* [recyclerView notify](https://stackoverflow.com/questions/32399115/notifyiteminserted-in-recyclerview-and-animation)
* [recyclerView animator](https://android.googlesource.com/platform/frameworks/support/+/8cf399b/v7/recyclerview/src/android/support/v7/widget/DefaultItemAnimator.java)