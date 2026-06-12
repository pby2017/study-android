package com.example.fragmentscommunicationapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// TODO: 현재 보여지는 fragment를 어떻게 찾을까
public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button toastCurrentFragmentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    @Override
    public void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_container, fragment, fragment.getClass().getSimpleName())
                .addToBackStack(fragment.getClass().getSimpleName())
                .commit();
    }

    @Override
    public String getNowFragmentClassName() {
        return null;
    }

    private void initialize() {
        initView();
        setFragment(FirstFragment.newInstance(0));
    }

    private void initView() {
        toastCurrentFragmentButton = findViewById(R.id.button_toast_current_fragment);
        toastCurrentFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frame_container);
                Toast.makeText(MainActivity.this, fragment.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
