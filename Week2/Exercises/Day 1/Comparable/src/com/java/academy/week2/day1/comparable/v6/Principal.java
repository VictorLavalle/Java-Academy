package com.java.academy.week2.day1.comparable.v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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


        // Improving the code using Lambda Expression and Comparator Interface to sort by Name
        Collections.sort(students,(e1,e2) -> e2.getName().compareTo(e1.getName()));
        System.out.println("Students sorted by Name: \n");
        students.forEach(System.out::println);
        System.out.println("----------------------------------");



        // Improving the code using Lambda Expression and Comparator Interface to sort by Average
        Collections.sort(students,(e1,e2) -> Double.compare(e2.getAverage(), e1.getAverage()));
        System.out.println("\nStudents sorted by Average:\n");
        students.forEach(System.out::println);
        System.out.println("----------------------------------");


        // Improving the code using Lambda Expression and Comparator Interface to sort by Age
        Collections.sort(students,(e1,e2) -> Integer.compare(e2.getAge(), e1.getAge()));
        System.out.println("\nStudents sorted by Age: \n");
        students.forEach(System.out::println);
        System.out.println("----------------------------------");


    }

}
