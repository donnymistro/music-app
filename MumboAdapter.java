package com.example.android.musicalappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MumboAdapter extends ArrayAdapter<Mumbo> {

    public MumboAdapter(Context context, ArrayList<Mumbo> jumbo){
        super(context, 0, jumbo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listResView = convertView;
        if (listResView == null) {
            listResView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_res, parent, false);
        }

        // Get the Mumbo object located at this position in the list
        Mumbo currentSong = getItem(position);

        // Find the TextView in the list_res.xml layout with the ID song_text_view.
        TextView songTextView = (TextView) listResView.findViewById(R.id.song_text_view);
        // Get the song from the currentSong object and set this text on
        // the song TextView.
        songTextView.setText(currentSong.getSongByArtist());

        // Find the TextView in the list_res.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listResView.findViewById(R.id.artist_text_view);
        // Get the artist from the currentSong object and set this text on
        // the artist TextView.
        artistTextView.setText(currentSong.getMusicalArtist());

        // Find the TextView in the list_res.xml layout with the ID album_text_view.
        TextView albumTextView = (TextView) listResView.findViewById(R.id.album_text_view);
        // Get the album from the currentSong object and set this text on
        // the album TextView.
        albumTextView.setText(currentSong.getAlbumLP());

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listResView;

    }



}
