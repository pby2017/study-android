package com.example.customdialogapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private DialogFragment dialogFragment;
    private Button initializeShowingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        if (isDialogEnabled()) {
            dialogFragment.show(getSupportFragmentManager(), "change password");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_initialize_showing_dialog:
                SharedPreferences sharedPreferences = getSharedPreferences(CustomDialogFragmentConstant.CUSTOM_DIALOG_FRAGMENT, 0);
                sharedPreferences.edit()
                        .putBoolean(CustomDialogFragmentConstant.PREF_DONT_SHOW_ISCHECKED, false)
                        .apply();
                break;
        }
    }

    private void initView() {
        dialogFragment = CustomDialogFragment.newInstance();
        initializeShowingDialog = findViewById(R.id.button_initialize_showing_dialog);
        initializeShowingDialog.setOnClickListener(this);
    }

    private boolean isDialogEnabled() {
        SharedPreferences sharedPreferences = getSharedPreferences(CustomDialogFragmentConstant.CUSTOM_DIALOG_FRAGMENT, 0);
        boolean isDontShowChecked = sharedPreferences.getBoolean(CustomDialogFragmentConstant.PREF_DONT_SHOW_ISCHECKED, false);

        if (isDontShowChecked) {
            long today = new Date().getTime();
            long dayOfStartDontShow = sharedPreferences.getLong(CustomDialogFragmentConstant.PREF_DONT_SHOW_DATE, new Date().getTime());
            long milliseconds = 24L * 60L * 60L * 1000L;
            if ((today - dayOfStartDontShow) / milliseconds >= 30) {
                sharedPreferences.edit()
                        .putBoolean(CustomDialogFragmentConstant.PREF_DONT_SHOW_ISCHECKED, false)
                        .remove(CustomDialogFragmentConstant.PREF_DONT_SHOW_DATE)
                        .apply();
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public void changeActivity(Class activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
