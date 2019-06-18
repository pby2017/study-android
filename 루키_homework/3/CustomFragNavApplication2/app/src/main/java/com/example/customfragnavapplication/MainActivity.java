package com.example.customfragnavapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.customfragnavapplication.home.HomeFragment;
import com.example.customfragnavapplication.mypage.MyYogiyoFragment;
import com.example.customfragnavapplication.orders.OrderHistoryFragment;
import com.example.customfragnavapplication.search.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ncapdevi.fragnav.FragNavController;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import static com.example.customfragnavapplication.constant.CustomConstant.FragNavConstant.INDEX_HOME;
import static com.example.customfragnavapplication.constant.CustomConstant.FragNavConstant.INDEX_MY_YOGIYO;
import static com.example.customfragnavapplication.constant.CustomConstant.FragNavConstant.INDEX_ORDER_HISTORY;
import static com.example.customfragnavapplication.constant.CustomConstant.FragNavConstant.INDEX_SEARCH;
import static com.example.customfragnavapplication.constant.CustomConstant.LogConstant.CUS_MAIN_ACT;

public class MainActivity extends AppCompatActivity implements
        FragNavController.RootFragmentListener,
        BottomNavigationView.OnNavigationItemSelectedListener,
        OnFragmentInteractionListener {

    private BottomNavigationView bottomNavigation;

    private FragNavController fragNavController = new FragNavController(getSupportFragmentManager(), R.id.frame_container);

    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(CUS_MAIN_ACT, "onCreate()");

        initView();

        initialize();

        Log.d(CUS_MAIN_ACT, "onCreate() - setRootFragments()");
        fragNavController.setRootFragments(fragments);

        Log.d(CUS_MAIN_ACT, "onCreate() - initialize()");
        fragNavController.initialize(FragNavController.TAB1, savedInstanceState);

        Log.d(CUS_MAIN_ACT, "onCreate() - setRootFragmentListener()");
        fragNavController.setRootFragmentListener(this);
    }

    // TODO: clearStack (i want to clear root fragment's editText...)
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Log.d(CUS_MAIN_ACT, "onNavigationItemSelected()");
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case R.id.item_tab_home:
                switchTab(INDEX_HOME);
                break;
            case R.id.item_tab_search:
                switchTab(INDEX_SEARCH);
                break;
            case R.id.item_tab_order_history:
                switchTab(INDEX_ORDER_HISTORY);
                break;
            case R.id.item_tab_my_yogiyo:
                switchTab(INDEX_MY_YOGIYO);
                break;
        }

        return true;
    }

    @NonNull
    @Override
    public Fragment getRootFragment(int index) {
        Log.d(CUS_MAIN_ACT, "getRootFragment()");
        switch (index) {
            case INDEX_HOME:
                return HomeFragment.newInstance(0);
            case INDEX_SEARCH:
                return SearchFragment.newInstance(0);
            case INDEX_ORDER_HISTORY:
                return OrderHistoryFragment.newInstance(0);
            case INDEX_MY_YOGIYO:
                return MyYogiyoFragment.newInstance(0);
        }
        throw new IllegalStateException("Need to send an index that we know");
    }

    @Override
    public int getNumberOfRootFragments() {
        Log.d(CUS_MAIN_ACT, "getNumberOfRootFragments()");
        return fragments.size();
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        Log.d(CUS_MAIN_ACT, "replaceFragment()");
        if (fragNavController.isRootFragment()) {
            fragNavController.pushFragment(fragment);
        } else {
            fragNavController.replaceFragment(fragment);
        }
    }

    // Exception: You can not popFragment the rootFragment.
    @Override
    public void onBackPressed() {
        Log.d(CUS_MAIN_ACT, "onBackPressed()");
        if (!fragNavController.isRootFragment()) {
            fragNavController.popFragment();
        } else {
            super.onBackPressed();
        }
    }

    private void initView() {
        Log.d(CUS_MAIN_ACT, "initView()");
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
    }

    private void initialize() {
        Log.d(CUS_MAIN_ACT, "initialize()");

        fragments = new ArrayList<>();

        fragments.add(HomeFragment.newInstance(0));
        fragments.add(SearchFragment.newInstance(0));
        fragments.add(OrderHistoryFragment.newInstance(0));
        fragments.add(MyYogiyoFragment.newInstance(0));

        fragNavController.setFragmentHideStrategy(FragNavController.DETACH_ON_NAVIGATE_HIDE_ON_SWITCH);
        fragNavController.setCreateEager(true);
    }

    private void switchTab(int tabIndex) {
        if (fragNavController.getCurrentStackIndex() == tabIndex) {
            fragNavController.clearStack(tabIndex);
        }
        fragNavController.switchTab(tabIndex);
    }

//    @Override
//    public void onFragmentTransaction(@Nullable Fragment fragment, @NotNull FragNavController.TransactionType transactionType) {
//        Log.d(CUS_MAIN_ACT, "onFragmentTransaction()");
//    }
//
//    @Override
//    public void onTabTransaction(@Nullable Fragment fragment, int i) {
//        Log.d(CUS_MAIN_ACT, "onTabTransaction()");
//    }
//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//        Log.d(CUS_MAIN_ACT, "onSaveInstanceState()");
//        fragNavController.onSaveInstanceState(outState);
//    }
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        Log.d(CUS_MAIN_ACT, "onOptionsItemSelected()");
//        switch (item.getItemId()) {
//            case R.id.item_tab_home:
//                fragNavController.popFragment();
//                break;
//        }
//        return true;
//    }
//
}
