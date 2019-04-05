package com.example.day15.example02;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.day15.R;
import com.example.day15.example02.helper.FriendsDatabaseHelper;
import com.example.day15.example02.table.FriendsTable.FriendEntry;

public class InnerDatabaseActivity extends AppCompatActivity {

    private SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_database);

        FriendsDatabaseHelper friendsDatabaseHelper = new FriendsDatabaseHelper(this, "androidDB", 1);

        sqLiteDatabase = friendsDatabaseHelper.getWritableDatabase();

        if (checkTable(sqLiteDatabase, FriendEntry.TABLE_NAME)) {
            friendsDatabaseHelper.onUpgrade(sqLiteDatabase, 1, 2);
            sqLiteDatabase.close();
        } else {
            // TODO: 테이블 생성
        }
    }

    private boolean checkTable(SQLiteDatabase db, String tableName) {
        try {
            db.rawQuery("SELECT * FROM " + tableName + " limit 1;", null);
        } catch (SQLiteException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
