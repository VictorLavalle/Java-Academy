package com.java.academy.week1.day2.polymorphism.v0;

public class Principal {

    public static void main(String[] args) {

        Addition addition = new Addition(2, 3);
        Substraction substraction = new Substraction(2, 3);

        System.out.println(addition);
        System.out.println(addition.execute()); // 5

        System.out.println(substraction);
        System.out.println(substraction.execute()); // -1

    }
}
