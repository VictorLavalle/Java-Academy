package com.java.academy.week3.day4.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Principal2 {

    private static final Employee[] arrayOfEmployees = {
            new Employee(0, "Patrobas", 100.0),
            new Employee(1, "Tercio", 200.0),
            new Employee(2, "Andrónico", 300.0),
            new Employee(3, "Epeneto", 400.0),
            new Employee(4, "Filologo", 500.0),
    };


    public static void main(String[] args) {


        List<Employee> listOfEmployees = Arrays.asList(arrayOfEmployees);
        listOfEmployees
                .forEach(employee -> employee.setSalary(employee.getSalary() + 200));



        Predicate<Employee> hasLongName = employee -> employee.getName().length() > 6;
        List<Employee> employeesWithLongNames = listOfEmployees.stream()
                .filter(hasLongName)
                .collect(Collectors.toList());


        Predicate<Employee> hasLowSalary = employee -> employee.getSalary() > 250;
        List<Employee> employeesWithLowSalary = listOfEmployees.stream()
                .filter(hasLowSalary)
                .collect(Collectors.toList());


        List<Employee> orderedEmployees = employeesWithLongNames.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());


        System.out.println("Ordered employees with names longer than 6 characters:");
        orderedEmployees
                .forEach(employee -> System.out.println(employee.getName()));




        System.out.println("\nEmployees with salary below 400:");
        employeesWithLowSalary
                .forEach(employee -> System.out.println(employee.getName()));

    }

}
