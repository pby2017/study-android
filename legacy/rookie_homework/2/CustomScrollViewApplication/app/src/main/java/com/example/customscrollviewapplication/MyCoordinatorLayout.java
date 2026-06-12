package com.example.customscrollviewapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static com.example.customscrollviewapplication.constant.MyConstant.MY_COORDINATOR_TAG;

public class MyCoordinatorLayout extends CoordinatorLayout {

    public MyCoordinatorLayout(@NonNull Context context) {
        super(context);
        Log.d(MY_COORDINATOR_TAG, "MyCoordinatorLayout(@NonNull Context context)");
    }

    public MyCoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(MY_COORDINATOR_TAG, "MyCoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attrs)");
    }

    public MyCoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(MY_COORDINATOR_TAG, "MyCoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr)");
    }

    @Override
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        Log.d(MY_COORDINATOR_TAG, "onStartNestedScroll(View child, View target, int axes, int type)");
        return super.onStartNestedScroll(child, target, axes, type);
    }

    @Override
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes, int type) {
        super.onNestedScrollAccepted(child, target, nestedScrollAxes, type);
        Log.d(MY_COORDINATOR_TAG, "onNestedScrollAccepted(View child, View target, int nestedScrollAxes, int type)");
    }

    @Override
    public void onStopNestedScroll(View target, int type) {
        super.onStopNestedScroll(target, type);
        Log.d(MY_COORDINATOR_TAG, "onStopNestedScroll(View target, int type)");
    }

    @Override
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        super.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        Log.d(MY_COORDINATOR_TAG, "onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type)");
    }

    @Override
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        super.onNestedPreScroll(target, dx, dy, consumed, type);
        Log.d(MY_COORDINATOR_TAG, "onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type)");
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        Log.d(MY_COORDINATOR_TAG, "onScrollChanged(int l, int t, int oldl, int oldt)");
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        Log.d(MY_COORDINATOR_TAG, "onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY)");
    }

    @Override
    public boolean startNestedScroll(int axes) {
        Log.d(MY_COORDINATOR_TAG, "startNestedScroll(int axes) ");
        return super.startNestedScroll(axes);
    }

    @Override
    public void stopNestedScroll() {
        super.stopNestedScroll();
        Log.d(MY_COORDINATOR_TAG, "stopNestedScroll()");
    }
}
