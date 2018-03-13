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

        // Locate the bloodWordTextView
        TextView bloodWord = findViewById(R.id.bloodWordTextView);

        // Add the word blood to the textview
        bloodWord.setText("blood");

        // Locate the bloodScriptureTextView
        TextView bloodScripture = findViewById(R.id.bloodScriptureTextView);

        // Add the scripture reference to the bloodScriptureTextView
        bloodScripture.setText("Scripture");

        // Locate the bloodImageView
        ImageView bloodImage = findViewById(R.id.bloodImage);

        // Add the blood image to the bloodImageView
        bloodImage.setImageResource(R.drawable.bloodimage);
    }
}
