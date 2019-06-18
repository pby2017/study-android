package com.example.customscrollviewapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.customscrollviewapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Integer> myIcons;

    public MyAdapter(List<Integer> myIcons) {
        this.myIcons = myIcons;
        if (this.myIcons == null) {
            this.myIcons = new ArrayList<>();
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sample, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.sampleImage.setImageResource(myIcons.get(i));
    }

    @Override
    public int getItemCount() {
        return myIcons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView sampleImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            sampleImage = itemView.findViewById(R.id.image_sample);
        }
    }
}
