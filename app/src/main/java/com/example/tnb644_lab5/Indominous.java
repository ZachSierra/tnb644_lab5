package com.example.tnb644_lab5;

public class Indominous extends Theropod{
    public Indominous(String name, Boolean isVegetarian){
        super.setDinosaur(name, isVegetarian);
    }
    /**
     * @return
     */
    public String getSubType() {
        return "Indominous";
    }
}
