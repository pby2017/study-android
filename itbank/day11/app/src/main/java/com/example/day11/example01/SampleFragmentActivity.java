package com.example.day11.example01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.day11.R;

public class SampleFragmentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button changeFragmentLocationButton;
    private boolean isFirstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_fragment);

        initView();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.linear_fragment_container, new SampleFragment())
                    .commit();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_change_fragment_location:
                if (!isFirstFragment) {
                    changeFragmentLocation(new SampleFragment02());
                } else {
                    changeFragmentLocation(new SampleFragment());
                }
                isFirstFragment = !isFirstFragment;
                break;
        }
    }

    private void initView() {
        changeFragmentLocationButton = findViewById(R.id.button_change_fragment_location);
        changeFragmentLocationButton.setOnClickListener(this);
    }

    private void changeFragmentLocation(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.linear_fragment_container, fragment)
                .commit();
    }
}
