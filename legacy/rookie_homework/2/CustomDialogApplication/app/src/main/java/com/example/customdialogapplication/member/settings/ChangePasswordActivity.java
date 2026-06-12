package com.example.customdialogapplication.member.settings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.customdialogapplication.R;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private Button changePasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initView();
    }

    private void initView() {
        changePasswordButton = findViewById(R.id.button_change_password);
        changePasswordButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_change_password:
                finish();
                Toast.makeText(getApplicationContext(), getString(R.string.text_complete_change), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
