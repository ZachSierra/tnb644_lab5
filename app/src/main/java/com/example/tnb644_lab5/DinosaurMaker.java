package com.example.tnb644_lab5;

import java.lang.reflect.Constructor;

public class DinosaurMaker {
    public Dinosaur makeDinosaur(String dinoName, String dinoType, String currentLocation, String type, boolean isVegetarian){
        Dinosaur newDino;
        switch (dinoType){
            case "Apatosaurus":
                newDino = new Apatosaurus(dinoName, isVegetarian);
                return newDino;
            case "Brachiosaurus":
                newDino = new Brachiosaurus(dinoName, isVegetarian);
                return newDino;
            case "Dilophosaurus":
                newDino = new Dilophosaurus(dinoName, isVegetarian);
                return newDino;
            case "Gallimimus":
                newDino = new Gallimimus(dinoName, isVegetarian);
                return newDino;
            case "Indominous":
                newDino = new Indominous(dinoName, isVegetarian);
                return newDino;
            case "Stegosaurus":
                newDino = new Stegosaurus(dinoName, isVegetarian);
                return newDino;
            case "Triceratops":
                newDino = new Triceratops(dinoName, isVegetarian);
                return newDino;
            case "Tyrannosaurus":
                newDino = new Tyrannosaurus(dinoName, isVegetarian);
                return newDino;
            case "Velociraptor":
                newDino = new Velociraptor(dinoName, isVegetarian);
                return newDino;
        }

        return null;
    }
}
