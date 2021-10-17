package com.example.android.musicalstructureapp;

public class Song {
    private final String nameOfSong;
    private final String artist;

    public Song(String nameOfSong, String artist) {
        this.nameOfSong = nameOfSong;
        this.artist = artist;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public String getArtist() {
        return artist;
    }
}
