package com.example.android.musicalstructureapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songList) {

        super(context, 0, songList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentAndroidFlavor = getItem(position);

        TextView nameOfSongTextView = (TextView) listItemView.findViewById(R.id.nameSong);
        nameOfSongTextView.setText(currentAndroidFlavor.getNameOfSong());
        nameOfSongTextView.setTextColor(Color.WHITE);

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.nameArtist);
        artistTextView.setText(currentAndroidFlavor.getArtist());
        artistTextView.setTextColor(Color.WHITE);
        return listItemView;
    }
}
