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

        // Locate the cleansingWordTextView
        TextView cleansingWord = findViewById(R.id.cleansingWordTextView);

        // Add the word Cleansing to the textview
        cleansingWord.setText("Cleansing");

        // Locate the cleansingScriptureTextView
        TextView cleansingScripture = findViewById(R.id.cleansingScriptureTextView);

        // Add the scripture reference to the cleansingScriptureTextView
        cleansingScripture.setText("' Purge me with hyssop, and I shall be clean; wash me, " +
                "and I shall be whiter than snow.'\n" +
                "Psalms 51:7");

        // Locate the cleansingImageView
        ImageView cleansingImage = findViewById(R.id.cleansingImage);

        // Add the cleansing image to the cleansingImageView
        cleansingImage.setImageResource(R.drawable.cleansingimage);
    }
}
