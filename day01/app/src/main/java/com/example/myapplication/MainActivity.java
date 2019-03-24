package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.example01.ButtonClickActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStartButtonClickActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        buttonStartButtonClickActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_button_click_activity:
                startActivity(new Intent(getApplicationContext(), ButtonClickActivity.class));
                break;
        }
    }

    private void initView() {

        buttonStartButtonClickActivity = (Button) findViewById(R.id.button_start_button_click_activity);
    }
}