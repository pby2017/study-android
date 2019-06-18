package com.example.customfragnavapplication.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.customfragnavapplication.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AllRestaurantFragment extends Fragment {

    public static AllRestaurantFragment newInstance(int index) {
        AllRestaurantFragment allRestaurantFragment = new AllRestaurantFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        allRestaurantFragment.setArguments(args);

        return allRestaurantFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_restaurant, container, false);
        return view;
    }
}
