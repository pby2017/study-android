package com.example.customcircleapplication.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.customcircleapplication.R;

public class CustomStrokedCircleView extends View {

    private static final String TAG = CustomStrokedCircleView.class.getSimpleName();

    private Paint strokeCirclePaint;
    private Paint circlePaint;

    private float strokeWidth;
    private float radius;

    private float x;
    private float y;

    public CustomStrokedCircleView(Context context) {
        this(context, null);
        Log.d(TAG, "CustomStrokedCircleView() 1");
    }

    public CustomStrokedCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
        Log.d(TAG, "CustomStrokedCircleView() 2");
    }

    public CustomStrokedCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
        Log.d(TAG, "CustomStrokedCircleView() 3");
    }

    public CustomStrokedCircleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        Log.d(TAG, "CustomStrokedCircleView() 4");
        Log.d(TAG, String.format("CustomStrokedCircleView() 4 - getWidth: %d, getHeight: %d", getWidth(), getHeight()));
        Log.d(TAG, String.format("CustomStrokedCircleView() 4 - getMeasuredWidth: %d, getMeasuredHeight: %d, getMeasuredState(): %d", getMeasuredWidth(), getMeasuredHeight(), getMeasuredState()));

        TypedArray attributes = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomStrokedCircleView,
                0, 0);

        strokeWidth = attributes.getFloat(R.styleable.CustomStrokedCircleView_setStrokeWidth, 20f);
        radius = attributes.getFloat(R.styleable.CustomStrokedCircleView_setRadius, 0);

        attributes.recycle();

        strokeCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        strokeCirclePaint.setColor(Color.BLACK);
        strokeCirclePaint.setStrokeWidth(strokeWidth);
        strokeCirclePaint.setStyle(Paint.Style.STROKE);

        circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint.setColor(Color.RED);

        Log.d(TAG, String.format("strokeWidth: %f, radius: %f", strokeWidth, radius));
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "onMeasure()");
        Log.d(TAG, String.format("onMeasure() - widthMeasureSpec: %d, heightMeasureSpec: %d", widthMeasureSpec, heightMeasureSpec));
        Log.d(TAG, String.format("onMeasure() - MeasureSpec.getSize(widthMeasureSpec): %d, MeasureSpec.getSize(heightMeasureSpec): %d", MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(heightMeasureSpec)));
        Log.d(TAG, String.format("onMeasure() - getMeasuredWidth: %d, getMeasuredHeight: %d, getMeasuredState(): %d", getMeasuredWidth(), getMeasuredHeight(), getMeasuredState()));
        // 0
        Log.d(TAG, String.format("onMeasure() - getWidth: %d, getHeight: %d", getWidth(), getHeight()));

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int width = 0;
        int height = 0;

        switch (widthMode) {
            case MeasureSpec.UNSPECIFIED:
                Log.d(TAG, "onMeasure() - widthMode: MeasureSpec.UNSPECIFIED");
                width = widthMeasureSpec;
                break;
            case MeasureSpec.EXACTLY:
                Log.d(TAG, "onMeasure() - widthMode: MeasureSpec.EXACTLY");
                width = MeasureSpec.getSize(widthMeasureSpec);
                break;
            case MeasureSpec.AT_MOST:
                Log.d(TAG, String.format("onMeasure() - widthMode: MeasureSpec.AT_MOST, getMeasuredWidth(): %d", getMeasuredWidth()));
                width = getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth()
//                        + getMeasuredWidth()
                        + (int)strokeWidth * 2 + (int)radius * 2;
                break;
        }

        switch (heightMode) {
            case MeasureSpec.UNSPECIFIED:
                Log.d(TAG, "onMeasure() - heightMode: MeasureSpec.UNSPECIFIED");
                height = heightMeasureSpec;
                break;
            case MeasureSpec.EXACTLY:
                Log.d(TAG, "onMeasure() - heightMode: MeasureSpec.EXACTLY");
                height = MeasureSpec.getSize(heightMeasureSpec);
                break;
            case MeasureSpec.AT_MOST:
                Log.d(TAG, "onMeasure() - heightMode: MeasureSpec.AT_MOST");
                height = getPaddingTop() + getPaddingBottom() + getSuggestedMinimumHeight()
//                        + getMeasuredHeight()
                        + (int)strokeWidth * 2 + (int)radius * 2;
                break;
        }

        setMeasuredDimension(width, height);

        Log.d(TAG, String.format("onMeasure() - radius: %f", radius));
        Log.d(TAG, String.format("onMeasure() - widthMode: %d / width: %d, heightMode: %d / height: %d", widthMode, width, heightMode, height));
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "onLayout()");
        Log.d(TAG, String.format("onLayout() - changed: %b, left: %d, top: %d, right: %d, bottom: %d", changed, left, top, right, bottom));
        Log.d(TAG, String.format("onLayout() - getWidth: %d, getHeight: %d", getWidth(), getHeight()));

        x = (float)getMeasuredWidth() / 2;
        y = (float)getMeasuredHeight() / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d(TAG, "onDraw()");

        // TODO: 왜 customView의 onClick() 이벤트가 호출될 때마다 onDraw()가 호출될까요? 동그라미의 radius가 계속 작아집니다.
//        if (radius == 0) {
//            radius = Math.min(halfOfWidth, halfOfHeight);
//        }
//        if (radius >= strokeWidth) {
//            radius = radius - strokeWidth;
//        }

        canvas.save();
        canvas.translate(x, y);
        canvas.drawCircle(0, 0, radius, strokeCirclePaint);
        canvas.restore();

        canvas.save();
        canvas.translate(x, y);
        canvas.drawCircle(0, 0, radius - (strokeCirclePaint.getStrokeWidth() / 2), circlePaint);
        canvas.restore();

//        canvas.drawCircle(0, 0, radius, strokeCirclePaint);
//        canvas.drawCircle(0, 0, radius - (strokeCirclePaint.getStrokeWidth() / 2), circlePaint);
//
//        canvas.save();
//        canvas.translate(halfOfWidth * 2, halfOfHeight * 2);
//        canvas.drawCircle(0, 0, radius, strokeCirclePaint);
//        canvas.drawCircle(0, 0, radius - (strokeCirclePaint.getStrokeWidth() / 2), circlePaint);
//        canvas.restore();
//
//        canvas.save();
//        canvas.translate(0, halfOfHeight * 2);
//        canvas.drawCircle(0, 0, radius, strokeCirclePaint);
//        canvas.drawCircle(0, 0, radius - (strokeCirclePaint.getStrokeWidth() / 2), circlePaint);
//        canvas.restore();
//
//        canvas.save();
//        canvas.translate(halfOfWidth * 2, 0);
//        canvas.drawCircle(0, 0, radius, strokeCirclePaint);
//        canvas.drawCircle(0, 0, radius - (strokeCirclePaint.getStrokeWidth() / 2), circlePaint);
//        canvas.restore();

        Log.d(TAG, String.format("onDraw - getMeasuredWidth(): %d, getMeasuredHeight(): %d", getMeasuredWidth(), getMeasuredHeight()));
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }
}
