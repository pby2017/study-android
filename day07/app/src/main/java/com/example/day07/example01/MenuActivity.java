package com.example.day07.example01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.day07.R;

public class MenuActivity extends AppCompatActivity {

    private LinearLayout linearMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initView();
    }

    private void initView() {
        linearMenu = findViewById(R.id.linear_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itemRed:
                linearMenu.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                linearMenu.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                linearMenu.setBackgroundColor(Color.BLUE);
                return true;
        }
        return false;
    }
}
