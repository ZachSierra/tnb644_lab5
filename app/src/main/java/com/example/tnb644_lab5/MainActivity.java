package com.example.tnb644_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String zoneType;
    private Context c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = getApplicationContext();
        Button ZoneX = findViewById(R.id./* FIX ME */);
        Button ZoneB = findViewById(R.id./* FIX ME */);
        Button ZoneG = findViewById(R.id./* FIX ME */);
        Button ZoneD = findViewById(R.id./* FIX ME */);
        Button ZoneR = findViewById(R.id./* FIX ME */);
        Button ZoneTR = findViewById(R.id./* FIX ME */);
        Button ZoneTY = findViewById(R.id./* FIX ME */);

        ZoneX.setOnClickListener(new MainController("Zone X", c));
        ZoneB.setOnClickListener(new MainController("Zone B", c));
        ZoneG.setOnClickListener(new MainController("Zone G", c));
        ZoneD.setOnClickListener(new MainController("Zone D", c));
        ZoneR.setOnClickListener(new MainController("Zone R", c));
        ZoneTR.setOnClickListener(new MainController("Zone TR", c));
        ZoneTY.setOnClickListener(new MainController("Zone TY", c));


        /**
         *
         *
         * DONE -- Initialize buttons for all of the 7 zones
         * Connect the 7 zone buttons to their ids in the xml layout
         * DONE -- Get the context of the activity and store it in c
         * EX: MainController(zoneType, c)
         */
    }
}