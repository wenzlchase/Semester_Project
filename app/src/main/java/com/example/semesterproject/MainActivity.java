package com.example.semesterproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Button button = (Button) findViewById(R.id.button2);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


           Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
              startActivity(intent);
          }
      });


       Button button1 = (Button) findViewById(R.id.button3);
               button1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(MainActivity.this, HelpActivity.class);
                       startActivity(intent);
                   }
               });


    Button button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeginGame.class);
                startActivity(intent);
            }
        });

     Button button3 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MoreActivity.class);
                startActivity(intent);
            }
        });

        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tooclose);
        mediaPlayer.start();
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }
  }













