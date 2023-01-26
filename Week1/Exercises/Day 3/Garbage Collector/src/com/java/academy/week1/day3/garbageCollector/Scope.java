package com.java.academy.week1.day3.garbageCollector;

public class Scope {

    public static void main(String[] args) {

        //Local vaiables
        String one, two;
        // Until here we have 0 objects but 2 references in the stack memory


        //In here we have 2 objects in the heap memory and one reference in the stack memory
        one = new String("a");
        two = new String("b");
        one = two;

        //In here we have one object in the heap memory and one reference in the stack memory
        String three = one;
        one = null;

        //We expect to have 1 object in the heap memory and 1 reference in the stack memory

    }

}
