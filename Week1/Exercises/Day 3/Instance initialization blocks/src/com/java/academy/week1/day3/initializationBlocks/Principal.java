package com.java.academy.week1.day3.initializationBlocks;

public class Principal {

    int counter = 5;

    {
        System.out.println("Initialization block 01");
        counter++;
    }

    {
        System.out.println("Initialization block 03");
        counter++;
    }

    Principal() {
        System.out.println("Pass by Constructor");
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Principal principal = new Principal();
        System.out.println("Counter: " + principal.counter);

        Principal principal2 = new Principal();
        System.out.println("Counter: " + principal2.counter);
    }

    {
        System.out.println("Initialization block 02");
        counter++;
    }

}
