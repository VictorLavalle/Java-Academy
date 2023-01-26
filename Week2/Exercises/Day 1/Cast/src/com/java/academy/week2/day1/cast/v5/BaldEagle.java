package com.java.academy.week2.day1.cast.v5;

public class BaldEagle extends Eagle {

    String type = "BaldEagle";

    @Override
    public void fly() {
        System.out.println("BaldEagle is flying");
    }

    public void eatLikeBaldEagle() {
        System.out.println("Eat like a Bald Eagle");
    }

}