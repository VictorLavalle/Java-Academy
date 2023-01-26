package com.java.academy.week2.day1.cast.v5;

public class Principal {

    public static void main(String[] args) {

        GoldenEagle goldenEagle = new GoldenEagle();
        System.out.println(goldenEagle.type);
        goldenEagle.fly();

        Eagle eagle = goldenEagle; // Upcasting
        System.out.println(eagle.type);
        eagle.fly();

        Bird bird = eagle;
        System.out.println(bird.type); //Bird
        bird.fly(); //Fly like an Eagle
    }

}
