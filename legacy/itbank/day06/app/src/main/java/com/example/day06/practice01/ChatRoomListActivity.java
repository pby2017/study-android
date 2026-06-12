package com.example.day06.practice01;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.day06.R;

public class ChatRoomListActivity extends TabActivity {

    private TabHost tabHost;
    private TabHost.TabSpec tabSpecChatRoomList;
    private TabHost.TabSpec tabSpecBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room_list);

        tabHost = getTabHost();

        tabSpecChatRoomList = tabHost.newTabSpec("CHATROOMLIST").setIndicator("채팅방별");
        tabSpecChatRoomList.setContent(R.id.linear_tab_chat_room_list);
        tabHost.addTab(tabSpecChatRoomList);

        tabSpecBlack = tabHost.newTabSpec("BLANK")
                .setIndicator("blank");
        tabSpecBlack.setContent(R.id.linear_tab_blank);
        tabHost.addTab(tabSpecBlack);

        tabSpecBlack = tabHost.newTabSpec("BLANK")
                .setIndicator("blank");
        tabSpecBlack.setContent(R.id.linear_tab_blank02);
        tabHost.addTab(tabSpecBlack);

        tabSpecBlack = tabHost.newTabSpec("BLANK")
                .setIndicator("blank");
        tabSpecBlack.setContent(R.id.linear_tab_blank03);
        tabHost.addTab(tabSpecBlack);

        tabHost.setCurrentTab(0);
    }
}
