package com.example.day10.example01;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day10.R;

public class IntentActionViewActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonImplicitIntentCall;
    private Button buttonImplicitIntentInternet;
    private Button buttonImplicitIntentGeomap;
    private Button buttonImplicitIntentSms;
    private Button buttonImplicitIntentSearch;
    private Button buttonImplicitIntentPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_action_view);

        initView();

        setViewOnClickListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_implicit_intent_call:
//                permissionCheck(Manifest.permission.CALL_PHONE);
                // TODO: implement permission check function
                break;
            case R.id.button_implicit_intent_internet:
                intentInternet();
                break;
            case R.id.button_implicit_intent_geomap:
                intentGeoMap();
                break;
            case R.id.button_implicit_intent_sms:
//                intentSms();
                // TODO: implement sms function
                break;
            case R.id.button_implicit_intent_photo:
                intentPhoto();
                break;
            case R.id.button_implicit_intent_search:
                // TODO: implement search function
                break;
        }
    }

    private void intentPhoto() {
        Intent intentPhoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intentPhoto, 1);
        // TODO: add show picture or save file later
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1234:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    intentCall();
                } else {
                    Toast.makeText(IntentActionViewActivity.this, "permission check 필요", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void permissionCheck(String permission) {
        if (ContextCompat.checkSelfPermission(IntentActionViewActivity.this, permission)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(IntentActionViewActivity.this, new String[]{permission}, 1234);
        }
    }

    private void intentSms() {
        String message = "hello";
        Intent smsIntent = new Intent(Intent.ACTION_SEND);
        smsIntent.setData(Uri.parse("smsto:010-1234-1234"));
        smsIntent.putExtra("sms_body", message);
        startActivity(smsIntent);
    }

    private void intentGeoMap() {
        Uri GeomapUri = Uri.parse("https://www.google.co.jp/maps/@37.5710371,126.9927944,16z");
        Intent geomapIntent = new Intent(Intent.ACTION_VIEW, GeomapUri);
        startActivity(geomapIntent);
    }

    private void intentInternet() {
        Uri internetUri = Uri.parse("http://www.naver.com");
        Intent callIntent = new Intent(Intent.ACTION_VIEW, internetUri);
        startActivity(callIntent);
    }

    private void intentCall() {
        Uri callUri = Uri.parse("tel:010-1234-1234");
        Intent callIntent = new Intent(Intent.ACTION_VIEW, callUri);
        startActivity(callIntent);
    }

    private void initView() {
        buttonImplicitIntentCall = (Button) findViewById(R.id.button_implicit_intent_call);
        buttonImplicitIntentInternet = (Button) findViewById(R.id.button_implicit_intent_internet);
        buttonImplicitIntentGeomap = (Button) findViewById(R.id.button_implicit_intent_geomap);
        buttonImplicitIntentSms = (Button) findViewById(R.id.button_implicit_intent_sms);
        buttonImplicitIntentSearch = (Button) findViewById(R.id.button_implicit_intent_search);
        buttonImplicitIntentPhoto = (Button) findViewById(R.id.button_implicit_intent_photo);
    }

    private void setViewOnClickListener() {
        buttonImplicitIntentCall.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentInternet.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentGeomap.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentSms.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentSearch.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentPhoto.setOnClickListener(IntentActionViewActivity.this);
    }
}
