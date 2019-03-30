package com.example.day05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day05.example01.ClockActivity;
import com.example.day05.example02.PickerActivity;
import com.example.day05.example03.AutoCompleteActivity;
import com.example.day05.example04.BarActivity;
import com.example.day05.example05.ScrollActivity;
import com.example.day05.example05.SlidingDrawerActivity;
import com.example.day05.practice01.SelectPickerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartClockActivity;
    private Button buttonStartPickerActivity;
    private Button buttonStartSelectPickerActivity;
    private Button buttonStartAutoCompleteActivity;
    private Button buttonStartBarActivity;
    private Button buttonStartScrollActivity;
    private Button buttonStartSlidingDrawerActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_clock_activity:
                startActivity(new Intent(getApplicationContext(), ClockActivity.class));
                break;
            case R.id.button_start_picker_activity:
                startActivity(new Intent(getApplicationContext(), PickerActivity.class));
                break;
            case R.id.button_start_select_picker_activity:
                startActivity(new Intent(getApplicationContext(), SelectPickerActivity.class));
                break;
            case R.id.button_start_auto_complete_activity:
                startActivity(new Intent(getApplicationContext(), AutoCompleteActivity.class));
                break;
            case R.id.button_start_bar_activity:
                startActivity(new Intent(getApplicationContext(), BarActivity.class));
                break;
            case R.id.button_start_scroll_activity:
                startActivity(new Intent(getApplicationContext(), ScrollActivity.class));
                break;
            case R.id.button_start_sliding_drawer_activity:
                startActivity(new Intent(getApplicationContext(), SlidingDrawerActivity.class));
                break;
        }
    }

    private void initView() {
        buttonStartClockActivity = findViewById(R.id.button_start_clock_activity);
        buttonStartPickerActivity = findViewById(R.id.button_start_picker_activity);
        buttonStartSelectPickerActivity = findViewById(R.id.button_start_select_picker_activity);
        buttonStartAutoCompleteActivity = findViewById(R.id.button_start_auto_complete_activity);
        buttonStartBarActivity = findViewById(R.id.button_start_bar_activity);
        buttonStartScrollActivity = findViewById(R.id.button_start_scroll_activity);
        buttonStartSlidingDrawerActivity = findViewById(R.id.button_start_sliding_drawer_activity);
        
        buttonStartClockActivity.setOnClickListener(this);
        buttonStartPickerActivity.setOnClickListener(this);
        buttonStartSelectPickerActivity.setOnClickListener(this);
        buttonStartAutoCompleteActivity.setOnClickListener(this);
        buttonStartBarActivity.setOnClickListener(this);
        buttonStartScrollActivity.setOnClickListener(this);
        buttonStartSlidingDrawerActivity.setOnClickListener(this);
    }
}