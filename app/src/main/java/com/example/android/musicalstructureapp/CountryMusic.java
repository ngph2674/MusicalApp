package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_music);

        ArrayList<Song> countryMusic = new ArrayList<>();
        countryMusic.add(new Song("I walk the line", "Jonny Cash"));
        countryMusic.add(new Song("Before he cheats", "Carrie  Underwood"));
        countryMusic.add(new Song("I Hope", "Gabby Barrett"));
        countryMusic.add(new Song("The Bones", "Maren Morris"));
        countryMusic.add(new Song("10,000 Hours", "Dan + Shay & Justin Bieber"));
        countryMusic.add(new Song("Chasin' You", "Morgan Wallen"));
        countryMusic.add(new Song("Nobody But You", "Blake Shelton Duet With Gwen Stefani"));
        countryMusic.add(new Song("One Man Band", "Old Dominion"));
        countryMusic.add(new Song("Got What I Got", "Jason Aldean"));
        countryMusic.add(new Song("Die From A Broken Heart", "Maddie & Tae"));

        SongAdapter songAdapter = new SongAdapter(this, countryMusic);
        ListView listView = (ListView) findViewById(R.id.countryMusic);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(CountryMusic.this, PlaySong.class);
            intent.putExtra("song", countryMusic.get(position).getNameOfSong());
            intent.putExtra("artist", countryMusic.get(position).getArtist());
            intent.putExtra("musicType", "country");
            startActivity(intent);
        });

        Button btn = (Button) findViewById(R.id.prev);
        btn.setOnClickListener(v -> startActivity(new Intent(CountryMusic.this, MainActivity.class)));
    }
}