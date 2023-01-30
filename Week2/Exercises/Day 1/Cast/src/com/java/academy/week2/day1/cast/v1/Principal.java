package com.java.academy.week2.day1.cast.v1;

public class Principal {

    public static void main(String[] args) {

        // We can create an object of a class that is a subclass of another class
        Bird bird = new GoldenEagle();
        bird = new BaldEagle();


        // InstanceOf is a keyword that allows us to know if an object is an instance of a class
        // or an interface or a subclass of a class or an interface.
        if (bird instanceof GoldenEagle) {
            ((GoldenEagle) bird).eatLikeGoldenEagle();
        } else if (bird instanceof BaldEagle) {
            ((BaldEagle) bird).eatLikeBaldEagle();
        }


    }

}
