package com.example.aaron.evangelismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GrowthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth);

        // Locate the growthWordTextView
        TextView growthWord = findViewById(R.id.growthWordTextView);

        // Add the word Growth to the textview
        growthWord.setText("Growth");

        // Locate the growthScriptureTextView
        TextView growthScripture = findViewById(R.id.growthScriptureTextView);

        // Add the scripture reference to the growthScriptureTextView
        growthScripture.setText("'But grow in the grace and knowledge of our Lord and " +
                "Savior Jesus Christ. To him be the glory both now and to the day of " +
                "eternity. Amen. '\n" +
                "2 Peter 3:18");

        // Locate the growthImageView
        ImageView growthImage = findViewById(R.id.growthImage);

        // Add the growth image to the growthImageView
        growthImage.setImageResource(R.drawable.growthimage);
    }
}
