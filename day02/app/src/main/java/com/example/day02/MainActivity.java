package com.example.day02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1 = (TextView) findViewById(R.id.tv1);
        final CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final ImageView iv1 = (ImageView) findViewById(R.id.iv1);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        if (cb1.isChecked()) {
                            iv1.setVisibility(View.VISIBLE);
                            Toast.makeText(getApplicationContext(),"cb1 체크",Toast.LENGTH_SHORT).show();
                            //if(rg1.isSelected()){
                                int selectedId = rg1.getCheckedRadioButtonId();
                                Toast.makeText(getApplicationContext(),"selectedId = "+Integer.toString(selectedId),Toast.LENGTH_SHORT).show();
                                switch (selectedId){
                                    case R.id.rb1:
                                        iv1.setImageResource(R.drawable.puppy);
                                        Toast.makeText(getApplicationContext(),"puppy 클릭",Toast.LENGTH_SHORT).show();
                                        break;
                                    case R.id.rb2:
                                        iv1.setImageResource(R.drawable.cat);
                                        Toast.makeText(getApplicationContext(),"cat 클릭",Toast.LENGTH_SHORT).show();
                                        break;
                                    case R.id.rb3:
                                        iv1.setImageResource(R.drawable.rabbit);
                                        Toast.makeText(getApplicationContext(),"rabbit 클릭",Toast.LENGTH_SHORT).show();
                                        break;
                                }
                            //}
                        } else {
                            iv1.setVisibility(View.INVISIBLE);
                        }
                        break;
                }
            }
        };

        btn1.setOnClickListener(listener);
    }
}
