package com.example.day04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day04.example01.TableActivity;
import com.example.day04.example02.GridActivity;
import com.example.day04.example03.EventActivity;
import com.example.day04.practice01.CalculatorActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStartTableActivity;
    Button buttonStartGridActivity;
    Button buttonStartEventActivity;
    Button buttonStartCalculatorActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_table_activity:
                startActivity(new Intent(this, TableActivity.class));
                break;
            case R.id.button_start_Grid_activity:
                startActivity(new Intent(this, GridActivity.class));
                break;
            case R.id.button_start_event_activity:
                startActivity(new Intent(this, EventActivity.class));
                break;
            case R.id.button_start_calculator_activity:
                startActivity(new Intent(this, CalculatorActivity.class));
                break;
        }
    }

    private void initView() {
        buttonStartTableActivity = findViewById(R.id.button_start_table_activity);
        buttonStartGridActivity = findViewById(R.id.button_start_Grid_activity);
        buttonStartEventActivity = findViewById(R.id.button_start_event_activity);
        buttonStartCalculatorActivity = findViewById(R.id.button_start_calculator_activity);

        buttonStartTableActivity.setOnClickListener(this);
        buttonStartGridActivity.setOnClickListener(this);
        buttonStartEventActivity.setOnClickListener(this);
        buttonStartCalculatorActivity.setOnClickListener(this);
    }


}
