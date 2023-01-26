package com.java.academy.week1.day3.garbageCollector;

public class Scope {

    public static void main(String[] args) {

        //Local vaiables
        String one, two;

        //In here we have two objects in the heap memory and one reference in the stack memory
        one = new String("a");
        two = new String("b");
        one = two;

        //In here we have one object in the heap memory and one reference in the stack memory
        String three = one;
        one = null;

    }

}
