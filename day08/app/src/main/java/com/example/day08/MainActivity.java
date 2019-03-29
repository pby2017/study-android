package com.example.day08;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ResourceCursorAdapter;

import com.example.day08.example01.MyDialogActivity;
import com.example.day08.example02.ToastMessageActivity;
import com.example.day08.example03.ResourceActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartMyDialogActivity;
    private Button buttonStartToastMessageActivity;
    private Button buttonStartResourceActivity;

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
            case R.id.button_start_resource_activity:
                startActivity(new Intent(getApplicationContext(), ResourceActivity.class));
                break;
        }
    }

    private void setViewOnClickListener() {
        buttonStartMyDialogActivity.setOnClickListener(this);
        buttonStartToastMessageActivity.setOnClickListener(this);
        buttonStartResourceActivity.setOnClickListener(this);
    }

    private void initView() {
        buttonStartMyDialogActivity = (Button) findViewById(R.id.button_start_my_dialog_activity);
        buttonStartToastMessageActivity = (Button) findViewById(R.id.button_start_toast_message_activity);
        buttonStartResourceActivity = (Button) findViewById(R.id.button_start_resource_activity);
    }
}
