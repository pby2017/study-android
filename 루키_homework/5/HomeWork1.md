```
* Custom View 피드백 반영

* NestedScrollView 피드백 반영

* 앱을 죽이는 방법 피드백 반영
* 현재 보여지고 있는 프래그먼트 찾을 수 있는 방법 피드백 반영
* Activity와 Fragment 통신 방법 피드백 반영

* REST Api 조사 및 실습 피드백 반영

* notification 구현 피드백 반영
```
# Custom View
* 프로젝트 : CustomCircleApplication
## canvas save / restore
* 현재 canvas의 좌표계 상태 저장 / 복구 메서드입니다.
* 사용법
  * ```canvas.save()``` 메서드를 호출해서 현재 canvas 좌표계 상태를 저장합니다.
  * ```canvas.translate(x, y)``` 메서드를 호출해서 (x,y) 위치로 좌표계의 원점을 이동합니다.
  * ```canvas.drawCircle(0, 0, radius, strokeCirclePaint)``` 메서드를 호출해서 이동 후 좌표계의 원점을 중심으로 circle을 그립니다.
  * ```canvas.restore()``` 메서드를 호출해서 ```canvas.save()``` 메서드를 호출했던 시점으로 좌표계를 복구합니다.
  * (x,y)를 중심으로 하는 circle이 그려집니다.
## onDraw() 메서드 외 onMeasure() / onLayout 메서드 정의해서 사용해보기
* onMeasure()
  * 뷰의 가로, 세로 크기를 결정하는 곳입니다.
* onLayout()
  * 뷰의 위치를 결정하는 곳입니다.
  * ```onMeasure()``` 메서드 호출로 크기 계산이 끝난 뒤 호출되는 메서드이므로 ```getWidth()``` / ```getHeight()```가 null이 아닙니다.
## 드래그 앤 드랍 액션 등 정의해보기
