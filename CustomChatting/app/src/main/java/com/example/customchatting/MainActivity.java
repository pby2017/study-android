package com.example.customchatting;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.customchatting.friends.FriendListFragment;
import com.example.customchatting.friends.helper.FriendsDatabaseHelper;
import com.example.customchatting.friends.model.User;
import com.example.customchatting.friends.table.FriendsTable.FriendEntry;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    // Database
    private SQLiteDatabase sqLiteDatabase;

    // RecyclerView component
    private ArrayList<User> userArrayList;

    // View
    private BottomNavigationView mainBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initialize();

        FriendListFragment friendListFragment = FriendListFragment.newInstance(userArrayList);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_main_container, friendListFragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id) {
            case R.id.item_tab_friend_list:
                break;
            case R.id.item_tab_chatting_list:
                break;
            case R.id.item_tab_not_yet01:
                break;
            case R.id.item_tab_not_yet02:
                break;
        }

        return true;
    }

    private void initView() {
        mainBottomNavigationView = findViewById(R.id.bottom_navigation);
        mainBottomNavigationView.inflateMenu(R.menu.bottom_navigation_menu);
        mainBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private void initialize() {

        // TODO: naming
        database();

        // TODO: naming
        recyclerViewComponent();
    }

    private void database() {
        FriendsDatabaseHelper friendsDatabaseHelper = new FriendsDatabaseHelper(this, "androidDB", 1);

        sqLiteDatabase = friendsDatabaseHelper.getWritableDatabase();

        if (checkTable(sqLiteDatabase, FriendEntry.TABLE_NAME)) {
            friendsDatabaseHelper.onUpgrade(sqLiteDatabase, 1, 2);
            sqLiteDatabase.close();
        } else {
            // TODO: 테이블 생성
        }
    }

    private void recyclerViewComponent() {
        userArrayList = new ArrayList<>();
        userArrayList.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        userArrayList.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        userArrayList.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        userArrayList.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        userArrayList.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        userArrayList.add(new User("a@a.a", String.valueOf(new Date().getTime())));
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
