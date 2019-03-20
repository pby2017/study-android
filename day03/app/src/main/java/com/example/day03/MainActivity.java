package com.example.day03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day03.example01.Login;
import com.example.day03.example02.LinearLayoutActivity;
import com.example.day03.example02.LinearLayoutActivity02;

public class MainActivity extends AppCompatActivity {

    Button btn_example01;
    Button btn_example02;
    Button btn_example02_01;
    Button btn_example02_02;
    Button btn_example03;
    Button btn_example03_02;
    Button btn_example03_03;
    Button btn_practice_linear_layout;
    Button btn_practice_relative_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_example01 = (Button) findViewById(R.id.btn_example01);
        btn_example02 = (Button) findViewById(R.id.btn_example02);
        btn_example02_01 = (Button) findViewById(R.id.btn_example02_02);
        btn_example03 = (Button) findViewById(R.id.btn_example03);
        btn_example03_02 = (Button) findViewById(R.id.btn_example03_02);
        btn_example03_03 = (Button) findViewById(R.id.btn_example03_03);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_example01:
                        startActivity(new Intent(getApplicationContext(), Login.class));
                        break;
                    case R.id.btn_example02:
                        startActivity(new Intent(getApplicationContext(), LinearLayoutActivity.class));
                        break;
                    case R.id.btn_example02_02:
                        startActivity(new Intent(getApplicationContext(), LinearLayoutActivity02.class));
                        break;
                    case R.id.btn_example03:
                        startActivity(new Intent(getApplicationContext(), LinearLayoutActivity02.class));
                        break;
                    case R.id.btn_example03_02:
                        startActivity(new Intent(getApplicationContext(), LinearLayoutActivity02.class));
                        break;
                    case R.id.btn_example03_03:
                        startActivity(new Intent(getApplicationContext(), LinearLayoutActivity02.class));
                        break;
                }
            }
        };

        btn_example01.setOnClickListener(listener);
        btn_example02.setOnClickListener(listener);
        btn_example02_02.setOnClickListener(listener);
        btn_example03.setOnClickListener(listener);
        btn_example03_02.setOnClickListener(listener);
        btn_example03_03.setOnClickListener(listener);
        btn_practice_linear_layout.setOnClickListener(listener);
        btn_practice_relative_layout.setOnClickListener(listener);
    }
}
