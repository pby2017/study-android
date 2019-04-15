package com.example.day11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day11.example01.SampleFragmentActivity;
import com.example.day11.example02.VerticalHorizontalFragmentActivity;
import com.example.day11.example03.BottomNavigationViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startFragmentActivityButton;
    private Button startVerticalHorizontalActivityButton;
    private Button startBottomNavigationViewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_fragment_activity:
                startActivity(new Intent(this, SampleFragmentActivity.class));
                break;
            case R.id.button_start_vertical_horizontal_activity:
                startActivity(new Intent(this, VerticalHorizontalFragmentActivity.class));
                break;
            case R.id.button_start_bottom_navigation_view_activity:
                startActivity(new Intent(this, BottomNavigationViewActivity.class));
                break;
        }
    }

    private void initView() {
        startFragmentActivityButton = findViewById(R.id.button_start_fragment_activity);
        startFragmentActivityButton.setOnClickListener(this);
        startVerticalHorizontalActivityButton = findViewById(R.id.button_start_vertical_horizontal_activity);
        startVerticalHorizontalActivityButton.setOnClickListener(this);
        startBottomNavigationViewActivityButton = findViewById(R.id.button_start_bottom_navigation_view_activity);
        startBottomNavigationViewActivityButton.setOnClickListener(this);
    }

}
