package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MusicPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_play);

        ImageView backward_button = (ImageView) findViewById(R.id.music_backward);
        ImageView play_button = (ImageView) findViewById(R.id.music_play);
        ImageView stop_button = (ImageView) findViewById(R.id.music_stop);
        ImageView forward_button = (ImageView) findViewById(R.id.music_forward);
        TextView musicTitleTextView = (TextView) findViewById(R.id.music_title_text_view);

        String musicTitle = getIntent().getStringExtra("musicTitle");

        //Set the music title in the activity title text view
        musicTitleTextView.setText(musicTitle);

        backward_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Previous Song button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Play Song button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stop Song button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        forward_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Forward Song button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
