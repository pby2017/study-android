package com.example.day19.example01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day19.R;

public class MySingletonActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startMySingletonActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_singleton);

        initView();

        initialize();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_start_my_singleton_test_activity:
                startActivity(new Intent(this, MySingletonTestActivity.class));
                break;
        }
    }

    private void initialize() {
        MySingleton.getINSTANCE().setData("BAAAM init");
    }

    private void initView() {
        startMySingletonActivityButton = findViewById(R.id.button_start_my_singleton_test_activity);
        startMySingletonActivityButton.setOnClickListener(this);
    }
}
