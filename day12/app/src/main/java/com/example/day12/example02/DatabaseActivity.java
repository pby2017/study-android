package com.example.day12.example02;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.day12.R;

public class DatabaseActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText;
    private EditText ageEditText;
    private TextView nameResultText;
    private TextView numberResultText;
    private Button initButton;
    private Button insertButton;
    private Button selectButton;
    private Button updateButton;
    private Button deleteButton;

    private MyDBHelper myDBHelper;
    private SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_init:
                sqLiteDatabase = myDBHelper.getWritableDatabase();
                myDBHelper.onUpgrade(sqLiteDatabase, 1, 2);
                sqLiteDatabase.close();
                break;
            case R.id.button_insert:
                final String insertSqlString = "INSERT INTO %s VALUES ('%s', %d);".toLowerCase();
                final String insertTable = getString(R.string.table);
                final String insertSql = String.format(insertSqlString,
                        insertTable,
                        nameEditText.getText().toString(),
                        Integer.parseInt(ageEditText.getText().toString()));
                sqLiteDatabase = myDBHelper.getWritableDatabase();
                sqLiteDatabase.execSQL(insertSql);
                sqLiteDatabase.close();
                Toast.makeText(getApplicationContext(), getString(R.string.text_database_query_complete), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_select:
                final String selectSqlString = "SELECT %s FROM %s;".toLowerCase();
                final String selectTable = getString(R.string.table);
                final String selectSql = String.format(selectSqlString,
                        "*",
                        selectTable);
                sqLiteDatabase = myDBHelper.getReadableDatabase();
                Cursor cursor = sqLiteDatabase.rawQuery(selectSql, null);
                StringBuilder namesStringBuilder = new StringBuilder("이름\r\n--------\r\n");
                StringBuilder agesStringBuilder = new StringBuilder("나이\r\n--------\r\n");
                while (cursor.moveToNext()) {
                    namesStringBuilder.append(String.format("%s\r\n", cursor.getString(0)));
                    agesStringBuilder.append(String.format("%s\r\n", cursor.getString(1)));
                }
                nameResultText.setText(namesStringBuilder.toString());
                numberResultText.setText(agesStringBuilder.toString());
                cursor.close();
                sqLiteDatabase.close();
                Toast.makeText(getApplicationContext(), getString(R.string.text_database_query_complete), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_update:
                final String updateSqlString = "UPDATE %s SET %s=%s WHERE %s='%s'".toLowerCase();
                final String updateTable = getString(R.string.table);
                final String updateSql = String.format(updateSqlString,
                        updateTable,
                        "age",
                        Integer.parseInt(ageEditText.getText().toString()),
                        "name",
                        nameEditText.getText().toString());
                sqLiteDatabase = myDBHelper.getWritableDatabase();
                sqLiteDatabase.execSQL(updateSql);
                sqLiteDatabase.close();
                Toast.makeText(getApplicationContext(), getString(R.string.text_database_query_complete), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_delete:
                final String deleteSqlString = "DELETE FROM %s WHERE %s='%s'".toLowerCase();
                final String deleteTable = getString(R.string.table);
                final String deleteSql = String.format(deleteSqlString,
                        deleteTable,
                        "name",
                        nameEditText.getText().toString());
                sqLiteDatabase = myDBHelper.getWritableDatabase();
                sqLiteDatabase.execSQL(deleteSql);
                sqLiteDatabase.close();
                Toast.makeText(getApplicationContext(), getString(R.string.text_database_query_complete), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void initView() {
        nameEditText = findViewById(R.id.name_edit_text);
        ageEditText = findViewById(R.id.age_edit_text);

        initButton = findViewById(R.id.button_init);
        initButton.setOnClickListener(this);
        insertButton = findViewById(R.id.button_insert);
        insertButton.setOnClickListener(this);
        selectButton = findViewById(R.id.button_select);
        selectButton.setOnClickListener(this);
        updateButton = findViewById(R.id.button_update);
        updateButton.setOnClickListener(this);
        deleteButton = findViewById(R.id.button_delete);
        deleteButton.setOnClickListener(this);

        nameResultText = findViewById(R.id.text_name_result);
        numberResultText = findViewById(R.id.text_number_result);

        myDBHelper = new MyDBHelper(this);
        initButton.setOnClickListener(this);
    }

    public class MyDBHelper extends SQLiteOpenHelper {

        private MyDBHelper(Context context) {
            super(context, context.getString(R.string.database), null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE student (name CHAR(20) PRIMARY KEY, age INTEGER);";
            db.execSQL(sql);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            String sql = "DROP TABLE IF EXISTS student";
            db.execSQL(sql);
            onCreate(db);
        }
    }
}
