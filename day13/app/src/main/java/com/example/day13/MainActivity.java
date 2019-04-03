package com.example.day13;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day13.example01.AsyncTaskActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startAsyncTaskActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_async_task_activity:
                startActivity(new Intent(this, AsyncTaskActivity.class));
                break;
        }
    }

    private void initView() {
        startAsyncTaskActivityButton = findViewById(R.id.button_start_async_task_activity);
        startAsyncTaskActivityButton.setOnClickListener(this);
    }
}
