package com.java.academy.week1.day1.constructors;

public class Duck {

    //Class Attributes
    //Instance Class Variables (Object Variables)
    String name; //null
    int age;

    //Constructor default (no parameters)
    //Overloading (Sobrecarga) of the constructor - same name, different parameters
    Duck() {
        this("Default", 5);
    }

    Duck(String name) {
        this.name = name;
    }

    Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
