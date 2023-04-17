package com.example.tnb644_lab5;

/*
 * This is a interface that other classes will implement. It gives the base
 * methods to use.
 * @author Zachary Sierra (tnb644)
 * UTSA CS 3443 - Lab 1
 * Spring 2023
 */
public interface Dinosaur {
    public String toString();//Prints out information about the current dinosaur
    public Boolean isVegetarian();//returns if the dinosaur is vegetarian or not
    public String getName();//returns the name of the dinosaur
    public String getType();//returns the type of dinosaur it is

}
