package com.java.academy.week1.day1.constructors;

public class Principal {

    public static void main(String[] args) {

        Duck duck1 = new Duck();
        System.out.println("Duck1 name: " + duck1.name);//Default -- default value set in the constructor
        System.out.println("Duck1 age: " + duck1.age);//5 -- default value set in the constructor

        System.out.println("--------------------");
        Duck duck2 = new Duck("Lucas");
        System.out.println("Duck2 name: " + duck2.name);//Lucas
        System.out.println("Duck2 age: " + duck2.age);//0

        System.out.println("--------------------");
        Duck duck3 = new Duck("Donald", 10);
        System.out.println("Duck3 name: " + duck3.name);//Donald
        System.out.println("Duck3 age: " + duck3.age);//10

    }
}
