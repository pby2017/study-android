package com.example.day02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day02.example01.ViewAttrActivity;
import com.example.day02.example02.LoginActivity;
import com.example.day02.example03.CheckBoxActivity;
import com.example.day02.example04.RadioButtonActivity;
import com.example.day02.example05.SwitchToggleActivity;
import com.example.day02.example06.ImageActivity;
import com.example.day02.practice01.ChoiceImageActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_example01;
    Button btn_example02;
    Button btn_example03;
    Button btn_example04;
    Button btn_example05;
    Button btn_example06;
    Button btn_practice01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_example01 = (Button)findViewById(R.id.btn_example01);
        btn_example02 = (Button)findViewById(R.id.btn_example02);
        btn_example03 = (Button)findViewById(R.id.btn_example03);
        btn_example04 = (Button)findViewById(R.id.btn_example04);
        btn_example05 = (Button)findViewById(R.id.btn_example05);
        btn_example06 = (Button)findViewById(R.id.btn_example06);
        btn_practice01 = (Button)findViewById(R.id.btn_practice01);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_example01:
                        startActivity(new Intent(getApplicationContext(), ViewAttrActivity.class));
                        break;
                    case R.id.btn_example02:
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                        break;
                    case R.id.btn_example03:
                        startActivity(new Intent(getApplicationContext(), CheckBoxActivity.class));
                        break;
                    case R.id.btn_example04:
                        startActivity(new Intent(getApplicationContext(), RadioButtonActivity.class));
                        break;
                    case R.id.btn_example05:
                        startActivity(new Intent(getApplicationContext(), SwitchToggleActivity.class));
                        break;
                    case R.id.btn_example06:
                        startActivity(new Intent(getApplicationContext(), ImageActivity.class));
                        break;
                    case R.id.btn_practice01:
                        startActivity(new Intent(getApplicationContext(), ChoiceImageActivity.class));
                        break;
                }
            }
        };

        btn_example01.setOnClickListener(listener);
        btn_example02.setOnClickListener(listener);
        btn_example03.setOnClickListener(listener);
        btn_example04.setOnClickListener(listener);
        btn_example05.setOnClickListener(listener);
        btn_example06.setOnClickListener(listener);
        btn_practice01.setOnClickListener(listener);
    }
}
