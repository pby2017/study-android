package com.example.customfragnavapplication.mypage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.customfragnavapplication.OnFragmentInteractionListener;
import com.example.customfragnavapplication.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_MY_YOGIYO_FRAG;

public class MyYogiyoFragment extends Fragment {

    private OnFragmentInteractionListener fragmentInteractionListener;

    public static MyYogiyoFragment newInstance(int index) {
        Log.d(CUS_MY_YOGIYO_FRAG, "newInstance()");
        MyYogiyoFragment myYogiyoFragment = new MyYogiyoFragment();

        Bundle args = new Bundle();
        args.putInt("index", index);
        myYogiyoFragment.setArguments(args);

        return myYogiyoFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            fragmentInteractionListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(CUS_MY_YOGIYO_FRAG, "onCreateView()");
        View view = inflater.inflate(R.layout.fragment_my_yogiyo, container, false);
        return view;
    }
}
