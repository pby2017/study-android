package com.example.day12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day12.example01.LifecycleActivity;
import com.example.day12.example02.DatabaseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startLifeCycleActivityButton;
    private Button startDatabaseActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_lifecycle_activity:
                startActivity(new Intent(this, LifecycleActivity.class));
                break;
            case R.id.button_start_database_activity:
                startActivity(new Intent(this, DatabaseActivity.class));
                break;
        }
    }

    private void initView() {
        startLifeCycleActivityButton = findViewById(R.id.button_start_lifecycle_activity);
        startLifeCycleActivityButton.setOnClickListener(this);
        startDatabaseActivityButton = findViewById(R.id.button_start_database_activity);
        startDatabaseActivityButton.setOnClickListener(this);
    }

}
