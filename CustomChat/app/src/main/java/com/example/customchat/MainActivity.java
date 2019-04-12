package com.example.customchat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.example.customchat.config.CustomConfig;
import com.example.customchat.login.RegisterAndLoginActivity;
import com.example.customchat.main.friends.helper.FriendsDatabaseHelper;
import com.example.customchat.main.friends.model.User;
import com.example.customchat.main.friends.table.FriendsTable.FriendEntry;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Date;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.customchat.constant.CustomConstant.LogConstant.CUS_MAIN_ACTIVITY;

public class MainActivity extends AppCompatActivity {

    // Database
    private SQLiteDatabase sqLiteDatabase;

    // RecyclerView component
    private ArrayList<User> users;

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

        initialize();
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
        users = new ArrayList<>();
        users.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        users.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        users.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        users.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        users.add(new User("a@a.a", String.valueOf(new Date().getTime())));
        users.add(new User("a@a.a", String.valueOf(new Date().getTime())));
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
