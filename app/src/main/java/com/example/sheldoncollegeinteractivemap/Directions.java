package com.example.sheldoncollegeinteractivemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Directions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);
    }

    public void launchFinalActivity(View view) {
        startActivity(new Intent(Directions.this,FinalActivity.class));
    }
}