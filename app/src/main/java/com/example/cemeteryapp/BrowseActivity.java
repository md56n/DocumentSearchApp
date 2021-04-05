package com.example.cemeteryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        Button submitSearch = (Button) findViewById(R.id.submitButton);       //Get id for button
        Button back = (Button) findViewById(R.id.backButton);                 //Get id for button
        Spinner plot = (Spinner) findViewById(R.id.spinner);                  //Get id for spinner
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
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(BrowseActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.plots));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        plot.setAdapter(adapter);
    }

    public void openMainActivity() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}