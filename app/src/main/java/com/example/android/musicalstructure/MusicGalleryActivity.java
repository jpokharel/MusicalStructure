package com.example.android.musicalstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class MusicGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_gallery);

        ImageView music_gallery_img = (ImageView) findViewById(R.id.library);

        music_gallery_img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData("C:\\Users\\jiwanpokharel89\\AndroidStudioProjects\\MusicalStructure\\app\\src\\main\\res\\raw\\music1.mp3");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });
    }
}
