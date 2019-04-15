package com.example.day19.example01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.day19.R;

public class MySingletonTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_singleton_test);

        Toast.makeText(getApplicationContext(), String.format("test singleton text = %s",
                MySingleton.getINSTANCE().getData()), Toast.LENGTH_SHORT).show();
    }
}
