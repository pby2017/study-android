
package com.example.day17.example02;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.day17.MainActivity;
import com.example.day17.R;

public class PendingIntentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendNotificationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_intent);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_send_notification:
                sendNotification("test title", "test message");
                break;
        }
    }

    private void initView() {
        sendNotificationButton = findViewById(R.id.button_send_notification);
        sendNotificationButton.setOnClickListener(this);
    }

    private void sendNotification(String title, String message) {
        Intent intent = new Intent(this, PendingIntentTestActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Uri bananaPeelSlipSoundUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.banana_peel_slip);
        // TODO: can not print sound yet
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        String name = "NOTIFICATION";
        String channel_id = "fcm_default_channel";


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(channel_id, name, NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, channel_id)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.baseline_attach_money_black_48))
                .setSmallIcon(R.drawable.baseline_alarm_black_18)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setSound(bananaPeelSlipSoundUri)
                .setContentIntent(pendingIntent);

        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    }
}
