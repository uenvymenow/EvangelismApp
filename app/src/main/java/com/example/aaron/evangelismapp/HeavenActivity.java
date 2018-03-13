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
        heavenScripture.setText("'Do not fear what you are about to suffer. Behold, the " +
                "devil is about to throw some of you into prison, that you may be tested, " +
                "and for ten days you will have tribulation. Be faithful unto death, and I " +
                "will give you the crown of life. '\n" +
                "Revelation 2:10");

        // Locate the heavenImageView
        ImageView heavenImage = findViewById(R.id.heavenImage);

        // Add the heaven image to the heavenImageView
        heavenImage.setImageResource(R.drawable.heavenimage);
    }
}
