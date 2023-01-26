package com.java.academy.week1.day3.initializationBlocks;

public class Principal2 {

    int counter = 5;

    {
        System.out.println("Initialization block 01");
        counter++;
    }

    static {
        System.out.println("Initialization static block 01");
    }

    Principal2() {
        System.out.println("Pass by Constructor");
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Principal2 principal = new Principal2();
        System.out.println("Counter: " + principal.counter);

        Principal2 principal2 = new Principal2();
        System.out.println("Counter: " + principal2.counter);

        Principal2 principal3 = new Principal2();
        System.out.println("Counter: " + principal3.counter);
    }

    {
        System.out.println("Initialization block 02");
        counter++;
    }

    static {
        System.out.println("Initialization static block 02");
        System.out.println("---------------------------------");
    }

}

