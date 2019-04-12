package com.example.customchat.main.friends.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.customchat.R;
import com.example.customchat.main.friends.model.User;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {

    private ArrayList<User> users;

    public FriendsAdapter(ArrayList<User> users) {
        this.users = users;
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
        myViewHolder.emailText.setText(users.get(i).getEmail());
        myViewHolder.nameText.setText(users.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return users.size();
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
