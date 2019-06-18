package com.example.fragmentscommunicationapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment implements View.OnClickListener {
    private static final String ARG_INDEX = "index";

    private int index;

    private OnFragmentInteractionListener mListener;

    private Button replaceThirdFragmentButton;

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance(int index) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.index = getArguments().getInt(ARG_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        replaceThirdFragmentButton = view.findViewById(R.id.button_replace_third_fragment);
        replaceThirdFragmentButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        if (mListener != null) {
            switch (v.getId()){
                case R.id.button_replace_third_fragment:
                    mListener.setFragment(ThirdFragment.newInstance(0));
                    break;
            }
        }
    }
}
