package com.example.day02.practice01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.day02.R;

public class ChoiceImageActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkboxSetAnimalScreenVisible;
    private LinearLayout linearAnimalScreen;
    private RadioGroup radioGroupSelectAnimal;
    private Button buttonShowAnimalImage;
    private ImageView imageAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_image);

        initView();

        buttonShowAnimalImage.setOnClickListener(this);
        checkboxSetAnimalScreenVisible.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_show_animal_image:
                int selectedId = radioGroupSelectAnimal.getCheckedRadioButtonId();
                switch (selectedId) {
                    case R.id.radio_button_puppy:
                        imageAnimal.setImageResource(R.drawable.puppy);
                        Toast.makeText(getApplicationContext(), "puppy 보여주기", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button_cat:
                        imageAnimal.setImageResource(R.drawable.cat);
                        Toast.makeText(getApplicationContext(), "cat 보여주기", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button_rabbit:
                        imageAnimal.setImageResource(R.drawable.rabbit);
                        Toast.makeText(getApplicationContext(), "rabbit 보여주기", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.checkbox_set_animal_screen_visible:
                if (checkboxSetAnimalScreenVisible.isChecked()) {
                    linearAnimalScreen.setVisibility(View.VISIBLE);
                } else {
                    linearAnimalScreen.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    private void initView() {
        CheckBox checkboxSetAnimalScreenVisible = findViewById(R.id.checkbox_set_animal_screen_visible);
        LinearLayout linearAnimalScreen = findViewById(R.id.linear_animal_screen);
        RadioGroup radioGroupSelectAnimal = findViewById(R.id.radio_group_select_animal);
        Button buttonShowAnimalImage = findViewById(R.id.button_show_animal_image);
        ImageView imageAnimal = findViewById(R.id.image_animal);
    }
}
