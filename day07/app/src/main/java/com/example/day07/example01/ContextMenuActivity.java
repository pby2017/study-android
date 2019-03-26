package com.example.day07.example01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.day07.R;

public class ContextMenuActivity extends AppCompatActivity {

    private LinearLayout linearContextMenu;
    private Button buttonBlank02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        initView();

        registerForContextMenu(buttonBlank02);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRed:
                linearContextMenu.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                linearContextMenu.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                linearContextMenu.setBackgroundColor(Color.BLUE);
                return true;
        }
        return false;
    }

    private void initView() {
        linearContextMenu = (LinearLayout) findViewById(R.id.linear_context_menu);
        buttonBlank02 = (Button) findViewById(R.id.button_blank02);
    }
}
