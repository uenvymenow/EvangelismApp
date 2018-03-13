package com.example.aaron.evangelismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GrowthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.growthWordTextView);

        // Add the word Growth to the textview
        sinWord.setText("Growth");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.growthScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("Scripture 1");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.growthImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.growthimage);
    }
}
