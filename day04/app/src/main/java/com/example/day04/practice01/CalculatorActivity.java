package com.example.day04.practice01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.day04.R;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivision;
    private Button buttonPoint;
    private Button buttonEqual;
    private Button buttonClearInput;
    private TextView textInput;
    private TextView textOutput;

    private boolean isInputingNumber;
    private boolean hasPointClicked;
    private char preSign;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        initView();

        setViewOnClickListener();

        isInputingNumber = true;
        preSign = 0;
        result = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                processInputNumber("0");
                break;
            case R.id.button1:
                processInputNumber("1");
                break;
            case R.id.button2:
                processInputNumber("2");
                break;
            case R.id.button3:
                processInputNumber("3");
                break;
            case R.id.button4:
                processInputNumber("4");
                break;
            case R.id.button5:
                processInputNumber("5");
                break;
            case R.id.button6:
                processInputNumber("6");
                break;
            case R.id.button7:
                processInputNumber("7");
                break;
            case R.id.button8:
                processInputNumber("8");
                break;
            case R.id.button9:
                processInputNumber("9");
                break;
            case R.id.button_plus:
                preSign = '+';
                break;
            case R.id.button_minus:
                preSign = '-';
                break;
            case R.id.button_multiply:
                preSign = '*';
                break;
            case R.id.button_division:
                preSign = '/';
                break;
            case R.id.button_point:
                processInputNumber(".");
                break;
            case R.id.button_equal:
                textOutput.setText(textInput.getText().toString());
                break;
            case R.id.button_clear_input:
                textInput.setText("0");
                textOutput.setText("0");
                break;
        }
    }

    private void initView() {
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (Button) findViewById(R.id.button_plus);
        buttonMinus = (Button) findViewById(R.id.button_minus);
        buttonMultiply = (Button) findViewById(R.id.button_multiply);
        buttonDivision = (Button) findViewById(R.id.button_division);
        buttonPoint = (Button) findViewById(R.id.button_point);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        buttonClearInput = (Button) findViewById(R.id.button_clear_input);
        textInput = (TextView) findViewById(R.id.text_input);
        textOutput = (TextView) findViewById(R.id.text_output);
    }

    private void setViewOnClickListener() {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonPoint.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonClearInput.setOnClickListener(this);
    }

    private void processInputNumber(String numberStr) {
        if (isInputingNumber
        ) {
            textInput.setText(textInput.getText().toString() + numberStr);
        }
    }
}
