package com.example.customchatting.main.friends.table;

import android.provider.BaseColumns;

public class FriendsTable {
    private FriendsTable() {
    }

    public static class FriendEntry implements BaseColumns {
        public static final String TABLE_NAME = "friend_list";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_NAME = "name";
    }
}
