package com.example.customfragnavapplication.search;

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

import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_SEARCH_FRAG;
import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_SEARCH_FRAG;

public class SearchFragment extends Fragment {

    private OnFragmentInteractionListener fragmentInteractionListener;

    public static SearchFragment newInstance(int index) {
        Log.d(CUS_SEARCH_FRAG, "newInstance()");
        SearchFragment searchFragment = new SearchFragment();

        Bundle args = new Bundle();
        args.putInt("index", index);
        searchFragment.setArguments(args);

        return searchFragment;
    }

    @Override
    public void onAttach(Context context) {
        Log.d(CUS_SEARCH_FRAG, "onAttach()");
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
        Log.d(CUS_SEARCH_FRAG, "onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(CUS_SEARCH_FRAG, "onCreateView()");
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }

    @Override
    public void onStart() {
        Log.d(CUS_SEARCH_FRAG, "onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(CUS_SEARCH_FRAG, "onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(CUS_SEARCH_FRAG, "onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(CUS_SEARCH_FRAG, "onStop()");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(CUS_SEARCH_FRAG, "onDestroyView()");
        super.onDestroyView();
    }

    // be not called
    @Override
    public void onDetach() {
        Log.d(CUS_SEARCH_FRAG, "onDetach()");
        super.onDetach();
    }

    // be not called
    @Override
    public void onDestroy() {
        Log.d(CUS_SEARCH_FRAG, "onDestroy()");
        super.onDestroy();
    }
}
