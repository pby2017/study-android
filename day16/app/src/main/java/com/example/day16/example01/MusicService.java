package com.example.day16.example01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {

    private static final String MUSIC_SERVICE = "MUSIC_SERVICE";

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(MUSIC_SERVICE, "onBind()");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(MUSIC_SERVICE, "onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(MUSIC_SERVICE, "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(MUSIC_SERVICE, "onDestroy()");
    }
}
