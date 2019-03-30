package com.example.day08.example01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day08.R;

public class MyDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonDialog;
    private View viewDialog;

    private EditText editTextDialogName;
    private EditText editTextDialogEmail;

    private EditText editTextName;
    private EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);

        initView();

        setAlertDialogOnClickListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_dialog:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MyDialogActivity.this);
                alertDialogBuilder.setTitle("제목");
                alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
                alertDialogBuilder.setView(viewDialog);

                alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        editTextName.setText(editTextDialogName.getText().toString());
                        editTextEmail.setText(editTextDialogEmail.getText().toString());

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

    private void initView() {
        viewDialog = (View) View.inflate(MyDialogActivity.this, R.layout.my_dialog, null);

        buttonDialog = (Button) findViewById(R.id.button_dialog);

        editTextDialogName = (EditText) viewDialog.findViewById(R.id.edit_text_dialog_name);
        editTextDialogEmail = (EditText) viewDialog.findViewById(R.id.edit_text_dialog_email);

        editTextName = (EditText) findViewById(R.id.edit_text_name);
        editTextEmail = (EditText) findViewById(R.id.edit_text_email);
    }

    private void setAlertDialogOnClickListener() {
        buttonDialog.setOnClickListener(MyDialogActivity.this);
    }
}
