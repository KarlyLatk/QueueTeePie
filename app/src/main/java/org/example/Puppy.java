package org.example;

public class Puppy implements Cutie {
    @Override
    public String description() {
        return "Lil' Chonk";
    }

    @Override
    public Integer cutenessRating() {
        return 3;
    }
}
