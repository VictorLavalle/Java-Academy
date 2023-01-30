package com.java.academy.week2.day1.cast.v5;

public class GoldenEagle extends Eagle {

    String type = "GoldenEagle";

    @Override
    public void fly() {
        System.out.println("GoldenEagle is flying");
    }

    public void eatLikeGoldenEagle() {
        System.out.println("Eat like a Golden Eagle");
    }
}
