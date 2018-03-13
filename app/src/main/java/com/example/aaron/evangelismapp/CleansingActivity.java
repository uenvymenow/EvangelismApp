package com.example.aaron.evangelismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CleansingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleansing);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.cleansingWordTextView);

        // Add the word Cleansing to the textview
        sinWord.setText("Cleansing");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.cleansingScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("Scripture 1");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.cleansingImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.cleansingimage);
    }
}
