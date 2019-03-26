package com.example.day07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day07.example01.ContextMenuActivity;
import com.example.day07.example01.MenuActivity;
import com.example.day07.example02.AlertDialogActivity;
import com.example.day07.practice01.SelectedMenuViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStartMenuActivity;
    private Button buttonStartContextMenuActivity;
    private Button buttonStartAlertDialogActivity;
    private Button buttonStartSelectedMenuViewActivity;

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
            case R.id.button_start_menu_activity:
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                break;
            case R.id.button_start_context_menu_activity:
                startActivity(new Intent(getApplicationContext(), ContextMenuActivity.class));
                break;
            case R.id.button_start_alert_dialog_activity:
                startActivity(new Intent(getApplicationContext(), AlertDialogActivity.class));
                break;
            case R.id.button_start_selected_menu_view_activity:
                startActivity(new Intent(getApplicationContext(), SelectedMenuViewActivity.class));
                break;
        }
    }

    private void setViewOnClickListener() {
        buttonStartMenuActivity.setOnClickListener(this);
        buttonStartContextMenuActivity.setOnClickListener(this);
        buttonStartAlertDialogActivity.setOnClickListener(this);
        buttonStartSelectedMenuViewActivity.setOnClickListener(this);
    }

    private void initView() {
        buttonStartMenuActivity = (Button) findViewById(R.id.button_start_menu_activity);
        buttonStartContextMenuActivity = (Button) findViewById(R.id.button_start_context_menu_activity);
        buttonStartAlertDialogActivity = (Button) findViewById(R.id.button_start_alert_dialog_activity);
        buttonStartSelectedMenuViewActivity = (Button) findViewById(R.id.button_start_selected_menu_view_activity);
    }
}
