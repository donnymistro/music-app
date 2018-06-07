package com.example.android.musicalappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        final TextView Artists = (TextView)findViewById(R.id.artists);

        Artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(Menu.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        TextView Tracks = (TextView)findViewById(R.id.tracks);

        Tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(Menu.this, Tracks.class);
                startActivity(tracksIntent);
            }
        });

        TextView myList = (TextView)findViewById(R.id.playlist);

        myList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myListIntent = new Intent(Menu.this, MyPlaylist.class);
                startActivity(myListIntent);
            }
        });
    }
}
