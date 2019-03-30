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

    private CheckBox setAnimalScreenVisibleCheckBox;
    private LinearLayout animalScreenLinear;
    private RadioGroup selectAnimalRadioGroup;
    private Button showAnimalImageButton;
    private ImageView animalImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_image);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_show_animal_image:
                int selectedId = selectAnimalRadioGroup.getCheckedRadioButtonId();
                switch (selectedId) {
                    case R.id.radio_button_puppy:
                        animalImage.setImageResource(R.drawable.puppy);
                        Toast.makeText(getApplicationContext(), "puppy 보여주기", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button_cat:
                        animalImage.setImageResource(R.drawable.cat);
                        Toast.makeText(getApplicationContext(), "cat 보여주기", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button_rabbit:
                        animalImage.setImageResource(R.drawable.rabbit);
                        Toast.makeText(getApplicationContext(), "rabbit 보여주기", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.checkbox_set_animal_screen_visible:
                if (setAnimalScreenVisibleCheckBox.isChecked()) {
                    animalScreenLinear.setVisibility(View.VISIBLE);
                } else {
                    animalScreenLinear.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    private void initView() {
        setAnimalScreenVisibleCheckBox = findViewById(R.id.checkbox_set_animal_screen_visible);
        setAnimalScreenVisibleCheckBox.setOnClickListener(this);

        animalScreenLinear = findViewById(R.id.linear_animal_screen);
        selectAnimalRadioGroup = findViewById(R.id.radio_group_select_animal);

        showAnimalImageButton = findViewById(R.id.button_show_animal_image);
        showAnimalImageButton.setOnClickListener(this);

        animalImage = findViewById(R.id.image_animal);
    }
}
