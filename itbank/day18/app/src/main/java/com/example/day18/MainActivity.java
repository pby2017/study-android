package com.example.day18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.day18.example01.MessageActivity;

import static com.example.day18.constant.CustomConstant.LogConstant.CUS_MAIN_ACTIVITY;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startMessageActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_message_activity:
                startActivity(new Intent(this, MessageActivity.class));
                Log.d(CUS_MAIN_ACTIVITY, "onClick(button_start_message_activity)");
                break;
        }
    }

    private void initView() {
        startMessageActivityButton = findViewById(R.id.button_start_message_activity);
        startMessageActivityButton.setOnClickListener(this);
    }
}

