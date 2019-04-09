package com.example.day17.example01;

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
import android.util.Log;

import com.example.day17.MainActivity;
import com.example.day17.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FcmService extends FirebaseMessagingService {

    private static final String CUS_FCM_SERV = "CUS_FCM_SERV";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(CUS_FCM_SERV, "onCreate");
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);

        Log.d(CUS_FCM_SERV, "Refreshed token: " + token);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(CUS_FCM_SERV, "From: " + remoteMessage.getFrom());

        if (remoteMessage.getData().size() > 0) {
            Log.d(CUS_FCM_SERV, "Message data payload: " + remoteMessage.getData());

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
//                scheduleJob();
            } else {
                // Handle message within 10 seconds
//                handleNow();
            }
        }

        if (remoteMessage.getNotification() != null) {
            Log.d(CUS_FCM_SERV, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
    }
}
