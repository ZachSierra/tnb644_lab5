package com.example.tnb644_lab5;

public class Gallimius extends Theropod{
    public Gallimius(String name, Boolean isVegetarian){
        super.setDinosaur(name, isVegetarian);
    }
    /**
     * @return
     */
    public String getSubType() {
        return "Gallimius";
    }
}
