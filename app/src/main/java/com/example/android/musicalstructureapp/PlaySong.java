package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PlaySong extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        TextView nameSong = findViewById(R.id.nameOfSong);
        TextView nameAtist = findViewById(R.id.nameArtist);
        if (getIntent().hasExtra("song"))
            nameSong.setText(getIntent().getStringExtra("song"));
        if (getIntent().hasExtra("artist"))
            nameAtist.setText(getIntent().getStringExtra("artist"));

        Button button1 = (Button) findViewById(R.id.fisrtRowRight);
        button1.setText("Home");
        button1.setTextColor(-3355444);
        button1.setOnClickListener(v -> startActivity(new Intent(PlaySong.this, MainActivity.class)));

        Button button2 = (Button) findViewById(R.id.fisrtRowLeft);
        button2.setText("Back");
        button2.setTextColor(-3355444);
        button2.setOnClickListener(v -> {
            switch (getIntent().getStringExtra("musicType").toLowerCase()) {
                case "country":
                    startActivity(new Intent(PlaySong.this, CountryMusic.class));
                    break;
                case "electronic":
                    startActivity(new Intent(PlaySong.this, Electronic.class));
                    break;
                case "jazz":
                    startActivity(new Intent(PlaySong.this, Jazz.class));
                    break;
                case "pop":
                    startActivity(new Intent(PlaySong.this, Pop.class));
                    break;
                case "randb":
                    startActivity(new Intent(PlaySong.this, RandB.class));
                    break;
                case "rock":
                    startActivity(new Intent(PlaySong.this, Rock.class));
                    break;
            }
        });
    }
}
