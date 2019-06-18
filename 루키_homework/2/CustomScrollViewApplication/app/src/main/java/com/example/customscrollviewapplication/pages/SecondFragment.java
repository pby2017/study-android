package com.example.customscrollviewapplication.pages;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.customscrollviewapplication.MainActivity;
import com.example.customscrollviewapplication.R;
import com.example.customscrollviewapplication.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private static final String TAG = SecondFragment.class.getSimpleName();

    private Context context;

    private RecyclerView recyclerHorizontalChild;
    private RecyclerView recyclerVerticalChild;

    public static SecondFragment getInstance() {
        return new SecondFragment();
    }

    public SecondFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.context = context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerHorizontalChild = view.findViewById(R.id.recycler_horizontal_child);
        recyclerHorizontalChild.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        List<Integer> myIcons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myIcons.add(R.drawable.ic_launcher_foreground);

        }
        recyclerHorizontalChild.setAdapter(new MyAdapter(myIcons));

        recyclerVerticalChild = view.findViewById(R.id.recycler_vertical_child);
        recyclerVerticalChild.setLayoutManager(new LinearLayoutManager(context));
        recyclerVerticalChild.setAdapter(new MyAdapter(myIcons));
    }
}
