```
* Custom View 피드백 반영

* NestedScrollView 피드백 반영

* 앱을 죽이는 방법 피드백 반영
* 현재 보여지고 있는 프래그먼트 찾을 수 있는 방법 피드백 반영
* Activity와 Fragment 통신 방법 피드백 반영

* REST Api 조사 및 실습 피드백 반영

* notification 구현 피드백 반영
```
# 앱을 죽이는 방법 피드백 반영
* 프로젝트 : LifeCycleApplication
* 가로 세로 전환 (onDestroy() - isFinishing() = false)
* 해상도(adb size 100x100, density 100, reset) 변경 (onDestroy() - isFinishing() = false)
  * 단축키 : ```Ctrl+Shift+A```
* 퍼미션 승인 취소 (onPause부터 호출 안됨, [adb idea plugin 사용](https://github.com/pbreault/adb-idea))
* adb kill (onPause부터 호출 안됨, adb idea plugin 사용)
# 현재 보여지고 있는 프래그먼트 찾을 수 있는 방법 피드백 반영
* 프로젝트 : FragmentsCommunicationApplication
* 방법
  ```java
  Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frame_container);
  ```
# Activity와 Fragment 통신 방법 피드백 반영