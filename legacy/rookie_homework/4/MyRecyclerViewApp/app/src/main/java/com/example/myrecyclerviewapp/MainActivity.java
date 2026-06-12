package com.example.myrecyclerviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myrecyclerviewapp.adapter.MyIconRecyclerAdapter;
import com.example.myrecyclerviewapp.constant.MyConstant;
import com.example.myrecyclerviewapp.model.MyIcon;
import com.example.myrecyclerviewapp.util.MyUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.example.myrecyclerviewapp.constant.MyConstant.MAIN_ACTIVITY_TAG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int ITEM_ADD_COUNT = 2;
    private static final int ITEM_DELETE_COUNT = 2;

    private List<MyIcon> myIcons;
    private RecyclerView.Adapter recyclerAdapter;
    private LinearLayoutManager recyclerLayoutManager;

    private RecyclerView recycler;
    private Button addItemButton;
    private Button deleteItemButton;

    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initialize();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_add_item:
                for (int i = 0; i < ITEM_ADD_COUNT; i++) {
                    int randomPosition = random.nextInt(MyConstant.ALL_ICONS.size());
                    MyIcon randomIcon = MyConstant.ALL_ICONS.get(randomPosition);
                    myIcons.add(0, new MyIcon(randomIcon.getMyIconResource(), randomIcon.getMyIconDescription(), MyUtils.getNowTimeString()));
                }
                recyclerAdapter.notifyItemRangeInserted(0, ITEM_ADD_COUNT);
                recycler.scrollToPosition(0);
                break;
            case R.id.button_delete_item:
                for (int i = 0; i < ITEM_DELETE_COUNT && myIcons.size() >= ITEM_DELETE_COUNT; i++) {
                    myIcons.remove(0);
                }
                recyclerAdapter.notifyItemRangeRemoved(0, ITEM_DELETE_COUNT);
                recycler.scrollToPosition(0);
                break;
        }
    }

    private void initView() {
        recycler = findViewById(R.id.recycler);
        addItemButton = findViewById(R.id.button_add_item);
        addItemButton.setOnClickListener(this);
        deleteItemButton = findViewById(R.id.button_delete_item);
        deleteItemButton.setOnClickListener(this);
    }

    private void initialize() {

        random = new Random();
        myIcons = new LinkedList<>();

        recycler.setHasFixedSize(true);

        recyclerLayoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(recyclerLayoutManager);

        recyclerAdapter = new MyIconRecyclerAdapter(myIcons);
        recycler.setAdapter(recyclerAdapter);

        recycler.addItemDecoration(new DividerItemDecoration(this, recyclerLayoutManager.getOrientation()));
        recycler.addItemDecoration(new MyIconRecyclerItemDecoration(48));
        Log.d(MAIN_ACTIVITY_TAG, String.valueOf(recycler.getItemDecorationCount()));

        RecyclerView.ItemAnimator recyclerItemAnimator = new MyIconRecyclerItemAnimator();
        recyclerItemAnimator.setAddDuration(500);
        recyclerItemAnimator.setRemoveDuration(500);
        recyclerItemAnimator.setMoveDuration(500);
        recycler.setItemAnimator(recyclerItemAnimator);

        recyclerAdapter.notifyDataSetChanged();
        recycler.scrollToPosition(0);
    }

    // xml animator
//    private void runLayoutAnimation(final RecyclerView recyclerView) {
//        if (recyclerView.getAdapter() != null) {
//            final Context context = recyclerView.getContext();
//            final LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down);
//            recyclerView.setLayoutAnimation(layoutAnimationController);
//            recyclerView.getAdapter().notifyDataSetChanged();
//            recyclerView.scheduleLayoutAnimation();
//        }
//    }
}