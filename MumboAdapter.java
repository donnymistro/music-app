package com.example.android.musicalappproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MumboAdapter extends ArrayAdapter<Mumbo> {

    //Make a reference to the Tracks activity where the toast for the play button is stored.
    private Tracks mTracksActivity;

    //Instead of using Context context, we again reference the Tracks activity to utilize the toast.
    public MumboAdapter(Tracks tracksActivity ,ArrayList<Mumbo> jumbo){
        super(tracksActivity, 0, jumbo);
        mTracksActivity = tracksActivity;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listResView = convertView;
        if (listResView == null) {
            listResView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_res, parent, false);
        }


        // Get the Mumbo object located at this position in the list; set final for currentSong to work when called for the button.
        final Mumbo currentSong = getItem(position);

        // Find the TextView in the list_res.xml layout with the ID song_text_view.
        final TextView songTextView = (TextView) listResView.findViewById(R.id.song_text_view);
        // Get the song from the currentSong object and set this text on
        // the song TextView.
        songTextView.setText(currentSong.getSongByArtist());

        // Find the TextView in the list_res.xml layout with the ID artist_text_view.
        final TextView artistTextView = (TextView) listResView.findViewById(R.id.artist_text_view);
        // Get the artist from the currentSong object and set this text on
        // the artist TextView.
        artistTextView.setText(currentSong.getMusicalArtist());

        // Find the TextView in the list_res.xml layout with the ID album_text_view.
        final TextView albumTextView = (TextView) listResView.findViewById(R.id.album_text_view);
        // Get the album from the currentSong object and set this text on
        // the album TextView.
        albumTextView.setText(currentSong.getAlbumLP());

        //Here we use a onClickListener for the play button.
        Button play = (Button) listResView.findViewById(R.id.play_button);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTracksActivity.showPlaying(currentSong);
            }
        });

        //Here we use a onClickListener for the add to playlist button.
        Button add = (Button) listResView.findViewById(R.id.add_to_playlist);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTracksActivity.addToPlaylist(currentSong);

            }
        });


        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listResView;

    }



}
