package com.example.day10.example01;

import android.Manifest;
import android.app.SearchManager;
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
    private Button buttonImplicitIntentWeb;
    private Button buttonImplicitIntentGeomap;
    private Button buttonImplicitIntentSms;
    private Button buttonImplicitIntentWebSearch;
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
                startCallActivityWithIntent();
                break;
            case R.id.button_implicit_intent_web:
                startWebActivityWithIntent();
                break;
            case R.id.button_implicit_intent_geomap:
                startGeomapActivityWithIntent();
                break;
            case R.id.button_implicit_intent_sms:
                startSmsActivityWithIntent();
                // TODO: implement sms function
                break;
            case R.id.button_implicit_intent_photo:
                startPhotoActivityWithIntent();
                break;
            case R.id.button_implicit_intent_web_search:
                startWebSearchActivityWithIntent();
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1234:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startCallActivityWithIntent();
                } else {
                    Toast.makeText(IntentActionViewActivity.this, "permission check 필요", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void initView() {
        buttonImplicitIntentCall = (Button) findViewById(R.id.button_implicit_intent_call);
        buttonImplicitIntentWeb = (Button) findViewById(R.id.button_implicit_intent_web);
        buttonImplicitIntentGeomap = (Button) findViewById(R.id.button_implicit_intent_geomap);
        buttonImplicitIntentSms = (Button) findViewById(R.id.button_implicit_intent_sms);
        buttonImplicitIntentPhoto = (Button) findViewById(R.id.button_implicit_intent_photo);
        buttonImplicitIntentWebSearch = (Button) findViewById(R.id.button_implicit_intent_web_search);
    }

    private void setViewOnClickListener() {
        buttonImplicitIntentCall.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentWeb.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentGeomap.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentSms.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentPhoto.setOnClickListener(IntentActionViewActivity.this);
        buttonImplicitIntentWebSearch.setOnClickListener(IntentActionViewActivity.this);
    }

    private void permissionCheck(String permission) {
        if (ContextCompat.checkSelfPermission(IntentActionViewActivity.this, permission)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(IntentActionViewActivity.this, new String[]{permission}, 1234);
        }
    }

    private void startCallActivityWithIntent() {
        Uri callUri = Uri.parse("tel:010-1234-1234");
        Intent callIntent = new Intent(Intent.ACTION_VIEW, callUri);
        startActivity(callIntent);
    }

    private void startWebActivityWithIntent() {
        Uri webUri = Uri.parse("http://www.naver.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webUri);
        startActivity(webIntent);
    }

    private void startGeomapActivityWithIntent() {
        Uri GeomapUri = Uri.parse("https://www.google.co.jp/maps/@37.5710371,126.9927944,16z");
        Intent geomapIntent = new Intent(Intent.ACTION_VIEW, GeomapUri);
        startActivity(geomapIntent);
    }

    private void startSmsActivityWithIntent() {
        String message = "hello";
//        Intent smsIntent = new Intent(Intent.ACTION_SEND);
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        smsIntent.setData(Uri.parse("smsto:010-1234-1234"));
        smsIntent.putExtra("sms_body", message);
        startActivity(smsIntent);
    }

    private void startPhotoActivityWithIntent() {
        Intent photoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(photoIntent, 1);
        // TODO: add show picture or save file later
    }

    private void startWebSearchActivityWithIntent(){
        Intent webSearchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        webSearchIntent.putExtra(SearchManager.QUERY, "검색어 순위");
        startActivity(webSearchIntent);
    }
}
