package com.example.day14;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day14.example01.RegisterAndLoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startRegisterAndLoginActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_register_and_login_activity:
                startActivity(new Intent(this, RegisterAndLoginActivity.class));
                break;
        }
    }

    private void initView() {
        startRegisterAndLoginActivityButton = findViewById(R.id.button_start_register_and_login_activity);
        startRegisterAndLoginActivityButton.setOnClickListener(this);
    }
}