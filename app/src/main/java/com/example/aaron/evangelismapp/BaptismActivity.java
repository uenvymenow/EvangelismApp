package com.example.aaron.evangelismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BaptismActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baptism);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.baptismWordTextView);

        // Add the word Sin to the textview
        sinWord.setText("Baptism");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.baptismScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("Scripture 2");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.baptismImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.baptismimage);
    }
}
