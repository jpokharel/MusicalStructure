package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Button song1 = (Button) findViewById(R.id.rato_ra_chandra_button);
        Button song2 = (Button) findViewById(R.id.sajha_busma_button);
        Button song3 = (Button) findViewById(R.id.simsime_panima_button);
        Button song4 = (Button) findViewById(R.id.jaaga_lamka_chamka_button);
        Button song5 = (Button) findViewById(R.id.kutu_ma_kutu_button);

        song1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(SongsActivity.this,MusicPlayActivity.class);
                startActivity(intent1);

                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
                mediaPlayer.start();
            }
        });

        song2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(SongsActivity.this,MusicPlayActivity.class);
                startActivity(intent1);

                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
                mediaPlayer.start();
            }
        });

        song3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(SongsActivity.this,MusicPlayActivity.class);
                startActivity(intent1);

                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
                mediaPlayer.start();
            }
        });

        song4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(SongsActivity.this,MusicPlayActivity.class);
                startActivity(intent1);

                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
                mediaPlayer.start();
            }
        });

        song5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(SongsActivity.this,MusicPlayActivity.class);
                startActivity(intent1);

                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music1);
                mediaPlayer.start();
            }
        });
    }
}
