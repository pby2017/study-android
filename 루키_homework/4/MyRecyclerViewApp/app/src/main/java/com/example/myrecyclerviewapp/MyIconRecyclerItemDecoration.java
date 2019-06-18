package com.example.myrecyclerviewapp;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MyIconRecyclerItemDecoration extends RecyclerView.ItemDecoration {

    private final int verticalSpaceHeight;

    public MyIconRecyclerItemDecoration(int verticalSpaceHeight) {
        this.verticalSpaceHeight = verticalSpaceHeight;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if(parent.getAdapter() != null){
            if(parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1){
                outRect.bottom = verticalSpaceHeight;
            }
        }
    }
}
