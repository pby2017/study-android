package com.example.customchatting.main.friends;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.customchatting.R;
import com.example.customchatting.main.friends.adapter.MyFriendListAdapter;
import com.example.customchatting.main.friends.model.User;

import java.util.ArrayList;
import java.util.Date;

public class FriendListFragment extends Fragment implements View.OnClickListener {

    private static final String FRIEND_LIST_FRAG = "FRIEND_LIST_FRAG";
    private static ArrayList<User> userArrayList;

    private LinearLayoutManager myLinearLayoutManager;
    private MyFriendListAdapter myFriendListAdapter;

    private RecyclerView friendListRecyclerView;
    private Button addFriendItemButton;

    public static FriendListFragment newInstance(ArrayList<User> arrayList) {
        userArrayList = arrayList;
        Log.d(FRIEND_LIST_FRAG, String.valueOf(userArrayList.size()));
        return new FriendListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friend_list, container, false);
        friendListRecyclerView = view.findViewById(R.id.recycler_view_friend_list);
        addFriendItemButton = view.findViewById(R.id.button_add_friend_item);
        addFriendItemButton.setOnClickListener(this);

        myLinearLayoutManager = new LinearLayoutManager(inflater.getContext());
        myFriendListAdapter = new MyFriendListAdapter(userArrayList);
        friendListRecyclerView.setLayoutManager(myLinearLayoutManager);
        friendListRecyclerView.setAdapter(myFriendListAdapter);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_add_friend_item:
                User user = new User("a@a.a", String.valueOf(new Date().getTime()));
                userArrayList.add(user);
                myFriendListAdapter.notifyDataSetChanged();
                break;
        }
    }
}
