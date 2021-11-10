package com.example.sheldoncollegeinteractivemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LINQBuildingTeachers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linqbuilding_teachers);
    }

    public void launchMapsActivity(View view) {
        startActivity(new Intent(LINQBuildingTeachers.this,MapsActivity.class));
    }
}