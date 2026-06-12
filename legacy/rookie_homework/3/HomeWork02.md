```
이번주 과제입니다.

1. Activity와 Fragment의 생명주기에 대해서 조사하시오. (백그라운드에서 앱에 재진입할 때의 시나리오, 앱 프로세스가 kill 되는 상황에서 시나리오 등의 다양한 시나리오도 조사해볼 것)
`https://developer.android.com/guide/components/activities?hl=ko`
`https://developer.android.com/guide/components/fragments?hl=ko`

2. Support 디자인 라이브러리의 Bottom Navigation을 사용하여 하단 네비게이션 관련 3rd 라이브러리인 FragNav라는 라이브러리를 적용하는 Sample 앱을 작성하시오. (요기요 앱 하단 내비게이션과 동일한 모양일 것)
`https://developer.android.com/reference/android/support/design/widget/BottomNavigationView`
`https://material.io/develop/android/components/bottom-navigation-view/`
`https://github.com/ncapdevi/FragNav`

3. Activity와 Fragment가 서로 통신하는 방법에 대해서 조사하시오. (Activity <- -> Fragment)
`https://developer.android.com/training/basics/fragments/communicating?hl=ko` (edited) 
```
# FragNav
* 프래그먼트들이 담긴 스택을 여러 개 관리할 수 있도록 도와주는 라이브러리
* 각 스택은 Tab 인덱스로 불러올 수 있음
* Tab 개수의 최대는 20이며, BottomNavigation을 사용하는 경우 최대 5개의 Tab을 사용할 수 있음
# FragNav 설정
* FragNavController 객체화
  * Fragment stack을 관리하는 객체
    ```java
    FragNavController fragNavController = new FragNavController(getSupportFragmentManager(), R.id.frame_container);
    ```
* onNavigationItemSelected tab bar 아이템 선택 리스너 정의
  * tab bar의 탭을 눌렀을 때 반응 정의
      ```java
      switch-case:
          fragNavController.switchTab(tabIndex);
          break;
      ```
* Tab bar 객체 생성
  * BottomNavigationView 사용
    ```java
    bottomNavigation = findViewById(R.id.bottom_navigation);
    bottomNavigation.inflateMenu(R.menu.bottom_navigation);
    bottomNavigation.setOnNavigationItemSelectedListener(this);
    ```
* Root fragment 초기화
  * 각 Tab의 root fragment 선정
    ```java
    fragments = new ArrayList<>();

    fragments.add(HomeFragment.newInstance(0));
    fragments.add(SearchFragment.newInstance(0));
    fragments.add(OrderHistoryFragment.newInstance(0));
    fragments.add(MyYogiyoFragment.newInstance(0));
    ```
* FragNavController 설정
  * FragmentHideStrategy
    ```java
    fragNavController.setFragmentHideStrategy(FragNavController.DETACH_ON_NAVIGATE_HIDE_ON_SWITCH);
    ```
    * Fragment가 화면에서 사라질 때 어떤 작업을 수행할지 결정함
    * DETACH (default)
      * 프래그먼트가 onResume() 상태에서 다른 프래그먼트로 교체되었을 때 onPause(), onStop(), onDestroyView()가 호출됨
      * 다시 프래그먼트가 재개되면 onCreateView()부터 호출됨
      * 프래그먼트끼리 바꿀 때 유지 안됨
    * HIDE
      * 프래그먼트가 onResume() 상태에서 다른 프래그먼트로 교체되었을 때도 그대로 유지됨 (onPause() 호출이 안됨)
      * 프래그먼트끼리 바꿀 때 show and hide methods를 호출함
    * DETACH_ON_NAVIGATE_HIDE_ON_SWITCH
      * 현재 탭에서 프래그먼트끼리 바꿀 때 attach and detach methods를 호출함 : 프래그먼트끼리 레이아웃이 새로 생성됨(= 현재 탭에서만 DETACH)
      * 탭끼리 바꿀 때 show and hide methods를 호출함 : 탭끼리 유지
    * REMOVE
      * 현재 탭에서 프래그먼트끼리 바꿀 때 create + attach methods를 호출함
      * 탭끼리 바꿀 때 탭을 처음 실행하면 onCreate()까지 호출하고, 두 번째 실행하면 onDetach()를 실행해서 소멸됨
  * Eager
    ```java
    fragNavController.setCreateEager(true);
    ```
    * HIDE, DETACH_ON_NAVIGATE_HIDE_ON_SWITCH 의 경우 자동으로 root fragment를 add와 inflate 작업을 해줌
    * 이 때, eager가 true mode 여야 함
      * true : 모든 root fragment를 onResume() 호출 상태까지 상태 변경해줌
      * false(default) : 처음으로 탭을 누르면 getRootFragment() 부터 호출되서 newInstance()부터 onResume()까지 호출되며 상태 변경됨
  * Set RootFragments
    ```java
    fragNavController.setRootFragments(fragments);
    ```
    * root fragment array list를 인자로 전달해서 각 tab에 해당하는 root fragment 정보를 FragNavController에게 제공함
  * Initialize
    ```java
    fragNavController.initialize(FragNavController.TAB1, savedInstanceState);
    ```
    * 이전에 프래그먼트에 대해 저장한 상태가 있다면 복구함
    * 첫 번째로 보여줄 탭을 정의함
  * getRootFragment() 메소드 정의
    ```java
    @NonNull
    @Override
    public Fragment getRootFragment(int index) {
        Log.d(CUS_MAIN_ACT, "getRootFragment()");
        switch (index) {
            case INDEX_HOME:
                return HomeFragment.newInstance(0);
                ...
        }
    }
    ```
    * 탭 클릭시 호출된 switchTab() 다음으로 호출되는 메소드
    * 새 fragment 객체를 반환
  * Set RootFragmentListener
    ```java
    fragNavController.setRootFragmentListener(this);
    ```
    * 탭 변경 메소드 호출시 어떤 프래그먼트를 보여줄지 Index를 반환하는 getRootFragment() 메소드를 FragNavController에 연결함
  * 
# 특이사항
* Fragment의 View 생성시 The specified child already has a parent. 문제 발생
    > inflater.inflate() 의 세 번째 인자에 false 값을 주어 해결
    ```java
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        return view;
    }
    ```
* BottomNavigationView의 탭시 현재 탭된 부분 표시
    > override boolean onNavigationItemSelected() 메소드의 반환을 true로 바꿔서 해결
    ```java
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        ...
        return true;
    }
    ```
* Shouldn't have both a rootFragmentListener and rootFragments set, this is clearly a mistake
    > fragNavController.initialize의 예외조건 확인 후 위치 수정해서 해결
    ```java
    fun initialize(@TabIndex index: Int = TAB1, savedInstanceState: Bundle? = null) {
        if (rootFragmentListener == null && rootFragments == null) {
            throw IndexOutOfBoundsException("Either a root fragment(s) needs to be set, or a fragment listener")
        } else if (rootFragmentListener != null && rootFragments != null) {
            throw java.lang.IllegalStateException("Shouldn't have both a rootFragmentListener and rootFragments set, this is clearly a mistake")
        }
        ...
    }
    ```
* You can not popFragment the rootFragment.
    > onBackPressed() 메소드 정의할 때 조건문으로 fragNavController.popFragment()를 호출하니까 rootFragment는 pop할 수 없다는 문제 발생해서 조건 수정함
    ```java
    @Override
    public void onBackPressed() {
        Log.d(CUS_MAIN_ACT, "onBackPressed()");
        if (fragNavController.isRootFragment()) {
            fragNavController.popFragment();
        } else {
            super.onBackPressed();
        }
    }
    ```
# 참고
1. [github - FragNav](https://github.com/ncapdevi/FragNav)
2. [developer.android.com/reference - Fragment newInstance()](https://developer.android.com/reference/android/support/v4/app/Fragment.html)
3. [Fragment newInstance() 사용하는 이유](https://m.blog.naver.com/PostView.nhn?blogId=tpgns8488&logNo=220989078813&proxyReferer=https%3A%2F%2Fwww.google.com%2F)