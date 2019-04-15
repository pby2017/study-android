package com.example.myapplication.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;

public class ButtonClickActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);

        initView();

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                Toast.makeText(getApplicationContext(), "버튼 1 선택", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_2:
                Toast.makeText(getApplicationContext(), "버튼 2 선택", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_3:
                Toast.makeText(getApplicationContext(), "버튼 3 선택", Toast.LENGTH_LONG).show();
                break;
        }
    }

    private void initView() {
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
    }
}