package com.example.tnb644_lab5;

/*
 *
 * This class uses its super class to set the dinosaur and return the subtype of dinosaur
 *
 *
 * @author Zachary Sierra (tnb644)
 * UTSA CS 3443 - Lab 1
 * Spring 2023
 */
public class Apatosaurus extends Sauropod {
    public Apatosaurus(String name, Boolean isVegetarian) {
        //sets the dinosaur name and if its vegetarian or not
        super.setDinosaur(name, isVegetarian);
    }
    public String getSubType() {
        //returns the subtype of dinosaur
        return "Apatosaurus";
    }
}
