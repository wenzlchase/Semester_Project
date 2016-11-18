package com.example.semesterproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

/**
 * Created by cwenzl on 10/11/2016.
 */
public class SettingsActivity extends AppCompatActivity {

   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_settings);

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

