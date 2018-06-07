package com.example.android.musicalappproject;

import android.widget.ImageView;

public class Bio {

    int artistPicture;

    private String artistName;

    private String artistBio;


    public Bio(int picture, String name, String bio){
        artistPicture = picture;
        artistName = name;
        artistBio = bio;
    }

    public int getArtistPicture(){
        return artistPicture;
    }

    public String getArtistName(){
        return artistName;
    }

    public String getArtistBio(){
        return artistBio;
    }
}
