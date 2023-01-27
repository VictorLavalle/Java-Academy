package com.java.academy.week2.day2.comparable.v6;

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

        System.out.println(students.get(2)); // Maria, 21, 9.5
        System.out.println(students.get(3)); // Ana, 20, 8.5

        System.out.println("\n------------\nNow looking for the same index but adding an element in the middle");
        System.out.println(students.get(2)); // Maria, 21, 9.5
        students.add(2,new Student("Patrobas", 18, 8.5));
        System.out.println(students.get(2)); // Patrobas, 18, 8.5 // ---> Position 2 is now occupied by Patrobas
        System.out.println(students.get(3)); // Maria, 21, 9.5 // ---> Position 3 is now occupied by Maria


        System.out.println("\n------------\nNow looking for the same index but removing an element in the middle");
        Student estTmp = students.remove(5);
        students.remove(5);
        System.out.println(estTmp); //It will print the removed element
        System.out.println(students.get(5)); //Luis, 21, 9.5 // ---> Position 5 is now occupied by Luis

        System.out.println("------------");
        students.forEach(System.out::println);


    }

}
