package com.example.semesterproject;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by cwenzl on 10/25/2016.
 */
public class BeginGame extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begin_game);

        Button button1 = (Button) findViewById(R.id.buttonQuit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeginGame.this, MainActivity.class);
                startActivity(intent);
            }
        });

        /*String url = "https://www.youtube.com/watch?v=OaOiHVgP3Pw"
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(url);
        mediaPlayer.prepare(); // might take long! (for buffering, etc)
        mediaPlayer.start();*/
    }
}