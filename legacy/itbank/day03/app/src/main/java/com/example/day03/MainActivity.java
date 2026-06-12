package com.example.day03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day03.example01.Login;
import com.example.day03.example02.LinearActivity;
import com.example.day03.example02.LinearActivity02;
import com.example.day03.example03.RelativeActivity;
import com.example.day03.example03.RelativeActivity02;
import com.example.day03.example03.RelativeActivity03;
import com.example.day03.practice01.LoginLinearActivity;
import com.example.day03.practice01.LoginRelativeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startLoginActivityButton;
    private Button startLinearActivityButton;
    private Button startLinearActivityButton02;
    private Button startRelativeActivityButton;
    private Button startRelativeActivityButton02;
    private Button startRelativeActivityButton03;
    private Button startLoginLinearActivityButton;
    private Button startLoginRelativeActivityButton;

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
                startActivity(new Intent(getApplicationContext(), RelativeActivity.class));
                break;
            case R.id.button_start_relative_activity02:
                startActivity(new Intent(getApplicationContext(), RelativeActivity02.class));
                break;
            case R.id.button_start_relative_activity03:
                startActivity(new Intent(getApplicationContext(), RelativeActivity03.class));
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

        startLoginActivityButton = findViewById(R.id.button_start_login_activity);
        startLinearActivityButton = findViewById(R.id.button_start_linear_activity);
        startLinearActivityButton02 = findViewById(R.id.button_start_linear_activity02);
        startRelativeActivityButton = findViewById(R.id.button_start_relative_activity);
        startRelativeActivityButton02 = findViewById(R.id.button_start_relative_activity02);
        startRelativeActivityButton03 = findViewById(R.id.button_start_relative_activity03);
        startLoginLinearActivityButton = findViewById(R.id.button_start_login_linear_activity);
        startLoginRelativeActivityButton = findViewById(R.id.button_start_login_relative_activity);

        startLoginActivityButton.setOnClickListener(this);
        startLinearActivityButton.setOnClickListener(this);
        startLinearActivityButton02.setOnClickListener(this);
        startRelativeActivityButton.setOnClickListener(this);
        startRelativeActivityButton02.setOnClickListener(this);
        startRelativeActivityButton03.setOnClickListener(this);
        startLoginLinearActivityButton.setOnClickListener(this);
        startLoginRelativeActivityButton.setOnClickListener(this);
    }

}
