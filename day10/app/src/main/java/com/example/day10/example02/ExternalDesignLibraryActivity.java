package com.example.day10.example02;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.day10.R;

public class ExternalDesignLibraryActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_design_library);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.inflateMenu(R.menu.bottom_navigation_menu);
        fragmentManager = getSupportFragmentManager();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.item_tab_call:
                        fragment = new CallFragment();
                        break;
                    case R.id.item_tab_sms:
                        // TODO: add fragment
                        break;
                    case R.id.item_tab_photo:
                        // TODO: add fragment
                        break;
                    case R.id.item_tab_search:
                        // TODO: add fragment
                        break;
                }

//                final FragmentTransaction transaction = fragmentManager.beginTransaction();
//                transaction.replace(R.id.frame_container, fragment).commit();
                // TODO: add each case Fragment
                return true;
            }
        });
    }
}
