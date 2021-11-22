package com.example.sheldoncollegeinteractivemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MrSinclairClasses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_sinclair_classes);
    }

    public void launchDirections(View view) {
        startActivity(new Intent(MrSinclairClasses.this, Directions.class)); //Starts the activity of Directions when the button is clicked
    }
}