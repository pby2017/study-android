package com.example.day17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.day17.example01.FcmService;
import com.example.day17.example01.SendNotificationActivity;
import com.example.day17.example02.PendingIntentActivity;
import com.example.day17.example03.SendAndReceiveMessageActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String MAIN_ACTIVITY = "MAIN_ACTIVITY";

    private Button startFCMServiceButton;
    private Button startSendNotificationActivityButton;
    private Button startPendingIntentActivityButton;
    private Button startSendAndReceiveMessageActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_fcm_service:
                startService(new Intent(this, FcmService.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_fcm_service)");
                break;
            case R.id.button_start_send_notification_activity:
                startActivity(new Intent(this, SendNotificationActivity.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_send_notification_activity)");
                break;
            case R.id.button_start_pending_intent_activity:
                startActivity(new Intent(this, PendingIntentActivity.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_pending_intent_activity)");
                break;
            case R.id.button_start_send_and_receive_message_activity:
                startActivity(new Intent(this, SendAndReceiveMessageActivity.class));
                Log.d(MAIN_ACTIVITY, "onClick(button_start_send_and_receive_message_activity)");
                break;
        }
    }

    private void initView() {
        startFCMServiceButton = findViewById(R.id.button_start_fcm_service);
        startFCMServiceButton.setOnClickListener(this);
        startSendNotificationActivityButton = findViewById(R.id.button_start_send_notification_activity);
        startSendNotificationActivityButton.setOnClickListener(this);
        startPendingIntentActivityButton = findViewById(R.id.button_start_pending_intent_activity);
        startPendingIntentActivityButton.setOnClickListener(this);
        startSendAndReceiveMessageActivityButton = findViewById(R.id.button_start_send_and_receive_message_activity);
        startSendAndReceiveMessageActivityButton.setOnClickListener(this);
    }
}
