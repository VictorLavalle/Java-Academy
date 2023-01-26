package com.java.academy.week1.day2.accessModifiers.v0;

public class Principal {

    public static void main(String[] args) {

        Student student1 = new Student("Epeneto", 18, new StringBuilder("XYZ20"), true);
        Student student2 = new Student("Epeneto", 18, new StringBuilder("XYZ20"), true);

        System.out.println(student1.name);
    }

}
