package com.example.day15.example01.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.day15.R;
import com.example.day15.example01.model.User;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private static final String MY_RECYCLER_ADPT = "MY_RECYCLER_ADPT";

    private ArrayList<User> userArrayList;

    public MyRecyclerViewAdapter(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_user_info, viewGroup, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.email.setText(userArrayList.get(i).getEmail());
        myViewHolder.name.setText(userArrayList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView email;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.email = itemView.findViewById(R.id.text_item_user_info_email);
            this.name = itemView.findViewById(R.id.text_item_user_info_name);
        }
    }
}
