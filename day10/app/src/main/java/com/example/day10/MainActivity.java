package com.example.day10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day10.example01.IntentActionViewActivity;
import com.example.day10.example02.ExternalDesignLibraryActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartIntentActionViewActivity;
    private Button buttonStartExternalDesignLibraryActivity;

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
            case R.id.button_start_intent_action_view_activity:
                startActivity(new Intent(MainActivity.this, IntentActionViewActivity.class));
                break;
            case R.id.button_start_external_design_library_activity:
                startActivity(new Intent(MainActivity.this, ExternalDesignLibraryActivity.class));
                break;
        }
    }

    private void initView() {
        buttonStartIntentActionViewActivity = (Button) findViewById(R.id.button_start_intent_action_view_activity);
        buttonStartExternalDesignLibraryActivity = (Button) findViewById(R.id.button_start_external_design_library_activity);
    }

    private void setViewOnClickListener() {
        buttonStartIntentActionViewActivity.setOnClickListener(MainActivity.this);
        buttonStartExternalDesignLibraryActivity.setOnClickListener(MainActivity.this);
    }

}
