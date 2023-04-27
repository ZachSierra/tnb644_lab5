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
        Button ZoneX = findViewById(R.id.ZoneX);
        Button ZoneB = findViewById(R.id.ZoneB);
        Button ZoneG = findViewById(R.id.ZoneG);
        Button ZoneD = findViewById(R.id.ZoneD);
        Button ZoneR = findViewById(R.id.ZoneR);
        Button ZoneTR = findViewById(R.id.ZoneTR);
        Button ZoneTY = findViewById(R.id.ZoneTY);

        ZoneX.setOnClickListener(new MainController("X", c));
        ZoneB.setOnClickListener(new MainController("B", c));
        ZoneG.setOnClickListener(new MainController("G", c));
        ZoneD.setOnClickListener(new MainController("D", c));
        ZoneR.setOnClickListener(new MainController("R", c));
        ZoneTR.setOnClickListener(new MainController("TR", c));
        ZoneTY.setOnClickListener(new MainController("TY", c));




        /**
         *
         *
         * DONE -- Initialize buttons for all of the 7 zones
         * DONE -- Connect the 7 zone buttons to their ids in the xml layout
         * DONE -- Get the context of the activity and store it in c
         * EX: MainController(zoneType, c)
         */
    }
}