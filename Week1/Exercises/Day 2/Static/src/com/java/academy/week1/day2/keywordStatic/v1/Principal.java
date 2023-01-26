package com.java.academy.week1.day2.keywordStatic.v1;

public class Principal {

    public static void main(String[] args) {

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Mike", 25);
        Student student3 = new Student("Mary", 30);

        System.out.println(student2.getNameCounter()); //Mike 3

        int counter = Student.getCounter();
        System.out.println("Counter: " + counter); //3

    }

}
