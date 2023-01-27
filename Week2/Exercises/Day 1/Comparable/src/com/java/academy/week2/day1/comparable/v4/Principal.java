package com.java.academy.week2.day1.comparable.v4;

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



        //Anonymous Class (Inner Class) using Comparator Interface to sort by Name
        Comparator<Student> comparatorName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // Print Students List sorted by Name
        Collections.sort(students, comparatorName);
        System.out.println("Students sorted by Name: \n");
        students.forEach(System.out::println);
        System.out.println("----------------------------------");





        //Anonymous Class (Inner Class) using Comparator Interface to sort by Average
        Comparator<Student> comparatorAverage = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverage(), o2.getAverage());
            }
        };

        // Print Students List sorted by Average
        Collections.sort(students, comparatorAverage);
        System.out.println("\nStudents sorted by Average:\n");
        students.forEach(System.out::println);
        System.out.println("----------------------------------");





        //Anonymous Class (Inner Class) using Comparator Interface to sort by Age
        Comparator<Student> comparatorAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        // Print Students List sorted by Age
        Collections.sort(students, comparatorAge);
        System.out.println("\nStudents sorted by Age: \n" );
        students.forEach(System.out::println);
        System.out.println("----------------------------------");


    }

}
