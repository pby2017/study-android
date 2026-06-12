package com.example.myrecyclerviewapp.constant;

import com.example.myrecyclerviewapp.MainActivity;
import com.example.myrecyclerviewapp.MyIconRecyclerItemAnimator;
import com.example.myrecyclerviewapp.R;
import com.example.myrecyclerviewapp.adapter.MyIconRecyclerAdapter;
import com.example.myrecyclerviewapp.model.MyIcon;
import com.example.myrecyclerviewapp.util.MyUtils;

import java.util.Arrays;
import java.util.List;

public class MyConstant {
    // TODO: 컨벤션 static / static final 일 때?
    public static final String MAIN_ACTIVITY_TAG = MainActivity.class.getSimpleName();
    public static final String MY_ICON_ADAPTER_TAG = MyIconRecyclerAdapter.class.getSimpleName();
    public static final String MY_ICON_ANIMATOR_TAG = MyIconRecyclerItemAnimator.class.getSimpleName();

    public static List<MyIcon> ALL_ICONS = Arrays.asList(
            new MyIcon(R.drawable.baseline_accessibility_black_48, "accessibility", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_alarm_on_black_48, "alarm", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_call_black_48, "call", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_camera_enhance_black_48, "camera_enhance", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_gavel_black_48, "gavel", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_info_black_48, "info", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_pets_black_48, "pets", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_question_answer_black_48, "question_answer", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_swap_calls_black_48, "swap", MyUtils.getNowTimeString()),
            new MyIcon(R.drawable.baseline_theaters_black_48, "theaters", MyUtils.getNowTimeString())
    );
}
