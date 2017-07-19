package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

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

        music_gallery_img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
                mediaPlayer.start();
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData("C:\\Users\\jiwanpokharel89\\AndroidStudioProjects\\MusicalStructure\\app\\src\\main\\res\\raw\\music1.mp3");
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }

            }
        });

        store_img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });

        browse_img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        });

        radio_img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, FmRadioActivity.class);
                startActivity(intent);
            }
        });

        search_img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MusicGalleryActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
