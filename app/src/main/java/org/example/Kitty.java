package org.example;

public class Kitty implements Cutie{
    @Override
    public String description() {
        return "Precious Kittie";
    }

    @Override
    public Integer cutenessRating() {
        return 100;
    }
}
