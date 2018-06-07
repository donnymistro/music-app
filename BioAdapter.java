package com.example.android.musicalappproject;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BioAdapter extends ArrayAdapter<Bio> {

    public BioAdapter(Context context, ArrayList<Bio> biography){
        super(context, 0, biography);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View bioListResView = convertView;
        if (bioListResView == null) {
            bioListResView = LayoutInflater.from(getContext()).inflate(
                    R.layout.bio_list_res, parent, false);
        }

        // Get the biography object located at this position in the list
        Bio currentArtist = getItem(position);


        // Find the ImageView in the bio_list_res.xml layout with the ID artist_picture.
        ImageView artistImage = (ImageView) bioListResView.findViewById(R.id.artist_picture);
        // Get the drawable from the currentArtist object and set this drawable on
        // the artist ImageView.
        artistImage.setImageResource(currentArtist.getArtistPicture());

        // Find the artist name TextView in the bio_list_res.xml layout with the ID artist_name.
        TextView artistNameView = (TextView) bioListResView.findViewById(R.id.artist_name);
        // Get the artist from the currentArtist object and set this text on
        // the artist name TextView.
        artistNameView.setText(currentArtist.getArtistName());

        // Find the bio TextView in the bio_list_res.xml layout with the ID artist_bio_text.
        TextView artistBioView = (TextView) bioListResView.findViewById(R.id.artist_bio_text);
        // Get the bio from the currentArtist object and set this text on
        // the artist bio TextView.
        artistBioView.setText(currentArtist.getArtistBio());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return bioListResView;
    }
}

