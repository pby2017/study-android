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

    private Button buttonStartViewFlipperActivity;
    private Button buttonStartTabHostActivity;
    private Button buttonStartActionBarActivity;
    private Button buttonStartActionBarActivity02;
    private Button buttonStartWebViewActivity;
    private Button buttonStartChatRoomListActivity;

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

    private void setViewOnClickListener() {
        buttonStartViewFlipperActivity.setOnClickListener(this);
        buttonStartTabHostActivity.setOnClickListener(this);
        buttonStartActionBarActivity.setOnClickListener(this);
        buttonStartActionBarActivity02.setOnClickListener(this);
        buttonStartWebViewActivity.setOnClickListener(this);
        buttonStartChatRoomListActivity.setOnClickListener(this);
    }

    private void initView() {
        buttonStartViewFlipperActivity = (Button) findViewById(R.id.button_start_view_flipper_activity);
        buttonStartTabHostActivity = (Button) findViewById(R.id.button_start_tab_host_activity);
        buttonStartActionBarActivity = (Button) findViewById(R.id.button_start_action_bar_activity);
        buttonStartActionBarActivity02 = (Button) findViewById(R.id.button_start_action_bar_activity02);
        buttonStartWebViewActivity = (Button) findViewById(R.id.button_start_web_view_activity);
        buttonStartChatRoomListActivity = (Button) findViewById(R.id.button_start_chat_room_list_activity);
    }
}