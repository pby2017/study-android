package com.example.day05.example03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.example.day05.R;

public class AutoCompleteActivity extends AppCompatActivity {

    private String[] items = {"aaa", "bbb", "ccc"};

    private AutoCompleteTextView autoCompleteText;
    private MultiAutoCompleteTextView multiAutoCompleteText;

    private ArrayAdapter<String> autoCompleteAdapter;
    private MultiAutoCompleteTextView.CommaTokenizer multiAutoCompleteCommaTokenizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        initView();
    }

    private void initView() {
        autoCompleteText = findViewById(R.id.auto_complete_text);
        multiAutoCompleteText = findViewById(R.id.multi_auto_complete_text);

        autoCompleteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        autoCompleteText.setAdapter(autoCompleteAdapter);

        multiAutoCompleteCommaTokenizer = new MultiAutoCompleteTextView.CommaTokenizer();
        multiAutoCompleteText.setTokenizer(multiAutoCompleteCommaTokenizer);
        multiAutoCompleteText.setAdapter(autoCompleteAdapter);
    }
}
