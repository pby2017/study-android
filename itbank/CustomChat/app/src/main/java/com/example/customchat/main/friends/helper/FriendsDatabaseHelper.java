package com.example.customchat.main.friends.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.customchat.main.friends.table.FriendsTable.FriendEntry;

import androidx.annotation.Nullable;

public class FriendsDatabaseHelper extends SQLiteOpenHelper {

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FriendEntry.TABLE_NAME + " (" +
                    FriendEntry.COLUMN_NAME_EMAIL + " VARCHAR(50) not null," +
                    FriendEntry.COLUMN_NAME_NAME + " VARCHAR(10) not null," +
                    "PRIMARY KEY(" + FriendEntry.COLUMN_NAME_EMAIL + "));";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FriendEntry.TABLE_NAME;


    public FriendsDatabaseHelper(@Nullable Context context, @Nullable String name, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
