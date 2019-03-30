package com.example.day02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day02.example01.ViewAttributeActivity;
import com.example.day02.example02.LoginActivity;
import com.example.day02.example03.CheckBoxActivity;
import com.example.day02.example04.RadioButtonActivity;
import com.example.day02.example05.SwitchToggleActivity;
import com.example.day02.example06.ImageActivity;
import com.example.day02.practice01.ChoiceImageActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartViewAttrActivity;
    private Button buttonStartLoginActivity;
    private Button buttonStartCheckBoxActivity;
    private Button buttonStartRadioButtonActivity;
    private Button buttonStartSwitchToggleActivity;
    private Button buttonStartImageActivity;
    private Button buttonStartChoiceImageActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        buttonStartViewAttrActivity.setOnClickListener(this);
        buttonStartLoginActivity.setOnClickListener(this);
        buttonStartCheckBoxActivity.setOnClickListener(this);
        buttonStartRadioButtonActivity.setOnClickListener(this);
        buttonStartSwitchToggleActivity.setOnClickListener(this);
        buttonStartImageActivity.setOnClickListener(this);
        buttonStartChoiceImageActivity.setOnClickListener(this);
    }

    private void initView() {

        buttonStartViewAttrActivity = findViewById(R.id.button_start_view_attr_activity);
        buttonStartLoginActivity = findViewById(R.id.button_start_login_activity);
        buttonStartCheckBoxActivity = findViewById(R.id.button_start_check_box_activity);
        buttonStartRadioButtonActivity = findViewById(R.id.button_start_radio_button_activity);
        buttonStartSwitchToggleActivity = findViewById(R.id.button_start_switch_toggle_activity);
        buttonStartImageActivity = findViewById(R.id.button_start_image_activity);
        buttonStartChoiceImageActivity = findViewById(R.id.button_choice_image_activity);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_view_attr_activity:
                startActivity(new Intent(getApplicationContext(), ViewAttributeActivity.class));
                break;
            case R.id.button_start_login_activity:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;
            case R.id.button_start_check_box_activity:
                startActivity(new Intent(getApplicationContext(), CheckBoxActivity.class));
                break;
            case R.id.button_start_radio_button_activity:
                startActivity(new Intent(getApplicationContext(), RadioButtonActivity.class));
                break;
            case R.id.button_start_switch_toggle_activity:
                startActivity(new Intent(getApplicationContext(), SwitchToggleActivity.class));
                break;
            case R.id.button_start_image_activity:
                startActivity(new Intent(getApplicationContext(), ImageActivity.class));
                break;
            case R.id.button_choice_image_activity:
                startActivity(new Intent(getApplicationContext(), ChoiceImageActivity.class));
                break;
        }
    }
}
