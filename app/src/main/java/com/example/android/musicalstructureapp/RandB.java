package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class RandB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rand_b);
        ArrayList<Song> randbMusic = new ArrayList<>();
        randbMusic.add(new Song("Your Love", "ATB"));
        randbMusic.add(new Song("Higher", "Clean Bandit"));
        randbMusic.add(new Song("Leave A Little Love", "Armin van Buuren"));
        randbMusic.add(new Song("Paradise", "Meduza"));
        randbMusic.add(new Song("Goosebumps", "Travis Scott"));
        randbMusic.add(new Song("Heartbreak Anthem", "David Duetta"));
        randbMusic.add(new Song("Wasted Love", "Ofenbach"));
        randbMusic.add(new Song("Best Is Yet To Come", "Gryfin"));
        randbMusic.add(new Song("Hearts on Fire", "Lights"));
        randbMusic.add(new Song("SMB", "Trace Lysette"));
        randbMusic.add(new Song("Mr Pefectly Fine", "Taylor Swift"));

        SongAdapter songAdapter = new SongAdapter(this, randbMusic);
        ListView listView = (ListView) findViewById(R.id.randbMusic);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(RandB.this, PlaySong.class);
            intent.putExtra("song", randbMusic.get(position).getNameOfSong());
            intent.putExtra("artist", randbMusic.get(position).getArtist());
            intent.putExtra("musicType", "randb");
            startActivity(intent);
        });

        Button btn = (Button) findViewById(R.id.prev);
        btn.setOnClickListener(v -> startActivity(new Intent(RandB.this, MainActivity.class)));
    }
}