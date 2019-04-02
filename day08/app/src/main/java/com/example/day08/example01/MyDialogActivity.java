package com.example.day08.example01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day08.R;

public class MyDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private Button dialogButton;

    private EditText nameEditText;
    private EditText emailEditText;

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_dialog:
                if (dialog == null) {
                    dialog = buildAlertDialog();
                }

                dialog.show();
                break;
        }
    }

    private void initView() {

        dialogButton = findViewById(R.id.button_dialog);
        dialogButton.setOnClickListener(this);

        nameEditText = findViewById(R.id.edit_text_name);
        emailEditText = findViewById(R.id.edit_text_email);
    }

    private AlertDialog buildAlertDialog() {
        View myDialogView = View.inflate(this, R.layout.my_dialog, null);
        final EditText dialogNameEditText = myDialogView.findViewById(R.id.edit_text_dialog_name);
        final EditText dialogEmailEditText = myDialogView.findViewById(R.id.edit_text_dialog_email);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("제목");
        alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
        alertDialogBuilder.setView(myDialogView);

        alertDialogBuilder.setPositiveButton(R.string.send, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                nameEditText.setText(dialogNameEditText.getText().toString());
                emailEditText.setText(dialogEmailEditText.getText().toString());

                Toast.makeText(getApplicationContext(), "확인을 누르셨어요.", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "취소를 누르셨어요.", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(getApplicationContext(), "(onCancel) you clicked back button", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                Toast.makeText(getApplicationContext(), "(onDismiss) you selected ok or cancel", Toast.LENGTH_SHORT).show();
            }
        });

        return alertDialogBuilder.create();
    }
}