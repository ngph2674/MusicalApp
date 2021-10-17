package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        ArrayList<Song> popMusic = new ArrayList<>();
        popMusic.add(new Song("Bad Habits", "Ed Sheeran"));
        popMusic.add(new Song("Shivers", "Ed Sheeran"));
        popMusic.add(new Song("Cold Heart (Pnau Remix)", "Elton John & Dua Lipa"));
        popMusic.add(new Song("Stay", "The Kid Laroi & Justin Bieber"));
        popMusic.add(new Song("Spaceman", "Mew Suppasit"));
        popMusic.add(new Song("Ghost", "Justin Bieber"));
        popMusic.add(new Song("My Universe", "Coldplay X BTS"));
        popMusic.add(new Song("Love Again", "Dua Lipa"));
        popMusic.add(new Song("Perfect", "Ed Sheeran"));
        popMusic.add(new Song("SMB", "Trace Lysette"));
        popMusic.add(new Song("Mr Pefectly Fine", "Taylor Swift"));

        SongAdapter songAdapter = new SongAdapter(this, popMusic);
        ListView listView = (ListView) findViewById(R.id.popMusic);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(Pop.this, PlaySong.class);
            intent.putExtra("song", popMusic.get(position).getNameOfSong());
            intent.putExtra("artist", popMusic.get(position).getArtist());
            intent.putExtra("musicType", "pop");
            startActivity(intent);
        });

        Button btn = (Button) findViewById(R.id.prev);
        btn.setOnClickListener(v -> startActivity(new Intent(Pop.this, MainActivity.class)));
    }
}