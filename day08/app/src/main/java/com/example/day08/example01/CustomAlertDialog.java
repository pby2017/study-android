package com.example.day08.example01;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day08.R;

public class CustomAlertDialog extends DialogFragment implements CustomAlertDialogInterface {

    private EditText dialogNameEditText;
    private EditText dialogEmailEditText;


    public static CustomAlertDialog newInstance(){
        return new CustomAlertDialog();
    }

    public CustomAlertDialog() {
//        View myDialogView = View.inflate(getActivity(), R.layout.my_dialog, null);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // TODO: dialogView를 불러오고 각 EditView를 불러오는 방법은?

        View myDialogView = inflater.inflate(R.layout.my_dialog, container);
        dialogNameEditText = myDialogView.findViewById(R.id.edit_text_dialog_name);
        dialogEmailEditText = myDialogView.findViewById(R.id.edit_text_dialog_email);
        return myDialogView;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // TODO: setView에 인자로 전송할 dialogView 불러오는 방법은?

        return new AlertDialog.Builder(getActivity())
                .setTitle("제목")
                .setIcon(R.mipmap.ic_launcher)
//                .setView(myDialogView)
                .setPositiveButton(R.string.send, this)
                .setNegativeButton(R.string.cancel, this)
                .setOnCancelListener(this)
                .setOnDismissListener(this)
                .create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case DialogInterface.BUTTON_POSITIVE:
                // TODO: Activity의 View들을 불러오는 방법은?
//                EditText nameEditText = getActivity().getParent().findViewById(R.id.edit_text_name);
//                EditText emailEditText = getActivity().getParent().findViewById(R.id.edit_text_email);
//                nameEditText.setText(dialogNameEditText.getText().toString());
//                emailEditText.setText(dialogEmailEditText.getText().toString());
                Toast.makeText(getActivity(), "확인을 누르셨어요.", Toast.LENGTH_SHORT).show();
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(getActivity(), "취소를 누르셨어요.", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Toast.makeText(getActivity(), "(onCancel) you clicked back button", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Toast.makeText(getActivity(), "(onDismiss) you selected ok or cancel", Toast.LENGTH_SHORT).show();
    }
}
