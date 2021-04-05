package com.example.cemeteryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                             //Set layout to home page
        Button searchPage = (Button) findViewById(R.id.searchButton);       //Get id for button
        searchPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchActivity();                                       //Change layout to search page after clicking button
            }
        });
        Button browsePage = (Button) findViewById(R.id.browseButton);       //Get id for button
        browsePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBrowseActivity();                                       //Change layout to browse page after clicking button
            }
        });
    }

    public void openSearchActivity() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void openBrowseActivity() {
        Intent intent = new Intent(this, BrowseActivity.class);
        startActivity(intent);
    }
}