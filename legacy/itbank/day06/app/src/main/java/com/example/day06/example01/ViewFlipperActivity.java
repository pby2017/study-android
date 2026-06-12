package com.example.day06.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.day06.R;

public class ViewFlipperActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonPrev;
    Button buttonAuto;
    Button buttonNext;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_prev:
                viewFlipper.showPrevious();
                break;
            case R.id.button_auto:
                if (viewFlipper.isFlipping()) {
                    viewFlipper.stopFlipping();
                } else {
                    viewFlipper.startFlipping();
                }
                break;
            case R.id.button_next:
                viewFlipper.showNext();
                break;
        }
    }

    private void initView() {
        buttonPrev = findViewById(R.id.button_prev);
        buttonAuto = findViewById(R.id.button_auto);
        buttonNext = findViewById(R.id.button_next);
        viewFlipper = findViewById(R.id.view_flipper);

        buttonPrev.setOnClickListener(this);
        buttonAuto.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
    }
}
