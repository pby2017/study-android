package com.example.day16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.day16.example01.MusicService;
import com.example.day16.example02.MyFirebaseMessagingService;
import com.example.day16.example02.MyFirebaseService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String MAIN_ACTIVITY = "MAIN_ACTIVITY";

    private Button startMusicServiceButton;
    private Button startMyFirebaseServiceButton;
    private Button startMyFirebaseMessagingServiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_music_service:
                startService(new Intent(this, MusicService.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_music_service)");
                break;
            case R.id.button_start_my_firebase_service:
                startService(new Intent(this, MyFirebaseService.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_my_firebase_service)");
                break;
            case R.id.button_start_my_firebase_messaging_service:
                startService(new Intent(this, MyFirebaseMessagingService.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_my_firebase_messaging_service)");
                break;
        }
    }

    private void initView() {
        startMusicServiceButton = findViewById(R.id.button_start_music_service);
        startMusicServiceButton.setOnClickListener(this);
        startMyFirebaseServiceButton = findViewById(R.id.button_start_my_firebase_service);
        startMyFirebaseServiceButton.setOnClickListener(this);
        startMyFirebaseMessagingServiceButton = findViewById(R.id.button_start_my_firebase_messaging_service);
        startMyFirebaseMessagingServiceButton.setOnClickListener(this);
    }
}
