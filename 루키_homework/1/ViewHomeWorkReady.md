[# How Android Draws Views](https://developer.android.com/guide/topics/ui/how-android-draws)
1. Activity receives focus
2. Activity be requested to draw its layout
3. Android framework drawing 과정을 handle
4. But, Activity must provide the root node of its layout hierarchy
5. layout의 root node로 Drawing이 시작
6. (measure & draw the layout tree)가 요청된다
7. walking the tree에 의해 Drawing은 다뤄진다
8. rendering each View에 의해 Drawing은 다뤄진다

9. ViewGroup은 it's children to be drawn(with the draw() method) 요청의 의무가 있다
10. Each View는 drawing itself 의무가 있다
11. Tree는 pre-order이므로 부모가 children 보다 먼저 draw 된다
12. children (slibings)은 tree order대로 draw 된다

```중요.
framework는 doesn't draw View objects that aren't in the invalid region
framework는 takes care of drawing the View background for you
```
1. Drawing the layout is a two pass process
   1. a measuer pass
   2. layout pass

## Measure pass
1. measuring pass is in measure(int, int)
2. measuring pass is top-down(하향식) traversal(탐색) of the View tree
3. each view는 recursion 동안 tree에 dimension specifications를 push 합니다
4. measure pass의 끝에는 모든 View가 its measurements(측정값)를 저장

1. second pass는 layout(int, int, int, int)에서 발생
2. second pass는 top-down(하향식)
3. this pass동안 each parent는 measure pass에서 계산된 sizes를 사용하여 모든 its children을 positioning(배치?)할 의무를 가진다

1. View object's measure() 메소드가 반환되면, View object's 모든 descendants(자손)은 its getMeasuredWidth(), getMeasuredHeight() 값은 set 되어야 한다
2. View object's measured width와 height 값은 View object's parents의 값을 respect해야 합니다
3. measure pass가 끝나면, 모든 parents는 모든 their children's measurements를 받아드린다.
4. parent View는 its children보다 1번 더 measure()을 호출한다
    1. 예를 들어,
    2. parent는 child가 how big을 원하는지 measure를 합니다
    3. 모든 children's unconstrained sizes가 너무 크거나 또는 작으면 다시 measure()를 호출합니다
    4. children이 크기에 동의하지 않으면 second pass에서 parent가 intervene함

1. ViewGroup.LayoutParams 클래스는 View objects가 사용한다
2. ViewGroup.LayoutParams는 View objects가 measured and positioned 방법을 their praents에게 전달할 때 사용한다
3. ViewGroup.LayoutParams는 View가 원하는 width와 height가 how big한지 설명한다

1. 각 측정 기준에 따라 다음 중 한 가지를 지정할 수 있다
   1. exact number
   2. MATCH_PARENT (minus padding)
   3. WRAP_CONTENT (plus padding)

1. ViewGroup의 서로 다른 subclasses에 대한 ViewGroup.LayoutParams의 subclasses가 있다
   1. 예를 들어,
   2. RelativeLayout은 ViewGroup.LayoutParams의 own subclass를 가진다
   3. ViewGroup.LayoutParams의 own subclass는 child View objects를 horizontally 또는 vertically에서 center에 배치할 수 있는 기능이 포함됩니다

1. MesureSpec objects는 parent에서 child로 requirements를 push하는 데 사용된다
2. Mesurespec은 아래 세 가지 modes 중 한 가지를 선택할 수 있다
   1. UNSPECIFIED : parent가 child View가 원하는 dimension을 결정하는데 사용된다
      1. LinearLayout의 child가 height는 UNSPECIFIED로 width는 EXACTLY 240으로 설정되어 있을 때,
      2. LinearLayout은 child View가 240 pixels width를 원할 때 how tall을 알아내기 위해 measure()를 호출할 수 있다
   2. EXACTLY : parent가 child에게 exact size를 부과한다, child는 it and its descendants가 this size에 맞는지 보증해야 한다
   3. AT MOST : parent가 child에게 maximum size를 부과한다, child는 it and its descendants가 this size에 맞는지 보증해야 한다

## Layout pass
1. layout을 시작하려면 requestLayout()을 호출하세요
2. View의 현재 bounds 안에 맞지 않을 때 View가 호출하는 메소드입니다

# [Custom View Components](https://developer.android.com/guide/topics/ui/custom-components)
1. Android는 building your UI를 위해 View와 ViewGroup을 기반으로 sophisticated and powerful componentized한 모델을 제공한다
2. 이 platform은 widgets and layouts라고 불리는 미리 만들어진 View and ViewGroup subclasses를 포함한다
## The Basic Approach
1. 이미 존재하는 View 또는 subclass를 당신의 class에 상속한다
2. 몇몇 superclass로 부터 method를 override한다, on으로 시작한다
3. 확장한 클래스를 사용한다
## Fully Customized Components
1. View를 상속한다
2. XML로부터 속성과 파라미터를 가져올 수 있는 constructor를 공급할 수 있다
3. your own event listeners, property accessors and modifiers, and possibly more sophisticated behavior를 만들기를 원할 수 있다
4. component가 show하길 원한다면 onMeasure() override, onDraw() override 해야한다
5. default면 onDraw() will do nothing, onMeasure() will always set a size of 100x100 이다
6. 필요하면 on으로 시작하는 메소드를 override 할 것이다
## Extend onDraw() and onMeasure()
1. onDraw()는 you can implement anything 할 수 있도록 한다
2. 이것은 2D를 지원하며, 3D는 View 대신 SurfaceView를 사용해야 하고 draw from a separate thread 하다

1. onMeasure()는 critical piece of the rendering contract between your component and its container 이다
2. onMeasure()는 efficiently and accurately 하게 its contained parts 측정값을 report 해야한다
3. onMeasure() implement
   1. onMeasure() with parameters (widthMeasureSpec, heightMeasureSpec representing dimensions = restrictions on the width and height measurements)
   2. Your component's onMeasure() calculate a measurement width and height (for rendering the component)
   3. Once the width and height are calculated, setMeasuredDimension(int width, int height) 메소드 호출됨
## Compound Controls
## Modifying an Existing View Type

# [notepad google sample source extends EditText](https://android.googlesource.com/platform/development/+/master/samples/NotePad)
1. The Definition
2. Class Initialization
3. Overridden Methods
4. Use the Custom Component

# [Custom Drawing](https://developer.android.com/training/custom-views/custom-drawing.html)
## Override onDraw()
## Create Drawing Objects
1. The android.graphics framework divides drawing into two areas:
   1. What to draw, handled by Canvas
   2. How to draw, handled by Paint
## Handle Layout Events
1. If your view doesn't need special control over its size, you only need to override one method: onSizeChanged().
## Draw!

# [Creating a View Class](https://developer.android.com/training/custom-views/create-view)
1. Subclass a View
2. Define Custom Attributes
3. Apply Custom Attributes
   1. When a view is created from an XML layout, all of the attributes in the XML tag are read from the resource bundle and passed into the view's constructor as an AttributeSet.
4. Add Properties and Events
5. Design For Accessibility

# 참고
* [canvas save / restore](https://simsimjae.tistory.com/269)
* [layout별 onMeasure호출 순서, 횟수](http://blog.unsignedusb.com/2017/05/android-layout-measure-linearlayout-vs.html)
* [TypedArray 의 recycle](https://stackoverflow.com/questions/7252839/what-is-the-use-of-recycle-method-in-typedarray)
* [onMeasure()에서 View MeasureSpec에 따라 다른 정의](https://gogorchg.tistory.com/entry/Android-Make-CustomView-TextView-OnMeasure)
* [onMeasure / onLayout / onDraw 에 대한 설명](https://onecellboy.tistory.com/344)
# 참고 대기
# [Android Canvas' drawArc Method: A Visual Guide](https://thoughtbot.com/blog/android-canvas-drawarc-method-a-visual-guide)
# [Draw Arc Android basic example](https://android.okhelp.cz/draw-arc-android-basic-example/)
# [How to draw text with different stroke and fill colors?](https://stackoverflow.com/questions/9044769/how-to-draw-text-with-different-stroke-and-fill-colors)



# [View](https://developer.android.com/reference/android/view/View.html#drawing)
# [View - onDraw(android.graphics.Canvas)](https://developer.android.com/reference/android/view/View.html#onDraw(android.graphics.Canvas))
# [Canvas](https://developer.android.com/reference/android/graphics/Canvas.html)
# [Rect](https://developer.android.com/reference/android/graphics/Rect.html)
# [Parcelable](https://developer.android.com/reference/android/os/Parcelable.html)
# [Parcel](https://developer.android.com/reference/android/os/Parcel.html)
# [IBinder](https://developer.android.com/reference/android/os/IBinder.html)
# [LayoutInflater](https://developer.android.com/reference/android/view/LayoutInflater)
# [View hierarchy](https://o7planning.org/en/10423/android-ui-layouts-tutorial)
# [Custom View Order Image](https://www.google.com/search?q=android+view+draw+order&newwindow=1&source=lnms&tbm=isch&sa=X&ved=0ahUKEwj91YT_nJ_hAhWKF4gKHS3RDGgQ_AUIDigB&biw=1270&bih=1361#imgrc=TW0hnWJ_QUxOwM:)
# [Post Includes Custom View Order Image](https://proandroiddev.com/android-draw-a-custom-view-ef79fe2ff54b)