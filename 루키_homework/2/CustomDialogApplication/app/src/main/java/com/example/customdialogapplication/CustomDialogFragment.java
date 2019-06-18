package com.example.customdialogapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.customdialogapplication.member.settings.ChangePasswordActivity;

import java.util.Date;

public class CustomDialogFragment extends DialogFragment implements View.OnClickListener {

    private static final String THIS_TAG = "custom_dialog_frag";

    private CustomDialogInterface customDialogInterface;

    private TextView customTitleText;
    private TextView customContentText;
    private TextView customDoNotShowText;

    public static CustomDialogFragment newInstance() {
        Log.d(THIS_TAG, "newInstance()");
        initialize();
        return new CustomDialogFragment();
    }

    private static void initialize() {
        Log.d(THIS_TAG, "initialize()");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(THIS_TAG, "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(THIS_TAG, "onCreate()");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Log.d(THIS_TAG, "onCreateDialog()");
        // onCreateDialog : 제공해주는 inflate를 사용하는 건 어떨지
        // 기존 뷰를 놔두고 새로운 다이얼로그를 만들어서 띄운다
        View customDialogFragmentView = getActivity().getLayoutInflater().inflate(R.layout.fragment_custom_dialog, null);

        customDialogFragmentView.findViewById(R.id.button_go_to_change_password).setOnClickListener(this);
        customDialogFragmentView.findViewById(R.id.button_close_dialog).setOnClickListener(this);

        return new AlertDialog.Builder(getActivity())
                .setView(customDialogFragmentView)
                .create();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(THIS_TAG, "onCreateView()");
        // onCreateView : 기존 뷰 container 에 View를 
        // fragment를 왜 쓰게 되었을지 고민해보기
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(THIS_TAG, "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(THIS_TAG, "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(THIS_TAG, "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(THIS_TAG, "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(THIS_TAG, "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(THIS_TAG, "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(THIS_TAG, "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(THIS_TAG, "onDetach()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_go_to_change_password:
                dismiss();
                ((MainActivity) getActivity()).changeActivity(ChangePasswordActivity.class);
                break;
            case R.id.button_close_dialog:
                long dayOfStartDontShow = new Date().getTime();
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences(CustomDialogFragmentConstant.CUSTOM_DIALOG_FRAGMENT, Context.MODE_PRIVATE);
                sharedPreferences.edit()
                        .putBoolean(CustomDialogFragmentConstant.PREF_DONT_SHOW_ISCHECKED, true)
                        .putLong(CustomDialogFragmentConstant.PREF_DONT_SHOW_DATE, dayOfStartDontShow)
                        .apply();
                dismiss();
                Toast.makeText(getContext(), getString(R.string.text_dont_show_checked), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /*
     * Parameter example
     * width = ViewGroup.LayoutParams.MATCH_PARENT;
     * height = ViewGroup.LayoutParams.WRAP_CONTENT;
     * */
    private void setViewGroupSize(int width, int height) {
        ViewGroup.LayoutParams params = getDialog().getWindow().getAttributes();
        params.width = width;
        params.height = height;
        getDialog().getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);
    }
}
