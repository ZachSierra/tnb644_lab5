package com.example.tnb644_lab5;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ZonedParkMaker {
    public void makeZonedPark(Context c){
        /**
         * loads all of the files
         * get # of dinosaurs
         * create a zonedpark object
         * create vegetarian map
         * pass data from each line of dino.csv and vegetarian map to DinosaurMaker to create a dinosaur
         * Add dinosaur to the park
         * read and store the zones data from zones.csv
         */
        System.out.println(c);

        String line;
        try {
            AssetManager am = c.getAssets();
            BufferedReader br = new BufferedReader(new InputStreamReader(am.open("types.csv"), "UTF-8"));
            //BufferedFileReader dinosbfr = new BufferedFileReader("dinos.csv", c);
            //BufferedFileReader typesbfr = new BufferedFileReader("types.csv", c);
            //BufferedFileReader zonesbfr = new BufferedFileReader("zones.csv", c);
            HashMap<String,Boolean> vegMap = new HashMap<>();
            DinosaurMaker dinoMaker = new DinosaurMaker();
            Park park = new Park("Park");

            while ((line = br.readLine()) != null) {
                String[] typefield = line.split(",");
                /** type, TRUE/FALSE **/
                /* Adds each line to a hashmap */
                String type = typefield[0];
                boolean isVegetarian = Boolean.valueOf(typefield[1]);

                System.out.println(type + " " + isVegetarian);
                vegMap.put(type, isVegetarian);
            }
            br.close();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(am.open("zones.csv"), "UTF-8"));
            while ((line = bfr.readLine()) != null) {
                String[] zonefield = line.split(",");
                /** zone full name, risk level, zone abbreviation, number of guests **/
                String zoneFullName = zonefield[0];
                String riskLevel = zonefield[1];
                String zoneAbbreviation = zonefield[2];
                int numOfGuests = Integer.parseInt(zonefield[3]);


                //Types are handled
                Zone zone = new Zone(zoneFullName, riskLevel, zoneAbbreviation, numOfGuests);
                System.out.println(zoneFullName + " " + riskLevel + " " + zoneAbbreviation + " " + numOfGuests);
                park.zone.add(zone);


            }
            bfr.close();
            BufferedReader breader = new BufferedReader(new InputStreamReader(am.open("dinos.csv"), "UTF-8"));
            while ((line = breader.readLine()) != null) {
                String[] dinofield = line.split(",");
                /** Dino name, type , current zone location **/
                String dinoName = dinofield[0];
                String dinoType = dinofield[1];
                String currLocation = dinofield[2];

                if (vegMap.containsKey(Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName())){
                    System.out.println("Super class was found in vegMap");
                }
                else{
                    System.out.println("Super class was not found in vegMap");
                }
                /** Add dino to parks arraylist of dinos **/
                System.out.println(dinoName + " " + dinoType + " " + currLocation + " " + Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName() + " " + vegMap.get(Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName()));
                park.addDino(dinoMaker.makeDinosaur(dinoName,dinoType,currLocation,Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName(),vegMap.get(Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName())));
                /** check to see what zone the dino can fit into **/
                for ( int i = 0; i < park.zone.size(); i++){
                    if (currLocation.equals(park.zone.get(i).getAbbreviation())){
                        park.zone.get(i).addDino(dinoMaker.makeDinosaur(dinoName,dinoType,currLocation,Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName(),vegMap.get(Class.forName("com.example.tnb644_lab5." + dinoType).getSuperclass().getSimpleName())));
                    }
                }
            }
            breader.close();

            /*
            zonesbfr.close();
            dinosbfr.close();
            typesbfr.close();
            */
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("ERROR UH-OH");
        }

    }
}
