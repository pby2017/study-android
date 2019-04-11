package com.example.customchatting;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.customchatting.config.CustomConfig;
import com.example.customchatting.login.RegisterAndLoginActivity;
import com.example.customchatting.main.friends.helper.FriendsDatabaseHelper;
import com.example.customchatting.main.friends.model.User;
import com.example.customchatting.main.friends.table.FriendsTable.FriendEntry;

import java.util.ArrayList;
import java.util.Date;

import static com.example.customchatting.constant.CustomConstant.LogConstant.CUS_MAIN_ACTIVITY;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    // Database
    private SQLiteDatabase sqLiteDatabase;

    // RecyclerView component
    private ArrayList<User> userArrayList;

    // View
    private BottomNavigationView mainBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(CUS_MAIN_ACTIVITY, "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        while (CustomConfig.getInstance().getUrlString() == null && CustomConfig.getInstance().getCountOfInputServerUrl() < 3) {
            createCustomDialog().show();
            CustomConfig.getInstance().setCountOfInputServerUrl(CustomConfig.getInstance().getCountOfInputServerUrl() + 1);
        }
        if (CustomConfig.getInstance().getUrlString() == null && CustomConfig.getInstance().getCountOfInputServerUrl() >= 3) {
            finish();
        }

        CustomConfig.getInstance().setCountOfInputServerUrl(0);

        startService(new Intent(this, MyFirebaseMessagingService.class));
        startActivity(new Intent(this, RegisterAndLoginActivity.class));

//        initView();
//
//        initialize();
//
//        FriendListFragment friendListFragment = FriendListFragment.newInstance(userArrayList);
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.frame_main_container, friendListFragment);
//        fragmentTransaction.commit();
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

    private AlertDialog createCustomDialog() {
        final EditText UrlEditText = new EditText(this);

        return new AlertDialog.Builder(this)
                .setTitle("Server 접속 주소를 입력하세요.")
                .setMessage("ex) http://192.168.0.1:8080/directory/file")
                .setView(UrlEditText)
                .setPositiveButton(R.string.save, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String urlString = UrlEditText.getText().toString();
                        CustomConfig.getInstance().setUrlString(urlString);
                        if (CustomConfig.getInstance().getUrlString().equals(urlString)) {
                            Toast.makeText(getApplicationContext(), String.format("Set url = %s", CustomConfig.getInstance().getUrlString()), Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .create();
    }
}
