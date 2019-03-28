package com.example.day09.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.day09.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup01;
    Button buttonOk01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();

        setViewOnClickListener();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_ok01:
                switch (radioGroup01.getCheckedRadioButtonId()) {
                    case R.id.radio_button_make_toast_message:
                        Toast.makeText(SecondActivity.this, "두 번째 액티비티입니다.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button_finish_second_activity:
                        finish();
                        break;
                }
                break;
        }
    }

    private void initView() {

        radioGroup01 = (RadioGroup) findViewById(R.id.radio_group01);
        buttonOk01 = (Button) findViewById(R.id.button_ok01);
    }

    private void setViewOnClickListener() {
        buttonOk01.setOnClickListener(SecondActivity.this);
    }


}
