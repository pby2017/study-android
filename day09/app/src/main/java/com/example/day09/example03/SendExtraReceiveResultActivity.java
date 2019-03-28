package com.example.day09.example03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day09.R;

public class SendExtraReceiveResultActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextSendValue01;
    EditText editTextSendValue02;
    Button buttonSendValue01;
    Button buttonSendValue02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_extra_receive_result);

        initView();

        setViewOnClickListener();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        Toast.makeText(SendExtraReceiveResultActivity.this, Integer.toString(intent.getIntExtra("result", -1)), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Intent containValueIntent = new Intent(SendExtraReceiveResultActivity.this, CalculatingActivity.class);
        int firstNumber = Integer.parseInt(editTextSendValue01.getText().toString());
        int secondNumber = Integer.parseInt(editTextSendValue02.getText().toString());

        switch (v.getId()) {
            case R.id.button_send_value01:
                putInputValueInIntent(containValueIntent, firstNumber, secondNumber, 1);
                startActivityForResult(containValueIntent, 1234);
                break;
            case R.id.button_send_value02:
                putInputValueInIntent(containValueIntent, firstNumber, secondNumber, 2);
                startActivity(containValueIntent);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == 1234) {
            Toast.makeText(SendExtraReceiveResultActivity.this, Integer.toString(data.getIntExtra("result", -1)), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(SendExtraReceiveResultActivity.this, "오류 = " + resultCode, Toast.LENGTH_SHORT).show();
        }
    }

    private void initView() {
        editTextSendValue01 = (EditText) findViewById(R.id.edit_text_input01);
        editTextSendValue02 = (EditText) findViewById(R.id.edit_text_input02);
        buttonSendValue01 = (Button) findViewById(R.id.button_send_value01);
        buttonSendValue02 = (Button) findViewById(R.id.button_send_value02);
    }

    private void setViewOnClickListener() {
        buttonSendValue01.setOnClickListener(SendExtraReceiveResultActivity.this);
        buttonSendValue02.setOnClickListener(SendExtraReceiveResultActivity.this);
    }

    private void putInputValueInIntent(Intent intent, int firstInt, int secondInt, int methodNumber) {
        intent.putExtra("methodNumber", methodNumber);
        intent.putExtra("first", firstInt);
        intent.putExtra("second", secondInt);
    }
}
