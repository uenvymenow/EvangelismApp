package com.example.aaron.evangelismapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        bloodWord.setText("Blood");

        // Locate the bloodScriptureTextView
        TextView bloodScripture = findViewById(R.id.bloodScriptureTextView);

        // Add the scripture reference to the bloodScriptureTextView
        bloodScripture.setText("'but God shows his love for us in that while we were still sinners, Christ died for us. '\n" +
                "Romans 5:8");

        // Locate the bloodImageView
        ImageView bloodImage = findViewById(R.id.bloodImage);

        // Add the blood image to the bloodImageView
        bloodImage.setImageResource(R.drawable.bloodimage);

        // Access backTextview by finding id
        TextView backTextView =  findViewById(R.id.backTextView);

        // Create onClickListener
        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Access continueTextView
        TextView continueTextView = findViewById(R.id.continueTextView);
        continueTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bloodActivity = new Intent(BloodActivity.this, CleansingActivity.class);
                startActivity(bloodActivity);
                finish();
            }
        });
    }
}
