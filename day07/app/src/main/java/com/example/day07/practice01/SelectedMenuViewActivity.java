package com.example.day07.practice01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.day07.R;

public class SelectedMenuViewActivity extends AppCompatActivity {
    private LinearLayout linearMovie;
    private LinearLayout linearComic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_menu_view);

        initView();

        setViewInvisible();

        registerForContextMenu(linearMovie);
        registerForContextMenu(linearComic);
    }

    private void setViewInvisible() {
        linearMovie.setVisibility(View.GONE);
        linearComic.setVisibility(View.GONE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_type, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_type_movie:
                setViewInvisible();
                linearMovie.setVisibility(View.VISIBLE);
                break;
            case R.id.item_type_comic:
                setViewInvisible();
                linearComic.setVisibility(View.VISIBLE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();

        switch (v.getId()) {
            case R.id.linear_movie:
                menuInflater.inflate(R.menu.menu_movie_kind, menu);
                break;
            case R.id.linear_comic:
                menuInflater.inflate(R.menu.menu_comic_kind, menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_movie_kind01:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_movie_kind02:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_movie_kind03:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_movie_kind04:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_movie_kind05:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_comic_kind01:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_comic_kind02:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_comic_kind03:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_comic_kind04:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_comic_kind05:
                Toast.makeText(getApplicationContext(), item.getTitle() + " 입니다!", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    private void initView() {
        linearMovie = (LinearLayout) findViewById(R.id.linear_movie);
        linearComic = (LinearLayout) findViewById(R.id.linear_comic);
    }
}
