package com.example.day11.example03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.day11.R;

public class CallFragment extends Fragment implements View.OnClickListener {

    private StartActivityWithUriListener listener;

    private View fragmentCall;
    private EditText phoneNumberEditText;
    private Button sendButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentCall = inflater.inflate(R.layout.fragment_call, container, false);

        initView();

        return fragmentCall;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_send:
                listener.startActivityWithUri("tel:010-1234-1234", Intent.ACTION_VIEW);
                break;
        }
    }

    private void initView() {
        phoneNumberEditText = fragmentCall.findViewById(R.id.edit_text_phone_number);
        phoneNumberEditText.setOnClickListener(this);
        sendButton = fragmentCall.findViewById(R.id.button_send);
        sendButton.setOnClickListener(this);
    }

    public void setStartActivityWithUriListener(StartActivityWithUriListener listener) {
        this.listener = listener;
    }
}
