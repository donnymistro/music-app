package com.example.android.musicalappproject;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mumbo {

    private String songByArtist;

    private String musicalArtist;

    private String albumLP;


    public Mumbo(String trackSong, String bandArtist, String album){
        songByArtist = trackSong;
        musicalArtist = bandArtist;
        albumLP = album;
    }

    public String getSongByArtist(){
        return songByArtist;
    }

    public String getMusicalArtist(){
        return  musicalArtist;
    }

    public String getAlbumLP() {
        return albumLP;
    }


}
