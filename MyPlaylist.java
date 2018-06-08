package com.example.android.musicalappproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MyPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        //Without this code, a null toast will appear on opening activity.
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

    //Gets the intent from Tracks and stores them in a new intent; declare new strings for the received data.
    Intent playlistIntent2 = getIntent();
    String song = playlistIntent2.getStringExtra("song");
    String artist = playlistIntent2.getStringExtra("artist");
    String album = playlistIntent2.getStringExtra("album");

    String myJumbo = song + "\n" + artist + "\n" + album;
    Toast.makeText(this, myJumbo , Toast.LENGTH_SHORT).show();
    }
}
