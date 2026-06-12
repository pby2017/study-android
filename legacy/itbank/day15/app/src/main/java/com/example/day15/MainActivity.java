package com.example.day15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day15.example01.MyRecyclerViewActivity;
import com.example.day15.example02.CreateInnerDatabaseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startRecyclerViewActivityButton;
    private Button startCreateInnerDatabaseActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_recycler_view_activity:
                startActivity(new Intent(this, MyRecyclerViewActivity.class));
                break;
            case R.id.button_start_create_inner_database_activity:
                startActivity(new Intent(this, CreateInnerDatabaseActivity.class));
                break;
        }
    }

    private void initView() {
        startRecyclerViewActivityButton = findViewById(R.id.button_start_recycler_view_activity);
        startRecyclerViewActivityButton.setOnClickListener(this);
        startCreateInnerDatabaseActivityButton = findViewById(R.id.button_start_create_inner_database_activity);
        startCreateInnerDatabaseActivityButton.setOnClickListener(this);
    }
}