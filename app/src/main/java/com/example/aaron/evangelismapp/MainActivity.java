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

        // Set onClickListener for sin textView {@Link SinActivity}
        bloodTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bloodIntent = new Intent(MainActivity.this, BloodActivity.class);
                startActivity(bloodIntent);
            }
        });
    }
}
