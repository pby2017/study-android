package com.example.day15.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.day15.R;
import com.example.day15.example01.adapter.MyRecyclerViewAdapter;
import com.example.day15.example01.model.User;

import java.util.ArrayList;
import java.util.Date;

public class MyRecyclerViewActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String MY_RECYCLER_ACT = "MY_RECYCLER_ACT";
    private ArrayList<User> userArrayList;

    private LinearLayoutManager myLinearLayoutManager;
    private MyRecyclerViewAdapter myRecyclerViewAdapter;

    private RecyclerView recyclerView;
    private Button addRecyclerViewItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        initView();

        initialize();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_add_recycler_view_item:
                User user = new User("a@a.com", String.valueOf(new Date().getTime()));
                userArrayList.add(user);
                myRecyclerViewAdapter.notifyDataSetChanged();
                Log.d(MY_RECYCLER_ACT, String.valueOf(userArrayList.size()));
                break;
        }
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycler_view);
        addRecyclerViewItemButton = findViewById(R.id.button_add_recycler_view_item);
        addRecyclerViewItemButton.setOnClickListener(this);
    }

    private void initialize() {
        userArrayList = new ArrayList<>();
        User user = new User("a@a.com", String.valueOf(new Date().getTime()));
        userArrayList.add(user);
        myLinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myLinearLayoutManager);
        myRecyclerViewAdapter = new MyRecyclerViewAdapter(userArrayList);
        recyclerView.setAdapter(myRecyclerViewAdapter);
    }
}
