package com.example.sheldoncollegeinteractivemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OpeningPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_page);
    }


    public void launchMapsActivity(View view) {
        startActivity(new Intent(OpeningPage.this,MapsActivity.class)); //Starts the MapsActivity
    }

    public void launchLINQBuildingTeacher(View view) {
        startActivity(new Intent(OpeningPage.this,LINQBuildingTeachers.class)); //Starts the LINQBuildingTeachers Activity
    }
}