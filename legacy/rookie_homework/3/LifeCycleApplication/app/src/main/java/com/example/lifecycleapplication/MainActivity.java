package com.example.lifecycleapplication;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.example.lifecycleapplication.CustomConstant.MAIN_ACT_TAG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 1111;

    private Button startFragmentButton;
    private Button showCustomDialogButton;
    private Button callFinishButton;
    private Button startTransparentActivityButton;
    private Button startActivityButton;
    private Button executeNullButton;
    private Button startInfiniteLoopButton;
    private Button startInfiniteFragmentButton;
    private Button startRequestReadContactsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(MAIN_ACT_TAG, "onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    protected void onRestart() {
        Log.d(MAIN_ACT_TAG, "onRestart()");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(MAIN_ACT_TAG, "onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(MAIN_ACT_TAG, "onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(MAIN_ACT_TAG, "onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(MAIN_ACT_TAG, "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(MAIN_ACT_TAG, "onDestroy()");
        if (isFinishing()) {
            Log.d(MAIN_ACT_TAG, "onDestroy() - isFinishing() = true");
        } else {
            Log.d(MAIN_ACT_TAG, "onDestroy() - isFinishing() = false");
            Toast.makeText(this, "강제 종료", Toast.LENGTH_SHORT).show();
        }
        super.onDestroy();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_fragment:
                // 프래그먼트가 있는지 찾아보는 findFragment~~ 로 찾는 것을 더 권장함
                if (getSupportFragmentManager().findFragmentById(R.id.frame_container) == null) {
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.frame_container, BlankFragment.newInstance(0))
                            .commit();
                } else {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_container, BlankFragment.newInstance(0))
                            .commit();
                }

                break;
            case R.id.button_show_custom_dialog:
                createCustomDialog().show();
                break;
            case R.id.button_call_finish:
                finish();
                break;
            case R.id.button_start_transparent_activity:
                startActivity(new Intent(this, TransparentActivity.class));
                break;
            case R.id.button_start_activity:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.button_execute_null:
                Button button = null;
                button.setOnClickListener(this);
                break;
            case R.id.button_start_infinite_loop:
                int nonce = 0;
                String sentence = "good";
                while (!testSHA256(String.format("%s%d", sentence, nonce)).substring(0, 4).equals("0000")) {
                    Log.d(MAIN_ACT_TAG, "nonce:" + String.valueOf(nonce) + " -> " + testSHA256(String.format("%s%d", sentence, nonce)));
                    nonce++;
                }
                Log.d(MAIN_ACT_TAG, "nonce:" + String.valueOf(nonce) + " -> " + testSHA256(String.format("%s%d", sentence, nonce)));
                break;
            case R.id.button_start_infinite_fragment:
                nonce = 0;
                sentence = "good";
                while (!testSHA256(String.format("%s%d", sentence, nonce)).substring(0, 4).equals("0000")) {
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.frame_container, BlankFragment.newInstance(0))
                            .addToBackStack(null)
                            .commit();
                    nonce++;
                    Log.d(MAIN_ACT_TAG, String.format("fragment count : %d", getSupportFragmentManager().getFragments().size()));
                }
                break;
            case R.id.button_start_request_read_contacts:
                if (ContextCompat.checkSelfPermission(this,
                        Manifest.permission.READ_CONTACTS)
                        != PackageManager.PERMISSION_GRANTED) {
                    Log.d(MAIN_ACT_TAG, "onCreate() - permission");
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.READ_CONTACTS},
                            MY_PERMISSIONS_REQUEST_READ_CONTACTS);
                }
                break;
        }
    }

    private void initView() {
        startFragmentButton = findViewById(R.id.button_start_fragment);
        startFragmentButton.setOnClickListener(this);
        showCustomDialogButton = findViewById(R.id.button_show_custom_dialog);
        showCustomDialogButton.setOnClickListener(this);
        callFinishButton = findViewById(R.id.button_call_finish);
        callFinishButton.setOnClickListener(this);
        startTransparentActivityButton = findViewById(R.id.button_start_transparent_activity);
        startTransparentActivityButton.setOnClickListener(this);
        startActivityButton = findViewById(R.id.button_start_activity);
        startActivityButton.setOnClickListener(this);
        executeNullButton = findViewById(R.id.button_execute_null);
        executeNullButton.setOnClickListener(this);
        startInfiniteLoopButton = findViewById(R.id.button_start_infinite_loop);
        startInfiniteLoopButton.setOnClickListener(this);
        startInfiniteFragmentButton = findViewById(R.id.button_start_infinite_fragment);
        startInfiniteFragmentButton.setOnClickListener(this);
        startRequestReadContactsButton = findViewById(R.id.button_start_request_read_contacts);
        startRequestReadContactsButton.setOnClickListener(this);
    }

    private AlertDialog createCustomDialog() {
        final EditText UrlEditText = new EditText(this);

        return new AlertDialog.Builder(this)
                .setTitle("Server 접속 주소를 입력하세요.")
                .setMessage("ex) http://192.168.0.1:8080/directory/file")
                .setView(UrlEditText)
                .setPositiveButton(R.string.save, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
    }

    public String testSHA256(String str) {

        String SHA = "";
        try {
            MessageDigest sh = MessageDigest.getInstance("SHA-256");
            sh.update(str.getBytes());
            byte byteData[] = sh.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            SHA = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            SHA = null;
        }

        return SHA;
    }
}
