package com.example.day02.practice01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.day02.R;

public class ChoiceImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_image);

        final TextView tv1 = (TextView) findViewById(R.id.tv1);
        final CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout1);
        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final ImageView iv1 = (ImageView) findViewById(R.id.iv1);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        int selectedId = rg1.getCheckedRadioButtonId();
                        switch (selectedId) {
                            case R.id.rb1:
                                iv1.setImageResource(R.drawable.puppy);
                                Toast.makeText(getApplicationContext(), "puppy 보여주기", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.rb2:
                                iv1.setImageResource(R.drawable.cat);
                                Toast.makeText(getApplicationContext(), "cat 보여주기", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.rb3:
                                iv1.setImageResource(R.drawable.rabbit);
                                Toast.makeText(getApplicationContext(), "rabbit 보여주기", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        break;
                    case R.id.cb1:
                        if (cb1.isChecked()) {
                            linearLayout.setVisibility(View.VISIBLE);
                        } else {
                            linearLayout.setVisibility(View.INVISIBLE);
                        }
                        break;
                }
            }
        };

        btn1.setOnClickListener(listener);
        cb1.setOnClickListener(listener);
    }
}
