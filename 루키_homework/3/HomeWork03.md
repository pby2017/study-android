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
# Define an Interface
* Fragment에서 호출되고 Activity에서 실행될 메소드를 가진 인터페이스를 생성함
   > OnFragmentInteractionListener.java
   ```java
   public interface OnFragmentInteractionListener {
      void replaceFragment(Fragment fragment);
   }
   ```
* Fragment에 인터페이스의 인스턴스를 저장할 변수를 선언함
   > FirstFragment.java
   ```java
   private OnFragmentInteractionListener mListener;
   ```
* Activity에서 인터페이스를 구현함
   > MainActivity.java
   ```java
   @Override
   public void replaceFragment(Fragment fragment) {
      getSupportFragmentManager().beginTransaction()
               .replace(R.id.frame_container, fragment)
               .addToBackStack(null)
               .commit();
   }
   ```
* Activity context를 Fragment의 onAttach()를 호출할 때 전달해서 인터페이스의 인스턴스를 저장할 변수에 저장함
   > MainActivity.java
   ```java
   @Override
   public void onAttach(Context context) {
      super.onAttach(context);
      if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
      } else {
            throw new RuntimeException(context.toString()
                  + " must implement OnFragmentInteractionListener");
      }
   }
   ```
* Fragment가 전달받은 Activity의 구현된 인터페이스 메소드를 호출하여 Fragment와 Activity 사이 통신을 함
   > FirstFragment.java
   ```java
   @Override
   public void onClick(View v) {
      if (mListener != null) {
            switch (v.getId()) {
               case R.id.button_replace_second_fragment:
                  mListener.replaceFragment(SecondFragment.newInstance(0));
                  break;
            }
      }
   }
   ```
# 참고
1. [developer.android.com/training - fragments communicating interface](https://developer.android.com/training/basics/fragments/communicating?hl=ko)
2. [developer.android.com/training - fragments communicating viewModel](https://developer.android.com/topic/libraries/architecture/viewmodel.html?hl=ko)
3. [developer.android.com/training - 다른 프래그먼트와 교체 add 대신 replace](https://developer.android.com/training/basics/fragments/fragment-ui?hl=ko)