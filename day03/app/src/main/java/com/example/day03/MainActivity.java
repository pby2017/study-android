package com.example.day03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day03.example01.Login;
import com.example.day03.example02.LinearActivity;
import com.example.day03.example02.LinearActivity02;
import com.example.day03.example03.RelativeActivity02;
import com.example.day03.practice01.LoginLinearActivity;
import com.example.day03.practice01.LoginRelativeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartLoginActivity;
    private Button buttonStartLinearActivity;
    private Button buttonStartLinearActivity02;
    private Button buttonStartRelativeActivity;
    private Button buttonStartRelativeActivity02;
    private Button buttonStartRelativeActivity03;
    private Button buttonStartLoginLinearActivity;
    private Button buttonStartLoginRelativeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_login_activity:
                startActivity(new Intent(getApplicationContext(), Login.class));
                break;
            case R.id.button_start_linear_activity:
                startActivity(new Intent(getApplicationContext(), LinearActivity.class));
                break;
            case R.id.button_start_linear_activity02:
                startActivity(new Intent(getApplicationContext(), LinearActivity02.class));
                break;
            case R.id.button_start_relative_activity:
                startActivity(new Intent(getApplicationContext(), RelativeActivity02.class));
                break;
            case R.id.button_start_relative_activity02:
                startActivity(new Intent(getApplicationContext(), RelativeActivity02.class));
                break;
            case R.id.button_start_relative_activity03:
                startActivity(new Intent(getApplicationContext(), RelativeActivity02.class));
                break;
            case R.id.button_start_login_linear_activity:
                startActivity(new Intent(getApplicationContext(), LoginLinearActivity.class));
                break;
            case R.id.button_start_login_relative_activity:
                startActivity(new Intent(getApplicationContext(), LoginRelativeActivity.class));
                break;
        }
    }

    private void initView() {

        buttonStartLoginActivity = findViewById(R.id.button_start_login_activity);
        buttonStartLinearActivity = findViewById(R.id.button_start_linear_activity);
        buttonStartLinearActivity02 = findViewById(R.id.button_start_linear_activity02);
        buttonStartRelativeActivity = findViewById(R.id.button_start_relative_activity);
        buttonStartRelativeActivity02 = findViewById(R.id.button_start_relative_activity02);
        buttonStartRelativeActivity03 = findViewById(R.id.button_start_relative_activity03);
        buttonStartLoginLinearActivity = findViewById(R.id.button_start_login_linear_activity);
        buttonStartLoginRelativeActivity = findViewById(R.id.button_start_login_relative_activity);

        buttonStartLoginActivity.setOnClickListener(this);
        buttonStartLinearActivity.setOnClickListener(this);
        buttonStartLinearActivity02.setOnClickListener(this);
        buttonStartRelativeActivity.setOnClickListener(this);
        buttonStartRelativeActivity02.setOnClickListener(this);
        buttonStartRelativeActivity03.setOnClickListener(this);
        buttonStartLoginLinearActivity.setOnClickListener(this);
        buttonStartLoginRelativeActivity.setOnClickListener(this);
    }

}
