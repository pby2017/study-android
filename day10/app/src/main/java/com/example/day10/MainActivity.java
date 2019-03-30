package com.example.day10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day10.example01.IntentActionActivity;
import com.example.day10.example02.ExternalDesignLibraryActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startIntentActionActivityButton;
    private Button startExternalDesignLibraryActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_intent_action_activity:
                startActivity(new Intent(this, IntentActionActivity.class));
                break;
            case R.id.button_start_external_design_library_activity:
                startActivity(new Intent(this, ExternalDesignLibraryActivity.class));
                break;
        }
    }

    private void initView() {
        startIntentActionActivityButton = findViewById(R.id.button_start_intent_action_activity);
        startIntentActionActivityButton.setOnClickListener(this);

        startExternalDesignLibraryActivityButton = findViewById(R.id.button_start_external_design_library_activity);
        startExternalDesignLibraryActivityButton.setOnClickListener(this);
    }

}
