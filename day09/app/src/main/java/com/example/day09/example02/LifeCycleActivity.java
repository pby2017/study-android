package com.example.day09.example02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.day09.R;

public class LifeCycleActivity extends AppCompatActivity {

    private final String LIFECYCLE = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LIFECYCLE, "onCreate()");
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LIFECYCLE, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LIFECYCLE, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LIFECYCLE, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LIFECYCLE, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LIFECYCLE, "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LIFECYCLE, "onRestart()");
    }
}
