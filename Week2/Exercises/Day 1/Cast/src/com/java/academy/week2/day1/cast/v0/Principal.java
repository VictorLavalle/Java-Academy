package com.java.academy.week2.day1.cast.v0;

public class Principal {

    public static void main(String[] args) {

        Bird bird = new Eagle();
        Bird bird2 = new BaldEagle();

        bird.fly();
        bird2.fly();

        bird2.eat(); //It is possible because the reference is of type Bird

        // The behavior of the object is determined by the type of the reference
        //bird2.eatLikeBaldEagle(); // ERROR

        //BaldEagle baldEagle = (BaldEagle) bird2;
        //baldEagle.eatLikeBaldEagle(); // OK
        ((BaldEagle) bird2).eatLikeBaldEagle(); // OK (casting in the same line of the method call)



    }

}
