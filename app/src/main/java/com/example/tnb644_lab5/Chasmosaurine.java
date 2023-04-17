package com.example.tnb644_lab5;

public abstract class Chasmosaurine implements Dinosaur {
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
        s = "* Chasmosaurine: " + getSubType() + " named " + getName() + " (" + Veg + ")\n";
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
        //returns the subtype of dinosaur
        String s = getSubType();
        return s;
    }
    public abstract String getSubType();//abstract method for the subclass

}
