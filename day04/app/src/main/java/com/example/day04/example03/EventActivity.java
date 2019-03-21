package com.example.day04.example03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day04.R;

public class EventActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    private void method1() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼1 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼2 클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void method2() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        Toast.makeText(getApplicationContext(), "버튼1 클릭", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.btn2:
                        Toast.makeText(getApplicationContext(), "버튼2 클릭", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
    }
}
