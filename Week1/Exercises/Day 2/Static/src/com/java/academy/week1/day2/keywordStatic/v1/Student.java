package com.java.academy.week1.day2.keywordStatic.v1;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student {

    //Instance Class variables
    String name;
    int age;

    //Class variable
   private static int counter;

    //Constructor
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        counter++;
    }

    //Class method
    static int getCounter() {
        return counter;
    }

    //Class method DOESN'T HAVE ACCESS to the attributes of the instance of the class

    //Instance class method
    String getNameCounter() {
        return name + " " + counter;
    }


    //Instance class method DOES HAVE ACCESS to the attributes of the instance of the class

}
