package com.example.aaron.evangelismapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.sinWordTextView);

        // Add the word Sin to the textview
        sinWord.setText("Sin");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.sinScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("'for all have sinned and fall short of the glory of God, \n" +
                "Romans 3:23");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.sinImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.sinimage);
    }

    public void BackButton(View view){
        // Find the sin view that shows the SinActivity
        TextView backTextView = findViewById(R.id.backTextView);

        // Set onClickListener for back textView {@Link MainActivity}
        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(SinActivity.this, BloodActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
