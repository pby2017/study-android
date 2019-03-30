package com.example.day07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day07.example01.ContextMenuActivity;
import com.example.day07.example01.MenuActivity;
import com.example.day07.example02.AlertDialogActivity;
import com.example.day07.practice01.SelectedMenuViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startMenuActivityButton;
    private Button startContextMenuActivityButton;
    private Button startAlertDialogActivityButton;
    private Button startSelectedMenuViewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
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

    private void initView() {
        startMenuActivityButton = findViewById(R.id.button_start_menu_activity);
        startContextMenuActivityButton = findViewById(R.id.button_start_context_menu_activity);
        startAlertDialogActivityButton = findViewById(R.id.button_start_alert_dialog_activity);
        startSelectedMenuViewActivityButton = findViewById(R.id.button_start_selected_menu_view_activity);

        startMenuActivityButton.setOnClickListener(this);
        startContextMenuActivityButton.setOnClickListener(this);
        startAlertDialogActivityButton.setOnClickListener(this);
        startSelectedMenuViewActivityButton.setOnClickListener(this);
    }
}
