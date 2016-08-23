package com.example.oscar.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void movies(View view) {
        Toast.makeText(this, "This button launch my Popular Movies app!", Toast.LENGTH_LONG).show();
    }

    public void hawk(View view) {
        Toast.makeText(this, "This button launch my Stock Hawk app!", Toast.LENGTH_LONG).show();
    }

    public void bigger(View view) {
        Toast.makeText(this, "This button launch my Build it Bigger app!", Toast.LENGTH_LONG).show();
    }

    public void material(View view) {
        Toast.makeText(this, "This button launch my Make Your App Material app!", Toast.LENGTH_LONG).show();
    }

    public void ubiquitous(View view) {
        Toast.makeText(this, "This button launch my Go Ubiquitous app!", Toast.LENGTH_LONG).show();
    }

    public void capstone(View view) {
        Toast.makeText(this, "This button launch my Capstone app!", Toast.LENGTH_LONG).show();
    }
}