package com.example.semesterproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/** Chase Wenzl
 *
 */
public class Character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more2);

        Button button = (Button) findViewById(R.id.PButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Character.this, MoreActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.home_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Character.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}

