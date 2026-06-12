package com.example.customchat.main.chattings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.customchat.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ChattingsFragment extends Fragment implements View.OnClickListener {

    private Button startTestChattingActivityButton;

    // TODO: naming
    private ChattingsFragmentInterface chattingsFragmentInterfaceListener;

    // TODO: Listener interface define

    public static Fragment newInstance() {
        // TODO: Bundle set

        return new ChattingsFragment();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // TODO: Listener set
        if (context instanceof ChattingsFragmentInterface) {
            chattingsFragmentInterfaceListener = (ChattingsFragmentInterface) context;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Bundle get
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chattings, container, false);

        startTestChattingActivityButton = view.findViewById(R.id.button_start_test_chatting_activity);
        startTestChattingActivityButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // TODO: Listener set
        chattingsFragmentInterfaceListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start_test_chatting_activity:
                chattingsFragmentInterfaceListener.startChattingActivity("receiverEmail", "b@b.b");
                break;
        }
    }

    // TODO: naming
    public interface ChattingsFragmentInterface {
        void startChattingActivity(String key, String value);
    }
}
