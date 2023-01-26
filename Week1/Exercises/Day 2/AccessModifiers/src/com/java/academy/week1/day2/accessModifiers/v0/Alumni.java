package com.java.academy.week1.day2.accessModifiers.v0;

public class Alumni extends Student{

    Alumni(){
        this("Alumni", 0, new StringBuilder("XXYY"), false);
    }

    Alumni(String name, int age, StringBuilder id, boolean isLegalAge){
        super(name, age, id, isLegalAge);
    }

    String getAlumniName(){
        System.out.println("Alumni name: " + this.name);
        return this.name;
    }

    int getAlumniAge(){
        System.out.println("Alumni age: " + this.age);
        return this.age;
    }

}
