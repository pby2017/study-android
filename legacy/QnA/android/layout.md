## ConstraintLayout / RelativeLayout / LinearLayout
Ask to 찬호님
* 적합한 곳에 맞게 사용한다.
* LinearLayout
  * Depth가 깊지 않고 순차적으로 View를 보여주고 싶을 때 사용한다.
  * 상대적으로 복잡하지 않을 때 사용한다.
* RelativeLayout / ConstraintLayout
  * 상대적으로 복잡할 때 사용한다.
* 사진이 들어가고 그 주변에 다른 View를 추가해야하는 상황일 때
  * 예전에는 ```RelativeLayout```을 사용했지만,
  * 요즘에는 ```ConstraintLayout```을 사용한다.
  * ```RelativeLayout```은 Depth가 깊어질 수 있는데 이것을 얕게, 1개로 만들어주는 것이 ```ConstraintLayout```의 장점이다.
* 속도를 비교해봤을 때
  * ```LinearLayout```은 사이즈 측정시 2번 측정하는데 이것이 상대적으로 느리다.
  * ```ConstraintLayout```은 최적화가 잘되서 1번만 측정하니까 상대적으로 빠르다.

## ViewPager
Ask to 희수님
* ViewPager의 여러 Fragment 중 현재 보여지는 페이지에서만 데이터를 가져와서 보여주고 싶을 때..
  * isResumed()와 setUserVisibleHint() 메서드를 활용한다.
Ask to 본창님
* ViewPager의 여러 Fragment 중 현재 보여지는 페이지에서만 데이터를 가져와서 보여주고 싶을 때..
  * 반복 호출하는 횟수가 2회 이상이어서 바꾸는게 좋을 것 같다.
  * 현재 보여지는 페이지 외 데이터를 한 번에 가져와서 전부 보여주는 방법을 사용하면 API 호출 횟수를 줄일 수 있다.
  * 페이징 처리를 찾아보는게 좋을 것 같다. 제한된 개수만 불러오는 방법이다.