package com.example.customfragnavapplication.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.customfragnavapplication.OnFragmentInteractionListener;
import com.example.customfragnavapplication.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_HOME_FRAG;
import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_HOME_FRAG;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener fragmentInteractionListener;

    private ImageView startRestaurantFragmentImage;

    public static HomeFragment newInstance(int index) {
        Log.d(CUS_HOME_FRAG, "newInstance()");
        HomeFragment homeFragment = new HomeFragment();

        Bundle args = new Bundle();
        args.putInt("index", index);
        homeFragment.setArguments(args);

        return homeFragment;
    }

    @Override
    public void onAttach(Context context) {
        Log.d(CUS_HOME_FRAG, "onAttach()");
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            fragmentInteractionListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(CUS_HOME_FRAG, "onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(CUS_HOME_FRAG, "onCreateView()");
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        startRestaurantFragmentImage = view.findViewById(R.id.image_start_restaurant_fragment);
        startRestaurantFragmentImage.setOnClickListener(this);

        return view;
    }

    @Override
    public void onStart() {
        Log.d(CUS_HOME_FRAG, "onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(CUS_HOME_FRAG, "onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(CUS_HOME_FRAG, "onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(CUS_HOME_FRAG, "onStop()");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(CUS_HOME_FRAG, "onDestroyView()");
        super.onDestroyView();
    }

    // be not called
    @Override
    public void onDetach() {
        Log.d(CUS_HOME_FRAG, "onDetach()");
        super.onDetach();
    }

    // be not called
    @Override
    public void onDestroy() {
        Log.d(CUS_HOME_FRAG, "onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Log.d(CUS_HOME_FRAG, "onClick()");
        switch (v.getId()) {
            case R.id.image_start_restaurant_fragment:
                fragmentInteractionListener.replaceFragment(RestaurantFragment.newInstance(0));
                break;
        }
    }
}
