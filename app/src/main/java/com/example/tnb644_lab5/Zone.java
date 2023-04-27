package com.example.tnb644_lab5;

import java.util.ArrayList;

public class Zone {
    private String fullName;
    private String riskLevel;
    private String abbreviation;

    private int numGuests;
    ArrayList<Dinosaur> dinosaur;
    public Zone(String fullName,String riskLevel, String abbreviation, int numGuests) {
        this.fullName = fullName;
        this.riskLevel = riskLevel;
        this.abbreviation = abbreviation;
        this.numGuests = numGuests;
        dinosaur = new ArrayList<>();
    }
    public void addDino(Dinosaur d){
        dinosaur.add(d);
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }
    public int getNumDinosaurs(){
        return dinosaur.size();
    }

}
