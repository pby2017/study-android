package com.example.day05.practice01;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.day05.R;

public class SelectPickerActivity extends AppCompatActivity implements View.OnClickListener {

    private Chronometer chronometerCheckTime;
    private LinearLayout linearSelectPicker;
    private RadioGroup radioGroupSelectPicker;
    private RadioButton radiobuttonDatePicker;
    private RadioButton radioButtonTimePicker;
    private RelativeLayout relativePicker;
    private DatePicker datePicker;
    private TimePicker timePicker;
    private Button buttonShowPickerValueSelected;
    private TextView textPickerValueSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_picker);

        setTitle("예약");

        initView();

        setViewInvisibility();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chronometer_check_time:
                chronometerCheckTime.start();
                chronometerCheckTime.setTextColor(Color.RED);
                linearSelectPicker.setVisibility(View.VISIBLE);
                break;
            case R.id.radio_button_date_picker:
                timePicker.setVisibility(View.INVISIBLE);
                if (relativePicker.getVisibility() != View.VISIBLE) {
                    relativePicker.setVisibility(View.VISIBLE);
                }
                datePicker.setVisibility(View.VISIBLE);
                break;
            case R.id.radio_button_time_picker:
                datePicker.setVisibility(View.INVISIBLE);
                if (relativePicker.getVisibility() != View.VISIBLE) {
                    relativePicker.setVisibility(View.VISIBLE);
                }
                timePicker.setVisibility(View.VISIBLE);
                break;
            case R.id.button_show_picker_value_selected:
                if (datePicker.getVisibility() == View.VISIBLE) {
                    int yearInt = datePicker.getYear();
                    int monthInt = datePicker.getMonth() + 1;
                    int dayOfMonthInt = datePicker.getDayOfMonth();
                    String dateSelectedString = String.format("선택한 날짜는 %d년 %d월 %d일 입니다.", yearInt, monthInt, dayOfMonthInt);
                    textPickerValueSelected.setText(dateSelectedString);
                } else if (timePicker.getVisibility() == View.VISIBLE) {
                    int hourInt = timePicker.getHour();
                    int minuteInt = timePicker.getMinute();
                    String timeSelectedString = String.format("선택한 시간은 %d시 %d분 입니다.", hourInt, minuteInt);
                    textPickerValueSelected.setText(timeSelectedString);
                }
                break;
        }
    }

    private void initView() {
        chronometerCheckTime = findViewById(R.id.chronometer_check_time);
        linearSelectPicker = findViewById(R.id.linear_select_picker);
        radioGroupSelectPicker = findViewById(R.id.radio_group_select_picker);
        radiobuttonDatePicker = findViewById(R.id.radio_button_date_picker);
        radioButtonTimePicker = findViewById(R.id.radio_button_time_picker);
        relativePicker = findViewById(R.id.relative_picker);
        datePicker = findViewById(R.id.date_picker);
        timePicker = findViewById(R.id.time_picker);
        buttonShowPickerValueSelected = findViewById(R.id.button_show_picker_value_selected);
        textPickerValueSelected = findViewById(R.id.text_picker_value_selected);

        chronometerCheckTime.setOnClickListener(this);
        linearSelectPicker.setOnClickListener(this);
        radioGroupSelectPicker.setOnClickListener(this);
        radiobuttonDatePicker.setOnClickListener(this);
        radioButtonTimePicker.setOnClickListener(this);
        datePicker.setOnClickListener(this);
        timePicker.setOnClickListener(this);
        buttonShowPickerValueSelected.setOnClickListener(this);
    }

    private void setViewInvisibility() {
        linearSelectPicker.setVisibility(View.INVISIBLE);
        relativePicker.setVisibility(View.INVISIBLE);
        datePicker.setVisibility(View.INVISIBLE);
        timePicker.setVisibility(View.INVISIBLE);
    }
}
