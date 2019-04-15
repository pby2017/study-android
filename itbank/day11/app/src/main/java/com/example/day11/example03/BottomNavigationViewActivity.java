package com.example.day11.example03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.day11.R;

public class BottomNavigationViewActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, StartActivityWithUriListener {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);

        initView();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_fragment_container, fragment)
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id) {
            case R.id.item_tab_call:
                fragment = new CallFragment();
                ((CallFragment) fragment).setStartActivityWithUriListener(this);
                break;
            case R.id.item_tab_sms:
                fragment = new SmsFragment();
                break;
            case R.id.item_tab_photo:
                fragment = new PhotoFragment();
                break;
            case R.id.item_tab_web_search:
                fragment = new WebSearchFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_fragment_container, fragment)
                .commit();

        return true;
    }

    @Override
    public void startActivityWithUri(String uriString, String intentAction) {
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(intentAction, uri);
        startActivity(intent);
    }

    private void initView() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.inflateMenu(R.menu.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        fragment = new CallFragment();
        ((CallFragment) fragment).setStartActivityWithUriListener(this);
    }
}
