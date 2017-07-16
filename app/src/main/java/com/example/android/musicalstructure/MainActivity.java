package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the instances of text views
        TextView fmRadios = (TextView) findViewById(R.id.fm_radios);
        TextView liveTvs = (TextView) findViewById(R.id.live_tvs);
        TextView newsPortals = (TextView) findViewById(R.id.news_portals);
        TextView musicGallery = (TextView) findViewById(R.id.music_library);

        //Set onClickListener and then implement onClick() method within it.
        fmRadios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Inside FM Radios", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FmRadioActivity.class);
                startActivity(intent);
            }
        });

        liveTvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Inside Live TVs", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LiveTvActivity.class);
                startActivity(intent);
            }
        });

        newsPortals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Inside News Portals", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, NewsPortalActivity.class);
                startActivity(intent);
            }
        });

        musicGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Inside Music Library", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MusicGalleryActivity.class);
                startActivity(intent);
            }
        });
    }
}
