package com.example.customcircleapplication;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.example.customcircleapplication.custom.CustomStrokedCircleView;
import com.example.customcircleapplication.custom.MyDragShadowBuilder;

public class MainActivity extends AppCompatActivity implements View.OnDragListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private FrameLayout forDragFrame;
    private CustomStrokedCircleView customStrokedCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        forDragFrame = findViewById(R.id.frame_for_drag);
        forDragFrame.setOnDragListener(this);

        customStrokedCircleView = findViewById(R.id.custom_stroked_circle);
        customStrokedCircleView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                View.DragShadowBuilder myShadow = new MyDragShadowBuilder(customStrokedCircleView);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(null, myShadow, null, 0);
                } else {
                    v.startDrag(null, myShadow, null, 0);
                }
                return true;
            }
        });
        customStrokedCircleView.setOnDragListener(this);
    }

    /*
     * ACTION_DRAG_STARTED = 1
     * ACTION_DRAG_LOCATION = 2
     * ACTION_DROP = 3
     * ACTION_DRAG_ENDED = 4
     * ACTION_DRAG_ENTERED = 5
     * ACTION_DRAG_EXITED = 6
     * */
    @Override
    public boolean onDrag(View v, DragEvent event) {
        Log.d(TAG, String.format("onDrag() - %s / event: %d", v.getClass().getSimpleName(), event.getAction()));

        final int action = event.getAction();
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                break;
            case DragEvent.ACTION_DRAG_LOCATION:
                break;
            case DragEvent.ACTION_DROP:
                Log.d(TAG, String.format("onDrag() - event.x: %f, event.y: %f", event.getX(), event.getY()));
                v.setX(event.getX());
                v.setY(event.getY());
                v.invalidate();
//                v.requestLayout();
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                v.setBackgroundColor(Color.WHITE);
                v.bringToFront();
//                v.invalidate();
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                v.setBackgroundColor(Color.GREEN);
//                v.invalidate();
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                v.setBackgroundColor(Color.BLUE);
//                v.invalidate();
                break;
            default:
                Log.e("DragDrop Example", "Unknown action type received by OnDragListener.");
                break;
        }
        return true;
    }
}
