package com.example.day11.example02;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.day11.R;

public class VerticalHorizontalFragmentActivity extends AppCompatActivity {

    private Fragment firstFragment;
    private Fragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_horizontal_fragment);

        initView();

        inflateFragment();
    }

    private void initView() {
        firstFragment = new LandFirstFragment();
        secondFragment = new LandSecondFragment();
    }

    private void inflateFragment() {
        if (isVerticalScreen()) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_fragment_container_vertical, firstFragment)
                    .commit();
        } else {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_fragment_container_horizontal_left, firstFragment)
                    .add(R.id.frame_fragment_container_horizontal_right, secondFragment)
                    .commit();
        }
    }

    private boolean isVerticalScreen() {
        Point pt = new Point();
        getWindowManager().getDefaultDisplay().getSize(pt);
        ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay().getSize(pt);
        int width = pt.x;
        int height = pt.y;

        if (height >= width) {
            return true;
        } else {
            return false;
        }
    }
}
