package com.java.academy.week1.day1.introduction;

public class Principal {
    public static void main(String[] args) {

        // Reference variables --> 3
        String x = "hello";
        String y = "hello";
        String z = "hello";

        // == Verifies that the references variables are pointing to the same object
        System.out.println(y == x); //true
        //Until here we have 1 object



        String w = new String("hello");
        System.out.println(y == w); //false
        //Until here we have 2 objects and 4 reference variables

        System.out.println(x.equals(w)); //true
        //.equals() verifies that the objects are equal (not the reference variables)

        // x= null; This is not an empty object, it is a reference variable that is not pointing to any object
        //We still have 2 objects and 4 reference variables


        //Concatenation
        x.concat(" world");
        System.out.println(x); //hello --> The object is not modified

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb1.equals(sb2)); //false --> The objects are not equal


    }

}
