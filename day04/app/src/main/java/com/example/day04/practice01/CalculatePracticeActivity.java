package com.example.day04.practice01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.day04.R;

public class CalculatePracticeActivity extends AppCompatActivity {

    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_plus;
    private Button btn_minus;
    private Button btn_multiply;
    private Button btn_divide;
    private Button btn_point;
    private Button btn_equal;
    private EditText et_input;

    private boolean isInputedNumber;
    private char preSign;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_practice);

        initView();

        isInputedNumber = true;
        preSign = 0;
        result = 0;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(v.getId()){
                    case R.id.btn_0:
                        processInputNumber("0");
                        break;
                    case R.id.btn_1:
                        processInputNumber("1");
                        break;
                    case R.id.btn_2:
                        processInputNumber("2");
                        break;
                    case R.id.btn_3:
                        processInputNumber("3");
                        break;
                    case R.id.btn_4:
                        processInputNumber("4");
                        break;
                    case R.id.btn_5:
                        processInputNumber("5");
                        break;
                    case R.id.btn_6:
                        processInputNumber("6");
                        break;
                    case R.id.btn_7:
                        processInputNumber("7");
                        break;
                    case R.id.btn_8:
                        processInputNumber("8");
                        break;
                    case R.id.btn_9:
                        processInputNumber("9");
                        break;
                    case R.id.btn_plus:
                        preSign = '+';
                        break;
                    case R.id.btn_minus:
                        preSign = '-';
                        break;
                    case R.id.btn_multiply:
                        preSign = '*';
                        break;
                    case R.id.btn_divide:
                        preSign = '/';
                        break;
                    case R.id.btn_point:
                        processInputNumber(".");
                        break;
                    case R.id.btn_equal:
                        break;
                }
            }
        };

        btn_0.setOnClickListener(listener);
        btn_1.setOnClickListener(listener);
        btn_2.setOnClickListener(listener);
        btn_3.setOnClickListener(listener);
        btn_4.setOnClickListener(listener);
        btn_5.setOnClickListener(listener);
        btn_6.setOnClickListener(listener);
        btn_7.setOnClickListener(listener);
        btn_8.setOnClickListener(listener);
        btn_9.setOnClickListener(listener);
        btn_plus.setOnClickListener(listener);
        btn_minus.setOnClickListener(listener);
        btn_multiply.setOnClickListener(listener);
        btn_divide.setOnClickListener(listener);
        btn_point.setOnClickListener(listener);
        btn_equal.setOnClickListener(listener);
    }

    private void initView() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        et_input = (EditText) findViewById(R.id.et_input);
    }

    private void processInputNumber(String numberStr){
        if(isInputedNumber){
            et_input.setText(et_input.getText().toString()+numberStr);
        }
    }
}
