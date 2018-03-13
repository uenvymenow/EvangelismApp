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

        // Locate the heavenWordTextView
        TextView heavenWord = findViewById(R.id.heavenWordTextView);

        // Add the word heaven to the textview
        heavenWord.setText("Heaven");

        // Locate the heavenScriptureTextView
        TextView heavenScripture = findViewById(R.id.heavenScriptureTextView);

        // Add the scripture reference to the heavenScriptureTextView
        heavenScripture.setText("Scripture 1");

        // Locate the heavenImageView
        ImageView heavenImage = findViewById(R.id.heavenImage);

        // Add the heaven image to the heavenImageView
        heavenImage.setImageResource(R.drawable.heavenimage);
    }
}
