package com.example.tnb644_lab5;

import java.util.ArrayList;

public class Zone {
    private String name;
    private int numGuests;
    ArrayList<Dinosaur> dinosaur;
    public Zone(String name, int numGuests) {
        this.name = name;
        this.numGuests = numGuests;
        dinosaur = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }
    public int getNumDinosaurs(){
        return dinosaur.size();
    }

}
