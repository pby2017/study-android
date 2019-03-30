package com.example.day06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day06.example01.ViewFlipperActivity;
import com.example.day06.example02.TabHostActivity;
import com.example.day06.example03.ActionBarActivity;
import com.example.day06.example03.ActionBarActivity02;
import com.example.day06.example04.WebViewActivity;
import com.example.day06.practice01.ChatRoomListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startViewFlipperActivityButton;
    private Button startTabHostActivityButton;
    private Button startActionBarActivityButton;
    private Button startActionBarActivity02Button;
    private Button startWebViewActivityButton;
    private Button startChatRoomListActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_view_flipper_activity:
                startActivity(new Intent(getApplicationContext(), ViewFlipperActivity.class));
                break;
            case R.id.button_start_tab_host_activity:
                startActivity(new Intent(getApplicationContext(), TabHostActivity.class));
                break;
            case R.id.button_start_action_bar_activity:
                startActivity(new Intent(getApplicationContext(), ActionBarActivity.class));
                break;
            case R.id.button_start_action_bar_activity02:
                startActivity(new Intent(getApplicationContext(), ActionBarActivity02.class));
                break;
            case R.id.button_start_web_view_activity:
                startActivity(new Intent(getApplicationContext(), WebViewActivity.class));
                break;
            case R.id.button_start_chat_room_list_activity:
                startActivity(new Intent(getApplicationContext(), ChatRoomListActivity.class));
                break;
        }
    }

    private void initView() {
        startViewFlipperActivityButton = findViewById(R.id.button_start_view_flipper_activity);
        startTabHostActivityButton = findViewById(R.id.button_start_tab_host_activity);
        startActionBarActivityButton = findViewById(R.id.button_start_action_bar_activity);
        startActionBarActivity02Button = findViewById(R.id.button_start_action_bar_activity02);
        startWebViewActivityButton = findViewById(R.id.button_start_web_view_activity);
        startChatRoomListActivityButton = findViewById(R.id.button_start_chat_room_list_activity);

        startViewFlipperActivityButton.setOnClickListener(this);
        startTabHostActivityButton.setOnClickListener(this);
        startActionBarActivityButton.setOnClickListener(this);
        startActionBarActivity02Button.setOnClickListener(this);
        startWebViewActivityButton.setOnClickListener(this);
        startChatRoomListActivityButton.setOnClickListener(this);
    }
}