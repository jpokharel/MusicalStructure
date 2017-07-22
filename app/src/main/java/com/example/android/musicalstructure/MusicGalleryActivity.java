package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_gallery);

        ImageView musicGalleryImage = (ImageView) findViewById(R.id.library);
        ImageView storeImage = (ImageView) findViewById(R.id.store);
        ImageView browseImage = (ImageView) findViewById(R.id.browse);
        ImageView radioImage = (ImageView) findViewById(R.id.radio);
        ImageView searchImage = (ImageView) findViewById(R.id.search);

        TextView playListTextView = (TextView) findViewById(R.id.play_list_text_view);
        TextView artistsTextView = (TextView) findViewById(R.id.artists_text_view);
        TextView albumsTextView = (TextView) findViewById(R.id.albums_text_view);
        TextView songsTextView = (TextView) findViewById(R.id.songs_text_view);

        Button button = (Button) findViewById(R.id.home_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        musicGalleryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, MusicGalleryActivity.class);
                startActivity(intent);

            }
        });

        storeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });

        browseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        });

        radioImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, FmRadioActivity.class);
                startActivity(intent);
            }
        });

        searchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        playListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });

        artistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });

        albumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        songsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicGalleryActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
