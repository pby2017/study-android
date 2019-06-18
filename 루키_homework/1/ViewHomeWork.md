```
이번주 과제는 다음과 같습니다.
`1. Android에서 화면 상에 View가 그려지는 원리에 대해서 조사하시오.`
`2. Android의 View.class와 ViewGroup.class에 대해서 비교하여 조사하시오.`
`3. 다음과 같은 모양을 갖는 나만의 Custom View Class를 작성하시오. (원과 원을 감싸는 선으로 이루어진 모양일 것, View.class를 상속할 것)`

참고자료
https://developer.android.com/reference/android/view/View.html
https://developer.android.com/reference/android/view/ViewGroup.html
https://developer.android.com/guide/topics/ui/custom-components (edited) 
```

# [setContentView(int id) from Activity's onCreate(Bundle)]()
* ## Inflator가 Xml 파일을 View 객체로 변환하고 ViewGroup에 추가함
1. ## CustomActivity.class : 메인 액티비티
   1. setContentView(R.layout.layoutId)
   2. ## AppCompatActivity.class : 하위버전 지원 액티비티
      1. setContentView(@LayoutRes int layoutResID)
         1. this.getDelegate().setContentView(layoutResID)
            1. getDelegate()
            2. = return AppCompatDelegate.create(this, this)
            3. = return new AppCompatDelegateImpl(activity, activity.getWindow(), callback)
            4. ## AppCompatDelegateImpl.class : Activity 대신 뭔가를 하는 클래스(?)
               1. setContentView(int resId)
                  1. ViewGroup contentParent = (ViewGroup)this.mSubDecor.findViewById(16908290);
                     1. 16908290 = R.id.content = the root element of a view, without having to know its actual name/type/ID.
                  2. contentParent.removeAllViews();
                  3. ## LayoutInflater.class : Instantiates a layout XML file into its corresponding View objects.ß
                     1. public View LayoutInflater.inflate(@LayoutRes int resource, @Nullable ViewGroup root)
                     2. View inflate(..){ return inflate(parser, root, attachToRoot) }
                     3. LayoutInflater.rInflateChildren(parser, temp, attrs, true)
                     4. ## Recursive : 재귀
                     5. rInflateChildren(parser, view, attrs, true);
                     6. viewGroup.addView(view, params);
                  4. this.mOriginalWindowCallback.onContentChanged();
#
#
#
# [Layout explorer from LinearLayout.class to View.class]()
* ## LinearLayout.class 부터 View.class 까지 가보기
1. ## LinearLayout.class
   1. Constructor(context, AttributeSet, defStyleAttr, defStyleRes)
      1. super(context, AttributeSet, defStyleAttr, defStyleRes)
      2. ## ViewGroup.class
         1. ViewGroup Constructor(context, AttributeSet, defStyleAttr, defStyleRes)
            1. super(context, AttributeSet, defStyleAttr, defStyleRes)
            2. ## View.class
               1. Constructor(context, AttributeSet, defStyleAttr, defStyleRes)
                  1. Constructor(context)
                     1. 초기화 mContext, mResources, mViewFlags, mPrivateFlags2, mTouchSlop, setOverScrollMode, mUserPaddingStart, mUserPaddingEnd
                     2. mRenderNode = RenderNode.create(getClass().getName(), this);
                        1. new RenderNode(name, owningView);
                     3. targetSdkVersion, sUseBrokenMakeMeasureSpec, sIgnoreMeasureCache, ... : (true / false)
                  2. final TypedArray a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.View, defStyleAttr, defStyleRes);
                     1. saveAttributeData(AttributeSet, a)
                     2. Drawable background, leftPadding, topPadding, ..., x, y, scrollbarStyle, ...
                     3. final int N = a.getIndexCount();
                     4. for (int i = 0; i < N; i++) { switch - case for View_paddingHorizontal etc.. setting }
                  3. a.recycle()

# [View explorer from Button.class to View.class]()
* ## Button.class 부터 View.class 까지 가보기
1. ## Button.class
   1. Constructor(context, AttributeSet, defStyleAttr, defStyleRes)
      1. super(context, AttributeSet, defStyleAttr, defStyleRes)
      2. ## TextView.class
         1. Constructor(context, AttributeSet, defStyleAttr, defStyleRes) implements ViewTreeObserver.OnPreDrawListener
            1. super(context, AttributeSet, defStyleAttr, defStyleRes)
            2. ## View.class
               1. Constructor(context, AttributeSet, defStyleAttr, defStyleRes)

# [ViewTreeObserver.OnPreDrawListener]()
* ## implement 했던 ViewTreeObserver.OnPreDrawListener 확인하기
1. ## android.view.View#onMeasure (int widthMeasureSpec, int heightMeasureSpec) : 현재 뷰와 자식들의 크기 요구를 확인
   1. Called to determine the size requirements for this view and all of its children.
   2. be invoked by measure(int, int)
   3. setMeasuredDimension(int, int) : must be called to store measurement
   4. Failure will trigger IllegalStateException, thrown by measure(int, int)
   5. #### Mode = MeasureSpec.AT_MOST(match_parent) / EXACTLY(wrap_content) / UNSPECIFIED
   6. #### Size = can be width, height as Mode
   7. #### setMeasuredDimension(width, height);
2. ## android.view.View#onLayout : 현재 뷰와 자식들의 크기 할당
   1. Called when this view should assign a size and position to all of its children.
3. ## android.view.View#onDraw : 그리기
   1. Called when the view should render its content.
4. @Override public boolean onPreDraw() : 그리기 전 해야할 것들(?)