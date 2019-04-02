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

public class SampleFragment extends Fragment implements View.OnClickListener {

    private final String TAG = "sample_frag";

    private View view;
    private TextView countText;
    private Button countUpFromFragmentButton;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "[Fragment] onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "[Fragment] onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "[Fragment] onCreateView()");
        view = inflater.inflate(R.layout.fragment_sample, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "[Fragment] onActivityCreated()");

        initView();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "[Fragment] onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "[Fragment] onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "[Fragment] onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "[Fragment] onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "[Fragment] onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[Fragment] onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "[Fragment] onDetach()");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_count_up_from_fragment:
                countUp();
                break;
        }
    }

    private void initView() {
        View fragmentView = getActivity().getLayoutInflater().inflate(R.layout.fragment_sample, null);
        countText = view.findViewById(R.id.text_count);
        countText.setText("0");
        countUpFromFragmentButton = fragmentView.findViewById(R.id.button_count_up_from_fragment);
        countUpFromFragmentButton.setOnClickListener(this);

        // TODO: 클릭 리스너 = null 문제 해결 필요
    }

    public void countUp() {
        int nowCount = Integer.parseInt(countText.getText().toString()) + 1;
        countText.setText(String.valueOf(nowCount));
    }
}
