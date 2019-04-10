package com.example.day18.example01;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.example.day18.constant.CustomConstant.LogConstant.CUS_MY_FCM_SERVICE;

public class MyFCMService extends FirebaseMessagingService {
    public MyFCMService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getData().size() > 0) {
            Log.d(CUS_MY_FCM_SERVICE, "Message data payload: " + remoteMessage.getData());

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
//                scheduleJob();
            } else {
                // Handle message within 10 seconds
//                handleNow();
            }

//            sendNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
        }

        if (remoteMessage.getNotification() != null) {
            Log.d(CUS_MY_FCM_SERVICE, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
    }
}
