package com.example.semesterproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by cwenzl on 10/11/2016.
 */
public class SettingsActivity extends AppCompatActivity {

    Switch aSwitch;

   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_settings);
       final MediaPlayer mediaPlayer = MediaPlayer.create(SettingsActivity.this, R.raw.tooclose);


       aSwitch = (Switch)findViewById(R.id.switchbutton);
       aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked==true){


                   Toast.makeText(getBaseContext(),"On",Toast.LENGTH_SHORT).show();
                   mediaPlayer.start();
               }
               else{


                   Toast.makeText(getBaseContext(),"Off",Toast.LENGTH_SHORT).show();
                   mediaPlayer.stop();
               }

           }
       });


       Button button = (Button) findViewById(R.id.back_button);
               button.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                       startActivity(intent);
                   }
               });

   }
}

