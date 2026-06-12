package com.example.customfragnavapplication.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.customfragnavapplication.R;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RestaurantFragment extends Fragment {

    private TabLayout tabRestaurant;

    public static RestaurantFragment newInstance(int index) {
        RestaurantFragment restaurantFragment = new RestaurantFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        restaurantFragment.setArguments(args);

        return restaurantFragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        tabRestaurant = view.findViewById(R.id.tab_restaurant);
        tabRestaurant.addTab(tabRestaurant.newTab().setText("전체"));
        tabRestaurant.addTab(tabRestaurant.newTab().setText("1인분주문"));
        tabRestaurant.addTab(tabRestaurant.newTab().setText("치킨"));
        tabRestaurant.addTab(tabRestaurant.newTab().setText("중국집"));
        tabRestaurant.addTab(tabRestaurant.newTab().setText("피자/양식"));
        tabRestaurant.addTab(tabRestaurant.newTab().setText("한식"));
        tabRestaurant.addTab(tabRestaurant.newTab().setText("분식"));

        return view;
    }
}
