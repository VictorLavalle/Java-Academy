package com.java.academy.week1.day2.keywordStatic.v0;

public class Student {

    //Instance Class variables
    String name;
    int age;

    //Class variable
    static int counter = 100; //0 This is a class variable, it is shared by all the instances of the class Student

    //Constructor
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        counter++;
        //++counter;
        //counter = counter + 1;

    }

}
