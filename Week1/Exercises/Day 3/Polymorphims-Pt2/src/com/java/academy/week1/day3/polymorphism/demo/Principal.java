package com.java.academy.week1.day3.polymorphism.demo;

public class Principal {

    public static void maain (String[] args){

        final String word = "hello";

        //Cannot assign a value to final variable 'word' because it is final and it is already assigned
        //word = "Hello";

        System.out.println(word);

        final StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);

        //Cannot assign a value to final variable 'sb' because it is final and it is already assigned
        //sb = new StringBuilder("hello");

    }

}
