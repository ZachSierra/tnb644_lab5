package com.example.tnb644_lab5;

/*
 * This class uses the dinosaur interface to create a type of dinosaur (Saurpod)
 * that holds information about the dinosaur including the name and if they are
 * vegetarian or not.
 *
 *
 *
 * @author Zachary Sierra (tnb644)
 * UTSA CS 3443 - Lab 1
 * Spring 2023
 */
public abstract class Sauropod implements Dinosaur {
    private String name;
    private Boolean isVegetarian;

    public void setDinosaur(String name, Boolean isVegetarian) {
        //sets the name and if they are vegetarian or not
        this.name = name;
        this.isVegetarian = isVegetarian;
    }
    public String toString() {
        //Prints out information about the current dinosaur
        String s, Veg;
        if(isVegetarian) {
            Veg = "not carnivore";
        }
        else {
            Veg = "carnivore";
        }
        s = "* Sauropod: " + getSubType() + " named " + getName() + " (" + Veg + ")\n";
        return s;
    }
    public String getName() {
        //returns the name of the dinosaur
        return name;
    }
    public Boolean isVegetarian() {
        //returns if the dinosaur is vegetarian or not
        return isVegetarian;
    }
    public String getType() {
        //gets the subtype of the dinosaur
        String s = getSubType();
        return s;
    }
    public abstract String getSubType();// abstract method for the subclass

}
