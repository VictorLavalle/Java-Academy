package com.java.academy.week2.day2.set.v0;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Student e1 =new Student("Juan", 18, 8.5);
        Student e2 =new Student("Maria", 20, 9.1);
        Student e3 =new Student("Pedro", 22, 7.8);
        Student e4 =new Student("Ana", 19, 9.2);
        Student e5 =new Student("Ana", 19, 9.2);

        Set<Student> setStudents = new HashSet<>();

        setStudents.add(e1);
        setStudents.add(e2);
        setStudents.add(e3);
        setStudents.add(e4);
        setStudents.add(e5);

        System.out.println(e4.equals(e5)); //true

        setStudents.forEach(System.out::println); //No duplicates allowed

    }
}
