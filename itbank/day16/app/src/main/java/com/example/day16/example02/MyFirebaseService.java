package com.example.day16.example02;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseService extends FirebaseInstanceIdService {

    private static final String MY_FIREBASE_SERV = "MY_FIREBASE_SERV";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = null;

        token = FirebaseInstanceId.getInstance().getToken();

        if (token != null) {
            Log.d(MY_FIREBASE_SERV, "token = " + token);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        String token = null;

        token = FirebaseInstanceId.getInstance().getToken();

        if (token != null) {
            Log.d(MY_FIREBASE_SERV, "token = " + token);
        }
    }
}

