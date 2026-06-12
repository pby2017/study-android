package com.example.day20.example01;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.day20.R;

public class BroadcastingActivity extends AppCompatActivity {

    private BatteryBroadcastReceiver broadcastReceiver;

    private ImageView imageBattery;
    private TextView textBattery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcasting);

        initView();

        initialize();
    }

    private void initView() {
        imageBattery = findViewById(R.id.image_battery);
        textBattery = findViewById(R.id.text_battery);
    }

    private void initialize() {
        broadcastReceiver = new BatteryBroadcastReceiver(imageBattery, textBattery);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(broadcastReceiver);
    }
}
