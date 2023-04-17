package com.example.tnb644_lab5;

public class Triceratops extends Chasmosaurine{
    public Triceratops(String name, Boolean isVegetarian){
        super.setDinosaur(name, isVegetarian);
    }

    public String getSubType() {
        return "Triceratops";
    }
}
