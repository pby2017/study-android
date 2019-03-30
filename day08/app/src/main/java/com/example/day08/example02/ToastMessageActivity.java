package com.example.day08.example02;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.day08.R;

public class ToastMessageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button showDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_message);

        initView();
    }

    private void initView() {
        showDialogButton = findViewById(R.id.button_show_dialog);
        showDialogButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_show_dialog:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("제목");
                alertDialogBuilder.setIcon(R.mipmap.ic_launcher);

                alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toastMsg = Toast.makeText(getApplicationContext(), "확인을 누르셨어요.", Toast.LENGTH_SHORT);

                        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();

                        int xOffset = (int) (Math.random() * display.getWidth());
                        int yOffset = (int) (Math.random() * display.getHeight());

                        toastMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);

                        // TODO: start here

                        toastMsg.show();
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
}
