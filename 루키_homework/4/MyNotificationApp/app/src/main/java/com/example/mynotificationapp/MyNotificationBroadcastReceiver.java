package com.example.mynotificationapp;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class MyNotificationBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.d(Constant.MY_NOTIFICATION_BROADCASE_RECEIVER, action);
        if (action.equals(Constant.CLOSE_NOTIFICATION)) {
            Log.d(Constant.MY_NOTIFICATION_BROADCASE_RECEIVER, Constant.CLOSE_NOTIFICATION);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
                    intent.getIntExtra("notificationId", -1) == MainActivity.CLOSE_NOTIFICATION_ID) {
                NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
                notificationManager.cancel(MainActivity.NOTIFICATION_ID);
            } else {
                // TODO: 하위 버전
            }
        }
    }
}



