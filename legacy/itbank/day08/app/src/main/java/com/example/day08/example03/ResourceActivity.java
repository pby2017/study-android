package com.example.day08.example03;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.day08.R;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        logResource();
    }

    private void logResource() {
        Resources res = getResources();
        String[] stringArray = res.getStringArray(R.array.string_array_name);
        for (int i = 0; i < stringArray.length; i++) {
            Log.d("Resource_Act", stringArray[i]);
        }
    }
}
