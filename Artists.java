package com.example.android.musicalappproject;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);

        ArrayList<Bio> biography = new ArrayList<Bio>();
        biography.add(new Bio(R.drawable.hopesfall, "Hopesfall", "aa"));
        biography.add(new Bio( R.drawable.little_dragon, "Little Dragon", "bb"));
        biography.add(new Bio( R.drawable.anasl, "Animals as Leaders", "cc"));



        // Create another Adapter, whose data source is a list of biography (artist picture, name and a short bio). The
        // adapter knows how to create list items for each item in the list.
        BioAdapter adapter = new BioAdapter(this, biography);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called tracks, which is declared in the
        // artists_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.artists_list);

        // Make the ListView use the BioAdapter we created above, so that the
        // ListView will display list items for each biography in the list.
        listView.setAdapter(adapter);
    }
}
