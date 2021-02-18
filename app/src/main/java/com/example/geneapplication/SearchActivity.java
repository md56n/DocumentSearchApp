package com.example.geneapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Button submitSearch = (Button) findViewById(R.id.submitButton);       //Get id for button
        Button back = (Button) findViewById(R.id.backButton);       //Get id for button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();             //Change layout to main page after clicking button
            }
        });
        submitSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                     //Change layout to main page after clicking button
            }
        });
    }

    public void openMainActivity() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}