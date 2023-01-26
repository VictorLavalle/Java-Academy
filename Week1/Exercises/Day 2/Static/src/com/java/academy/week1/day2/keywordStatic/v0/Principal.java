package com.java.academy.week1.day2.keywordStatic.v0;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Counter: " + Student.counter);//0

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Mike", 25);
        Student student3 = new Student("Mary", 30);

        //System.out.println("Counter: " + student1.counter);//3
        //System.out.println("Counter: " + student2.counter);//3
        //System.out.println("Counter: " + student3.counter);//3

        Student.counter = 999;
        System.out.println("Counter: " + Student.counter);//999

    }

}
