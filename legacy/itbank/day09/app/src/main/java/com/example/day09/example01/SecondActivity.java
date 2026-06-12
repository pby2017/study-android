package com.example.day09.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.day09.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_ok:
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radio_button_make_toast_message:
                        Toast.makeText(this, "두 번째 액티비티입니다.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button_finish_second_activity:
                        finish();
                        break;
                }
                break;
        }
    }

    private void initView() {

        radioGroup = findViewById(R.id.radio_group);
        okButton = findViewById(R.id.button_ok);
        okButton.setOnClickListener(this);
    }


}
