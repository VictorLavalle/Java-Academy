package com.java.academy.week2.day1.cast.v5;

class Eagle extends Bird {


    String type = "Eagle";

    @Override
    public void fly() {
        System.out.println("Fly like an Eagle");
    }

    public void eatLikeEagle() {
        System.out.println("Eat like an Eagle");
    }

}
