package com.example.aaron.evangelismapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the sin view that shows the SinActivity
        TextView sinTextView = findViewById(R.id.sinTextView);

        // Set onClickListener for sin textView {@Link SinActivity}
        sinTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sinIntent = new Intent(MainActivity.this, SinActivity.class);
                startActivity(sinIntent);
            }
        });

        // Find the blood view that shows the BloodActivity
        TextView bloodTextView = findViewById(R.id.bloodTextView);

        // Set onClickListener for blood textView {@Link BloodActivity}
        bloodTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bloodIntent = new Intent(MainActivity.this, BloodActivity.class);
                startActivity(bloodIntent);
            }
        });

        // Find the baptism view that shows the BaptismActivity
        TextView baptismTextView = findViewById(R.id.baptismTextView);

        // Set onClickListener for baptism textView {@Link BaptismActivity}
        baptismTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baptismIntent = new Intent(MainActivity.this, BaptismActivity.class);
                startActivity(baptismIntent);
            }
        });

        // Find the cleansing view that shows the CleansingActivity
        TextView cleansingTextView = findViewById(R.id.cleansingTextView);

        // Set onClickListener for cleansing textView {@Link CleansingActivity}
        cleansingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cleansingIntent = new Intent(MainActivity.this, CleansingActivity.class);
                startActivity(cleansingIntent);
            }
        });

        // Find the growth view that shows the GrowthActivity
        TextView growthTextView = findViewById(R.id.growthTextView);

        // Set onClickListener for sin textView {@Link SinActivity}
        growthTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent growthIntent = new Intent(MainActivity.this, GrowthActivity.class);
                startActivity(growthIntent);
            }
        });

        // Find the heaven view that shows the HeavenActivity
        TextView heavenTextView = findViewById(R.id.heavenTextView);

        // Set onClickListener for sin textView {@Link SinActivity}
        heavenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent heavenIntent = new Intent(MainActivity.this, HeavenActivity.class);
                startActivity(heavenIntent);
            }
        });
    }
}
