package com.example.myrecyclerviewapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myrecyclerviewapp.R;
import com.example.myrecyclerviewapp.model.MyIcon;

import java.util.List;

public class MyIconRecyclerAdapter extends RecyclerView.Adapter<MyIconRecyclerAdapter.MyIconViewHolder> {

    private List<MyIcon> myIcons;

    public MyIconRecyclerAdapter(List<MyIcon> myIcons) {
        this.myIcons = myIcons;
    }

    @NonNull
    @Override
    public MyIconViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_my_icon, viewGroup, false);
        MyIconViewHolder myIconViewHolder = new MyIconViewHolder(view);

        return myIconViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyIconViewHolder myIconViewHolder, int position) {
        myIconViewHolder.imageView.setImageResource(myIcons.get(position).getMyIconResource());
        myIconViewHolder.textView.setText(String.format("%s %s", myIcons.get(position).getCreatedTimeString(), myIcons.get(position).getMyIconDescription()));

        myIconViewHolder.imageView.setActivated(false);
    }

    @Override
    public int getItemCount() {
        return myIcons.size();
    }

//    @Override
//    public void onViewDetachedFromWindow(@NonNull MyIconViewHolder holder) {
//        super.onViewDetachedFromWindow(holder);
//    }

    class MyIconViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;

        public MyIconViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_my_icon);
            textView = itemView.findViewById(R.id.text_my_icon_description);
        }
    }


}
