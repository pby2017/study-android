package com.example.customchat.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.customchat.R;
import com.example.customchat.chatting.ChattingActivity;
import com.example.customchat.main.chattings.ChattingsFragment;
import com.example.customchat.main.friends.FriendsFragment;
import com.example.customchat.main.mysettings.MySettingsFragment;
import com.example.customchat.main.search.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ncapdevi.fragnav.FragNavController;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import static com.example.customchat.constant.CustomConstant.FragNavRootIndex.INDEX_CHATTINGS;
import static com.example.customchat.constant.CustomConstant.FragNavRootIndex.INDEX_FRIENDS;
import static com.example.customchat.constant.CustomConstant.FragNavRootIndex.INDEX_MY_SETTINGS;
import static com.example.customchat.constant.CustomConstant.FragNavRootIndex.INDEX_SEARCH;

public class MainFragNavActivity extends AppCompatActivity implements
        FragNavController.RootFragmentListener
        , BottomNavigationView.OnNavigationItemSelectedListener
//        , OnFragmentInteractionListener
        , ChattingsFragment.ChattingsFragmentInterface {

    private BottomNavigationView bottomNavigation;

    private FragNavController fragNavController = new FragNavController(getSupportFragmentManager(), R.id.frame_container);

    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frag_nav);

        initView();

        initialize();

        fragNavController.setRootFragments(fragments);

        fragNavController.initialize(FragNavController.TAB1, savedInstanceState);

        fragNavController.setRootFragmentListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        switch (itemId) {
            case R.id.item_tab_friends:
                switchTab(INDEX_FRIENDS);
                break;
            case R.id.item_tab_chattings:
                switchTab(INDEX_CHATTINGS);
                break;
            case R.id.item_tab_not_yet01:
                switchTab(INDEX_SEARCH);
                break;
            case R.id.item_tab_not_yet02:
                switchTab(INDEX_MY_SETTINGS);
                break;
        }

        return true;
    }

    @Override
    public int getNumberOfRootFragments() {
        return fragments.size();
    }

    @NotNull
    @Override
    public Fragment getRootFragment(int index) {
        switch (index) {
            case INDEX_FRIENDS:
                return FriendsFragment.newInstance();
            case INDEX_CHATTINGS:
                return ChattingsFragment.newInstance();
            case INDEX_SEARCH:
                return SearchFragment.newInstance();
            case INDEX_MY_SETTINGS:
                return MySettingsFragment.newInstance();
        }
        throw new IllegalStateException("Need to send an index that we know");
    }

    private void initView() {
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
    }

    private void initialize() {
        fragments = new ArrayList<>();

        fragments.add(FriendsFragment.newInstance());
        fragments.add(ChattingsFragment.newInstance());
        fragments.add(SearchFragment.newInstance());
        fragments.add(MySettingsFragment.newInstance());
    }

    private void switchTab(int tabIndex) {
        if (fragNavController.getCurrentStackIndex() == tabIndex) {
            fragNavController.clearStack(tabIndex);
        }
        fragNavController.switchTab(tabIndex);
    }

    @Override
    public void startChattingActivity(String key, String value) {
        Intent chattingIntent = new Intent(this, ChattingActivity.class);
        chattingIntent.putExtra(key, value);
        startActivity(chattingIntent);
    }
}
