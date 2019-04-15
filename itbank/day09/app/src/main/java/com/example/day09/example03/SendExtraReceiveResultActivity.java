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

    public static final int CALCULATE_SUCCESS = 1234;
    public static final String CALCULATE_FIRST_INPUT = "intent.calculate.first.input";
    public static final String CALCULATE_SECOND_INPUT = "intent.calculate.second.input";
    public static final String CALCULATE_RESULT_OUTPUT = "intent.calculate.result";
    public static final String CALCULATE_METHOD = "intent.calculate.method";

    private EditText firstInputEditText;
    private EditText secondInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_extra_receive_result);

        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();

//        계산 후 finish()로 액티비티 닫을 경우
//        Intent intent = getIntent();
//        Toast.makeText(this, Integer.toString(intent.getIntExtra(CALCULATE_RESULT_OUTPUT, -1)), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Intent containValueIntent = new Intent(this, CalculatingActivity.class);
        int firstInputValue = Integer.parseInt(firstInputEditText.getText().toString());
        int secondInputValue = Integer.parseInt(secondInputEditText.getText().toString());

        switch (v.getId()) {
            case R.id.button_calculate_check_on_result:
                startActivityForResult(getContainInputValueIntent(containValueIntent, firstInputValue, secondInputValue, 1), CALCULATE_SUCCESS);
                break;
            case R.id.button_calculate_check_on_resume:
                startActivity(getContainInputValueIntent(containValueIntent, firstInputValue, secondInputValue, 2));
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == CALCULATE_SUCCESS) {
            Toast.makeText(this, Integer.toString(data.getIntExtra(CALCULATE_RESULT_OUTPUT, -1)), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "오류 = " + resultCode, Toast.LENGTH_SHORT).show();
        }
    }

    private void initView() {
        firstInputEditText = findViewById(R.id.edit_text_first_input);
        secondInputEditText = findViewById(R.id.edit_text_second_input);

        Button calculateCheckOnResultButton = findViewById(R.id.button_calculate_check_on_result);
        calculateCheckOnResultButton.setOnClickListener(this);

        Button calculateCheckOnResumeButton = findViewById(R.id.button_calculate_check_on_resume);
        calculateCheckOnResumeButton.setOnClickListener(this);
    }

    private Intent getContainInputValueIntent(Intent intent, int firstInt, int secondInt, int methodNumber) {
        intent.putExtra(CALCULATE_METHOD, methodNumber);
        intent.putExtra(CALCULATE_FIRST_INPUT, firstInt);
        intent.putExtra(CALCULATE_SECOND_INPUT, secondInt);

        return intent;
    }
}
