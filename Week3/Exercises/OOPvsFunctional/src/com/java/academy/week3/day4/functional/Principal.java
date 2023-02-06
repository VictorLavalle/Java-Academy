package com.java.academy.week3.day4.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        List<String> nombres =
                listOfEmployees.stream().parallel()
                        .filter(x -> x.getSalary() < 400)
                        //.peek(System.out::println)
                        .peek(z -> z.increaseSalary(200))
                        //.peek(System.out::println)
                        .filter(e -> e.getName().length() > 6)
                        //.peek(System.out::println)
                        .sorted(Comparator.comparing(Employee::getName))
                        //.peek(System.out::println)
                        .map(y -> y.getName())
                        //.peek(System.out::println)
                        .collect(Collectors.toList());

        System.out.println(nombres);

    }

}

