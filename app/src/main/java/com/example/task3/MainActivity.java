package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity{
    VideoView animalsvideo;
    Uri uri, uri2, uri3, uri4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton catbtn = (ImageButton) findViewById(R.id.cat);
        ImageButton dogbtn = (ImageButton) findViewById(R.id.dog);
        ImageButton cowbtn = (ImageButton) findViewById(R.id.cow);
        ImageButton chickenbtn = (ImageButton) findViewById(R.id.chicken);

        animalsvideo = findViewById(R.id.videoView);

        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cat);
        uri2 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dog);
        uri3 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.chicken);
        uri4 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cow);

        catbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animalsvideo.setVideoURI(uri);
                animalsvideo.start();
            }
        });
        dogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animalsvideo.setVideoURI(uri2);
                animalsvideo.start();
            }
        });
        chickenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animalsvideo.setVideoURI(uri3);
                animalsvideo.start();
            }
        });
        cowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animalsvideo.setVideoURI(uri4);
                animalsvideo.start();
            }
        });
    }

}
