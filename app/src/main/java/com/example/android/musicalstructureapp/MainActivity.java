package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout country = (LinearLayout) findViewById(R.id.countryMusic);
        country.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CountryMusic.class)));
        LinearLayout electronic = (LinearLayout) findViewById(R.id.electronicMusic);
        electronic.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Electronic.class)));
        LinearLayout jazz = (LinearLayout) findViewById(R.id.jazzMusic);
        jazz.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Jazz.class)));
        LinearLayout pop = (LinearLayout) findViewById(R.id.popMusic);
        pop.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Pop.class)));
        LinearLayout rAndB = (LinearLayout) findViewById(R.id.randbMusic);
        rAndB.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RandB.class)));
        LinearLayout rock = (LinearLayout) findViewById(R.id.rockMusic);
        rock.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Rock.class)));
    }
}