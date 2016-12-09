package com.example.semesterproject;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
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

    }
}

