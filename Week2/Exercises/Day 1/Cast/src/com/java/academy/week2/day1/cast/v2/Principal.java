package com.java.academy.week2.day1.cast.v2;

public class Principal {

    public static void main(String[] args) {

        //Upcasting (implicit) - from subclass to superclass (no casting needed)
        GoldenEagle goldenEagle = new GoldenEagle();

        //Eagle eagle = goldenEagle;
        goldenEagle.eatLikeGoldenEagle();

        //Bird bird = goldenEagle;

        //Optional casting (explicit) - from superclass to subclass (casting needed)
        Eagle eagle = goldenEagle;

        Bird bird = (Bird) goldenEagle;

        Object o = goldenEagle;



    }

}
