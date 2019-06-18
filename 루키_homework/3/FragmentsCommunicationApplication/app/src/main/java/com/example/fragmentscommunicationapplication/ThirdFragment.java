package com.example.fragmentscommunicationapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment implements View.OnClickListener {
    private static final String ARG_INDEX = "index";

    private int index;

    private OnFragmentInteractionListener mListener;

    private Button replaceFirstFragmentButton;

    public ThirdFragment() {
        // Required empty public constructor
    }

    public static ThirdFragment newInstance(int index) {
        ThirdFragment fragment = new ThirdFragment();
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
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        replaceFirstFragmentButton = view.findViewById(R.id.button_replace_first_fragment);
        replaceFirstFragmentButton.setOnClickListener(this);

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
            switch (v.getId()) {
                case R.id.button_replace_first_fragment:
                    mListener.setFragment(FirstFragment.newInstance(0));
                    break;
            }
        }
    }
}
