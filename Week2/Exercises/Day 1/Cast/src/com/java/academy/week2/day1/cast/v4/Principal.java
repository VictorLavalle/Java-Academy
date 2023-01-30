package com.java.academy.week2.day1.cast.v4;

public class Principal {

    public static void main(String[] args) {

        GoldenEagle goldenEagle = new GoldenEagle();
        goldenEagle.eatLikeGoldenEagle();
        goldenEagle.fly();

        Eagle eagle = goldenEagle;
        //eagle.eatLikeGoldenEagle(); //ERROR - eagle is not a GoldenEagle
        eagle.fly(); //OK - eagle is an Eagle

        Bird bird = eagle; //OK - eagle is a Bird
        //bird.eatLikeGoldenEagle(); //ERROR - bird is not a GoldenEagle
        bird.fly(); //OK - bird is a Bird - GoldenEagle
    }

}
