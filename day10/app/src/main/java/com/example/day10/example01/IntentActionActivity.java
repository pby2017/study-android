package com.example.day10.example01;

import android.Manifest;
import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day10.R;

public class IntentActionActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startCallButton;
    private Button startWebButton;
    private Button startGeomapButton;
    private Button startSmsButton;
    private Button startWebSearchButton;
    private Button startPhotoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_action);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_call:
//                permissionCheck(Manifest.permission.CALL_PHONE);
                // TODO: need to implement permission check function perfectly working
                startActivityWithUri("tel:010-1234-1234", Intent.ACTION_VIEW);
                break;
            case R.id.button_start_web:
                startActivityWithUri("http://www.naver.com", Intent.ACTION_VIEW);
                break;
            case R.id.button_start_geomap:
                startActivityWithUri("https://www.google.co.jp/maps/@37.5710371,126.9927944,16z", Intent.ACTION_VIEW);
                break;
            case R.id.button_start_sms:
                startActivityWithUri("smsto:010-1234-1234", Intent.ACTION_SENDTO);
                break;
            case R.id.button_start_photo:
                Intent photoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(photoIntent, 1);
                // TODO: add show picture or save file later
                break;
            case R.id.button_start_web_search:
                Intent webSearchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
                webSearchIntent.putExtra(SearchManager.QUERY, "검색어 순위");
                startActivity(webSearchIntent);
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1234:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    permissionCheck(Manifest.permission.CALL_PHONE);
                } else {
                    Toast.makeText(this, "permission check 필요" + grantResults[0], Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void initView() {
        startCallButton = findViewById(R.id.button_start_call);
        startCallButton.setOnClickListener(this);
        startWebButton = findViewById(R.id.button_start_web);
        startWebButton.setOnClickListener(this);
        startGeomapButton = findViewById(R.id.button_start_geomap);
        startGeomapButton.setOnClickListener(this);
        startSmsButton = findViewById(R.id.button_start_sms);
        startSmsButton.setOnClickListener(this);
        startPhotoButton = findViewById(R.id.button_start_photo);
        startPhotoButton.setOnClickListener(this);
        startWebSearchButton = findViewById(R.id.button_start_web_search);
        startWebSearchButton.setOnClickListener(this);
    }

    private void permissionCheck(String permission) {
        if (ContextCompat.checkSelfPermission(this, permission)
                == PackageManager.PERMISSION_GRANTED) {
            startActivityWithUri("tel:010-1234-1234", Intent.ACTION_VIEW);
        } else {
            final String permissionRequested = permission;
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("권한 요청")
                    .setMessage("권한이 필요합니다. 계속하시겠습니까?")
                    .setPositiveButton("네", new DialogInterface.OnClickListener() {
                        @RequiresApi(api = Build.VERSION_CODES.M)
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO: return result -1, not 1
                            requestPermissions(new String[]{permissionRequested}, 1234);
                        }
                    });
            alertDialog.show();
        }
    }

    private void startActivityWithUri(String uriString, String intentAction) {
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(intentAction, uri);
        startActivity(intent);
    }
}
