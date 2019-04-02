package com.example.day12.example01;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.day12.R;

public class SampleFragment02 extends Fragment implements View.OnClickListener {
    private final String TAG = "sample_frag02";

    private View view;
    private TextView countText;
    private Button countUpFromFragmentButton;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "[Fragment02] onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "[Fragment02] onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "[Fragment02] onCreateView()");
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "[Fragment02] onActivityCreated()");

        initView();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "[Fragment02] onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "[Fragment02] onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "[Fragment02] onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "[Fragment02] onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "[Fragment02] onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[Fragment02] onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "[Fragment02] onDetach()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_fragment_count_up:
                int nowCount = Integer.parseInt(countText.getText().toString()) + 1;
                countText.setText(String.valueOf(nowCount));
                break;
        }
    }

    private void initView() {
        view = getActivity().getLayoutInflater().inflate(R.layout.fragment_sample, null);
        countText = view.findViewById(R.id.text_count);
        countText.setText("0");
        countUpFromFragmentButton = view.findViewById(R.id.button_fragment_count_up);
//        countUpFromFragmentButton.setOnClickListener(this);
    }
}
