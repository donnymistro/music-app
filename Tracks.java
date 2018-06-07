package com.example.android.musicalappproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        ArrayList<Mumbo> jumbo = new ArrayList<Mumbo>();
        jumbo.add(new Mumbo("Rx Contender The Pretender", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Swamp Kittens", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Cubic Zirconias Are Forever", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("I Can Do This On An Island", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Secondhand Surgery", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Vacation/Add/Vacation!", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Magnetic North", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("East of 1989; Battle of the Bay", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Bird Flu", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("The Cannon", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Devil's Concubine", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Head General Hospital", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Paisley", "Hopesfall", "Magnetic North"));
        jumbo.add(new Mumbo("Ritual Union", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Little Man", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Brush The Heat", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Shuffle A Dream", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Please Turn", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Crystal Film", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Precious", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Nightlight", "Little Dragon","Ritual Union"));
        jumbo.add(new Mumbo("Summertearz", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("When I Go Out", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Seconds", "Little Dragon", "Ritual Union"));
        jumbo.add(new Mumbo("Ka$cade", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Lippincott", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Air Chrysalis", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Another Year", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Physical Education", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Tooth and Claw", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Crescent", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("The Future That Awaited Me", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Para Mexer", "Animals as Leaders","The Joy of Motion" ));
        jumbo.add(new Mumbo("The Woven Web", "Animals as Leaders","The Joy of Motion" ));
        jumbo.add(new Mumbo("Mind-Spun", "Animals as Leaders", "The Joy of Motion"));
        jumbo.add(new Mumbo("Nephele", "Animals as Leaders", "The Joy of Motion"));

        // Create an MumboAdapter, whose data source is a list of jumbos (songs and their associated artists and albums. The
        // adapter knows how to create list items for each item in the list.
        MumboAdapter adapter = new MumboAdapter(this, jumbo);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called tracks, which is declared in the
        // songs_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.tracks);

        // Make the ListView use the MumboAdapter we created above, so that the
        // ListView will display list items for each Jumbo in the list.
        listView.setAdapter(adapter);

    }
}
