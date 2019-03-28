package com.example.day09.example03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class CalculatingActivity extends AppCompatActivity {

    private final String CALCULATING_ACTIVITY = "calc_act";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(CALCULATING_ACTIVITY, "onCreate()");

        Intent intent = getIntent();

        int methodNumber = intent.getIntExtra("methodNumber", -1);

        Intent containCalculatedValueIntent = new Intent(CalculatingActivity.this, SendExtraReceiveResultActivity.class);
        int calculatedResult = intent.getIntExtra("first", -1) + intent.getIntExtra("second", -1);
        containCalculatedValueIntent.putExtra("result", calculatedResult);

        switch (methodNumber) {
            case 1:
                setResult(1234, containCalculatedValueIntent);
                finish();
                break;
            case 2:
                startActivity(containCalculatedValueIntent);
                break;
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(CALCULATING_ACTIVITY, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(CALCULATING_ACTIVITY, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(CALCULATING_ACTIVITY, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(CALCULATING_ACTIVITY, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(CALCULATING_ACTIVITY, "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(CALCULATING_ACTIVITY, "onRestart()");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(CALCULATING_ACTIVITY, "onNewIntent()");
    }
}
