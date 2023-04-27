package com.example.tnb644_lab5;

public class Gallimimus extends Theropod{
    public Gallimimus(String name, Boolean isVegetarian){
        super.setDinosaur(name, isVegetarian);
    }
    /**
     * @return
     */
    public String getSubType() {
        return "Gallimius";
    }
}
