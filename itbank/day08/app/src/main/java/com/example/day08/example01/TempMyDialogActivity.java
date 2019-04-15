package com.example.day08.example01;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.day08.R;

public class TempMyDialogActivity extends AppCompatActivity implements View.OnClickListener {

//    private View myDialogView;

    private EditText nameEditText;
    private EditText emailEditText;

//    private AlertDialog.Builder alertDialogBuilder;
//    private AlertDialog dialog;

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
                final DialogFragment dialogFragment = new CustomAlertDialog();
                dialogFragment.show(getSupportFragmentManager(), "TAG");
//                if (dialog == null) {
//                    dialog = CustomAlertDialog.newInstance();
//                    dialog = build...
//                }
//                dialog.show();
                break;
        }
    }

    private void initView() {

        Button dialogButton = findViewById(R.id.button_dialog);
        dialogButton.setOnClickListener(this);

        nameEditText = findViewById(R.id.edit_text_name);
        emailEditText = findViewById(R.id.edit_text_email);
    }
}
