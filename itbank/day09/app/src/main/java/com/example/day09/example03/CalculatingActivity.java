package com.example.day09.example03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static com.example.day09.example03.SendExtraReceiveResultActivity.CALCULATE_FIRST_INPUT;
import static com.example.day09.example03.SendExtraReceiveResultActivity.CALCULATE_METHOD;
import static com.example.day09.example03.SendExtraReceiveResultActivity.CALCULATE_RESULT_OUTPUT;
import static com.example.day09.example03.SendExtraReceiveResultActivity.CALCULATE_SECOND_INPUT;
import static com.example.day09.example03.SendExtraReceiveResultActivity.CALCULATE_SUCCESS;

public class CalculatingActivity extends AppCompatActivity {

    private final String CALCULATING_ACTIVITY = "calc_act";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(CALCULATING_ACTIVITY, "onCreate()");

        calculate();
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

    private void calculate() {
        Intent intent = getIntent();

        int methodNumber = intent.getIntExtra(CALCULATE_METHOD, -1);

        Intent containCalculatedValueIntent = new Intent(this, SendExtraReceiveResultActivity.class);
        int calculatedResult = intent.getIntExtra(CALCULATE_FIRST_INPUT, -1) + intent.getIntExtra(CALCULATE_SECOND_INPUT, -1);
        containCalculatedValueIntent.putExtra(CALCULATE_RESULT_OUTPUT, calculatedResult);

        switch (methodNumber) {
            case 1:
                setResult(CALCULATE_SUCCESS, containCalculatedValueIntent);
                finish();
                break;
            case 2:
                startActivity(containCalculatedValueIntent);
                break;
        }
    }
}
