package com.example.day08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day08.example01.MyDialogActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartMyDialogActivity;
    private Button buttonStartToastMessageActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setViewOnClickListener();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_my_dialog_activity:
                startActivity(new Intent(getApplicationContext(), MyDialogActivity.class));
                break;
            case R.id.button_start_toast_message_activity:
                startActivity(new Intent(getApplicationContext(), MyDialogActivity.class));
                break;
        }
    }

    private void setViewOnClickListener() {
        buttonStartMyDialogActivity.setOnClickListener(this);
        buttonStartToastMessageActivity.setOnClickListener(this);
    }

    private void initView() {
        buttonStartMyDialogActivity = (Button) findViewById(R.id.button_start_my_dialog_activity);
        buttonStartToastMessageActivity = (Button) findViewById(R.id.button_start_toast_message_activity);
    }
}
