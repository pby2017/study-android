package com.example.day06.example02;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.day06.R;

@SuppressWarnings("deprecation")
public class TabHostActivity extends TabActivity {

    private TabHost tabHost;
    private TabSpec tabSpecSong;
    private TabSpec tabSpecArtist;
    private TabSpec tabSpecAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);

        tabHost = getTabHost();

        tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.linear_tab_song);
        tabHost.addTab(tabSpecSong);

        tabSpecArtist = tabHost.newTabSpec("ARTIST")
                .setIndicator("가수별");
        tabSpecArtist.setContent(R.id.linear_tab_artist);
        tabHost.addTab(tabSpecArtist);

        tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.linear_tab_album);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);
    }
}
