package com.example.aaron.evangelismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HeavenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heaven);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.heavenWordTextView);

        // Add the word Sin to the textview
        sinWord.setText("Heaven");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.heavenScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("Scripture 1");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.heavenImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.heavenimage);
    }
}
