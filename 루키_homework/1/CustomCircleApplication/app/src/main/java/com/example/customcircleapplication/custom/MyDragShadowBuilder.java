package com.example.customcircleapplication.custom;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

public class MyDragShadowBuilder extends View.DragShadowBuilder {

    private static final String TAG = MyDragShadowBuilder.class.getSimpleName();

    private static Drawable shadow;

    public MyDragShadowBuilder(View v) {
        super(v);
        shadow = new ColorDrawable(Color.LTGRAY);
    }

    @Override
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        Log.d(TAG, String.format("onProvideShadowMetrics - outShadowSize: x=%d, y=%d / outShadowTouchPoint: x=%d, y=%d", outShadowSize.x, outShadowSize.y, outShadowTouchPoint.x, outShadowTouchPoint.y));
        int width, height;

        width = getView().getWidth() / 2;
        height = getView().getHeight() / 2;

        shadow.setBounds(0, 0, width, height);

        outShadowSize.set(width, height);

        outShadowTouchPoint.set(width / 2, height / 2);

        Log.d(TAG, String.format("onProvideShadowMetrics - outShadowSize: x=%d, y=%d / outShadowTouchPoint: x=%d, y=%d", outShadowSize.x, outShadowSize.y, outShadowTouchPoint.x, outShadowTouchPoint.y));
    }

    @Override
    public void onDrawShadow(Canvas canvas) {
        Log.d(TAG, "onDrawShadow()");
        shadow.draw(canvas);
    }
}
