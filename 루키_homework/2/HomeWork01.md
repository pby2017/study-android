```
이번주 과제입니다.
1. ScrollView와 NestedScrollView에 대해서 비교하여 조사하시오.
https://developer.android.com/reference/android/widget/ScrollView
https://developer.android.com/reference/android/support/v4/widget/NestedScrollView

2. 안드로이드 앱과 웹페이지가 서로 통신하는 방법을 조사하고, 간단한 Sample 앱을 작성하시오.
https://developer.android.com/guide/webapps/webview#BindingJavaScript
ex) NAVER - 다른 브라우저로 열기, KAKAO - 공유하기, 전화걸기

3. 다음과 같은 디자인을 갖는 나만의 Custom Dialog Class를 작성하시오.
(새로운 화면으로 이동하는 Button, Dialog를 닫는 Button, 앱을 재시작하더라도 일정 시간 동안 Dialog를 보여주지 않게 하는 CheckBox를 포함하여야 함, DialogFragment.Class를 상속할 것)
https://developer.android.com/guide/topics/ui/dialogs
+ dialog 마진 찾아보기
```
# ScrollView와 NestedScrollView
* Scrolling 기능을 제공하는 View Group 중 하나
* View Group의 subclass인 FrameLayout의 subclass
  * 바로 아래 1개의 자식 계층(direct child)만 가질 수 있음
* View 계층을 포함하며 ScrollView 안에서 View 계층 요소들을 scroll할 수 있음
  * 다양한 View를 포함시키려면 다음과 같은 방법을 적용함
    1. child로 LinearLayout과 같은 View Group (Container layout)을 먼저 추가함
    2. View Group 내 포함하려는 View를 추가함
# ScrollView란
* Vertical scrolling만 지원함
  * Horizontal scrolling은 HorizontalScrollView가 지원함
* ScrollView 내 RecyclerView나 ListView 등 scrolling layout 사용을 금지하는 이유는 아래와 같음
  1. User interface 성능에 좋지 않음
  2. User experience에 좋지 않음
* Vertical scrolling을 사용하려면 다음과 같은 이유로 아래 방법을 고려해봐야 함
  * NestedScrollView
    1. 높은 User interface 유연성을 제공함
    2. Material design scrolling 패턴을 지원함
# NestedScrollView란
* ScrollView이지만, support v4 라이브러리로써 옛 버전과 새로운 버전에 모두 호환이 가능함
* ScrollView와 달리 아래 인터페이스를 구현함
  1. NestedScrollingParent
     * 중첩시 부모 ScrollView의 역할을 수행할 때 호출되는 메서드 구현
  2. NestedScrollingChild2
     * 중첩시 자식 ScrollView의 역할을 수행할 때 호출되는 메서드 구현
  3. ScrollingView
     * Scroll Vertical, Horizontal 지원
     * Scroll offset (몇 번째 item인지), Range (item 개수는 몇 개인지) 등을 관리
# 부모 ScrollingView와 자식 ScrollingView의 중첩시 스크롤 과정
* 자식 뷰의 onTouchEvent(MotionEvent) 메서드 호출 : 스크롤 등의 사용자 이벤트 발생시 호출
* 자식 뷰의 dispatchNestedPreScroll() 메서드 호출 : 부모 뷰에게 스크롤의 일부를 소비할 것이라고 알림
  * 부모 뷰의 onNestedPreScroll() 메서드 호출 : 부모 뷰가 먼저 스크롤의 일부를 소비할 기회를 얻음
  * 부모 뷰의 스크롤 소비 후
* 자식 뷰의 남은 스크롤 소비
* 자식 뷰의 dispatchNestedScroll() 메서드 호출 : 부모 뷰에게 얼마의 스크롤을 소비했는지 알릴 때 호출
  * 부모 뷰의 onNestedScroll() 메서드 호출 : 부모 뷰가 남은 스크롤을 소비할 기회를 얻음
* 자식 뷰의 onTouchEvent(MotionEvent) 결과 반환 : 스크롤을 소비했으면 true를 반환함
# 스크롤 과정2
* 자식 뷰의 onTouchEvent(): action down 메서드 호출
* 자식 뷰의 onScrollStarted() 메서드 호출
* 자식 뷰의 dispatchPreScroll() 메서드 호출 : 부모 뷰에게 scroll을 소비할 기회를 줌
  * 부모 뷰가 true를 반환하면 부모 뷰가 소비한만큼 자식 뷰가 소비할 수 있는 scroll은 줄어듬
* 자식 뷰의 dispatchScroll() 메서드 호출
* 자식 뷰의 dispatchNestedScroll() 메서드 호출 : 자식 뷰가 scroll을 얼마나 소비했는지 부모 뷰에게 알림
* 부모 뷰는 남은 scroll을 소비함
* CoordinatorLayout은 자식 뷰로부터 콜백을 받음
* scroll 프로세스가 끝나면 자식뷰는 onScrollStoped() 콜백을 호출함
# 출처
1. [developer.android.com/reference - ScrollView](https://developer.android.com/reference/android/widget/ScrollView)
2. [developer.android.com/reference - NestedScrollView](https://developer.android.com/reference/android/support/v4/widget/NestedScrollView.html)
3. [developer.android.com/reference - NestedScrollingParent]([NestedScrollingParent](https://developer.android.com/reference/android/support/v4/view/NestedScrollingParent.html))
4. [developer.android.com/reference - NestedScrollingChild2](https://developer.android.com/reference/android/support/v4/view/NestedScrollingChild2.html)
5. [developer.android.com/reference - ScrollingView](https://developer.android.com/reference/android/support/v4/view/ScrollingView.html#interfaces)
6. [NestedScrollView와 RecyclerView의 중첩시 호출되는 메서드](http://dktfrmaster.blogspot.com/2018/12/experimenting-with-nested-scrolling.html?m=1)
7. [SwipeRefreshLayout, (ScrollView 또는 NestedScrollView) 중첩시 문제와 해결](https://yunzema.tistory.com/m/8)
8. [scrollView 상단 바 show/hide](https://lab.getbase.com/nested-scrolling-with-coordinatorlayout-on-android/)