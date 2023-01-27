package com.java.academy.week2.day1.comparable.v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Juan", 20, 8.5));
        students.add(new Student("Pedro", 19, 7.5));
        students.add(new Student("Maria", 21, 9.5));
        students.add(new Student("Ana", 20, 8.5));
        students.add(new Student("Jose", 19, 7.5));
        students.add(new Student("Luis", 21, 9.5));
        students.add(new Student("Diego", 21, 8.0));
        students.add(new Student("Paula", 20, 9.0));
        students.add(new Student("Alejandro", 18, 7.8));
        students.add(new Student("Juliana", 19, 9.2));
        students.add(new Student("Sebastian", 21, 8.5));
        students.add(new Student("Camila", 20, 9.1));

        Collections.sort(students, new SortAge());
        students.forEach(System.out::println);

        System.out.println("-------------------------");

        Collections.sort(students, new SortName());
        students.forEach(System.out::println);

    }

}
