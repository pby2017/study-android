package com.example.lifecycleapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.lifecycleapplication.CustomConstant.BLANK_FRAG_TAG;

public class BlankFragment extends Fragment {

    private static final String ARG_INDEX = "index";

    private int index;

    public BlankFragment() {
        // Required empty public constructor
    }

    // factory 패턴
    // 프래그먼트에서 사용될 데이터들을 인자(Argument)로 받
    // ex) 검색창. 검색단어를 프래그먼트에게 보내줌
    // 메소드 내부에서 번들(Bundle) 권장사항.
    // 인자(Argument)로 번들x -> 명확하지 않음 = 외부에서는 내부 동작을 몰라도 됨
    // 보일러플레이트 (이거 하나만 호출하면 해결)
    // 재활용을 위해서 이렇게 사용함.
    // 찾기가 쉽다.
    // alt f7
    public static BlankFragment newInstance(int index) {
        BlankFragment fragment = new BlankFragment();

        Bundle args = new Bundle();
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        Log.d(BLANK_FRAG_TAG, "onAttach()");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(BLANK_FRAG_TAG, "onCreate()");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.index = getArguments().getInt(ARG_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(BLANK_FRAG_TAG, "onCreateView()");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(BLANK_FRAG_TAG, "onActivityCreated()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(BLANK_FRAG_TAG, "onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(BLANK_FRAG_TAG, "onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(BLANK_FRAG_TAG, "onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(BLANK_FRAG_TAG, "onStop()");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(BLANK_FRAG_TAG, "onDestroyView()");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(BLANK_FRAG_TAG, "onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(BLANK_FRAG_TAG, "onDetach()");
        super.onDetach();
    }
}
