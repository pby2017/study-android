package com.example.customchatting.main.friends.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.customchatting.R;
import com.example.customchatting.main.friends.model.User;

import java.util.ArrayList;

public class MyFriendListAdapter extends RecyclerView.Adapter<MyFriendListAdapter.MyViewHolder> {

    private ArrayList<User> userArrayList;

    public MyFriendListAdapter(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_friend, viewGroup, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.emailText.setText(userArrayList.get(i).getEmail());
        myViewHolder.nameText.setText(userArrayList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView emailText;
        private TextView nameText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.emailText = itemView.findViewById(R.id.text_item_friend_email);
            this.nameText = itemView.findViewById(R.id.text_item_friend_name);
        }
    }
}
