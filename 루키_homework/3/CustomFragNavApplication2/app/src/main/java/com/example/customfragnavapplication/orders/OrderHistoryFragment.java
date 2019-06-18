package com.example.customfragnavapplication.orders;

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

import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_ORDER_FRAG;

public class OrderHistoryFragment extends Fragment {

    private OnFragmentInteractionListener fragmentInteractionListener;

    public static OrderHistoryFragment newInstance(int index) {
        Log.d(CUS_ORDER_FRAG, "newInstance()");
        OrderHistoryFragment orderHistoryFragment = new OrderHistoryFragment();

        Bundle args = new Bundle();
        args.putInt("index", index);
        orderHistoryFragment.setArguments(args);

        return orderHistoryFragment;
    }

    @Override
    public void onAttach(Context context) {
        Log.d(CUS_ORDER_FRAG, "onAttach()");
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
        super.onCreate(savedInstanceState);
        Log.d(CUS_ORDER_FRAG, "onCreate()");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(CUS_ORDER_FRAG, "onCreateView()");
        View view = inflater.inflate(R.layout.fragment_order_history, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(CUS_ORDER_FRAG, "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(CUS_ORDER_FRAG, "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(CUS_ORDER_FRAG, "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(CUS_ORDER_FRAG, "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(CUS_ORDER_FRAG, "onDestroyView()");
    }

    // be not called
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(CUS_ORDER_FRAG, "onDetach()");
    }

    // be not called
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(CUS_ORDER_FRAG, "onDestroy()");
    }
}
