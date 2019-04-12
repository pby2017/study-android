package com.example.day20.example02;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.day20.R;

public class QRCodeActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView dataText;
    private TextView AddressText;
    private Button startScanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        initView();

        initialize();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_scan:
                break;
        }
    }

    private void initView() {
        dataText = findViewById(R.id.text_data);
        AddressText = findViewById(R.id.text_address);
        startScanButton = findViewById(R.id.button_start_scan);
        startScanButton.setOnClickListener(this);

    }

    private void initialize() {


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

    }
}
