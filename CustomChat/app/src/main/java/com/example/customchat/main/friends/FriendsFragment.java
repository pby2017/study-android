package com.example.customchat.main.friends;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.customchat.R;
import com.example.customchat.main.friends.adapter.FriendsAdapter;
import com.example.customchat.main.friends.model.User;

import java.util.ArrayList;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsFragment extends Fragment implements View.OnClickListener {

    private static final String FRIEND_LIST_FRAG = "FRIEND_LIST_FRAG";
    private static ArrayList<User> users;

    private LinearLayoutManager myLinearLayoutManager;
    private FriendsAdapter myFriendListAdapter;

    private RecyclerView friendListRecyclerView;
    private Button addFriendItemButton;

    // TODO: Listener interface define

    public static Fragment newInstance() {
        users = new ArrayList<>();
        Log.d(FRIEND_LIST_FRAG, String.valueOf(users.size()));

        // TODO: Bundle set

        return new FriendsFragment();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // TODO: Listener set
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Bundle get
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        friendListRecyclerView = view.findViewById(R.id.recycler_view_friend_list);
        addFriendItemButton = view.findViewById(R.id.button_add_friend_item);
        addFriendItemButton.setOnClickListener(this);

        myLinearLayoutManager = new LinearLayoutManager(inflater.getContext());
        myFriendListAdapter = new FriendsAdapter(users);
        friendListRecyclerView.setLayoutManager(myLinearLayoutManager);
        friendListRecyclerView.setAdapter(myFriendListAdapter);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // TODO: Listener set
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_add_friend_item:
                User user = new User("a@a.a", String.valueOf(new Date().getTime()));
                users.add(user);
                myFriendListAdapter.notifyDataSetChanged();
                break;
        }
    }
}
