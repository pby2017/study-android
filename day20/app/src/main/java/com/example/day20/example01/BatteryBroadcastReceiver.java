package com.example.day20.example01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.day20.R;

public class BatteryBroadcastReceiver extends BroadcastReceiver {

    private ImageView imageBattery;
    private TextView textBattery;

    public BatteryBroadcastReceiver(ImageView imageBattery, TextView textBattery) {
        this.imageBattery = imageBattery;
        this.textBattery = textBattery;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_BATTERY_CHANGED)) {
            int currentBatteryLevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            textBattery.setText(String.format("현재 충전량 : %s\n", currentBatteryLevel));

            if (currentBatteryLevel >= 90) {
                imageBattery.setImageResource(R.drawable.battery_100);
            } else if (currentBatteryLevel >= 70) {
                imageBattery.setImageResource(R.drawable.battery_80);
            } else if (currentBatteryLevel >= 50) {
                imageBattery.setImageResource(R.drawable.battery_60);
            } else if (currentBatteryLevel >= 10) {
                imageBattery.setImageResource(R.drawable.battery_20);
            } else {
                imageBattery.setImageResource(R.drawable.battery_0);
            }

            int plug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0);
            switch (plug) {
                case 0:
                    textBattery.append("전원 연결 : 안됨");
                    break;
                case BatteryManager.BATTERY_PLUGGED_AC:
                    textBattery.append("전원 연결 : 어댑터 연결됨");
                    break;
                case BatteryManager.BATTERY_PLUGGED_USB:
                    textBattery.append("전원 연결 : USB 연결됨");
                    break;
                case BatteryManager.BATTERY_PLUGGED_WIRELESS:
                    textBattery.append("전원 연결 : 무선충전 연결됨");
                    break;
            }
        }

    }
}
