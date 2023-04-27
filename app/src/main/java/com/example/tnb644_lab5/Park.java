package com.example.tnb644_lab5;

import java.util.ArrayList;

/*
 * This class holds information about the different parks that are made
 * it contains an array that stores information on each dinosaur and is able
 * to add more dinosaurs to the array if needed.
 *
 *
 *
 * @author Zachary Sierra (tnb644)
 * UTSA CS 3443 - Lab 1
 * Spring 2023
 */
public class Park {
    private String name;
    ArrayList<Dinosaur> dinosaur;
    ArrayList<Zone> zone;


    public Park(String name) {
        //creates the park name, sets the max capacity, and creates the dinosaur array
        this.name = name;
        dinosaur = new ArrayList<>();
        zone = new ArrayList<>();

    }

    public String toString() {
        //prints information of all of the dinosaurs in the park
        String s;
        s = "Welcome to "+ name + "!\n- - - - - - - - - - - - -\n";
        for(int x = 0; x < dinosaur.size(); x++) {
            s = s + dinosaur.get(x).toString();
        }
        return s;
    }

    public void addDino(Dinosaur d) {
        //adds dinosaurs to the array
        dinosaur.add(d);
    }

}
