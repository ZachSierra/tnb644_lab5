package com.example.tnb644_lab5;

public class Dilophosaurus extends Theropod {
    public Dilophosaurus(String name, Boolean isVegetarian){
        super.setDinosaur(name, isVegetarian);
    }
    /**
     * @return
     */
    public String getSubType() {
        return "Dilophosaurus";
    }
}
