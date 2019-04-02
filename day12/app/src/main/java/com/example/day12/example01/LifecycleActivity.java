package com.example.day12.example01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.day12.R;

public class LifecycleActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "sample_lifecycle_act";

    private Button changeFragmentLocationButton;
    private Button fragmentCountUpButton;
    private Button fragment02CountUpButton;
    private Fragment sampleFragment;
    private Fragment sampleFragment02;

    private boolean isFirstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d(TAG, "[Activity] onCreate()");

        initView();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.linear_fragment_container, sampleFragment)
                    .commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "[Activity] onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "[Activity] onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "[Activity] onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[Activity] onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "[Activity] onRestart()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_change_fragment_location:
                if (!isFirstFragment) {
                    changeFragmentLocation(sampleFragment02);
                } else {
                    changeFragmentLocation(sampleFragment);
                }
                isFirstFragment = !isFirstFragment;
                break;
            case R.id.button_fragment_count_up:
//                sampleFragment.countUp();
                break;
            case R.id.button_fragment02_count_up:
//                sampleFragment02.countUp();
                break;
        }
    }

    private void initView() {
        changeFragmentLocationButton = findViewById(R.id.button_change_fragment_location);
        changeFragmentLocationButton.setOnClickListener(this);

        fragmentCountUpButton = findViewById(R.id.button_fragment_count_up);
        fragmentCountUpButton.setOnClickListener(this);

        fragment02CountUpButton = findViewById(R.id.button_fragment02_count_up);
        fragment02CountUpButton.setOnClickListener(this);

        sampleFragment = new SampleFragment();
        sampleFragment02 = new SampleFragment02();
    }

    private void changeFragmentLocation(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.linear_fragment_container, fragment)
                .commit();
    }
}
