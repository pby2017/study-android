package com.example.mydatabindingapp;

import android.databinding.ObservableInt;
import android.view.View;

public class MyViewModel {

    public ObservableInt sampleCount;

    public MyViewModel() {
        sampleCount = new ObservableInt();
        sampleCount.set(0);
    }

    public void onClickCountUp(View view){
        sampleCount.set(sampleCount.get() + 1);
    }
}
