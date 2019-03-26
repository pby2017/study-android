package com.example.day07.example02;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.day07.R;

public class AlertDialogActivity extends AppCompatActivity
        implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener {

    private Button buttonShowAlertDialog;

    private String[] drinks = new String[]{"콜라", "사이다", "커피"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        initView();

        setViewOnClickListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_show_alert_dialog:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AlertDialogActivity.this);
                alertDialogBuilder.setTitle("제목");
                alertDialogBuilder.setIcon(R.mipmap.ic_launcher);

//                setAlertDialogOnClickListener01(alertDialogBuilder);
//                setAlertDialogOnClickListener02(alertDialogBuilder);
                setAlertDialogOnClickListener03(alertDialogBuilder);

                alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "확인을 누르셨어요.", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialogBuilder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "취소를 누르셨어요.", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialogBuilder.show();

                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case 0:
                Toast.makeText(getApplicationContext(), drinks[which] + " 클릭", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(getApplicationContext(), drinks[which] + " 클릭", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(), drinks[which] + " 클릭", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
        switch (which) {
            case 0:
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), drinks[which] + " 체크", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), drinks[which] + " 체크 해제", Toast.LENGTH_SHORT).show();
                }
                break;
            case 1:
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), drinks[which] + " 체크", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), drinks[which] + " 체크 해제", Toast.LENGTH_SHORT).show();
                }
                break;
            case 2:
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), drinks[which] + " 체크", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), drinks[which] + " 체크 해제", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void setViewOnClickListener() {
        buttonShowAlertDialog.setOnClickListener(this);
    }

    private void initView() {
        buttonShowAlertDialog = (Button) findViewById(R.id.button_show_alert_dialog);
    }

    private void setAlertDialogOnClickListener01(AlertDialog.Builder alertDialogBuilder) {
        alertDialogBuilder.setItems(drinks, this);
    }

    private void setAlertDialogOnClickListener02(AlertDialog.Builder alertDialogBuilder) {
        alertDialogBuilder.setSingleChoiceItems(drinks, 0, this);
    }

    private void setAlertDialogOnClickListener03(AlertDialog.Builder alertDialogBuilder) {
        boolean[] boolArray = new boolean[]{true, false, false};
        alertDialogBuilder.setMultiChoiceItems(drinks, boolArray, this);
    }
}
