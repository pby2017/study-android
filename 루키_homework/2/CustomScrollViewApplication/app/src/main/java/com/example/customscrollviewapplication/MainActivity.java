package com.example.customscrollviewapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;

import com.example.customscrollviewapplication.pages.FirstFragment;
import com.example.customscrollviewapplication.pages.SecondFragment;

// TODO: 스크롤 올릴 때는 앱바가 먼저 반응하는데 스크롤 내릴 때도 앱바가 먼저 반응하는 문제

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TabLayout tabLayout;
    private FrameLayout containerFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initialize();
    }

    private void initialize() {
        setFragment(FirstFragment.getInstance());
    }

    private void initView() {

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("hello"));
        tabLayout.addTab(tabLayout.newTab().setText("hello"));
        int tabCount = tabLayout.getSelectedTabPosition();
        if(tabCount == 0){
            setFragment(FirstFragment.getInstance());
        } else {
            setFragment(SecondFragment.getInstance());
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        setFragment(FirstFragment.getInstance());
                        break;
                    case 1:
                        setFragment(SecondFragment.getInstance());
                        break;
                    default:
                        break;
                }
                Log.d(TAG, String.valueOf(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        containerFrame = findViewById(R.id.frame_container);
    }

    private void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }
}
