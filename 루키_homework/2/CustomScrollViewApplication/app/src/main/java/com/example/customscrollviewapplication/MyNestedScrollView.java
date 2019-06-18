package com.example.customscrollviewapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.util.Log;

import static com.example.customscrollviewapplication.constant.MyConstant.MY_NESTED_SCROLL_TAG;

public class MyNestedScrollView extends NestedScrollView {
    public MyNestedScrollView(@NonNull Context context) {
        super(context);
        Log.d(MY_NESTED_SCROLL_TAG, "MyNestedScrollView(@NonNull Context context)");
    }

    public MyNestedScrollView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(MY_NESTED_SCROLL_TAG, "MyNestedScrollView(@NonNull Context context, @Nullable AttributeSet attrs)");
    }

    public MyNestedScrollView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(MY_NESTED_SCROLL_TAG, "MyNestedScrollView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr)");
    }
}
