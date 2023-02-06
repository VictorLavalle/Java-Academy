package com.java.academy.week3.day4.predicate.v3;

import java.util.Arrays;
import java.util.List;

public class Principal {

    private static final Employee[] arrayOfEmployees = {
            new Employee(0, "Patrobas", 100.0),
            new Employee(1, "Tercio", 200.0),
            new Employee(2, "Andrónico", 300.0),
            new Employee(3, "Epeneto", 400.0),
            new Employee(4, "Filologo", 500.0),
    };


    public static void main(String[] args) {

        List<Employee> listOfEmployees = Arrays.asList(arrayOfEmployees);

        showEmployee(listOfEmployees,e -> e.getSalary()>250);
        showEmployee(listOfEmployees,e -> e.getName().length() > 6);
        showEmployee(listOfEmployees,e -> e.getName().length() > 7 && e.getSalary()>250);

        List<String> namesList = Arrays.asList("Patrobas","Tercio","Andronico");
        showName(namesList, n -> n.length() > 6);
    }

    static void showEmployee(List<Employee> lista, Predicate p ) {
        for(Employee emp:lista) {
            if(p.test(emp)) {
                System.out.println(emp);
            }
        }
        System.out.println("-------------");
    }

    static void showName(List<String> lista, Predicate<String> p ) {
        for(String name:lista) {
            if(p.test(name)) {
                System.out.println(name);
            }
        }
        System.out.println("-------------");
    }
}



