package com.example.tnb644_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class ZoneActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tnb644_lab5.message";
    private String zoneType;
    private Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);
        zoneType = getIntent().getStringExtra(EXTRA_MESSAGE);
        /**
         * _________________________
         * |{ImageView}  {TextView}|
         * |{TextView}             |
         * |{TextView}             |
         * |{Button}               |
         * |[{ImageView}{TextView}]|
         * |[{         }{TextView}]|
         * -------------------------
         *
         * Shows info about Zone X such as number of guests, number of dinosaurs, and a
         * list of dinosaurs with details about each dino
         *
         * - 1 button that moves to DinoActivity to relocate the dinosaur
         */


    }
}