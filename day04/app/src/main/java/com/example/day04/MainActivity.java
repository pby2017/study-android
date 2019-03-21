package com.example.day04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.day04.example01.TableLayoutActivity;
import com.example.day04.example02.GridLayoutActivity;
import com.example.day04.example03.EventActivity;
import com.example.day04.practice01.CalculatePracticeActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_example01;
    Button btn_example02;
    Button btn_example03;
    Button btn_practice01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_example01 = (Button) findViewById(R.id.btn_example01);
        btn_example02 = (Button) findViewById(R.id.btn_example02);
        btn_example03 = (Button) findViewById(R.id.btn_example03);
        btn_practice01 = (Button) findViewById(R.id.btn_practice01);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_example01:
                        startActivity(new Intent(getApplicationContext(), TableLayoutActivity.class));
                        break;
                    case R.id.btn_example02:
                        startActivity(new Intent(getApplicationContext(), GridLayoutActivity.class));
                        break;
                    case R.id.btn_example03:
                        startActivity(new Intent(getApplicationContext(), EventActivity.class));
                        break;
                    case R.id.btn_practice01:
                        startActivity(new Intent(getApplicationContext(), CalculatePracticeActivity.class));
                        break;
                }
            }
        };

        btn_example01.setOnClickListener(listener);
        btn_example02.setOnClickListener(listener);
        btn_example03.setOnClickListener(listener);
        btn_practice01.setOnClickListener(listener);

    }
}
