package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_gallery);

        ImageView music_gallery_img = (ImageView) findViewById(R.id.library);
        ImageView store_img = (ImageView) findViewById(R.id.store);
        ImageView browse_img = (ImageView) findViewById(R.id.browse);
        ImageView radio_img = (ImageView) findViewById(R.id.radio);
        ImageView search_img = (ImageView) findViewById(R.id.search);

        TextView playlist_textview = (TextView) findViewById(R.id.play_list_text_view);
        TextView artists_textview = (TextView) findViewById(R.id.artists_text_view);
        TextView albums_textview = (TextView) findViewById(R.id.albums_text_view);
        TextView songs_textview = (TextView) findViewById(R.id.songs_text_view);

        music_gallery_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
              //  mediaPlayer.start();
               Intent intent = new Intent(MusicGalleryActivity.this,MusicGalleryActivity.class);
                startActivity(intent);

            }
        });

        store_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });

        browse_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        });

        radio_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, FmRadioActivity.class);
                startActivity(intent);
            }
        });

        search_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        playlist_textview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });

        artists_textview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });

        albums_textview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        songs_textview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
