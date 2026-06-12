package com.example.myrecyclerviewapp;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.Random;

import static com.example.myrecyclerviewapp.constant.MyConstant.MY_ICON_ANIMATOR_TAG;

public class MyIconRecyclerItemAnimator extends DefaultItemAnimator {

    @Override
    public boolean animateAdd(RecyclerView.ViewHolder holder) {
        Log.d(MY_ICON_ANIMATOR_TAG, "animateAdd");

        View view = holder.itemView;
        view.setTranslationX(new Random().nextInt(1000));

        return super.animateAdd(holder);
    }

    @Override
    public boolean animateRemove(RecyclerView.ViewHolder holder) {
        Log.d(MY_ICON_ANIMATOR_TAG, "animateRemove");

        View view = holder.itemView;

        return super.animateRemove(holder);
    }

    @Override
    public boolean animateMove(RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY) {
        Log.d(MY_ICON_ANIMATOR_TAG, "animateMove");

        View view = holder.itemView;
        view.setTranslationX(new Random().nextInt(1000));
        return super.animateMove(holder, fromX, fromY, toX, toY);
    }

    @Override
    public boolean animateChange(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder newHolder, int fromX, int fromY, int toX, int toY) {
        Log.d(MY_ICON_ANIMATOR_TAG, "animateChange");

        View oldView = oldHolder.itemView;
        View newView = newHolder.itemView;
        return super.animateChange(oldHolder, newHolder, fromX, fromY, toX, toY);
    }

    @Override
    public void endAnimation(RecyclerView.ViewHolder item) {
        super.endAnimation(item);
        Log.d(MY_ICON_ANIMATOR_TAG, "endAnimation");

        View view = item.itemView;
        view.setTranslationX(new Random().nextInt(1000));
    }

    @Override
    public boolean isRunning() {
//        Log.d(MY_ICON_ANIMATOR_TAG, "isRunning");

        return super.isRunning();
    }
}
