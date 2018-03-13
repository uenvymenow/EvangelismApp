package com.example.aaron.evangelismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BloodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.bloodWordTextView);

        // Add the word Sin to the textview
        sinWord.setText("blood");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.bloodScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("Scripture");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.bloodImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.bloodimage);
    }
}
