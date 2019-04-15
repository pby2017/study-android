package com.example.customchat;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.List;

import androidx.core.app.NotificationCompat;

import static com.example.customchat.constant.CustomConstant.LogConstant.CUS_MY_FCM_SERVICE;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public MyFirebaseMessagingService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        String token = null;

        token = FirebaseInstanceId.getInstance().getToken();

        if (token != null) {
            Log.d(CUS_MY_FCM_SERVICE, "token = " + token);
        }
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);

        Log.d(CUS_MY_FCM_SERVICE, "Refreshed token: " + token);
    }

    // TODO: 메시지 받아서 브로드캐스트 하기
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(CUS_MY_FCM_SERVICE, "onMessageReceived() " + remoteMessage.getData());

        if (remoteMessage.getData().size() > 0) {
            Log.d(CUS_MY_FCM_SERVICE, "ChattingMessage data payload: " + remoteMessage.getData());

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
//                scheduleJob();
            } else {
                // Handle message within 10 seconds
//                handleNow();
            }

            String email = remoteMessage.getData().get("email");
            String content = remoteMessage.getData().get("content");

            ActivityManager activity_manager =
                    (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);

            List<ActivityManager.RunningTaskInfo> task_info =
                    activity_manager.getRunningTasks(9999);


            if(task_info.get(0).topActivity.getClassName().endsWith("ChattingActivity")) {
                Log.d(CUS_MY_FCM_SERVICE, "send broadcast");
                Toast.makeText(getApplicationContext(), "null", Toast.LENGTH_SHORT).show();
                Intent messageIntent = new Intent("receive_message");
                messageIntent.putExtra("email",email);
                messageIntent.putExtra("content",content);
                sendBroadcast(messageIntent);
            } else {
                Toast.makeText(getApplicationContext(), "not null", Toast.LENGTH_SHORT).show();
                sendNotification(email, content);
            }
        } else if (remoteMessage.getNotification() != null) {
            Log.d(CUS_MY_FCM_SERVICE, "ChattingMessage Notification Body: " + remoteMessage.getNotification().getBody());

            sendNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
        } else {
            Log.d(CUS_MY_FCM_SERVICE, "remoteMessage Fail");
        }
    }

    private void sendNotification(String title, String message) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        String name = "NOTIFICATION";
        String channel_id = "fcm_default_channel";


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(channel_id, name, NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, channel_id)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), android.R.drawable.ic_dialog_info))
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent);

        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    }
}
