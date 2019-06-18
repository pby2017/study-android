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
# 생명 주기
* 한 화면의 사용자 인터페이스를 제공하는 Activity와 Fragment는 생성, 중단, 제거 등의 상태 변화가 존재함
* 상태 변화의 일정한 주기를 생명 주기라고 함
* 상태가 변경되면 생명 주기 콜백 메서드가 호출됨
# 액티비티 생명 주기
* ### Foreground(포커스 가짐)
  * ##### onCreate(Bundle savedInstanceState)
    * 액티비티가 처음 생성될 때 호출됨
    * savedInstanceState 에 액티비티의 이전 상태가 저장됨
    * 이 상태에서 초기 설정을 수행해야 함
  * ##### onStart()
    * 액티비티가 사용자에게 표시되기 직전에 호출됨
    * 액티비티가 재개될 때 onRestart() 다음으로 호출
  * ##### onResume()
    * 액티비티가 표시되고 사용자와 상호작용하기 전 호출됨
* ### Background(포커스 잃음)
  * ##### onPause()
    * 다른 액티비티를 시작하기 전에 포커스를 잃고 사용자와 상호작용을 하지 못할 때 호출됨
    * 상태를 저장하는 작업을 수행해야 함 (액티비티가 급하게 종료되는 경우 onStop, onDestroy는 호출이 안될 때도 있음)
    * 반환이 되어야 다른 액티비티가 시작할 수 있기 때문에 작업을 빨리 끝내야 함
    * 액티비티가 포커스를 되찾으면 onResume(), 화면에서 사라지면 onStop()이 호출됨
    * 이 상태에서 다른 우선 작업의 메모리가 부족하면 강제 종료되며 onStop() 보다 강제 종료 우선순위 낮음
* ### Background(안보임)
  * ##### onStop()
    * 액티비티가 소멸될 때(종료될 때) 또는 가려졌을 때와 같이 더이상 표시되지 않으면 호출됨
    * 다시 표시되기 직전 onRestart()가, 완전히 사라지면 onDestroy()가 호출됨
    * 이 상태에서 다른 우선 작업의 메모리가 부족하면 강제 종료되며 onPause() 보다 강제 종료 우선순위 낮음
    * 메모리 부족시 액티비티가 종료될 때 호출 안될 수 있음
* ### Empty
  * ##### onDestroy()
    * 액티비티가 소멸되기 전에 마지막으로 호출됨
    * 액티비티가 스택의 마지막일 때 뒤로 가기를 누르거나 finish() 메소드 호출 등의 이유로 소멸되거나 시스템이 공간을 절약하기 위해 소멸시킬 때 호출됨
    * isFinishing() 메소드로 구분 가능함
      * true : 액티비티 마지막 스택에서 뒤로 가기를 누르거나 finish()가 호출될 때
      * false : 시스템에 의해 종료될 때
    * 메모리 부족시 액티비티가 종료될 때 호출 안될 수 있음
* ##### onRestart()
  * 소멸되지 않은 액티비티가 중단 상태에서 다시 시작되기 직전에 호출됨
  * 사용자 화면에서 완전히 사라졌다가 다시 표시되기 직전에 호출됨
# 프래그먼트 생명 주기
* ##### onAttach(Context context)
  * 액티비티와 연관된 경우 호출됨
  * 액티비티와 통신할 경우 listener 인스턴스를 인자로 받음
* ##### onCreate(Bundle savedInstanceState)
  * 이전 상태 복구 작업 수행
* ##### View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
  * 프래그먼트와 연관된 뷰 계층을 생성하기 위해 호출됨
  * View와 관련한 초기화 작업을 정의함
* ##### onActivityCreated(@Nullable Bundle savedInstanceState)
  * 액티비티의 onCreate() 메서드가 반환되면 호출됨
* ##### onStart()
  * 프래그먼트가 사용자에게 표시되기 직전에 호출됨
* ##### onResume()
  * 프래그먼트가 표시되고 사용자와 상호작용하기 전 호출됨
* ##### onPause()
  * 반환이 되어야 다른 액티비티 또는 프래그먼트가 시작할 수 있기 때문에 작업을 빨리 끝내야 함
  * 프래그먼트가 포커스를 되찾으면 onResume(), 화면에서 사라지면 onStop()이 호출됨
  * 이 상태에서 다른 우선 작업의 메모리가 부족하면 강제 종료되며 onStop() 보다 강제 종료 우선순위 낮음
* ##### onStop()
  * 프래그먼트가 소멸될 때(종료될 때) 또는 가려졌을 때와 같이 더이상 표시되지 않으면 호출됨
  * 재개되면 onStart()가, 완전히 사라지면 onDestroyView, onDestroy(), onDetach() 순으로 호출됨
  * 이 상태에서 다른 우선 작업의 메모리가 부족하면 강제 종료되며 onPause() 보다 강제 종료 우선순위 낮음
  * 메모리 부족시 프래그먼트가 종료될 때 호출 안될 수 있음
* ##### onDestroyView()
  * 프래그먼트와 연관된 뷰 계층이 제거될 때 호출됨
* ##### onDestroy()
  * 프래그먼트가 소멸되기 전에 호출됨
* ##### onDetach()
  * 액티비티와 연결이 끊어질 때 호출됨
  * 프래그먼트가 소멸되기 전에 마지막으로 호출됨
# 상황별 생명 주기
* 액티비티 시작
  ```
  onCreate()
  onStart()
  onResume()
  ```
* 프래그먼트 시작
  ```
  onAttach()
  onCreate()
  onCreateView()
  onActivityCreated()
  onStart()
  onResume()
  ```
* 액티비티 위에 투명 배경의 액티비티 시작 & 뒤로가기
  * 시작
    ```
    onPause()
    ```
  * 뒤로가기
    ```
    onResume()
    ```
* 프래그먼트 위에 투명 배경의 액티비티 시작 & 뒤로가기
  * 시작
    ```
    [activity]onPause()
    onPause()
    ```
  * 뒤로가기
    ```
    [activity]onResume()
    onResume()
    ```
* 액티비티에서 동일한 액티비티 재시작
  * 재시작
    > onPause()의 작업이 길면 안되는 이유
    ```
    onPause()
    [new] onCreate()
    [new] onStart()
    [new] onResume()
    onStop()
    ```
* 프래그먼트에서 동일한 프래그먼트 재시작
  * 재시작
    ```
    [new] onAttach()
    [new] onCreate()
    onPause()
    onStop()
    onDestroyView()
    onDestroy()
    onDetach()
    [new] onCreateView()
    [new] onActivityCreated()
    [new] onStart()
    [new] onResume()
    ```
* 액티비티에서 finish() 호출해서 종료
  ```
  onPause()
  onStop()
  onDestroy()
  onDestroy() - isFinishing(true)
  ```
* 프래그먼트에서 액티비티 finish() 호출해서 종료
    ```
    onPause()
    [Fragment] onPause()
    onStop()
    [Fragment] onStop()
    onDestroy()
    onDestroy() - isFinishing(true)
    [Fragment] onDestroyView()
    [Fragment] onDestroy()
    [Fragment] onDetach()
    ```
* device setting - 액티비티 유지 안함 설정 후 소멸
  * 액티비티
    > 차이점
    ```
    onDestroy() - isFinishing(false)
    ```
  * 프래그먼트
    > 차이점
    ```
    onDestroy() - isFinishing(true)
    ```
* null 접근
  * 액티비티 & 프래그먼트
    ```
    생명 주기 로그 안보임
    ```
* 무한 반복 (메모리 없애보기)
  * 강제 종료 실패
# 배운점
* Activity에서 Fragment를 변경하는 메소드를 정의할 때 첫 Fragment면 add()를, 아니면 replace()를 호출함
    > 기존 코드
    ```java
    if (getSupportFragmentManager().getFragments().size() == 0) {...
    } else {...}
    ```
    > 수정 코드
    ```java
    if (getSupportFragmentManager().findFragmentById(R.id.frame_container) == null) {
    } else {...}
    ```
* Fragment의 newInstance() 메소드에 대해서
  * 팩토리 패턴 : 클래스의 인스턴스를 만드는 일을 맡기는 것
  * 검색창을 예로 들면, 검색어 키워드를 인자로 전달함
  * newInstance() 내부에서 Bundle 사용하는 것을 권장함
  * 인자로 Bundle을 전달하는 것은? 어떤 정보를 전달하는지 명확하지 않아서 좋은 방법은 아님 (어떤 정보를 전달하는지는 알되, 내부 동작은 모르도록)
  * 보일러 플레이트 코드 : 재사용할 수 있음
  * Alt + Fn + F7 단축키로 찾기가 쉬움
# 참고
1. [developer.android.com/guide - 액티비티](https://developer.android.com/guide/components/activities?hl=ko)
2. [developer.android.com/training - 액티비티 생명 주기 관리](https://developer.android.com/training/basics/activity-lifecycle/index.html?hl=ko)
3. [developer.android.com/reference - LifecycleObserver](https://developer.android.com/reference/android/arch/lifecycle/Lifecycle.html)
4. [개발자옵션 - 액티비티 유지 안함 설정](https://oneday0012.tistory.com/137)
5. [메모리 부족할 경우 시스템이 액티비티 종료](https://j07051.tistory.com/293)
6. [액티비티 생명 주기 테스트](https://mydevromance.tistory.com/21)
7. [배경이 투명한 액티비티 생성](https://m.blog.naver.com/artisan_ryu/220663792572)
8. [프래그먼트 자체 종료 - Event Bus](https://hashcode.co.kr/questions/4519/안드로이드-프래그먼트만-종료)
9. [SHA256 계산 메소드](https://ra2kstar.tistory.com/142)
10. [ADB kill](https://stackoverflow.com/a/26890214)