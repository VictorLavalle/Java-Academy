package com.java.academy.week1.day2.accessModifiers.v1;

public class Principal {

    public static void main(String[] args) {

        String name1 = new String("Epeneto");
        String name2 = new String("Epeneto");

        StringBuilder stringBuilder = new StringBuilder("XYZ20");


        Student student1 = new Student(name1, 20, stringBuilder, true);
        Student student2 = new Student(name2, 25, stringBuilder, false);

        System.out.println(student1.equals(student2));
    }

}
