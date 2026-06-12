package com.example.mynotificationapp;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int NOTIFICATION_ID = 888;
    public static final String CHANNEL_ID = "custom_notification";
    public static final int CLOSE_NOTIFICATION_ID = -1;

    private MyNotificationBroadcastReceiver myNotificationBroadcastReceiver;
    private NotificationManagerCompat notificationManagerCompat;
    private Notification customNotification;

    private RemoteViews notificationLayout;

    private Runnable runnable;

    private Button notificationSettingsStartButton;
    private Button changeTimerStartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initialize();

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constant.CLOSE_NOTIFICATION);
        registerReceiver(myNotificationBroadcastReceiver, intentFilter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myNotificationBroadcastReceiver);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_notification_settings:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    Intent intent = new Intent(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS);
                    intent.putExtra(Settings.EXTRA_APP_PACKAGE, getPackageName());
                    intent.putExtra(Settings.EXTRA_CHANNEL_ID, CHANNEL_ID);
                    startActivity(intent);
                } else {
                    // TODO: 하위 버전
                }
                break;
            case R.id.button_start_change_notification_content:
                startTimer();
                break;
        }
    }

    private void initView() {
        notificationSettingsStartButton = findViewById(R.id.button_start_notification_settings);
        notificationSettingsStartButton.setOnClickListener(this);

        changeTimerStartButton = findViewById(R.id.button_start_change_notification_content);
        changeTimerStartButton.setOnClickListener(this);
    }

    private void initialize() {
        myNotificationBroadcastReceiver = new MyNotificationBroadcastReceiver();

        createNotificationChannel();

        notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationLayout = new RemoteViews(getPackageName(), R.layout.notification_small);

        Intent intent = new Intent(Constant.CLOSE_NOTIFICATION);
        intent.putExtra("notificationId", CLOSE_NOTIFICATION_ID);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, NOTIFICATION_ID, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        notificationLayout.setOnClickPendingIntent(R.id.button_close_notification, pendingIntent);

        customNotification = buildNotification(CHANNEL_ID, notificationLayout, pendingIntent);
        notificationManagerCompat.notify(NOTIFICATION_ID, customNotification);

        runnable = new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                notificationLayout.setTextViewText(R.id.text_content, String.format("%d시 %d분 %d초".toLowerCase(),
                        date.getHours(), date.getMinutes(), date.getSeconds()));
                notificationManagerCompat.notify(NOTIFICATION_ID, customNotification);
//                startTimer();
            }
        };
    }

    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.text_channel_name);
            String description = getString(R.string.text_channel_description);
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        } else {
            // TODO: 하위 버전
        }
    }

    private Notification buildNotification(String channelId, RemoteViews remoteViews, PendingIntent pendingIntent) {
        return new NotificationCompat.Builder(getApplicationContext(), channelId)
                .setSmallIcon(R.drawable.baseline_rowing_24)
                .setStyle(new NotificationCompat.DecoratedCustomViewStyle())
                .setCustomContentView(remoteViews)
                .setOngoing(true)
                .setContentIntent(pendingIntent)
                .build();
    }

    private void startTimer() {
        new Handler().postDelayed(runnable, 1000);
    }
}



