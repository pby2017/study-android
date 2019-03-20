package com.example.day03.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.day03.R;

public class Login extends AppCompatActivity {

    private EditText et1_id;
    private EditText et2_pw;
    private Button btn1_login;
    private TextView tv1_print_id;
    private TextView tv2_print_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1_id = (EditText) findViewById(R.id.et1_id);
        et2_pw = (EditText) findViewById(R.id.et2_pw);
        btn1_login = (Button) findViewById(R.id.btn1_login);
        tv1_print_id = (TextView) findViewById(R.id.tv1_print_id);
        tv2_print_pw = (TextView) findViewById(R.id.tv2_print_pw);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1_login:
                        tv1_print_id.setText("입력하신 아이디는 " + et1_id.getText().toString());
                        tv2_print_pw.setText("입력하신 비밀번호는 " + et2_pw.getText().toString());
                        break;
                }
            }
        };

        btn1_login.setOnClickListener(listener);
    }
}
