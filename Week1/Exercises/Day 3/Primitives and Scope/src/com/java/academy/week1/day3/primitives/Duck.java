package com.java.academy.week1.day3.primitives;

public class Duck {

    String name;
    int age;
    static boolean fly = false;

    void makeSound() {
        String sound = "Quack";
        System.out.println(sound);
    }

    void eat(boolean mustEat) {
        String food = null;
        if (mustEat) {
            food = "bread";
        }
        System.out.println(food);
    }

}
