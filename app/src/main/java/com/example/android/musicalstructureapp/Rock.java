package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        ArrayList<Song> rockMusic = new ArrayList<>();
        rockMusic.add(new Song("Your Love", "ATB"));
        rockMusic.add(new Song("Higher", "Clean Bandit"));
        rockMusic.add(new Song("Leave A Little Love", "Armin van Buuren"));
        rockMusic.add(new Song("Paradise", "Meduza"));
        rockMusic.add(new Song("Goosebumps", "Travis Scott"));
        rockMusic.add(new Song("Heartbreak Anthem", "David Duetta"));
        rockMusic.add(new Song("Wasted Love", "Ofenbach"));
        rockMusic.add(new Song("Best Is Yet To Come", "Gryfin"));
        rockMusic.add(new Song("Hearts on Fire", "Lights"));
        rockMusic.add(new Song("SMB", "Trace Lysette"));
        rockMusic.add(new Song("Mr Pefectly Fine", "Taylor Swift"));

        SongAdapter songAdapter = new SongAdapter(this, rockMusic);
        ListView listView = (ListView) findViewById(R.id.rockMusic);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(Rock.this, PlaySong.class);
            intent.putExtra("song", rockMusic.get(position).getNameOfSong());
            intent.putExtra("artist", rockMusic.get(position).getArtist());
            intent.putExtra("musicType", "rock");
            startActivity(intent);
        });

        Button btn = (Button) findViewById(R.id.prev);
        btn.setOnClickListener(v -> startActivity(new Intent(Rock.this, MainActivity.class)));
    }
}