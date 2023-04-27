package com.example.tnb644_lab5;

import java.util.ArrayList;
import java.util.RandomAccess;

public class ZonedPark extends Park{

    public ZonedPark(String name) {
        super(name);

    }
    public void addZone(Zone x){
    zone.add(x);

    }
    public Zone getZone(String name){
        /** finds the zone given the name **/
        for (int i = 0; i < zone.size(); i++){
            if ( name.equals(zone.get(i).getAbbreviation())){
                return zone.get(i);
            }
        }
        return zone.get(0);
    }
    public Dinosaur getDinosaur(String name) throws Exception{
        /** finds the dinosaur when given the name **/
        for ( int i = 0; i < dinosaur.size(); i++){
            if ( dinosaur.get(i).getName().equals(name)) {
            return dinosaur.get(i);
            }
        }
        throw new Exception("ERROR: cannot find Dino named: "+ name);
    }
}
