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

        // Locate the baptismWordTextView
        TextView baptismWord = findViewById(R.id.baptismWordTextView);

        // Add the word Baptism to the textview
        baptismWord.setText("Baptism");

        // Locate the baptismScriptureTextView
        TextView baptismScripture = findViewById(R.id.baptismScriptureTextView);

        // Add the scripture reference to the baptismScriptureTextView
        baptismScripture.setText("'We were buried therefore with him by baptism into death, in " +
                "order that, just as Christ was raised from the dead by the glory of the " +
                "Father, we too might walk in newness of life. '\n" +
                "Romans 6:4");

        // Locate the baptismImageView
        ImageView baptismImage = findViewById(R.id.baptismImage);

        // Add the baptism image to the baptismImageView
        baptismImage.setImageResource(R.drawable.baptismimage);
    }
}
