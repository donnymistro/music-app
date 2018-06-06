package com.example.android.musicalappproject;

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
