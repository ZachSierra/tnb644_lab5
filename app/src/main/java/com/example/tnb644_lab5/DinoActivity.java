package com.example.tnb644_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class DinoActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tnb644_lab5.message";
    private String zoneType;
    private Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dino);
        zoneType = getIntent().getStringExtra(EXTRA_MESSAGE);
        /**
         * ________________________
         * |{ImageView} {TextView}|
         * |      {TextView}      |
         * |{TextView}            |
         * |{EditText}            |
         * |{TextView}            |
         * |{EditText}            |
         * |  {Button}  {Button}  |
         * ------------------------
         * Shows the name of the Zone [X], instructions on how to relocate the dinosaur, and a short form to complete
         *
         * - 2 Text fields
         *      - One that gets the dinosaur name
         *      - One that gets what zone to relocate to
         * - 2 Buttons
         *      - "RELOCATE" Button
         *          - Button that submits the relocation and pops up a toast depending on the action
         *              - ENTERED and VALID -- Toast "[Dinosaur name] has been successfully moved to Zone [X]"
         *                  - UPDATE FILES ACCORDINGLY
         *              - INVALID NAME -- Toast "The name [Dinosaur name] is a invalid dinosaur name"
         *                  - DON'T UPDATE FILES
         *              - INVALID ZONE -- Toast "The Zone [X] is a invalid Zone"
         *                  - DON'T UPDATE FILES
         *      - "PARK MAP" Button
         *          - Button that returns the user back to the MainActivity
         */

    }
}