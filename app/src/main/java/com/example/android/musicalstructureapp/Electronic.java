package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Electronic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);

        ArrayList<Song> electronicMusic = new ArrayList<>();
        electronicMusic.add(new Song("Your Love", "ATB"));
        electronicMusic.add(new Song("Higher", "Clean Bandit"));
        electronicMusic.add(new Song("Leave A Little Love", "Armin van Buuren"));
        electronicMusic.add(new Song("Paradise", "Meduza"));
        electronicMusic.add(new Song("Goosebumps", "Travis Scott"));
        electronicMusic.add(new Song("Heartbreak Anthem", "David Duetta"));
        electronicMusic.add(new Song("Wasted Love", "Ofenbach"));
        electronicMusic.add(new Song("Best Is Yet To Come", "Gryfin"));
        electronicMusic.add(new Song("Hearts on Fire", "Lights"));
        electronicMusic.add(new Song("Ocean Drive", "Duke Dumont"));
        electronicMusic.add(new Song("Riverside", "Sidney Samson"));

        SongAdapter songAdapter = new SongAdapter(this, electronicMusic);
        ListView listView = (ListView) findViewById(R.id.electronicMusic);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(Electronic.this, PlaySong.class);
            intent.putExtra("song", electronicMusic.get(position).getNameOfSong());
            intent.putExtra("artist", electronicMusic.get(position).getArtist());
            intent.putExtra("musicType", "electronic");
            startActivity(intent);
        });

        Button btn = (Button) findViewById(R.id.prev);
        btn.setOnClickListener(v -> startActivity(new Intent(Electronic.this, MainActivity.class)));
    }
}