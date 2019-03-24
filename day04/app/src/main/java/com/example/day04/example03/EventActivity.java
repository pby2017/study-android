package com.example.day04.example03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day04.R;

public class EventActivity extends AppCompatActivity {

    private Button button01;
    private Button button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    private void method1() {
        button01 = (Button) findViewById(R.id.button01);
        button02 = (Button) findViewById(R.id.button02);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼1 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼2 클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void method2() {
        button01 = (Button) findViewById(R.id.button01);
        button02 = (Button) findViewById(R.id.button02);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button01:
                        Toast.makeText(getApplicationContext(), "버튼1 클릭", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button02:
                        Toast.makeText(getApplicationContext(), "버튼2 클릭", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        button01.setOnClickListener(listener);
        button02.setOnClickListener(listener);
    }
}
