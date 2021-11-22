package com.example.sheldoncollegeinteractivemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    public void launchGoogle(View view) {
        startActivity(new Intent(FinalActivity.this,OpeningPage.class));
    }

    public void launchTeachers(View view) {
        startActivity(new Intent(FinalActivity.this,LINQBuildingTeachers.class));
    }
}