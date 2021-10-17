package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Jazz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        ArrayList<Song> jazzMusic = new ArrayList<>();
        jazzMusic.add(new Song("Phone Dies", "Andra Day"));
        jazzMusic.add(new Song("Old Brazil (feat. Duncan Lamont)", "Beverley Beirne"));
        jazzMusic.add(new Song("Night and Day (feat. Danny Gottlieb & Jacob Jezioro)", "Pat Coil"));
        jazzMusic.add(new Song("Sounds from the Ancestors", "Kenny Garrett"));
        jazzMusic.add(new Song("You've Got a Friend", "Wayne Alpern"));
        jazzMusic.add(new Song("There Will Never Be Another You", "Eliane Elias"));
        jazzMusic.add(new Song("Steamroller Blues", "Kari Kirkland"));
        jazzMusic.add(new Song("Tigress & Tweed", "Andra Day"));
        jazzMusic.add(new Song("Give Me More", "Erin Propp & Larry Roy"));
        jazzMusic.add(new Song("Chocoholic", "Martin Landström"));
        jazzMusic.add(new Song("Patio", "Martin Landström"));
        jazzMusic.add(new Song("Plait", "Ennio Mano"));
        jazzMusic.add(new Song("In A Deeper Sense", "Martin Landström"));
        jazzMusic.add(new Song("Don't Open Your Eyes", "Vendla"));

        SongAdapter songAdapter = new SongAdapter(this, jazzMusic);
        ListView listView = (ListView) findViewById(R.id.jazzMusic);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(Jazz.this, PlaySong.class);
            intent.putExtra("song", jazzMusic.get(position).getNameOfSong());
            intent.putExtra("artist", jazzMusic.get(position).getArtist());
            intent.putExtra("musicType", "jazz");
            startActivity(intent);
        });

        Button btn = (Button) findViewById(R.id.prev);
        btn.setOnClickListener(v -> startActivity(new Intent(Jazz.this, MainActivity.class)));
    }
}