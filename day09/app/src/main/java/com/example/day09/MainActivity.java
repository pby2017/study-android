package com.example.day09;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day09.example01.SecondActivity;
import com.example.day09.example02.LifeCycleActivity;
import com.example.day09.example03.SendExtraReceiveResultActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartSecondActivity;
    private Button buttonStartLifeCycleActivity;
    private Button buttonStartSendExtraReceiveResultActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setViewOnClickListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_second_activity:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;
            case R.id.button_start_life_cycle_activity:
                startActivity(new Intent(MainActivity.this, LifeCycleActivity.class));
            case R.id.button_start_send_extra_receive_result_activity:
                startActivity(new Intent(MainActivity.this, SendExtraReceiveResultActivity.class));
        }
    }

    private void initView() {
        buttonStartSecondActivity = (Button) findViewById(R.id.button_start_second_activity);
        buttonStartLifeCycleActivity = (Button) findViewById(R.id.button_start_life_cycle_activity);
        buttonStartSendExtraReceiveResultActivity = (Button) findViewById(R.id.button_start_send_extra_receive_result_activity);
    }

    private void setViewOnClickListener() {
        buttonStartSecondActivity.setOnClickListener(MainActivity.this);
        buttonStartLifeCycleActivity.setOnClickListener(MainActivity.this);
        buttonStartSendExtraReceiveResultActivity.setOnClickListener(MainActivity.this);
    }
}
